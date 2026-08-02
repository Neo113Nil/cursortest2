package androidx.camera.camera2.internal;

import defpackage.c06;
import defpackage.d6z;
import defpackage.sk7;
import java.util.LinkedHashSet;

/* loaded from: classes10.dex */
public final /* synthetic */ class i implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sk7 sk7Var = (sk7) obj;
                Camera2CameraImpl$InternalState camera2CameraImpl$InternalState = ((l) ((c06) sk7Var.w).b).x;
                Camera2CameraImpl$InternalState camera2CameraImpl$InternalState2 = Camera2CameraImpl$InternalState.OPENING;
                c06 c06Var = (c06) sk7Var.w;
                if (camera2CameraImpl$InternalState == camera2CameraImpl$InternalState2) {
                    ((l) c06Var.b).w("Camera onError timeout, reopen it.");
                    ((l) ((c06) sk7Var.w).b).G(Camera2CameraImpl$InternalState.REOPENING);
                    ((l) ((c06) sk7Var.w).b).B.scheduleCameraReopen();
                    break;
                } else {
                    ((l) c06Var.b).w("Camera skip reopen at state: " + ((l) ((c06) sk7Var.w).b).x);
                    break;
                }
            case 1:
                k kVar = (k) obj;
                if (!kVar.b) {
                    d6z.y(null, kVar.c.this$0.x == Camera2CameraImpl$InternalState.REOPENING || kVar.c.this$0.x == Camera2CameraImpl$InternalState.REOPENING_QUIRK);
                    boolean shouldActiveResume = kVar.c.shouldActiveResume();
                    l lVar = kVar.c.this$0;
                    if (!shouldActiveResume) {
                        lVar.L(true);
                        break;
                    } else {
                        lVar.K(true);
                        break;
                    }
                }
                break;
            default:
                CaptureSessionRepository$1.lambda$forceOnClosedCaptureSessions$0((LinkedHashSet) obj);
                break;
        }
    }
}
