package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p0c0 {
    public static final p0c0 e = new p0c0("", "", "", "");
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public p0c0(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0c0)) {
            return false;
        }
        p0c0 p0c0Var = (p0c0) obj;
        return jl40.l(this.a, p0c0Var.a) && jl40.l(this.b, p0c0Var.b) && jl40.l(this.c, p0c0Var.c) && jl40.l(this.d, p0c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return g8e.r(b64.v("PinStyle(color=", this.a, ", legColor=", this.b, ", summaryColor="), this.c, ", textColor=", this.d, Extension.C_BRAKE);
    }
}
