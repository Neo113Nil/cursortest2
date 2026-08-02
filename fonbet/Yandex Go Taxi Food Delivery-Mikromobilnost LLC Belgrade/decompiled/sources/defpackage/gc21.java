package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class gc21 extends hc21 {
    public final String a;
    public final String b;

    public gc21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gc21)) {
            return false;
        }
        gc21 gc21Var = (gc21) obj;
        return jl40.l(this.a, gc21Var.a) && jl40.l(this.b, gc21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Success(uploadedImagePath=", this.a, ", downloadLink=", this.b, Extension.C_BRAKE);
    }
}
