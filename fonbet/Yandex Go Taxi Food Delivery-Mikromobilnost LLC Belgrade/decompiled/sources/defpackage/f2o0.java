package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class f2o0 {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;

    public f2o0(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = charSequence3;
        this.e = charSequence4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f2o0)) {
            return false;
        }
        f2o0 f2o0Var = (f2o0) obj;
        return jl40.l(this.a, f2o0Var.a) && jl40.l(this.b, f2o0Var.b) && jl40.l(this.c, f2o0Var.c) && jl40.l(this.d, f2o0Var.d) && jl40.l(this.e, f2o0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + smw0.b(smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "ScootersNewbieUiState(imageTag=", this.a, ", title=", ", subtitle=");
        vfc.A(t, this.c, ", rejectButtonText=", this.d, ", confirmButtonText=");
        return xvz.n(t, this.e, Extension.C_BRAKE);
    }
}
