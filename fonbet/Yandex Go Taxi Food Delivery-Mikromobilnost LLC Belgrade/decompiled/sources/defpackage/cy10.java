package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class cy10 {
    public final long a;
    public final long b;
    public final String c;

    public cy10(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cy10)) {
            return false;
        }
        cy10 cy10Var = (cy10) obj;
        return this.a == cy10Var.a && this.b == cy10Var.b && jl40.l(this.c, cy10Var.c);
    }

    public final int hashCode() {
        int c = qv10.c(Long.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder w = unr0.w(this.a, "DataFlagsTuple(msgInternalId=", ", flags=");
        uw51.v(this.b, ", data=", this.c, w);
        w.append(Extension.C_BRAKE);
        return w.toString();
    }
}
