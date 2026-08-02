package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class iq8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;

    public iq8(int i, String str, String str2) {
        super("care.button_retake_photo");
        this.b = i;
        this.c = str;
        this.w = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iq8)) {
            return false;
        }
        iq8 iq8Var = (iq8) obj;
        return this.b == iq8Var.b && jl40.l(this.c, iq8Var.c) && this.w.equals(iq8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.b, "ButtonRetakePhoto(step=", ", type=", this.c, ", cameraType="), this.w, Extension.C_BRAKE);
    }
}
