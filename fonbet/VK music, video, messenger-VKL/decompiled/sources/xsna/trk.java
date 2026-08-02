package xsna;

import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.libvideo.bottomsheet.about.delegate.w;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.lists.RecyclerPaginatedView;
import java.util.LinkedHashSet;

/* compiled from: D2DVerticalScrollTracker.kt */
/* loaded from: classes7.dex */
public final class trk implements df90 {
    public final RecyclerPaginatedView b;
    public final float c = 0.7f;
    public final hvr0 d;
    public final mmm0 e;
    public final LinkedHashSet f;
    public boolean g;
    public final Rect h;

    public trk(RecyclerPaginatedView recyclerPaginatedView, hvr0 hvr0Var, mmm0 mmm0Var) {
        this.b = recyclerPaginatedView;
        this.d = hvr0Var;
        this.e = mmm0Var;
        recyclerPaginatedView.Om(this);
        this.f = new LinkedHashSet();
        this.g = true;
        this.h = new Rect();
    }

    @Override // xsna.df90
    public final void e(int i, int i2, int i3, int i4) {
        RecyclerView recyclerView;
        RecyclerView.Adapter adapter;
        if (!this.g || (adapter = (recyclerView = this.b.getRecyclerView()).getAdapter()) == null || i2 > i3) {
            return;
        }
        while (true) {
            if (i2 >= 0 && i2 < adapter.getItemCount()) {
                RecyclerView.e0 findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(i2);
                if (findViewHolderForAdapterPosition != null && ((findViewHolderForAdapterPosition instanceof x.b) || (findViewHolderForAdapterPosition instanceof w.a))) {
                    if (bwt0.E(this.h, findViewHolderForAdapterPosition.itemView) >= this.c) {
                        Integer valueOf = Integer.valueOf(i2);
                        LinkedHashSet linkedHashSet = this.f;
                        if (!linkedHashSet.contains(valueOf)) {
                            linkedHashSet.add(Integer.valueOf(i2));
                            this.d.invoke();
                        }
                    }
                }
            }
            if (i2 == i3) {
                return;
            } else {
                i2++;
            }
        }
    }

    @Override // xsna.df90
    public final void l(int i) {
        if (this.g) {
            this.e.invoke(Boolean.valueOf(i == 0));
        }
    }
}
