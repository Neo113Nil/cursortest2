package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.common.liveness.CameraType;

/* loaded from: classes4.dex */
public final class lib0 implements tt11 {
    public final cj91 a;
    public final CameraType b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;

    public lib0(cj91 cj91Var, CameraType cameraType, boolean z, boolean z2, boolean z3, int i) {
        this.a = cj91Var;
        this.b = cameraType;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = i;
    }

    public static lib0 a(lib0 lib0Var, cj91 cj91Var, CameraType cameraType, boolean z, boolean z2, boolean z3, int i, int i2) {
        if ((i2 & 1) != 0) {
            cj91Var = lib0Var.a;
        }
        cj91 cj91Var2 = cj91Var;
        if ((i2 & 2) != 0) {
            cameraType = lib0Var.b;
        }
        CameraType cameraType2 = cameraType;
        if ((i2 & 4) != 0) {
            z = lib0Var.c;
        }
        boolean z4 = z;
        if ((i2 & 8) != 0) {
            z2 = lib0Var.d;
        }
        boolean z5 = z2;
        if ((i2 & 16) != 0) {
            z3 = lib0Var.e;
        }
        boolean z6 = z3;
        if ((i2 & 32) != 0) {
            i = lib0Var.f;
        }
        lib0Var.getClass();
        return new lib0(cj91Var2, cameraType2, z4, z5, z6, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lib0)) {
            return false;
        }
        lib0 lib0Var = (lib0) obj;
        return jl40.l(this.a, lib0Var.a) && this.b == lib0Var.b && this.c == lib0Var.c && this.d == lib0Var.d && this.e == lib0Var.e && this.f == lib0Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + unr0.e(unr0.e(unr0.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PhotoRecordingState(capturingState=");
        sb.append(this.a);
        sb.append(", cameraType=");
        sb.append(this.b);
        sb.append(", isSwitchCameraAllowed=");
        nnm.v(", isProcessingWidgetVisible=", ", isSuccessfulVerificationWidgetVisible=", sb, this.c, this.d);
        sb.append(this.e);
        sb.append(", processingTitleRes=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }

    public lib0() {
        this(0);
    }

    public /* synthetic */ lib0(int i) {
        this(mgb0.b, CameraType.FRONT, true, false, false, kzh0.ebssdk_processing_tv_text);
    }
}
