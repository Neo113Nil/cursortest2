package yads;

import android.util.SparseArray;

/* loaded from: classes10.dex */
public final class ze {
    public final ew0 a;
    public final SparseArray b;

    public ze(ew0 ew0Var, SparseArray sparseArray) {
        this.a = ew0Var;
        SparseArray sparseArray2 = new SparseArray(ew0Var.a());
        for (int i = 0; i < ew0Var.a(); i++) {
            int a = ew0Var.a(i);
            sparseArray2.append(a, (ye) ni.a((ye) sparseArray.get(a)));
        }
        this.b = sparseArray2;
    }

    public final boolean a(int i) {
        return this.a.a.get(i);
    }
}
