package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import xsna.snw;
import xsna.ub9;
import xsna.von0;
import xsna.zon0;

/* compiled from: SynchronizedCaptureSessionBaseImpl.java */
/* loaded from: classes11.dex */
public class xon0 extends von0.a implements von0, zon0.b {

    @NonNull
    public final hs9 b;

    @NonNull
    public final Executor c;

    @NonNull
    public final ScheduledExecutorService d;

    @Nullable
    public apn0 e;

    @Nullable
    public jg9 f;

    @Nullable
    public ub9.d g;

    @Nullable
    public ub9.a<Void> h;

    @Nullable
    public p0t i;
    public final Object a = new Object();
    public boolean j = false;
    public boolean k = false;

    public xon0(@NonNull hs9 hs9Var, @NonNull Executor executor, @NonNull ScheduledExecutorService scheduledExecutorService, @NonNull Handler handler) {
        this.b = hs9Var;
        this.c = executor;
        this.d = scheduledExecutorService;
    }

    @Override // xsna.zon0.b
    @NonNull
    public ugz a(@NonNull ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.k) {
                    return new snw.a(new CancellationException("Opener is disabled"));
                }
                Executor executor = this.c;
                ScheduledExecutorService scheduledExecutorService = this.d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((DeferrableSurface) it.next()).c());
                }
                p0t a = p0t.a(ub9.a(new wrl(arrayList2, scheduledExecutorService, executor)));
                jx0 jx0Var = new jx0(this, arrayList);
                Executor executor2 = this.c;
                a.getClass();
                ora g = r0t.g(a, jx0Var, executor2);
                this.i = g;
                return r0t.e(g);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.von0
    @NonNull
    public final jg9 b() {
        this.f.getClass();
        return this.f;
    }

    @Override // xsna.von0
    public int c(@NonNull CaptureRequest captureRequest, @NonNull af9 af9Var) throws CameraAccessException {
        obr.e(this.f, "Need to call openCaptureSession before using this API.");
        return this.f.a.a.setSingleRepeatingRequest(captureRequest, this.c, af9Var);
    }

    @Override // xsna.von0
    public void close() {
        obr.e(this.f, "Need to call openCaptureSession before using this API.");
        hs9 hs9Var = this.b;
        synchronized (hs9Var.b) {
            hs9Var.d.add(this);
        }
        this.f.a.a.close();
    }

    @Override // xsna.von0
    @NonNull
    public ugz<Void> d(@NonNull String str) {
        return snw.c.c;
    }

    @Override // xsna.zon0.b
    @NonNull
    public ugz<Void> f(@NonNull CameraDevice cameraDevice, @NonNull zsi0 zsi0Var) {
        synchronized (this.a) {
            try {
                if (this.k) {
                    return new snw.a(new CancellationException("Opener is disabled"));
                }
                hs9 hs9Var = this.b;
                synchronized (hs9Var.b) {
                    hs9Var.e.add(this);
                }
                ub9.d a = ub9.a(new d3u(this, new mh9(cameraDevice), zsi0Var));
                this.g = a;
                return r0t.e(a);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.von0.a
    public final void g(@NonNull xon0 xon0Var) {
        this.e.g(xon0Var);
    }

    @Override // xsna.von0.a
    public final void h(@NonNull xon0 xon0Var) {
        this.e.h(xon0Var);
    }

    @Override // xsna.von0.a
    public void i(@NonNull von0 von0Var) {
        ub9.d dVar;
        synchronized (this.a) {
            try {
                if (this.j) {
                    dVar = null;
                } else {
                    this.j = true;
                    obr.e(this.g, "Need to call openCaptureSession before using this API.");
                    dVar = this.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (dVar != null) {
            dVar.c.addListener(new v9j(7, this, von0Var), xo9.g());
        }
    }

    @Override // xsna.von0.a
    public final void j(@NonNull von0 von0Var) {
        hs9 hs9Var = this.b;
        synchronized (hs9Var.b) {
            hs9Var.e.remove(this);
        }
        this.e.j(von0Var);
    }

    @Override // xsna.von0.a
    public void k(@NonNull xon0 xon0Var) {
        hs9 hs9Var = this.b;
        synchronized (hs9Var.b) {
            hs9Var.c.add(this);
            hs9Var.e.remove(this);
        }
        this.e.k(xon0Var);
    }

    @Override // xsna.von0.a
    public final void l(@NonNull xon0 xon0Var) {
        this.e.l(xon0Var);
    }

    @Override // xsna.von0.a
    public final void m(@NonNull xon0 xon0Var, @NonNull Surface surface) {
        this.e.m(xon0Var, surface);
    }

    public final void n(@NonNull CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new jg9(cameraCaptureSession);
        }
    }

    @NonNull
    public final CameraDevice o() {
        this.f.getClass();
        return this.f.a.a.getDevice();
    }

    public final void p() throws CameraAccessException {
        obr.e(this.f, "Need to call openCaptureSession before using this API.");
        this.f.a.a.stopRepeating();
    }

    @Override // xsna.zon0.b
    public boolean stop() {
        boolean z;
        boolean z2;
        try {
            synchronized (this.a) {
                try {
                    if (!this.k) {
                        p0t p0tVar = this.i;
                        r1 = p0tVar != null ? p0tVar : null;
                        this.k = true;
                    }
                    synchronized (this.a) {
                        z = this.g != null;
                    }
                    z2 = !z;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z2;
        } finally {
            if (r1 != null) {
                r1.cancel(true);
            }
        }
    }

    @Override // xsna.von0
    @NonNull
    public final xon0 e() {
        return this;
    }
}
