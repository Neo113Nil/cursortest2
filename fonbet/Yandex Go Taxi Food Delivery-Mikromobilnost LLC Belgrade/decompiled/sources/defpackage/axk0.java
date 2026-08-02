package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes4.dex */
public final class axk0 {
    public static final zwk0 Companion = new zwk0();
    public final float a;
    public final float b;

    public /* synthetic */ axk0(int i, float f, float f2) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, ywk0.a.getDescriptor());
            throw null;
        }
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && axk0.class == obj.getClass()) {
            axk0 axk0Var = (axk0) obj;
            if (this.a == axk0Var.a && this.b == axk0Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("RotationAnimationSettings(startAngle=", this.a, ", endAngle=", this.b, Extension.C_BRAKE);
    }
}
