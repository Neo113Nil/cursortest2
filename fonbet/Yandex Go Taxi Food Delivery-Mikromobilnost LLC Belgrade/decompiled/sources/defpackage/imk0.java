package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class imk0 implements lmk0 {
    public final String a;
    public final boolean b;
    public final String c;
    public final String d;
    public final String e;

    public imk0(String str, String str2, String str3, String str4, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    @Override // defpackage.lmk0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof imk0)) {
            return false;
        }
        imk0 imk0Var = (imk0) obj;
        return jl40.l(this.a, imk0Var.a) && this.b == imk0Var.b && jl40.l(this.c, imk0Var.c) && jl40.l(this.d, imk0Var.d) && jl40.l(this.e, imk0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.e(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder l = oo31.l("Achievement(badgeId=", this.a, ", isSelected=", ", title=", this.b);
        g8e.D(l, this.c, ", activeImageTag=", this.d, ", inactiveImageTag=");
        return oyr.t(l, this.e, Extension.C_BRAKE);
    }
}
