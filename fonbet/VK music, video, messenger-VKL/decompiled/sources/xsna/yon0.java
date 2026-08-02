package xsna;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.DeferrableSurface;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import xsna.snw;
import xsna.ub9;

/* compiled from: SynchronizedCaptureSessionImpl.java */
/* loaded from: classes11.dex */
public final class yon0 extends xon0 {
    public final Object l;

    @NonNull
    public final Set<String> m;

    @NonNull
    public final ugz<Void> n;
    public ub9.a<Void> o;

    @Nullable
    public final ugz<Void> p;

    @Nullable
    public ub9.a<Void> q;

    @Nullable
    public ArrayList r;

    @Nullable
    public p0t s;

    @Nullable
    public p0t t;
    public boolean u;
    public final a v;

    /* compiled from: SynchronizedCaptureSessionImpl.java */
    public class a extends CameraCaptureSession.CaptureCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureSequenceAborted(@NonNull CameraCaptureSession cameraCaptureSession, int i) {
            yon0 yon0Var = yon0.this;
            ub9.a<Void> aVar = yon0Var.o;
            if (aVar != null) {
                aVar.c();
                yon0Var.o = null;
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public final void onCaptureStarted(@NonNull CameraCaptureSession cameraCaptureSession, @NonNull CaptureRequest captureRequest, long j, long j2) {
            yon0 yon0Var = yon0.this;
            ub9.a<Void> aVar = yon0Var.o;
            if (aVar != null) {
                aVar.b(null);
                yon0Var.o = null;
            }
        }
    }

    public yon0(@NonNull HashSet hashSet, @NonNull hs9 hs9Var, @NonNull tli0 tli0Var, @NonNull mtu mtuVar, @NonNull Handler handler) {
        super(hs9Var, tli0Var, mtuVar, handler);
        this.l = new Object();
        this.v = new a();
        this.m = hashSet;
        boolean contains = hashSet.contains("wait_for_request");
        snw.c cVar = snw.c.c;
        if (contains) {
            this.n = ub9.a(new wii0(this, 6));
        } else {
            this.n = cVar;
        }
        if (hashSet.contains("deferrableSurface_close")) {
            this.p = ub9.a(new tuz(this, 16));
        } else {
            this.p = cVar;
        }
    }

    @Override // xsna.xon0, xsna.zon0.b
    @NonNull
    public final ugz a(@NonNull ArrayList arrayList) {
        ugz e;
        HashMap hashMap;
        synchronized (this.l) {
            try {
                this.r = arrayList;
                List list = Collections.EMPTY_LIST;
                if (this.m.contains("force_close")) {
                    hs9 hs9Var = this.b;
                    synchronized (hs9Var.b) {
                        hs9Var.f.put(this, arrayList);
                        hashMap = new HashMap(hs9Var.f);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        if (entry.getKey() != this && !Collections.disjoint((Collection) entry.getValue(), this.r)) {
                            arrayList2.add((von0) entry.getKey());
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((von0) it.next()).d("deferrableSurface_close"));
                    }
                    list = arrayList3;
                }
                p0t a2 = p0t.a(new sez(new ArrayList(list), false, xo9.g()));
                sgw sgwVar = new sgw(3, this, arrayList);
                Executor executor = this.c;
                a2.getClass();
                ora g = r0t.g(a2, sgwVar, executor);
                this.t = g;
                e = r0t.e(g);
            } catch (Throwable th) {
                throw th;
            }
        }
        return e;
    }

    @Override // xsna.xon0, xsna.von0
    public final int c(@NonNull CaptureRequest captureRequest, @NonNull af9 af9Var) throws CameraAccessException {
        int c;
        if (!this.m.contains("wait_for_request")) {
            return super.c(captureRequest, af9Var);
        }
        synchronized (this.l) {
            this.u = true;
            c = super.c(captureRequest, new af9(Arrays.asList(this.v, af9Var)));
        }
        return c;
    }

    @Override // xsna.xon0, xsna.von0
    public final void close() {
        if (this.m.contains("wait_for_request")) {
            synchronized (this.l) {
                try {
                    if (!this.u) {
                        this.n.cancel(true);
                    }
                } finally {
                }
            }
        }
        this.n.addListener(new nx3(this, 16), this.c);
    }

