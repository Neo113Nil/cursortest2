package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hna0 {
    public final String a;
    public final String b;
    public final boolean c;

    public hna0(String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hna0)) {
            return false;
        }
        hna0 hna0Var = (hna0) obj;
        return jl40.l(this.a, hna0Var.a) && jl40.l(this.b, hna0Var.b) && this.c == hna0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(b64.v("PaymentsInfoUiState(title=", this.a, ", subtitle=", this.b, ", shouldShowPaymentsSection="), this.c, Extension.C_BRAKE);
    }
}
