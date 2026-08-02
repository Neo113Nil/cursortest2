package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class fpu0 {
    public final int a;
    public final int b;

    public fpu0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpu0)) {
            return false;
        }
        fpu0 fpu0Var = (fpu0) obj;
        return this.a == fpu0Var.a && this.b == fpu0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ScreenshotState(playerViewVisibility=", ", topViewMainVisibility=", Extension.C_BRAKE);
    }
}
