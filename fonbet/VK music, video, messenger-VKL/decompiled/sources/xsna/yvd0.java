package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.sdk.shared.api.domain.HashtagParseMode;
import com.vk.clips.sdk.shared.api.domain.MentionsParseMode;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.tlo0;
import xsna.xvd0;

/* compiled from: ProfileDraftListAdapter.kt */
/* loaded from: classes16.dex */
public final class yvd0 extends RecyclerView.Adapter<RecyclerView.e0> implements vic {
    public final wi3 c;
    public final ae8 d;
    public final xod e;
    public List<jdo> f = EmptyList.b;

    public yvd0(wi3 wi3Var, ae8 ae8Var, xod xodVar) {
        this.c = wi3Var;
        this.d = ae8Var;
        this.e = xodVar;
    }

    @Override // xsna.vic, com.vk.lists.c.i
    public final void clear() {
        this.f = EmptyList.b;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        jdo jdoVar = (jdo) j5g.b0(i, this.f);
        if (jdoVar == null) {
            return -5L;
        }
        return Long.parseLong(jdoVar.a);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        return R.layout.draft_small_item_vk_cell;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i, List<? extends Object> list) {
        String string;
        if (e0Var instanceof zvd0) {
            jdo jdoVar = this.f.get(i);
            zvd0 zvd0Var = (zvd0) e0Var;
            zvd0Var.q = jdoVar;
            zvd0Var.itemView.setOnClickListener(zvd0Var);
            VkCell vkCell = zvd0Var.o;
            Context context = vkCell.getContext();
            vkCell.setLeftMainViewController(new xvd0());
            vkCell.setLeft(VkCell.Left.a.a(VkCell.Left.Companion, new VkCell.Left.Main.e(new xvd0.c(jdoVar.c, jdoVar.e != null), new Size(e3m.a(R.dimen.clip_draft_cover_size, context), e3m.a(R.dimen.clip_draft_cover_size, context)))));
            String a = cqm0.a(jdoVar.b);
            if (a == null || (string = zvd0Var.n.a(a, HashtagParseMode.DEFAULT, MentionsParseMode.DEFAULT, true).toString()) == null) {
                string = context.getString(R.string.clip_without_description);
            }
            vkCell.setMiddle(VkCell.Middle.a.a(VkCell.Middle.Companion, new VkCell.Middle.e(oq.d(tlo0.Companion, string), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(pvo0.k(jdoVar.d, zvd0Var.itemView.getResources(), false)), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62), null, 12));
            vkCell.setRight(VkCell.Right.c.a(VkCell.Right.Companion, null, null, new VkCell.Right.ExtraAction.d(new acd(0, zvd0Var, zvd0.class, "openDraftBottomSheet", "openDraftBottomSheet()V", 0, 3), new tlo0.f(R.string.menu), 4), null, 27));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View b = tf3.b(viewGroup, i, viewGroup, false);
        if (i != R.layout.draft_small_item_vk_cell) {
            throw new IllegalStateException("Unknown viewholder type");
        }
        return new zvd0(b, this.c, this.d, this.e);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        onBindViewHolder(e0Var, i, EmptyList.b);
    }
}
