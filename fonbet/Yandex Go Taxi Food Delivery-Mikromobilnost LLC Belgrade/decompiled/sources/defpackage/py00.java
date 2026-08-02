package defpackage;

import java.util.Objects;

/* loaded from: classes10.dex */
public final class py00 extends has {
    public static final Object e = new Object();
    public final Object c;
    public final Object d;

    public py00(a9z0 a9z0Var, Object obj, Object obj2) {
        super(a9z0Var);
        this.c = obj;
        this.d = obj2;
    }

    @Override // defpackage.has, defpackage.a9z0
    public final int b(Object obj) {
        Object obj2;
        if (e == obj && (obj2 = this.d) != null) {
            obj = obj2;
        }
        return this.b.b(obj);
    }

    @Override // defpackage.has, defpackage.a9z0
    public final y8z0 g(int i, y8z0 y8z0Var, boolean z) {
        this.b.g(i, y8z0Var, z);
        if (Objects.equals(y8z0Var.b, this.d) && z) {
            y8z0Var.b = e;
        }
        return y8z0Var;
    }

    @Override // defpackage.has, defpackage.a9z0
    public final Object m(int i) {
        Object m = this.b.m(i);
        return Objects.equals(m, this.d) ? e : m;
    }

    @Override // defpackage.has, defpackage.a9z0
    public final z8z0 n(int i, z8z0 z8z0Var, long j) {
        this.b.n(i, z8z0Var, j);
        if (Objects.equals(z8z0Var.a, this.c)) {
            z8z0Var.a = z8z0.p;
        }
        return z8z0Var;
    }
}
