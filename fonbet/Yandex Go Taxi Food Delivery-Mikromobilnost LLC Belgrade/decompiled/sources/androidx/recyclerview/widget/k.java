package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class k extends RecyclerView.g {
    public final /* synthetic */ l a;

    public k(l lVar) {
        this.a = lVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        l lVar = this.a;
        int i3 = lVar.a;
        int computeVerticalScrollRange = lVar.L.computeVerticalScrollRange();
        int i4 = lVar.K;
        lVar.M = computeVerticalScrollRange - i4 > 0 && i4 >= i3;
        int computeHorizontalScrollRange = lVar.L.computeHorizontalScrollRange();
        int i5 = lVar.J;
        boolean z = computeHorizontalScrollRange - i5 > 0 && i5 >= i3;
        lVar.N = z;
        boolean z2 = lVar.M;
        if (!z2 && !z) {
            if (lVar.O != 0) {
                lVar.i(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i4;
            lVar.E = (int) ((((f / 2.0f) + computeVerticalScrollOffset) * f) / computeVerticalScrollRange);
            lVar.D = Math.min(i4, (i4 * i4) / computeVerticalScrollRange);
        }
        if (lVar.N) {
            float f2 = computeHorizontalScrollOffset;
            float f3 = i5;
            lVar.H = (int) ((((f3 / 2.0f) + f2) * f3) / computeHorizontalScrollRange);
            lVar.G = Math.min(i5, (i5 * i5) / computeHorizontalScrollRange);
        }
        int i6 = lVar.O;
        if (i6 == 0 || i6 == 1) {
            lVar.i(1);
        }
    }
}
