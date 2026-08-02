package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class g0c0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final d0c0 f;

    public g0c0(String str, String str2, String str3, boolean z, boolean z2, d0c0 d0c0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = d0c0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g0c0)) {
            return false;
        }
        g0c0 g0c0Var = (g0c0) obj;
        return jl40.l(this.a, g0c0Var.a) && jl40.l(this.b, g0c0Var.b) && jl40.l(this.c, g0c0Var.c) && this.d == g0c0Var.d && this.e == g0c0Var.e && jl40.l(this.f, g0c0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int e = unr0.e(unr0.e((b + (str == null ? 0 : str.hashCode())) * 31, 31, this.d), 31, this.e);
        d0c0 d0c0Var = this.f;
        return e + (d0c0Var != null ? d0c0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("PinState(title=", this.a, ", subtitle=", this.b, ", contentDescription=");
        tse0.y(this.c, ", hasChevron=", ", shouldSwapTexts=", v, this.d);
        v.append(this.e);
        v.append(", icon=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public g0c0() {
        this("", "", null, false, false, null);
    }
}
