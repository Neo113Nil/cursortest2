package defpackage;

import java.util.Iterator;

/* loaded from: classes10.dex */
public final class m2b0 extends z6 {
    public final b2b0 a;

    public m2b0(b2b0 b2b0Var) {
        this.a = b2b0Var;
    }

    @Override // defpackage.z6, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.a.containsValue(obj);
    }

    @Override // defpackage.z6
    public final int getSize() {
        b2b0 b2b0Var = this.a;
        b2b0Var.getClass();
        return b2b0Var.b;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        ce11 ce11Var = this.a.a;
        de11[] de11VarArr = new de11[8];
        for (int i = 0; i < 8; i++) {
            de11VarArr[i] = new he11();
        }
        return new k2b0(ce11Var, de11VarArr);
    }
}
