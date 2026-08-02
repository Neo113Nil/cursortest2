package xsna;

import android.content.res.Resources;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.m;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import xsna.tlo0;

/* compiled from: ContentDiscussionsAdapter.kt */
/* loaded from: classes5.dex */
public final class egj extends zoj0<ii7, b> {
    public final dhh e;

    /* compiled from: ContentDiscussionsAdapter.kt */
    public static final class a extends m.e<ii7> {
        @Override // androidx.recyclerview.widget.m.e
        public final boolean areContentsTheSame(ii7 ii7Var, ii7 ii7Var2) {
            return ii7Var.equals(ii7Var2);
        }

        @Override // androidx.recyclerview.widget.m.e
        public final boolean areItemsTheSame(ii7 ii7Var, ii7 ii7Var2) {
            return ii7Var.a == ii7Var2.a;
        }
    }

    /* compiled from: ContentDiscussionsAdapter.kt */
    public final class b extends vif0<ii7> {
        public final VkCell n;

        public b(VkCell vkCell, dhh dhhVar) {
            super(vkCell);
            this.n = vkCell;
            bwt0.i0(vkCell, new com.vk.im.engine.commands.messages.a(16, dhhVar, this));
        }

        @Override // xsna.vif0
        public final void i6(ii7 ii7Var) {
            ii7 ii7Var2 = ii7Var;
            Resources resources = this.itemView.getContext().getResources();
            int i = ii7Var2.c;
            String string = this.itemView.getContext().getResources().getString(R.string.community_profile_discussion_subtitle, resources.getQuantityString(R.plurals.profile_common_discussion_comments_count, i, Integer.valueOf(i)), pvo0.k(ii7Var2.e, this.itemView.getResources(), false));
            tlo0.a aVar = tlo0.Companion;
            String str = ii7Var2.b;
            if (str == null) {
                str = "";
            }
            tlo0.h d = oq.d(aVar, str);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            this.n.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(d, 1, truncateAt, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), new VkCell.Middle.d(new tlo0.h(string), (gzs) null, 1, truncateAt, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 50), (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        }
    }

    public egj(dhh dhhVar) {
        super(new com.vk.lists.a(new a()));
        this.e = dhhVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((b) e0Var).V5(this.c.c(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        VkCell vkCell = new VkCell(viewGroup.getContext(), null, 6, 0);
        vkCell.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return new b(vkCell, this.e);
    }
}
