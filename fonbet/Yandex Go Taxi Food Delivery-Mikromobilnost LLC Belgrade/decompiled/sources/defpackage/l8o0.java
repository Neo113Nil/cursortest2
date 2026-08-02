package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l8o0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final k8o0 d;
    public final CharSequence e;
    public final boolean f;

    public l8o0(String str, CharSequence charSequence, CharSequence charSequence2, k8o0 k8o0Var, CharSequence charSequence3, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = k8o0Var;
        this.e = charSequence3;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8o0)) {
            return false;
        }
        l8o0 l8o0Var = (l8o0) obj;
        return jl40.l(this.a, l8o0Var.a) && jl40.l(this.b, l8o0Var.b) && jl40.l(this.c, l8o0Var.c) && jl40.l(this.d, l8o0Var.d) && jl40.l(this.e, l8o0Var.e) && this.f == l8o0Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + smw0.b((this.d.hashCode() + smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Package(packageProductId=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", priceTitle=");
        t.append(this.d);
        t.append(", priceSubtitle=");
        t.append((Object) this.e);
        t.append(", isSelected=");
        t.append(this.f);
        t.append(Extension.C_BRAKE);
        return t.toString();
    }
}
