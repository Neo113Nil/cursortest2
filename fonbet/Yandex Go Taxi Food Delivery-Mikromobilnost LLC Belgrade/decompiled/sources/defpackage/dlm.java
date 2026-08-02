package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dlm {
    public static final dlm c = new dlm(false, false);
    public final boolean a;
    public final boolean b;

    public dlm(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlm)) {
            return false;
        }
        dlm dlmVar = (dlm) obj;
        return this.a == dlmVar.a && this.b == dlmVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + unr0.e(Boolean.hashCode(true) * 31, 31, this.a);
    }

    public final String toString() {
        return ly3.o("DrivingRootPayload(focusUserOnAttach=true, cameraToUserPositionWithoutAnimation=", ", proposeFinishOnExit=", Extension.C_BRAKE, this.a, this.b);
    }
}
