package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class cp81 {
    public static final cp81 g = new cp81(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;

    public cp81(float f, float f2, float f3, float f4, float f5, float f6) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp81)) {
            return false;
        }
        cp81 cp81Var = (cp81) obj;
        return Float.compare(this.a, cp81Var.a) == 0 && Float.compare(this.b, cp81Var.b) == 0 && Float.compare(this.c, cp81Var.c) == 0 && Float.compare(this.d, cp81Var.d) == 0 && Float.compare(this.e, cp81Var.e) == 0 && Float.compare(this.f, cp81Var.f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f) + g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("DisplayInsetsF(left=", this.a, ", top=", this.b, ", right=");
        vfc.x(k, this.c, ", bottom=", this.d, ", cutoutTop=");
        return ly3.q(k, this.e, ", cutoutBottom=", this.f, Extension.C_BRAKE);
    }
}
