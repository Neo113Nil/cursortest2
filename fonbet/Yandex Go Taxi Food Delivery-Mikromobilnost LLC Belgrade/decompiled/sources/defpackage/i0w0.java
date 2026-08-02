package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class i0w0 {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final bk10 g;

    public i0w0(String str, String str2, String str3, boolean z, boolean z2, String str4, bk10 bk10Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = z2;
        this.f = str4;
        this.g = bk10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0w0)) {
            return false;
        }
        i0w0 i0w0Var = (i0w0) obj;
        return this.a.equals(i0w0Var.a) && this.b.equals(i0w0Var.b) && jl40.l(this.c, i0w0Var.c) && this.d == i0w0Var.d && this.e == i0w0Var.e && this.f.equals(i0w0Var.f) && jl40.l(this.g, i0w0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.e(unr0.e(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder v = b64.v("SuperAppHeaderUiState(youAreHereTitle=", this.a, ", currentAddressLoadingTitle=", this.b, ", currentAddressTitle=");
        tse0.y(this.c, ", addressLoadingState=", ", addressModalEnabled=", v, this.d);
        unr0.A(", currentAddressAccessibilityMessage=", this.f, ", menuState=", v, this.e);
        v.append(this.g);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
