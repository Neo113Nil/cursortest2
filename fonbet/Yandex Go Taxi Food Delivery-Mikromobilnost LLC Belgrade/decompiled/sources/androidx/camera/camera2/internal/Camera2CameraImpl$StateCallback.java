package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import android.os.SystemClock;
import defpackage.b64;
import defpackage.c06;
import defpackage.d6z;
import defpackage.ht7;
import defpackage.sgb1;
import defpackage.yci0;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
final class Camera2CameraImpl$StateCallback extends CameraDevice.StateCallback {
    private final j mCameraReopenMonitor;
    private final Executor mExecutor;
    ScheduledFuture<?> mScheduledReopenHandle;
    private k mScheduledReopenRunnable;
    private final ScheduledExecutorService mScheduler;
    final /* synthetic */ l this$0;

    public Camera2CameraImpl$StateCallback(l lVar, Executor executor, ScheduledExecutorService scheduledExecutorService, long j) {
        this.this$0 = lVar;
        this.mExecutor = executor;
        this.mScheduler = scheduledExecutorService;
        this.mCameraReopenMonitor = new j(this, j);
    }

    private void handleErrorOnOpen(CameraDevice cameraDevice, int i) {
        d6z.y("Attempt to handle open error from non open state: " + this.this$0.x, this.this$0.x == Camera2CameraImpl$InternalState.OPENING || this.this$0.x == Camera2CameraImpl$InternalState.OPENED || this.this$0.x == Camera2CameraImpl$InternalState.CONFIGURED || this.this$0.x == Camera2CameraImpl$InternalState.REOPENING || this.this$0.x == Camera2CameraImpl$InternalState.REOPENING_QUIRK);
        if (i == 1 || i == 2 || i == 4) {
            cameraDevice.getId();
            sgb1.g(3, "Camera2CameraImpl");
            reopenCameraAfterError(i);
            return;
        }
        sgb1.d("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + Extension.COLON_SPACE + l.y(i) + " closing camera.");
        this.this$0.H(Camera2CameraImpl$InternalState.CLOSING, new androidx.camera.core.b(i == 3 ? 5 : 6, null), true);
        this.this$0.t();
    }

    private void reopenCameraAfterError(int i) {
        d6z.y("Can only reopen camera device after error if the camera device is actually in an error state.", this.this$0.E != 0);
        this.this$0.H(Camera2CameraImpl$InternalState.REOPENING, new androidx.camera.core.b(i != 1 ? i != 2 ? 3 : 1 : 2, null), true);
        this.this$0.t();
    }

    public boolean cancelScheduledReopen() {
        if (this.mScheduledReopenHandle == null) {
            return false;
        }
        this.this$0.w("Cancelling scheduled re-open: " + this.mScheduledReopenRunnable);
        this.mScheduledReopenRunnable.b = true;
        this.mScheduledReopenRunnable = null;
        this.mScheduledReopenHandle.cancel(false);
        this.mScheduledReopenHandle = null;
        return true;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        this.this$0.w("CameraDevice.onClosed()");
        d6z.y("Unexpected onClose callback on camera device: " + cameraDevice, this.this$0.D == null);
        int ordinal = this.this$0.x.ordinal();
        if (ordinal == 1 || ordinal == 5) {
            d6z.y(null, this.this$0.J.isEmpty());
            this.this$0.u();
            return;
        }
        if (ordinal != 6 && ordinal != 7) {
            yci0.t(this.this$0.x, "Camera closed while in state: ");
            return;
        }
        l lVar = this.this$0;
        int i = lVar.E;
        if (i == 0) {
            lVar.L(false);
        } else {
            lVar.w("Camera closed due to error: ".concat(l.y(i)));
            scheduleCameraReopen();
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        this.this$0.w("CameraDevice.onDisconnected()");
        onError(cameraDevice, 1);
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        l lVar = this.this$0;
        lVar.D = cameraDevice;
        lVar.E = i;
        c06 c06Var = lVar.h0;
        ((l) c06Var.b).w("Camera receive onErrorCallback");
        c06Var.g();
        int ordinal = this.this$0.x.ordinal();
        if (ordinal != 1) {
            switch (ordinal) {
                case 5:
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    cameraDevice.getId();
                    this.this$0.x.name();
                    sgb1.g(3, "Camera2CameraImpl");
                    handleErrorOnOpen(cameraDevice, i);
                    break;
                default:
                    yci0.t(this.this$0.x, "onError() should not be possible from state: ");
                    break;
            }
            return;
        }
        String id = cameraDevice.getId();
        String y = l.y(i);
        String name = this.this$0.x.name();
        StringBuilder v = b64.v("CameraDevice.onError(): ", id, " failed with ", y, " while in ");
        v.append(name);
        v.append(" state. Will finish closing camera.");
        sgb1.d("Camera2CameraImpl", v.toString());
        this.this$0.t();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
        this.this$0.w("CameraDevice.onOpened()");
        l lVar = this.this$0;
        lVar.D = cameraDevice;
        lVar.E = 0;
        resetReopenMonitor();
        int ordinal = this.this$0.x.ordinal();
        if (ordinal == 1 || ordinal == 5) {
            d6z.y(null, this.this$0.J.isEmpty());
            this.this$0.D.close();
            this.this$0.D = null;
        } else {
            if (ordinal != 6 && ordinal != 7 && ordinal != 8) {
                yci0.t(this.this$0.x, "onOpened() should not be possible from state: ");
                return;
            }
            this.this$0.G(Camera2CameraImpl$InternalState.OPENED);
            ht7 ht7Var = this.this$0.N;
            String id = cameraDevice.getId();
            l lVar2 = this.this$0;
            if (ht7Var.e(id, lVar2.M.c(lVar2.D.getId()))) {
                this.this$0.E();
            }
        }
    }

    public void resetReopenMonitor() {
        this.mCameraReopenMonitor.b = -1L;
    }

    public void scheduleCameraReopen() {
        d6z.y(null, this.mScheduledReopenRunnable == null);
        d6z.y(null, this.mScheduledReopenHandle == null);
        j jVar = this.mCameraReopenMonitor;
        jVar.getClass();
        long uptimeMillis = SystemClock.uptimeMillis();
        if (jVar.b == -1) {
            jVar.b = uptimeMillis;
        }
        if (uptimeMillis - jVar.b >= jVar.b()) {
            jVar.b = -1L;
            sgb1.d("Camera2CameraImpl", "Camera reopening attempted for " + this.mCameraReopenMonitor.b() + "ms without success.");
            this.this$0.H(Camera2CameraImpl$InternalState.PENDING_OPEN, null, false);
            return;
        }
        this.mScheduledReopenRunnable = new k(this, this.mExecutor);
        this.this$0.w("Attempting camera re-open in " + this.mCameraReopenMonitor.a() + "ms: " + this.mScheduledReopenRunnable + " activeResuming = " + this.this$0.d0);
        this.mScheduledReopenHandle = this.mScheduler.schedule(this.mScheduledReopenRunnable, (long) this.mCameraReopenMonitor.a(), TimeUnit.MILLISECONDS);
    }

    public boolean shouldActiveResume() {
        l lVar = this.this$0;
        if (!lVar.d0) {
            return false;
        }
        int i = lVar.E;
        return i == 1 || i == 2;
    }
}
