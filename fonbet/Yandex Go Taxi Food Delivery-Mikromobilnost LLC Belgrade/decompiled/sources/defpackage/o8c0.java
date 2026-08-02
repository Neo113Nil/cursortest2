package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class o8c0 {
    public final String a;
    public final String b;

    public o8c0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8c0)) {
            return false;
        }
        o8c0 o8c0Var = (o8c0) obj;
        return jl40.l(this.a, o8c0Var.a) && jl40.l(this.b, o8c0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.p("PlacesFlexContainerScreenInfo(path=", this.a, ", skeleton=", this.b, Extension.C_BRAKE);
    }
}
