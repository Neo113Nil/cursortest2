package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lu11 implements hmm {
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public lu11(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu11)) {
            return false;
        }
        lu11 lu11Var = (lu11) obj;
        return this.a == lu11Var.a && this.b == lu11Var.b && this.c == lu11Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + unr0.e(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return x4e.i(qv10.u("UiVisibilityState(isVisible=", ", isNotificationCameraVisible=", ", isLocationButtonVisible=", this.a, this.b), this.c, Extension.C_BRAKE);
    }
}
