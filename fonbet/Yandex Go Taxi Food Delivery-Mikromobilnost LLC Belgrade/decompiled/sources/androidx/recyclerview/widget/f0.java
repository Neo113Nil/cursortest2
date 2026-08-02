package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class f0 extends e1 {
    public c0 d;
    public b0 e;

    public static int h(View view, d0 d0Var) {
        return ((d0Var.c(view) / 2) + d0Var.e(view)) - ((d0Var.l() / 2) + d0Var.k());
    }

    public static View i(RecyclerView.e eVar, d0 d0Var) {
        int d0 = eVar.d0();
        View view = null;
        if (d0 == 0) {
            return null;
        }
        int l = (d0Var.l() / 2) + d0Var.k();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < d0; i2++) {
            View c0 = eVar.c0(i2);
            int abs = Math.abs(((d0Var.c(c0) / 2) + d0Var.e(c0)) - l);
            if (abs < i) {
                view = c0;
                i = abs;
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.e1
    public int[] c(RecyclerView.e eVar, View view) {
        int[] iArr = new int[2];
        if (eVar.I()) {
            iArr[0] = h(view, j(eVar));
        } else {
            iArr[0] = 0;
        }
        if (eVar.J()) {
            iArr[1] = h(view, k(eVar));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e1
    public final RecyclerView.j d(RecyclerView.e eVar) {
        if (eVar instanceof u0) {
            return new e0(this, this.a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e1
    public View e(RecyclerView.e eVar) {
        if (eVar.J()) {
            return i(eVar, k(eVar));
        }
        if (eVar.I()) {
            return i(eVar, j(eVar));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.e1
    public int f(RecyclerView.e eVar, int i, int i2) {
        PointF d;
        int itemCount = eVar.getItemCount();
        if (itemCount != 0) {
            View view = null;
            d0 k = eVar.J() ? k(eVar) : eVar.I() ? j(eVar) : null;
            if (k != null) {
                int d0 = eVar.d0();
                boolean z = false;
                int i3 = Integer.MAX_VALUE;
                int i4 = Integer.MIN_VALUE;
                View view2 = null;
                for (int i5 = 0; i5 < d0; i5++) {
                    View c0 = eVar.c0(i5);
                    if (c0 != null) {
                        int h = h(c0, k);
                        if (h <= 0 && h > i4) {
                            view2 = c0;
                            i4 = h;
                        }
                        if (h >= 0 && h < i3) {
                            view = c0;
                            i3 = h;
                        }
                    }
                }
                boolean z2 = !eVar.I() ? i2 <= 0 : i <= 0;
                if (z2 && view != null) {
                    return ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
                }
                if (!z2 && view2 != null) {
                    return ((RecyclerView.LayoutParams) view2.getLayoutParams()).getViewLayoutPosition();
                }
                if (z2) {
                    view = view2;
                }
                if (view != null) {
                    int viewLayoutPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewLayoutPosition();
                    int itemCount2 = eVar.getItemCount();
                    if ((eVar instanceof u0) && (d = ((u0) eVar).d(itemCount2 - 1)) != null && (d.x < 0.0f || d.y < 0.0f)) {
                        z = true;
                    }
                    int i6 = viewLayoutPosition + (z == z2 ? -1 : 1);
                    if (i6 >= 0 && i6 < itemCount) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public final d0 j(RecyclerView.e eVar) {
        b0 b0Var = this.e;
        if (b0Var == null || b0Var.a != eVar) {
            this.e = new b0(eVar);
        }
        return this.e;
    }

    public final d0 k(RecyclerView.e eVar) {
        c0 c0Var = this.d;
        if (c0Var == null || c0Var.a != eVar) {
            this.d = new c0(eVar);
        }
        return this.d;
    }
}
