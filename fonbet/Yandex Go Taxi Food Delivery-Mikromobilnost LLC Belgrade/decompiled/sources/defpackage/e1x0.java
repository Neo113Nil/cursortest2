package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionOnClosedNotCalledQuirk;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.ConfigureSurfaceToSecondarySessionFailQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.camera2.internal.compat.quirk.PreviewOrientationIncorrectQuirk;
import androidx.camera.camera2.internal.compat.quirk.TextureViewIsClosedQuirk;
import androidx.camera.camera2.internal.compat.workaround.b;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class e1x0 extends d1x0 {
    public final k6u n;
    public final Object o;
    public ArrayList p;
    public lry q;
    public final xi6 r;
    public final mum s;
    public final b t;
    public final w7o u;
    public final AtomicBoolean v;

    public e1x0(a73 a73Var, a73 a73Var2, u uVar, androidx.camera.core.impl.utils.executor.b bVar, k6u k6uVar, Handler handler) {
        super(uVar, bVar, k6uVar, handler);
        this.o = new Object();
        this.v = new AtomicBoolean(false);
        xi6 xi6Var = new xi6();
        xi6Var.a = a73Var2.a(TextureViewIsClosedQuirk.class);
        xi6Var.b = a73Var.a(PreviewOrientationIncorrectQuirk.class);
        xi6Var.c = a73Var.a(ConfigureSurfaceToSecondarySessionFailQuirk.class);
        this.r = xi6Var;
        this.t = new b(a73Var.a(CaptureSessionStuckQuirk.class) || a73Var.a(IncorrectCaptureStateQuirk.class));
        this.s = new mum(a73Var2);
        this.u = new w7o(a73Var2, 3);
        this.n = k6uVar;
    }

    public static void o() {
        sgb1.g(3, "SyncCaptureSessionImpl");
    }

    @Override // defpackage.d1x0, defpackage.a1x0
    public final void c(b1x0 b1x0Var) {
        gl7 gl7Var;
        synchronized (this.o) {
            this.r.b(this.p);
        }
        o();
        synchronized (this.a) {
            try {
                if (this.k) {
                    gl7Var = null;
                } else {
                    this.k = true;
                    d6z.v(this.g, "Need to call openCaptureSession before using this API.");
                    gl7Var = this.g;
                }
            } finally {
            }
        }
        synchronized (this.a) {
            try {
                List list = this.j;
                if (list != null) {
                    a.a(list);
                    this.j = null;
                }
            } finally {
            }
        }
        this.t.c();
        if (gl7Var != null) {
            gl7Var.b.c(new tpt0(28, this, b1x0Var), geb1.b());
        }
    }

    @Override // defpackage.d1x0, defpackage.a1x0
    public final void e(b1x0 b1x0Var) {
        ArrayList arrayList;
        b1x0 b1x0Var2;
        b1x0 b1x0Var3;
        b1x0 b1x0Var4;
        o();
        mum mumVar = this.s;
        u uVar = this.b;
        synchronized (uVar.b) {
            arrayList = new ArrayList(uVar.e);
        }
        ArrayList a = this.b.a();
        if (((CaptureSessionOnClosedNotCalledQuirk) mumVar.a) != null) {
            LinkedHashSet<b1x0> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (b1x0Var4 = (b1x0) it.next()) != b1x0Var) {
                linkedHashSet.add(b1x0Var4);
            }
            for (b1x0 b1x0Var5 : linkedHashSet) {
                d1x0 d1x0Var = (d1x0) b1x0Var5;
                d1x0Var.getClass();
                d1x0Var.d(b1x0Var5);
            }
        }
        Objects.requireNonNull(this.e);
        u uVar2 = this.b;
        synchronized (uVar2.b) {
            uVar2.c.add(this);
            uVar2.e.remove(this);
        }
        Iterator it2 = uVar2.b().iterator();
        while (it2.hasNext() && (b1x0Var3 = (b1x0) it2.next()) != this) {
            e1x0 e1x0Var = (e1x0) b1x0Var3;
            synchronized (e1x0Var.a) {
                try {
                    List list = e1x0Var.j;
                    if (list != null) {
                        a.a(list);
                        e1x0Var.j = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            e1x0Var.t.c();
        }
        this.e.e(b1x0Var);
        if (((CaptureSessionOnClosedNotCalledQuirk) mumVar.a) != null) {
            LinkedHashSet<b1x0> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = a.iterator();
            while (it3.hasNext() && (b1x0Var2 = (b1x0) it3.next()) != b1x0Var) {
                linkedHashSet2.add(b1x0Var2);
            }
            for (b1x0 b1x0Var6 : linkedHashSet2) {
                d1x0 d1x0Var2 = (d1x0) b1x0Var6;
                d1x0Var2.getClass();
                d1x0Var2.c(b1x0Var6);
            }
        }
    }

    @Override // defpackage.d1x0
    public final euy l(ArrayList arrayList) {
        euy l;
        synchronized (this.o) {
            this.p = arrayList;
            l = super.l(arrayList);
        }
        return l;
    }

    public final void n() {
        if (!this.v.compareAndSet(false, true)) {
            o();
            return;
        }
        if (this.u.a) {
            try {
                o();
                d6z.v(this.f, "Need to call openCaptureSession before using this API.");
                ((CameraCaptureSession) ((hh5) this.f.b).b).abortCaptures();
            } catch (Exception e) {
                e.toString();
                o();
            }
        }
        o();
        this.t.b().c(new lnv0(21, this), this.c);
    }

    public final euy p(CameraDevice cameraDevice, oyq0 oyq0Var, List list) {
        euy g;
        synchronized (this.o) {
            try {
                ArrayList a = this.b.a();
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    e1x0 e1x0Var = (e1x0) ((b1x0) it.next());
                    arrayList.add(jx81.r(new e5h(e1x0Var.t.b(), e1x0Var.n, 1500L, 2)));
                }
                lry k = ni91.k(arrayList);
                this.q = k;
                g = ni91.g(ni91.n(jqs.a(k), new f83(this, cameraDevice, oyq0Var, list, 15), this.c));
            } catch (Throwable th) {
                throw th;
            }
        }
        return g;
    }

    public final int q(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        CameraCaptureSession.CaptureCallback a = this.t.a(captureCallback);
        d6z.v(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((hh5) this.f.b).b).setSingleRepeatingRequest(captureRequest, this.c, a);
    }

    public final boolean r() {
        boolean z;
        synchronized (this.o) {
            try {
                if (j()) {
                    this.r.b(this.p);
                } else {
                    lry lryVar = this.q;
                    if (lryVar != null) {
                        lryVar.cancel(true);
                    }
                }
                try {
                    synchronized (this.a) {
                        try {
                            if (!this.l) {
                                jqs jqsVar = this.i;
                                r1 = jqsVar != null ? jqsVar : null;
                                this.l = true;
                            }
                            z = !j();
                        } finally {
                        }
                    }
                } finally {
                    if (r1 != null) {
                        r1.cancel(true);
                    }
                }
            } finally {
            }
        }
        return z;
    }
}
