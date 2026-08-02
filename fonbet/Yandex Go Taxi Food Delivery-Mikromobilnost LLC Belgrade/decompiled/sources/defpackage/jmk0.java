package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class jmk0 implements lmk0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;

    public jmk0(String str, boolean z, String str2, String str3) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
    }

    @Override // defpackage.lmk0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jmk0)) {
            return false;
        }
        jmk0 jmk0Var = (jmk0) obj;
        return jl40.l(this.a, jmk0Var.a) && this.b == jmk0Var.b && jl40.l(this.c, jmk0Var.c) && jl40.l(this.d, jmk0Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return g8e.r(oo31.l("Tag(badgeId=", this.a, ", isSelected=", ", title=", this.b), this.c, ", iconTag=", this.d, Extension.C_BRAKE);
    }
}
