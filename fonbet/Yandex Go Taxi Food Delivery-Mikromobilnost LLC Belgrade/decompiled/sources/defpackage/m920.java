package defpackage;

import android.util.SparseArray;

/* loaded from: classes10.dex */
public final class m920 {
    public final SparseArray a;
    public jp11 b;

    public m920(int i) {
        this.a = new SparseArray(i);
    }

    public final void a(jp11 jp11Var, int i, int i2) {
        int a = jp11Var.a(i);
        SparseArray sparseArray = this.a;
        m920 m920Var = sparseArray == null ? null : (m920) sparseArray.get(a);
        if (m920Var == null) {
            m920Var = new m920(1);
            sparseArray.put(jp11Var.a(i), m920Var);
        }
        if (i2 > i) {
            m920Var.a(jp11Var, i + 1, i2);
        } else {
            m920Var.b = jp11Var;
        }
    }
}
