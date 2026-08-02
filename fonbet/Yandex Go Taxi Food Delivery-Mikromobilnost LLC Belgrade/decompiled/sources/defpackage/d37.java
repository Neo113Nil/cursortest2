package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class d37 {
    public final String a;
    public final String b;
    public final boolean c;
    public final boolean d;

    public /* synthetic */ d37(String str, int i, boolean z, boolean z2) {
        this((i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2, str, (String) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d37)) {
            return false;
        }
        d37 d37Var = (d37) obj;
        return jl40.l(this.a, d37Var.a) && jl40.l(this.b, d37Var.b) && this.c == d37Var.c && this.d == d37Var.d;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return Boolean.hashCode(this.d) + unr0.e((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
    }

    public final String toString() {
        return smw0.k(", isShimmering=", Extension.C_BRAKE, b64.v("ButtonState(title=", this.a, ", subtitle=", this.b, ", isEnabled="), this.c, this.d);
    }

    public d37(boolean z, boolean z2, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = z2;
    }
}
