package defpackage;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes11.dex */
public final class g5n implements nt31 {
    public final c05 a;
    public final c05 b;
    public final SparseArray c = new SparseArray();
    public int d = 0;
    public float e = 0.0f;
    public final /* synthetic */ int f;

    public g5n(ViewGroup viewGroup, c05 c05Var, c05 c05Var2, int i) {
        this.f = i;
        this.a = c05Var;
        this.b = c05Var2;
    }

    @Override // defpackage.nt31
    public int a(int i, int i2) {
        switch (this.f) {
            case 0:
                this.c.clear();
                break;
        }
        return c(i, i2);
    }

    @Override // defpackage.nt31
    public final boolean b(int i, float f) {
        switch (this.f) {
            case 0:
                break;
            default:
                SparseArray sparseArray = this.c;
                if (sparseArray.size() != 0) {
                    if (i == 0 || (i == 1 && f <= 0.0f)) {
                        sparseArray.size();
                        t4x0 t4x0Var = (t4x0) sparseArray.valueAt(sparseArray.size() - 1);
                        if (t4x0Var.a() != t4x0Var.b()) {
                        }
                    }
                }
                break;
        }
        return true;
    }

    public final int c(int i, int i2) {
        SparseArray sparseArray = this.c;
        t4x0 t4x0Var = (t4x0) sparseArray.get(i);
        if (t4x0Var == null) {
            j05 j05Var = this.b.a.m;
            int size = j05Var == null ? 0 : j05Var.c().size();
            if (size == 0) {
                return 0;
            }
            t4x0 t4x0Var2 = new t4x0(size, new iy4(this, View.MeasureSpec.getSize(i), i2));
            sparseArray.put(i, t4x0Var2);
            t4x0Var = t4x0Var2;
        }
        int i3 = this.d;
        float f = this.e;
        switch (this.f) {
            case 0:
                if (f < 0.01f) {
                    return t4x0Var.c(i3);
                }
                return Math.round(((t4x0Var.c(i3 + 1) - r5) * f) + t4x0Var.c(i3));
            default:
                if (i3 > 0) {
                    return t4x0Var.b();
                }
                if (f < 0.01f) {
                    return t4x0Var.a();
                }
                return Math.round(((t4x0Var.b() - r5) * f) + t4x0Var.a());
        }
    }
}
