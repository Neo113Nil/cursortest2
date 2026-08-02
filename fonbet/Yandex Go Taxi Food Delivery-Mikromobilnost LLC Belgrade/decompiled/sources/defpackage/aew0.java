package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class aew0 implements cew0 {
    public final String a;
    public final String b;
    public final Float c;

    public aew0(String str, String str2, Float f) {
        this.a = str;
        this.b = str2;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aew0)) {
            return false;
        }
        aew0 aew0Var = (aew0) obj;
        return jl40.l(this.a, aew0Var.a) && jl40.l(this.b, aew0Var.b) && jl40.l(this.c, aew0Var.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Float f = this.c;
        return b + (f == null ? 0 : f.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("Rotatable(backgroundImageUrl=", this.a, ", imageUrl=", this.b, ", rotationDegrees=");
        v.append(this.c);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
