package androidx.camera.camera2.internal;

import androidx.camera.core.impl.CameraInternal$State;
import defpackage.d6z;

/* loaded from: classes10.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ c(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.S = false;
                lVar.R = false;
                lVar.w("OpenCameraConfigAndClose is done, state: " + lVar.x);
                int ordinal = lVar.x.ordinal();
                if (ordinal != 1 && ordinal != 5) {
                    if (ordinal == 7) {
                        int i2 = lVar.E;
                        if (i2 == 0) {
                            lVar.L(false);
                            break;
                        } else {
                            lVar.w("OpenCameraConfigAndClose in error: ".concat(l.y(i2)));
                            lVar.B.scheduleCameraReopen();
                            break;
                        }
                    } else {
                        lVar.w("OpenCameraConfigAndClose finished while in state: " + lVar.x);
                        break;
                    }
                } else {
                    d6z.y(null, lVar.J.isEmpty());
                    lVar.x();
                    break;
                }
                break;
            default:
                lVar.w("Camera is removed. Updating state and cleaning up.");
                Camera2CameraImpl$InternalState camera2CameraImpl$InternalState = lVar.x;
                Camera2CameraImpl$InternalState camera2CameraImpl$InternalState2 = Camera2CameraImpl$InternalState.RELEASING;
                if (camera2CameraImpl$InternalState != camera2CameraImpl$InternalState2 && lVar.x != Camera2CameraImpl$InternalState.RELEASED) {
                    androidx.camera.core.b bVar = new androidx.camera.core.b(8, null);
                    lVar.z.a(CameraInternal$State.CLOSED, bVar);
                    lVar.H(camera2CameraImpl$InternalState2, bVar, true);
                    lVar.B.cancelScheduledReopen();
                    lVar.h0.g();
                    if (lVar.D == null) {
                        lVar.x();
                        break;
                    } else {
                        lVar.t();
                        break;
                    }
                }
                break;
        }
    }
}
