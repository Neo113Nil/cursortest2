package xsna;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.stickers.StickerItem;

/* compiled from: StickerStyleSelectorAdapter.kt */
/* loaded from: classes6.dex */
public final class e7l0 extends sxm implements i5l0 {
    public final n7l0 i;
    public final kcl0 j;
    public RecyclerView k;

    public e7l0(n7l0 n7l0Var, kcl0 kcl0Var) {
        this.i = n7l0Var;
        this.j = kcl0Var;
        x0(a790.class, new alj0(this, 5));
        x0(y690.class, new m2l0(this, 1));
        x0(y1l0.class, new c3k0(this, 1));
        x0(zl2.class, new r6i0(this, 4));
        x0(iki0.class, new d7l0(0));
        x0(u690.class, new z6f0(this, 10));
    }

    @Override // xsna.qul, androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.f = recyclerView;
        recyclerView.getContext();
        this.k = recyclerView;
    }

    @Override // xsna.i5l0
    public final StickerItem p0(View view) {
        RecyclerView recyclerView = this.k;
        int childAdapterPosition = recyclerView != null ? recyclerView.getChildAdapterPosition(view) : -1;
        if ((j5g.b0(childAdapterPosition, this.h) instanceof y1l0) || (j5g.b0(childAdapterPosition, this.h) instanceof zl2)) {
            return this.h.get(childAdapterPosition) instanceof y1l0 ? ((y1l0) this.h.get(childAdapterPosition)).c : ((zl2) this.h.get(childAdapterPosition)).c;
        }
        return null;
    }
}
