package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes8.dex */
public final class pr20 {
    public static final or20 Companion = new or20();
    public final lq20 a;
    public final boolean b;

    public /* synthetic */ pr20(int i, lq20 lq20Var, boolean z) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, nr20.a.getDescriptor());
            throw null;
        }
        this.a = lq20Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pr20)) {
            return false;
        }
        pr20 pr20Var = (pr20) obj;
        return jl40.l(this.a, pr20Var.a) && this.b == pr20Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.b.hashCode() * 31);
    }

    public final String toString() {
        return "MobSelectedProxy(proxy=" + this.a + ", ignoreDns=" + this.b + Extension.C_BRAKE;
    }

    public pr20(lq20 lq20Var, boolean z) {
        this.a = lq20Var;
        this.b = z;
    }
}
