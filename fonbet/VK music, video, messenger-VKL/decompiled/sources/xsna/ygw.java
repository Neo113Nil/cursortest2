package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraCaptureFailure;
import xsna.ub9;
import xsna.ugw;

/* compiled from: ImageCapture.java */
/* loaded from: classes11.dex */
public final class ygw extends gg9 {
    public final /* synthetic */ ub9.a a;

    public ygw(ub9.a aVar) {
        this.a = aVar;
    }

    @Override // xsna.gg9
    public final void a() {
        this.a.d(new ah9("Capture request is cancelled because camera is closed"));
    }

    @Override // xsna.gg9
    public final void b(@NonNull he9 he9Var) {
        this.a.b(null);
    }

    @Override // xsna.gg9
    public final void c(@NonNull CameraCaptureFailure cameraCaptureFailure) {
        this.a.d(new ugw.e("Capture request failed with reason " + cameraCaptureFailure.a));
    }
}
