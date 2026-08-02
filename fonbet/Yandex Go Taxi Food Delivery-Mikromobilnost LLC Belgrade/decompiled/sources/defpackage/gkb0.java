package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gkb0 {
    public final String a;
    public final String b;

    public gkb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gkb0)) {
            return false;
        }
        gkb0 gkb0Var = (gkb0) obj;
        return jl40.l(this.a, gkb0Var.a) && jl40.l(this.b, gkb0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("PhotocommentData(uploadedImagePath=", this.a, ", downloadUrl=", this.b, Extension.C_BRAKE);
    }
}
