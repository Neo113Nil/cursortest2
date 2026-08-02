package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class nq8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;

    public nq8(int i, String str, String str2) {
        super("care.camera_photo_view");
        this.b = i;
        this.c = str;
        this.w = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq8)) {
            return false;
        }
        nq8 nq8Var = (nq8) obj;
        return this.b == nq8Var.b && jl40.l(this.c, nq8Var.c) && this.w.equals(nq8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.b, "CameraPhotoView(step=", ", type=", this.c, ", cameraType="), this.w, Extension.C_BRAKE);
    }
}
