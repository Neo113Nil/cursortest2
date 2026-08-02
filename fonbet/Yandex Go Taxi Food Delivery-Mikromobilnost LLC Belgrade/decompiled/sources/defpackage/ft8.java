package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ft8 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ft8(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ft8)) {
            return false;
        }
        ft8 ft8Var = (ft8) obj;
        return jl40.l(this.a, ft8Var.a) && jl40.l(this.b, ft8Var.b) && jl40.l(this.c, ft8Var.c) && jl40.l(this.d, ft8Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("CareWebViewErrorScreenText(errorTitleText=", this.a, ", errorSubtitleText=", this.b, ", closeButtonText="), this.c, ", reloadButtonText=", this.d, Extension.C_BRAKE);
    }
}
