package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class gcf0 implements jcf0 {
    public final boolean a;
    public final boolean b;
    public final rb6 c;
    public final rbf0 d;
    public final icf0 e;

    public gcf0(boolean z, boolean z2, rb6 rb6Var, rbf0 rbf0Var, icf0 icf0Var) {
        this.a = z;
        this.b = z2;
        this.c = rb6Var;
        this.d = rbf0Var;
        this.e = icf0Var;
    }

    @Override // defpackage.jcf0
    public final rb6 a() {
        return this.c;
    }

    @Override // defpackage.jcf0
    public final rbf0 b() {
        return this.d;
    }

    @Override // defpackage.jcf0
    public final boolean c() {
        return true;
    }

    @Override // defpackage.jcf0
    public final boolean d() {
        return this.a;
    }

    @Override // defpackage.jcf0
    public final kao e() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gcf0)) {
            return false;
        }
        gcf0 gcf0Var = (gcf0) obj;
        return this.a == gcf0Var.a && this.b == gcf0Var.b && this.c.equals(gcf0Var.c) && jl40.l(this.d, gcf0Var.d) && this.e.equals(gcf0Var.e);
    }

    @Override // defpackage.jcf0
    public final boolean f() {
        return false;
    }

    @Override // defpackage.jcf0
    public final boolean g() {
        return this.b;
    }

    @Override // defpackage.jcf0
    public final boolean h() {
        return false;
    }

    public final int hashCode() {
        int b = ly3.b(unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c.a);
        rbf0 rbf0Var = this.d;
        return this.e.hashCode() + ((b + (rbf0Var == null ? 0 : rbf0Var.hashCode())) * 31);
    }

    public final icf0 i() {
        return this.e;
    }

    public final String toString() {
        StringBuilder u = qv10.u("Loading(isProductsV4Enabled=", ", isProductsV4HeaderEnabled=", ", bottomBarState=", this.a, this.b);
        u.append(this.c);
        u.append(", headerGradientState=");
        u.append(this.d);
        u.append(", skeletonType=");
        u.append(this.e);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
