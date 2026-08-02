package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class f401 {
    public final c501 a;
    public final String b;
    public final String c;
    public final String d;

    public f401(c501 c501Var, String str, String str2, String str3) {
        this.a = c501Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final String a() {
        return this.d;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f401)) {
            return false;
        }
        f401 f401Var = (f401) obj;
        return jl40.l(this.a, f401Var.a) && jl40.l(this.b, f401Var.b) && jl40.l(this.c, f401Var.c) && jl40.l(this.d, f401Var.d);
    }

    public final int hashCode() {
        c501 c501Var = this.a;
        int hashCode = (c501Var == null ? 0 : c501Var.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrackingCardRatingSelector(selectedColor=");
        sb.append(this.a);
        sb.append(", selectedImageUrl=");
        sb.append(this.b);
        sb.append(", unselectedImageUrl=");
        return g8e.r(sb, this.c, ", backgroundGlowImageUrl=", this.d, Extension.C_BRAKE);
    }
}
