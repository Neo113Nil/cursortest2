package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class lu1 {
    public static final ku1 Companion = new ku1();
    public final float a;
    public final float b;

    public /* synthetic */ lu1(int i, float f, float f2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ju1.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && lu1.class == obj.getClass()) {
            lu1 lu1Var = (lu1) obj;
            if (this.a == lu1Var.a && this.b == lu1Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("AlphaAnimationSettings(start=", this.a, ", end=", this.b, Extension.C_BRAKE);
    }
}
