package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public class x extends e1 {
    public c0 d;
    public b0 e;

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
            d0 j = j(eVar);
            iArr[0] = ((j.c(view) / 2) + j.e(view)) - ((j.l() / 2) + j.k());
        } else {
            iArr[0] = 0;
        }
        if (!eVar.J()) {
            iArr[1] = 0;
            return iArr;
        }
        d0 k = k(eVar);
        iArr[1] = ((k.c(view) / 2) + k.e(view)) - ((k.l() / 2) + k.k());
        return iArr;
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
    public final int f(RecyclerView.e eVar, int i, int i2) {
        int itemCount;
        View e;
        int viewLayoutPosition;
        int i3;
        PointF d;
        int i4;
        int i5;
        if ((eVar instanceof u0) && (itemCount = eVar.getItemCount()) != 0 && (e = e(eVar)) != null && (viewLayoutPosition = ((RecyclerView.LayoutParams) e.getLayoutParams()).getViewLayoutPosition()) != -1 && (d = ((u0) eVar).d(itemCount - 1)) != null) {
            if (eVar.I()) {
                i4 = h(eVar, j(eVar), i, 0);
                if (d.x < 0.0f) {
                    i4 = -i4;
                }
            } else {
                i4 = 0;
            }
            if (eVar.J()) {
                i5 = h(eVar, k(eVar), 0, i2);
                if (d.y < 0.0f) {
                    i5 = -i5;
                }
            } else {
                i5 = 0;
            }
            if (eVar.J()) {
                i4 = i5;
            }
            if (i4 != 0) {
                int i6 = viewLayoutPosition + i4;
                int i7 = i6 >= 0 ? i6 : 0;
                return i7 >= itemCount ? i3 : i7;
            }
        }
        return -1;
    }

    public final int h(RecyclerView.e eVar, d0 d0Var, int i, int i2) {
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int d0 = eVar.d0();
        float f = 1.0f;
        if (d0 != 0) {
            View view = null;
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            View view2 = null;
            for (int i5 = 0; i5 < d0; i5++) {
                View c0 = eVar.c0(i5);
                int r0 = RecyclerView.e.r0(c0);
                if (r0 != -1) {
                    if (r0 < i4) {
                        view = c0;
                        i4 = r0;
                    }
                    if (r0 > i3) {
                        view2 = c0;
                        i3 = r0;
                    }
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(d0Var.b(view), d0Var.b(view2)) - Math.min(d0Var.e(view), d0Var.e(view2));
                if (max != 0) {
                    f = (max * 1.0f) / ((i3 - i4) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
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
