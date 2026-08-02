package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class mm70 implements nm70 {
    public final String a;
    public final String b;

    public mm70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm70)) {
            return false;
        }
        mm70 mm70Var = (mm70) obj;
        return jl40.l(this.a, mm70Var.a) && jl40.l(this.b, mm70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ImageWithOverlayImage(primaryImageUrl=", this.a, ", overlayImageUrl=", this.b, Extension.C_BRAKE);
    }
}
