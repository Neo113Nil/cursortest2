package defpackage;

import androidx.camera.core.impl.CameraCaptureMetaData$AeState;
import androidx.camera.core.impl.CameraCaptureMetaData$AfState;
import androidx.camera.core.impl.CameraCaptureMetaData$AwbState;
import androidx.camera.core.impl.CameraCaptureMetaData$FlashState;

/* loaded from: classes10.dex */
public final class bx31 implements ap7 {
    public final ap7 a;
    public final q6x0 b;
    public final long c;

    public bx31(ap7 ap7Var, q6x0 q6x0Var, long j) {
        this.a = ap7Var;
        this.b = q6x0Var;
        this.c = j;
    }

    @Override // defpackage.ap7
    public final q6x0 b() {
        return this.b;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$FlashState d() {
        ap7 ap7Var = this.a;
        return ap7Var != null ? ap7Var.d() : CameraCaptureMetaData$FlashState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AfState f() {
        ap7 ap7Var = this.a;
        return ap7Var != null ? ap7Var.f() : CameraCaptureMetaData$AfState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final long getTimestamp() {
        ap7 ap7Var = this.a;
        if (ap7Var != null) {
            return ap7Var.getTimestamp();
        }
        long j = this.c;
        if (j != -1) {
            return j;
        }
        ny61.r("No timestamp is available.");
        return 0L;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AwbState i() {
        ap7 ap7Var = this.a;
        return ap7Var != null ? ap7Var.i() : CameraCaptureMetaData$AwbState.UNKNOWN;
    }

    @Override // defpackage.ap7
    public final CameraCaptureMetaData$AeState l() {
        ap7 ap7Var = this.a;
        return ap7Var != null ? ap7Var.l() : CameraCaptureMetaData$AeState.UNKNOWN;
    }
}
