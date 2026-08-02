package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class bsq {
    public final String a;
    public final String b;

    public bsq(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bsq)) {
            return false;
        }
        bsq bsqVar = (bsq) obj;
        return jl40.l(this.a, bsqVar.a) && jl40.l(this.b, bsqVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("Support(buttonText=", this.a, ", url=", this.b, Extension.C_BRAKE);
    }
}
