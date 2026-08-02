package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ofe {
    public static final ofe e = new ofe(2, "", "", null);
    public final int a;
    public final String b;
    public final String c;
    public final String d;

    public ofe(int i, String str, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofe)) {
            return false;
        }
        ofe ofeVar = (ofe) obj;
        return this.a == ofeVar.a && jl40.l(this.b, ofeVar.b) && jl40.l(this.c, ofeVar.c) && jl40.l(this.d, ofeVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(unr0.v(this.a, "ContentDescription(isImportantForAccessibility=", ", text=", this.b, ", actionText="), this.c, ", className=", this.d, Extension.C_BRAKE);
    }
}
