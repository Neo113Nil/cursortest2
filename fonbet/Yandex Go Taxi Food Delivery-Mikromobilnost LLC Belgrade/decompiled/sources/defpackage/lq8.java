package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class lq8 extends ye0 {
    public final int b;
    public final String c;
    public final String w;
    public final String x;
    public final Integer y;

    public lq8(int i, Integer num, String str, String str2, String str3) {
        super("care.button_take_photo");
        this.b = i;
        this.c = str;
        this.w = str2;
        this.x = str3;
        this.y = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lq8)) {
            return false;
        }
        lq8 lq8Var = (lq8) obj;
        return this.b == lq8Var.b && jl40.l(this.c, lq8Var.c) && this.w.equals(lq8Var.w) && this.x.equals(lq8Var.x) && jl40.l(this.y, lq8Var.y);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(Integer.hashCode(this.b) * 31, 31, this.c), 31, this.w), 31, this.x);
        Integer num = this.y;
        return b + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.b, "ButtonTakePhoto(step=", ", type=", this.c, ", cameraType=");
        g8e.D(v, this.w, ", captureMethod=", this.x, ", timerDuration=");
        return oo31.j(v, this.y, Extension.C_BRAKE);
    }
}
