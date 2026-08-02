package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import xsna.ub9;

/* compiled from: FocusMeteringControl.java */
/* loaded from: classes11.dex */
public final class awr extends gg9 {
    public final /* synthetic */ ub9.a a;

    public awr(ub9.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.gg9
    public final void a() {
        ub9.a aVar = this.a;
        if (aVar != null) {
            aVar.d(new CameraControl$OperationCanceledException("Camera is closed"));
        }
    }

    @Override // xsna.gg9
    public final void b(@NonNull he9 he9Var) {
        this.a.b(he9Var);
    }

    @Override // xsna.gg9
    public final void c(@NonNull CameraCaptureFailure cameraCaptureFailure) {
        this.a.d(new CameraControlInternal.CameraControlException(cameraCaptureFailure));
    }
}
