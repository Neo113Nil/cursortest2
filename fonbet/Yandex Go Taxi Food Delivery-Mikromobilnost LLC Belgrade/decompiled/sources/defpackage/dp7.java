package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class dp7 extends we11 {
    public final float a;
    public final uc4 b;

    public dp7(float f, uc4 uc4Var) {
        this.a = f;
        this.b = uc4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dp7)) {
            return false;
        }
        dp7 dp7Var = (dp7) obj;
        return Float.compare(this.a, dp7Var.a) == 0 && this.b.equals(dp7Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CameraChangeTriggerEvent(currentZoom=" + this.a + ", currentBBox=" + this.b + Extension.C_BRAKE;
    }
}
