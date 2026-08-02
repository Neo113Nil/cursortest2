package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.k1u0;
import xsna.tlo0;

/* compiled from: AudioBookActionListAdapter.kt */
/* loaded from: classes3.dex */
public final class wc4 extends RecyclerView.Adapter<a> {
    public final k00 c;
    public final ArrayList d = new ArrayList();

    /* compiled from: AudioBookActionListAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final izs<od4, s3q0> l;
        public final VkCell m;

        public a(View view, k00 k00Var) {
            super(view);
            this.l = k00Var;
            this.m = (VkCell) view.findViewById(R.id.cell);
        }
    }

    public wc4(k00 k00Var) {
        this.c = k00Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        s10 s10Var = (s10) this.d.get(i);
        Integer num = s10Var.e;
        int i2 = s10Var.c;
        VkCell vkCell = aVar2.m;
        vkCell.setAlpha(!s10Var.f ? 1.0f : 0.64f);
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(s10Var.a, VkCell.Left.Main.Size.Medium, new k1u0.a(new x7g(s10Var.b)), tq.h(tlo0.Companion, i2)), null));
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(i2), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), num != null ? new VkCell.Middle.d(new tlo0.f(num.intValue()), (gzs) null, 0, (TextUtils.TruncateAt) null, (VkCell.Middle.d.b.C0815b) null, (VkCell.Middle.d.b.C0815b) null, 62) : null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 12));
        if (s10Var.g) {
            aVar2.itemView.setOnClickListener(new vc4(0, aVar2, s10Var));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.audio_book_action_item, viewGroup, false), this.c);
    }
}
