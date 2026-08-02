package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class n380 {
    public static final n380 e = new n380(true, false, "", "");
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public n380(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n380)) {
            return false;
        }
        n380 n380Var = (n380) obj;
        return jl40.l(this.a, n380Var.a) && jl40.l(this.b, n380Var.b) && this.c == n380Var.c && this.d == n380Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + unr0.e(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return smw0.k(", hasChevron=", Extension.C_BRAKE, b64.v("OrderPinV2State(title=", this.a, ", subtitle=", this.b, ", isTitleOnTop="), this.c, this.d);
    }
}
