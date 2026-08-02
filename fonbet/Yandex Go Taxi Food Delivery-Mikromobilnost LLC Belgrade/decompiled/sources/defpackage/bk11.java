package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bk11 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public bk11(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bk11)) {
            return false;
        }
        bk11 bk11Var = (bk11) obj;
        return jl40.l(this.a, bk11Var.a) && jl40.l(this.b, bk11Var.b) && jl40.l(this.c, bk11Var.c) && jl40.l(this.d, bk11Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("TurnOffNoticeEntity(title=", this.a, ", description=", this.b, ", buttonTextPrimary="), this.c, ", buttonTextSecondary=", this.d, Extension.C_BRAKE);
    }
}
