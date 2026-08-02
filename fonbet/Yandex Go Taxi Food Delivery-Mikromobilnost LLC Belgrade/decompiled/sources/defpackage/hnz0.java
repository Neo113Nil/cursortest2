package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class hnz0 {
    public final String a;
    public final long b;

    public hnz0(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hnz0)) {
            return false;
        }
        hnz0 hnz0Var = (hnz0) obj;
        return jl40.l(this.a, hnz0Var.a) && this.b == hnz0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder l = x4e.l("TokenInfo(token=", this.a, ", uid=", this.b);
        l.append(Extension.C_BRAKE);
        return l.toString();
    }
}
