package androidx.camera.camera2.internal;

import android.hardware.camera2.CameraDevice;
import androidx.camera.core.impl.DeferrableSurface;
import defpackage.b1x0;
import defpackage.d1x0;
import defpackage.e1x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes10.dex */
class CaptureSessionRepository$1 extends CameraDevice.StateCallback {
    final /* synthetic */ u this$0;

    public CaptureSessionRepository$1(u uVar) {
        this.this$0 = uVar;
    }

    private void cameraClosed() {
        ArrayList b;
        synchronized (this.this$0.b) {
            b = this.this$0.b();
            this.this$0.e.clear();
            this.this$0.c.clear();
            this.this$0.d.clear();
        }
        Iterator it = b.iterator();
        while (it.hasNext()) {
            e1x0 e1x0Var = (e1x0) ((b1x0) it.next());
            synchronized (e1x0Var.a) {
                try {
                    List list = e1x0Var.j;
                    if (list != null) {
                        androidx.camera.core.impl.a.a(list);
                        e1x0Var.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e1x0Var.t.c();
        }
    }

    private void dispatchOnError(final int i) {
        final LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.this$0.b) {
            linkedHashSet.addAll(this.this$0.e);
            linkedHashSet.addAll(this.this$0.c);
        }
        this.this$0.a.execute(new Runnable() { // from class: androidx.camera.camera2.internal.t
            @Override // java.lang.Runnable
            public final void run() {
                CaptureSessionRepository$1.lambda$dispatchOnError$1(linkedHashSet, i);
            }
        });
    }

    private void forceOnClosedCaptureSessions() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        synchronized (this.this$0.b) {
            linkedHashSet.addAll(this.this$0.e);
            linkedHashSet.addAll(this.this$0.c);
        }
        this.this$0.a.execute(new i(2, linkedHashSet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$dispatchOnError$1(LinkedHashSet linkedHashSet, int i) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            e1x0 e1x0Var = (e1x0) ((b1x0) it.next());
            if (i == 5) {
                synchronized (e1x0Var.o) {
                    try {
                        if (e1x0Var.j() && e1x0Var.p != null) {
                            e1x0.o();
                            Iterator it2 = e1x0Var.p.iterator();
                            while (it2.hasNext()) {
                                ((DeferrableSurface) it2.next()).a();
                            }
                        }
                    } finally {
                    }
                }
            } else {
                e1x0Var.getClass();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void lambda$forceOnClosedCaptureSessions$0(LinkedHashSet linkedHashSet) {
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            b1x0 b1x0Var = (b1x0) it.next();
            d1x0 d1x0Var = (d1x0) b1x0Var;
            d1x0Var.getClass();
            d1x0Var.c(b1x0Var);
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onClosed(CameraDevice cameraDevice) {
        forceOnClosedCaptureSessions();
        cameraClosed();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onDisconnected(CameraDevice cameraDevice) {
        forceOnClosedCaptureSessions();
        cameraClosed();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onError(CameraDevice cameraDevice, int i) {
        forceOnClosedCaptureSessions();
        dispatchOnError(i);
        cameraClosed();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public void onOpened(CameraDevice cameraDevice) {
    }
}
