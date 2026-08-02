package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class br3 {
    public static final br3 d = new br3(0, 0, null);
    public final long a;
    public final long b;
    public final ar3 c;

    public br3(long j, long j2, ar3 ar3Var) {
        this.a = j;
        this.b = j2;
        this.c = ar3Var;
    }

    public final long a() {
        return this.b;
    }

    public final long b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br3)) {
            return false;
        }
        br3 br3Var = (br3) obj;
        return this.a == br3Var.a && this.b == br3Var.b && jl40.l(this.c, br3Var.c);
    }

    public final int hashCode() {
        int c = qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
        ar3 ar3Var = this.c;
        return c + (ar3Var == null ? 0 : ar3Var.hashCode());
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "AutoFsProtectionConfig(warmupWindowMs=", ", silentResetMs=");
        w.append(this.b);
        w.append(", discoConfig=");
        w.append(this.c);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }
}
