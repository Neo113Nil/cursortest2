package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class hb40 {
    public final CharSequence a;
    public final CharSequence b;
    public final wi70 c;
    public final ib40 d;
    public final CharSequence e;
    public final boolean f;

    public hb40(CharSequence charSequence, CharSequence charSequence2, wi70 wi70Var, ib40 ib40Var, CharSequence charSequence3, boolean z) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = wi70Var;
        this.d = ib40Var;
        this.e = charSequence3;
        this.f = z;
    }

    public static hb40 a(hb40 hb40Var, wi70 wi70Var, ib40 ib40Var, int i) {
        CharSequence charSequence = hb40Var.a;
        CharSequence charSequence2 = hb40Var.b;
        if ((i & 4) != 0) {
            wi70Var = hb40Var.c;
        }
        wi70 wi70Var2 = wi70Var;
        if ((i & 8) != 0) {
            ib40Var = hb40Var.d;
        }
        ib40 ib40Var2 = ib40Var;
        CharSequence charSequence3 = hb40Var.e;
        boolean z = (i & 32) != 0 ? hb40Var.f : true;
        hb40Var.getClass();
        return new hb40(charSequence, charSequence2, wi70Var2, ib40Var2, charSequence3, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hb40)) {
            return false;
        }
        hb40 hb40Var = (hb40) obj;
        return jl40.l(this.a, hb40Var.a) && jl40.l(this.b, hb40Var.b) && jl40.l(this.c, hb40Var.c) && jl40.l(this.d, hb40Var.d) && jl40.l(this.e, hb40Var.e) && this.f == hb40Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + smw0.b((this.d.hashCode() + ((this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "MtTrainCheckoutPaymentInfo(title=", ", subtitle=", ", paymentButton=");
        r.append(this.c);
        r.append(", paymentMethod=");
        r.append(this.d);
        r.append(", userAgreement=");
        r.append((Object) this.e);
        r.append(", isLoading=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