    @Override // xsna.xon0, xsna.von0
    @NonNull
    public final ugz<Void> d(@NonNull String str) {
        return !str.equals("wait_for_request") ? !str.equals("deferrableSurface_close") ? snw.c.c : r0t.e(this.p) : r0t.e(this.n);
    }

    @Override // xsna.xon0, xsna.zon0.b
    @NonNull
    public final ugz<Void> f(@NonNull CameraDevice cameraDevice, @NonNull zsi0 zsi0Var) {
        ArrayList arrayList;
        ugz<Void> e;
        synchronized (this.l) {
            hs9 hs9Var = this.b;
            synchronized (hs9Var.b) {
                arrayList = new ArrayList(hs9Var.d);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((von0) it.next()).d("wait_for_request"));
            }
            p0t a2 = p0t.a(new sez(new ArrayList(arrayList2), false, xo9.g()));
            mw30 mw30Var = new mw30(this, cameraDevice, zsi0Var);
            mzm g = xo9.g();
            a2.getClass();
            ora g2 = r0t.g(a2, mw30Var, g);
            this.s = g2;
            e = r0t.e(g2);
        }
        return e;
    }

    @Override // xsna.xon0, xsna.von0.a
    public final void i(@NonNull von0 von0Var) {
        t();
        super.i(von0Var);
    }

    @Override // xsna.xon0, xsna.von0.a
    public final void k(@NonNull xon0 xon0Var) {
        ArrayList arrayList;
        von0 von0Var;
        ArrayList arrayList2;
        von0 von0Var2;
        if (this.m.contains("force_close")) {
            LinkedHashSet<von0> linkedHashSet = new LinkedHashSet();
            hs9 hs9Var = this.b;
            synchronized (hs9Var.b) {
                arrayList2 = new ArrayList(hs9Var.e);
            }
            Iterator it = arrayList2.iterator();
            while (it.hasNext() && (von0Var2 = (von0) it.next()) != xon0Var) {
                linkedHashSet.add(von0Var2);
            }
            for (von0 von0Var3 : linkedHashSet) {
                von0Var3.e().j(von0Var3);
            }
        }
        super.k(xon0Var);
        if (this.m.contains("force_close")) {
            LinkedHashSet<von0> linkedHashSet2 = new LinkedHashSet();
            hs9 hs9Var2 = this.b;
            synchronized (hs9Var2.b) {
                arrayList = new ArrayList(hs9Var2.c);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext() && (von0Var = (von0) it2.next()) != xon0Var) {
                linkedHashSet2.add(von0Var);
            }
            for (von0 von0Var4 : linkedHashSet2) {
                von0Var4.e().i(von0Var4);
            }
        }
    }

    @Override // xsna.xon0, xsna.zon0.b
    public final boolean stop() {
        boolean z;
        boolean stop;
        synchronized (this.l) {
            try {
                synchronized (this.a) {
                    z = this.g != null;
                }
                if (z) {
                    t();
                } else {
                    p0t p0tVar = this.s;
                    if (p0tVar != null) {
                        p0tVar.cancel(true);
                    }
                    p0t p0tVar2 = this.t;
                    if (p0tVar2 != null) {
                        p0tVar2.cancel(true);
                    }
                    u();
                }
                stop = super.stop();
            } catch (Throwable th) {
                throw th;
            }
        }
        return stop;
    }

    public final void t() {
        synchronized (this.l) {
            try {
                if (this.r == null) {
                    return;
                }
                if (this.m.contains("deferrableSurface_close")) {
                    Iterator it = this.r.iterator();
                    while (it.hasNext()) {
                        ((DeferrableSurface) it.next()).a();
                    }
                    u();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u() {
        if (this.m.contains("deferrableSurface_close")) {
            hs9 hs9Var = this.b;
            synchronized (hs9Var.b) {
                hs9Var.f.remove(this);
            }
            ub9.a<Void> aVar = this.q;
            if (aVar != null) {
                aVar.b(null);
            }
        }
    }
}
