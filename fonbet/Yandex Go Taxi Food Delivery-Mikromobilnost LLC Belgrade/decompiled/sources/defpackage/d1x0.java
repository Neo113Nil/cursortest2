package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.camera2.internal.u;
import androidx.camera.core.impl.a;
import androidx.camera.core.impl.utils.executor.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;

/* loaded from: classes10.dex */
public abstract class d1x0 extends a1x0 implements b1x0 {
    public final u b;
    public final b c;
    public final k6u d;
    public f1x0 e;
    public pm5 f;
    public gl7 g;
    public androidx.concurrent.futures.b h;
    public jqs i;
    public final Object a = new Object();
    public List j = null;
    public boolean k = false;
    public boolean l = false;
    public boolean m = false;

    public d1x0(u uVar, b bVar, k6u k6uVar, Handler handler) {
        this.b = uVar;
        this.c = bVar;
        this.d = k6uVar;
    }

    @Override // defpackage.a1x0
    public final void a(b1x0 b1x0Var) {
        Objects.requireNonNull(this.e);
        this.e.a(b1x0Var);
    }

    @Override // defpackage.a1x0
    public final void b(b1x0 b1x0Var) {
        Objects.requireNonNull(this.e);
        this.e.b(b1x0Var);
    }

    @Override // defpackage.a1x0
    public abstract void c(b1x0 b1x0Var);

    @Override // defpackage.a1x0
    public final void d(b1x0 b1x0Var) {
        b1x0 b1x0Var2;
        Objects.requireNonNull(this.e);
        e1x0 e1x0Var = (e1x0) this;
        synchronized (e1x0Var.a) {
            try {
                List list = e1x0Var.j;
                if (list != null) {
                    a.a(list);
                    e1x0Var.j = null;
                }
            } finally {
            }
        }
        e1x0Var.t.c();
        u uVar = this.b;
        Iterator it = uVar.b().iterator();
        while (it.hasNext() && (b1x0Var2 = (b1x0) it.next()) != this) {
            e1x0 e1x0Var2 = (e1x0) b1x0Var2;
            synchronized (e1x0Var2.a) {
                try {
                    List list2 = e1x0Var2.j;
                    if (list2 != null) {
                        a.a(list2);
                        e1x0Var2.j = null;
                    }
                } finally {
                }
            }
            e1x0Var2.t.c();
        }
        synchronized (uVar.b) {
            uVar.e.remove(this);
        }
        this.e.d(b1x0Var);
    }

    @Override // defpackage.a1x0
    public abstract void e(b1x0 b1x0Var);

    @Override // defpackage.a1x0
    public final void f(b1x0 b1x0Var) {
        Objects.requireNonNull(this.e);
        this.e.f(b1x0Var);
    }

    @Override // defpackage.a1x0
    public final void g(b1x0 b1x0Var) {
        gl7 gl7Var;
        synchronized (this.a) {
            try {
                if (this.m) {
                    gl7Var = null;
                } else {
                    this.m = true;
                    d6z.v(this.g, "Need to call openCaptureSession before using this API.");
                    gl7Var = this.g;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (gl7Var != null) {
            gl7Var.b.c(new tpt0(29, this, b1x0Var), geb1.b());
        }
    }

    @Override // defpackage.a1x0
    public final void h(b1x0 b1x0Var, Surface surface) {
        Objects.requireNonNull(this.e);
        this.e.h(b1x0Var, surface);
    }

    public final void i(CameraCaptureSession cameraCaptureSession) {
        if (this.f == null) {
            this.f = new pm5(cameraCaptureSession);
        }
    }

    public final boolean j() {
        boolean z;
        synchronized (this.a) {
            z = this.g != null;
        }
        return z;
    }

    public final int k(List list, CameraCaptureSession.CaptureCallback captureCallback) {
        d6z.v(this.f, "Need to call openCaptureSession before using this API.");
        return ((CameraCaptureSession) ((hh5) this.f.b).b).setRepeatingBurstRequests(list, this.c, captureCallback);
    }

    public euy l(ArrayList arrayList) {
        synchronized (this.a) {
            try {
                if (this.l) {
                    return new hiv(1, new CancellationException("Opener is disabled"));
                }
                o89 n = ni91.n(jqs.a(a.c(arrayList, this.c, this.d)), new r3k0(16, this, arrayList), this.c);
                this.i = n;
                return ni91.g(n);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final pm5 m() {
        this.f.getClass();
        return this.f;
    }
}
