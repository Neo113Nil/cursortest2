package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class a9m0 {
    public final long a;
    public final long b;

    public a9m0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a9m0)) {
            return false;
        }
        a9m0 a9m0Var = (a9m0) obj;
        return this.a == a9m0Var.a && this.b == a9m0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return oyr.n(this.b, Extension.C_BRAKE, unr0.w(this.a, "ProgressAnimationDuration(min=", ", max="));
    }
}
