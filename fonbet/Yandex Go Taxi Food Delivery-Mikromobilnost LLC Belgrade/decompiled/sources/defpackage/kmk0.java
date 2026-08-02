package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class kmk0 implements lmk0 {
    public final String a;
    public final boolean b;
    public final String c;

    public kmk0(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    @Override // defpackage.lmk0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kmk0)) {
            return false;
        }
        kmk0 kmk0Var = (kmk0) obj;
        return jl40.l(this.a, kmk0Var.a) && this.b == kmk0Var.b && jl40.l(this.c, kmk0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return oyr.t(oo31.l("Text(badgeId=", this.a, ", isSelected=", ", title=", this.b), this.c, Extension.C_BRAKE);
    }
}
