package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class cu31 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final boolean h;

    public cu31(float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = f6;
        this.g = f7;
        this.h = z;
    }

    public static cu31 a(cu31 cu31Var, float f, float f2, float f3, boolean z, int i) {
        if ((i & 1) != 0) {
            f = cu31Var.a;
        }
        float f4 = f;
        if ((i & 2) != 0) {
            f2 = cu31Var.b;
        }
        float f5 = f2;
        if ((i & 4) != 0) {
            f3 = cu31Var.c;
        }
        float f6 = f3;
        float f7 = cu31Var.d;
        float f8 = cu31Var.e;
        float f9 = cu31Var.f;
        float f10 = cu31Var.g;
        if ((i & 128) != 0) {
            z = cu31Var.h;
        }
        cu31Var.getClass();
        return new cu31(f4, f5, f6, f7, f8, f9, f10, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu31)) {
            return false;
        }
        cu31 cu31Var = (cu31) obj;
        return Float.compare(this.a, cu31Var.a) == 0 && Float.compare(this.b, cu31Var.b) == 0 && Float.compare(this.c, cu31Var.c) == 0 && Float.compare(this.d, cu31Var.d) == 0 && Float.compare(this.e, cu31Var.e) == 0 && Float.compare(this.f, cu31Var.f) == 0 && Float.compare(this.g, cu31Var.g) == 0 && this.h == cu31Var.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + g8e.c(this.g, g8e.c(this.f, g8e.c(this.e, g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder k = oo31.k("ViewProperties(spinnerRadiusPercent=", this.a, ", circumference=", this.b, ", initialSpinnerWidth=");
        vfc.x(k, this.c, ", iconRadiusPercent=", this.d, ", backgroundRadiusPercent=");
        vfc.x(k, this.e, ", size=", this.f, ", errorIconScale=");
        k.append(this.g);
        k.append(", isScaleStrokeWidthEnabled=");
        k.append(this.h);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
