package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pq8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;

    public pq8(int i, String str, String str2) {
        super("care.close_camera_alert_view");
        this.b = i;
        this.c = str;
        this.w = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pq8)) {
            return false;
        }
        pq8 pq8Var = (pq8) obj;
        return this.b == pq8Var.b && jl40.l(this.c, pq8Var.c) && this.w.equals(pq8Var.w);
    }

    public final int hashCode() {
        return this.w.hashCode() + unr0.b(Integer.hashCode(this.b) * 31, 31, this.c);
    }

    public final String toString() {
        return oyr.t(unr0.v(this.b, "CloseCameraAlertView(step=", ", type=", this.c, ", cameraType="), this.w, Extension.C_BRAKE);
    }
}
