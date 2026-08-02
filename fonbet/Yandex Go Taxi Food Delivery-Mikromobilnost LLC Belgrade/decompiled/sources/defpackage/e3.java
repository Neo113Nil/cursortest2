package defpackage;

import java.util.Enumeration;

/* loaded from: classes9.dex */
public final class e3 implements Enumeration {
    public int a = 0;
    public final /* synthetic */ h3 b;

    public e3(h3 h3Var) {
        this.b = h3Var;
    }

    @Override // java.util.Enumeration
    public final boolean hasMoreElements() {
        return this.a < this.b.a.length;
    }

    @Override // java.util.Enumeration
    public final Object nextElement() {
        int i = this.a;
        z1[] z1VarArr = this.b.a;
        if (i < z1VarArr.length) {
            this.a = i + 1;
            return z1VarArr[i];
        }
        ny61.p();
        return null;
    }
}
