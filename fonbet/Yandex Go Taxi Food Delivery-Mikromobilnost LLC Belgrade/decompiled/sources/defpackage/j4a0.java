package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class j4a0 {
    public final CharSequence a;
    public final kdc b;
    public final kdc c;

    public j4a0(kdc kdcVar, kdc kdcVar2, String str) {
        this.a = str;
        this.b = kdcVar;
        this.c = kdcVar2;
    }

    public final kdc a() {
        return this.b;
    }

    public final kdc b() {
        return this.c;
    }

    public final CharSequence c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j4a0)) {
            return false;
        }
        j4a0 j4a0Var = (j4a0) obj;
        return jl40.l(this.a, j4a0Var.a) && jl40.l(this.b, j4a0Var.b) && jl40.l(this.c, j4a0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + smw0.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "PaymentMethodBadge(title=" + ((Object) this.a) + ", backgroundColor=" + this.b + ", textColor=" + this.c + Extension.C_BRAKE;
    }
}
