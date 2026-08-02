package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ena0 {
    public final String a;
    public final String b;
    public final boolean c;

    public ena0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ena0)) {
            return false;
        }
        ena0 ena0Var = (ena0) obj;
        return jl40.l(this.a, ena0Var.a) && jl40.l(this.b, ena0Var.b) && this.c == ena0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("PaymentsInfoPayload(title=", this.a, ", subtitle=", this.b, ", shouldShowPaymentsSection="), this.c, Extension.C_BRAKE);
    }
}
