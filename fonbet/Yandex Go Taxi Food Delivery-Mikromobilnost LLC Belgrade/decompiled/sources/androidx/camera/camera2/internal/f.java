package androidx.camera.camera2.internal;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.impl.DeferrableSurface;
import defpackage.a73;
import defpackage.d6z;
import defpackage.dyq0;
import defpackage.e1x0;
import defpackage.e90;
import defpackage.el7;
import defpackage.g84;
import defpackage.geb1;
import defpackage.gyq0;
import defpackage.iiv;
import defpackage.ims;
import defpackage.jqs;
import defpackage.js4;
import defpackage.jx81;
import defpackage.jyq0;
import defpackage.k6u;
import defpackage.kr7;
import defpackage.ni91;
import defpackage.nm7;
import defpackage.o89;
import defpackage.q0r0;
import defpackage.q8n;
import defpackage.qqs;
import defpackage.ro7;
import defpackage.sgb1;
import defpackage.sr4;
import defpackage.vmn0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes10.dex */
public final /* synthetic */ class f implements el7, ro7, ims {
    public final /* synthetic */ Object a;

    public /* synthetic */ f(Object obj) {
        this.a = obj;
    }

    public void a() {
        s sVar = (s) this.a;
        synchronized (sVar.a) {
            try {
                if (sVar.j == CaptureSession$State.OPENED) {
                    sVar.q(sVar.f);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.ims
    /* renamed from: apply */
    public Object mo104apply(Object obj) {
        x xVar = (x) this.a;
        s sVar = xVar.e;
        if (xVar.j == ProcessingCaptureSession$ProcessorState.SESSION_INITIALIZED) {
            List<DeferrableSurface> b = xVar.i.b();
            ArrayList arrayList = new ArrayList();
            for (DeferrableSurface deferrableSurface : b) {
                d6z.m("Surface must be SessionProcessorSurface", deferrableSurface instanceof q0r0);
                arrayList.add((q0r0) deferrableSurface);
            }
            xVar.h = new o(sVar, arrayList);
            sgb1.g(3, "ProcessingCaptureSession");
            xVar.a.a(xVar.h);
            xVar.j = ProcessingCaptureSession$ProcessorState.ON_CAPTURE_SESSION_STARTED;
            jyq0 jyq0Var = xVar.g;
            if (jyq0Var != null) {
                xVar.g(jyq0Var);
            }
            if (xVar.k != null) {
                xVar.d(xVar.k);
                xVar.k = null;
            }
        }
        return null;
    }

    @Override // defpackage.el7
    public Object j(final androidx.concurrent.futures.b bVar) {
        final l lVar = (l) this.a;
        try {
            ArrayList arrayList = new ArrayList(lVar.a.b().b().c);
            arrayList.add(lVar.V.f);
            arrayList.add(new CameraDevice.StateCallback() { // from class: androidx.camera.camera2.internal.Camera2CameraImpl$2
                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onClosed(CameraDevice cameraDevice) {
                    l.this.w("openCameraConfigAndClose camera closed");
                    bVar.b(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onDisconnected(CameraDevice cameraDevice) {
                    l.this.w("openCameraConfigAndClose camera disconnected");
                    bVar.b(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onError(CameraDevice cameraDevice, int i) {
                    l.this.w("openCameraConfigAndClose camera error " + i);
                    bVar.b(null);
                }

                @Override // android.hardware.camera2.CameraDevice.StateCallback
                public void onOpened(CameraDevice cameraDevice) {
                    l.this.w("openCameraConfigAndClose camera opened");
                    l lVar2 = l.this;
                    s sVar = new s(lVar2.f0, new a73(Collections.EMPTY_LIST), false);
                    SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                    surfaceTexture.setDefaultBufferSize(640, 480);
                    Surface surface = new Surface(surfaceTexture);
                    iiv iivVar = new iiv(surface);
                    ni91.g(iivVar.e).c(new nm7(1, surface, surfaceTexture), geb1.b());
                    dyq0 dyq0Var = new dyq0();
                    g84 a = gyq0.a(iivVar);
                    a.f = q8n.d;
                    dyq0Var.a.add(a.a());
                    dyq0Var.b.c = 1;
                    lVar2.w("Start configAndClose.");
                    jyq0 d = dyq0Var.d();
                    vmn0 vmn0Var = lVar2.W;
                    o89 n = ni91.n(jqs.a(jx81.r(new qqs(sVar.b(d, cameraDevice, new e1x0((a73) vmn0Var.x, (a73) vmn0Var.y, (u) vmn0Var.w, (androidx.camera.core.impl.utils.executor.b) vmn0Var.a, (k6u) vmn0Var.b, (Handler) vmn0Var.c)), 0))), new e90(4, sVar, iivVar), lVar2.c);
                    Objects.requireNonNull(cameraDevice);
                    n.c(new js4(27, cameraDevice), l.this.c);
                }
            });
            kr7 kr7Var = lVar.b;
            String str = lVar.C.a;
            androidx.camera.core.impl.utils.executor.b bVar2 = lVar.c;
            CameraDevice.StateCallback b = m.b(arrayList);
            sr4 sr4Var = kr7Var.a;
            sr4Var.getClass();
            try {
                ((CameraManager) sr4Var.b).openCamera(str, bVar2, b);
                return "configAndCloseTask";
            } catch (CameraAccessException e) {
                throw new CameraAccessExceptionCompat(e);
            }
        } catch (CameraAccessExceptionCompat | RuntimeException e2) {
            lVar.w("Unable to open camera for configAndClose: " + e2.getMessage());
            bVar.d(e2);
            return "configAndCloseTask";
        }
    }
}
