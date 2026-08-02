package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ir8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;

    public ir8(int i, String str, String str2) {
        super("care.success_photo_view");
        this.b = i;
        this.c = str;
        this.w = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ir8)) {
            return false;
        }
        ir8 ir8Var = (ir8) obj;
        return this.b == ir8Var.b && jl40.l(this.c, ir8Var.c) && this.w.equals(ir8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.b, "SuccessPhotoView(step=", ", type=", this.c, ", cameraType="), this.w, Extension.C_BRAKE);
    }
}
