package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ou1 {
    public final String a;
    public final String b;
    public final String c;

    public ou1(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou1)) {
            return false;
        }
        ou1 ou1Var = (ou1) obj;
        return jl40.l(this.a, ou1Var.a) && jl40.l(this.b, ou1Var.b) && this.c.equals(ou1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        return this.c.hashCode() + unr0.b((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(b64.v("AltChoiceBubbleOption(imageUrl=", this.a, ", title=", this.b, ", optionName="), this.c, Extension.C_BRAKE);
    }
}
