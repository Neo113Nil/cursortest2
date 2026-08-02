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
import xsna.zh4;

/* compiled from: AudioBookPersonActionItemListAdapter.kt */
/* loaded from: classes3.dex */
public final class xh4 extends RecyclerView.Adapter<a> {
    public final zh4.d c;
    public final ArrayList d = new ArrayList();

    /* compiled from: AudioBookPersonActionItemListAdapter.kt */
    public static final class a extends RecyclerView.e0 {
        public final izs<uh4, s3q0> l;
        public final VkCell m;

        public a(View view, zh4.d dVar) {
            super(view);
            this.l = dVar;
            this.m = (VkCell) view.findViewById(R.id.cell);
        }
    }

    public xh4(zh4.d dVar) {
        this.c = dVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.d.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(a aVar, int i) {
        a aVar2 = aVar;
        vh4 vh4Var = (vh4) this.d.get(i);
        VkCell vkCell = aVar2.m;
        int i2 = vh4Var.a;
        VkCell.Left.Main.Size size = VkCell.Left.Main.Size.Medium;
        k1u0.a aVar3 = new k1u0.a(new x7g(R.attr.vk_ui_icon_accent));
        tlo0.a aVar4 = tlo0.Companion;
        int i3 = vh4Var.b;
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(i2, size, aVar3, tq.h(aVar4, i3)), null));
        VkCell.Middle.d dVar = null;
        VkCell.Middle.c cVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.f(i3), 0, (TextUtils.TruncateAt) null, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 62), dVar, cVar, (VkCell.Middle.Size) objArr, 14));
        aVar2.itemView.setOnClickListener(new wh4(0, aVar2, vh4Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(tf3.b(viewGroup, R.layout.audio_book_action_item, viewGroup, false), this.c);
    }
}
