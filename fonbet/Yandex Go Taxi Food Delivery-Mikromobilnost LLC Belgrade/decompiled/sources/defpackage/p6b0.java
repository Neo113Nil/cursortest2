package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class p6b0 implements r6b0 {
    public final v6b0 a;
    public final j6b0 b;

    public p6b0(v6b0 v6b0Var, j6b0 j6b0Var) {
        this.a = v6b0Var;
        this.b = j6b0Var;
    }

    @Override // defpackage.r6b0
    public final v6b0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p6b0)) {
            return false;
        }
        p6b0 p6b0Var = (p6b0) obj;
        return this.a.equals(p6b0Var.a) && jl40.l(this.b, p6b0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Loaded(loadingTrigger=" + this.a + ", personalStateData=" + this.b + Extension.C_BRAKE;
    }
}
