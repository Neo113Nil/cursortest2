package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class l2p0 {
    public final CharSequence a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final wp2 e;
    public final String f;
    public final CharSequence g;
    public final CharSequence h;
    public final String i;
    public final String j;

    public l2p0(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, wp2 wp2Var, String str, CharSequence charSequence5, CharSequence charSequence6, String str2, String str3) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = charSequence3;
        this.d = charSequence4;
        this.e = wp2Var;
        this.f = str;
        this.g = charSequence5;
        this.h = charSequence6;
        this.i = str2;
        this.j = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l2p0)) {
            return false;
        }
        l2p0 l2p0Var = (l2p0) obj;
        return jl40.l(this.a, l2p0Var.a) && jl40.l(this.b, l2p0Var.b) && jl40.l(this.c, l2p0Var.c) && jl40.l(this.d, l2p0Var.d) && jl40.l(this.e, l2p0Var.e) && jl40.l(this.f, l2p0Var.f) && jl40.l(this.g, l2p0Var.g) && jl40.l(this.h, l2p0Var.h) && jl40.l(this.i, l2p0Var.i) && jl40.l(this.j, l2p0Var.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + unr0.b(smw0.b(smw0.b(unr0.b(n.b(this.e, smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "ScootersSuperPassesUpsaleOnBookUiState(title=", ", subtitle=", ", price=");
        vfc.A(r, this.c, ", trialBadgeText=", this.d, ", trialBadgeColor=");
        r.append(this.e);
        r.append(", imageTag=");
        r.append(this.f);
        r.append(", rejectButtonText=");
        vfc.A(r, this.g, ", confirmButtonText=", this.h, ", legalTermsText=");
        return g8e.r(r, this.i, ", legalTermsLink=", this.j, Extension.C_BRAKE);
    }
}
