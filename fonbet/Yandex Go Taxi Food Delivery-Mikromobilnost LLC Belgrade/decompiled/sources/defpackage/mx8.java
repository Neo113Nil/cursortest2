package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class mx8 {
    public final String a;
    public final String b;

    public mx8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mx8)) {
            return false;
        }
        mx8 mx8Var = (mx8) obj;
        return jl40.l(this.a, mx8Var.a) && jl40.l(this.b, mx8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("CarouselIndicatorsStyle(selectedColor=", this.a, ", unselectedColor=", this.b, Extension.C_BRAKE);
    }
}
