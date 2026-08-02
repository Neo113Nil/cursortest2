package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l170 {
    public final String a;
    public final String b;
    public final String c;

    public l170(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l170)) {
            return false;
        }
        l170 l170Var = (l170) obj;
        return this.a.equals(l170Var.a) && jl40.l(this.b, l170Var.b) && jl40.l(this.c, l170Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return oyr.t(b64.v("OnboardingListItem(title=", this.a, ", subtitle=", this.b, ", iconTag="), this.c, Extension.C_BRAKE);
    }
}
