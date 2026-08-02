package xsna;

import android.graphics.Bitmap;
import android.util.SparseArray;
import java.util.Iterator;
import xsna.sj2;

/* compiled from: FrescoFrameCache.kt */
/* loaded from: classes12.dex */
public final class bhs implements dc7 {
    public final sj2 b;
    public final boolean c;
    public final SparseArray<uvf<svf>> d = new SparseArray<>();
    public uvf<svf> e;

    /* compiled from: FrescoFrameCache.kt */
    public static final class a {
        public static final int a(uvf uvfVar) {
            if (!uvf.t(uvfVar)) {
                return 0;
            }
            svf svfVar = (svf) uvfVar.r();
            if (svfVar instanceof qvf) {
                return id7.d(((qvf) svfVar).W3());
            }
            return 0;
        }

        public static uvf b(uvf uvfVar) {
            try {
                if (!uvf.t(uvfVar) || !(uvfVar.r() instanceof xvf)) {
                    uvf.q(uvfVar);
                    return null;
                }
                uvf<Bitmap> R = ((xvf) uvfVar.r()).R();
                uvfVar.close();
                return R;
            } catch (Throwable th) {
                uvf.q(uvfVar);
                throw th;
            }
        }
    }

    public bhs(sj2 sj2Var, boolean z) {
        this.b = sj2Var;
        this.c = z;
    }

    @Override // xsna.dc7
    public final synchronized void a(int i, uvf uvfVar) {
        kcl kclVar;
        try {
            kclVar = uvf.v(xvf.B2(uvfVar, gpw.d, 0, 0));
            if (kclVar == null) {
                uvf.q(kclVar);
                return;
            }
            try {
                sj2 sj2Var = this.b;
                kcl d = sj2Var.b.d(new sj2.a(sj2Var.a, i), kclVar, sj2Var.c);
                if (uvf.t(d)) {
                    uvf.q(this.d.get(i));
                    this.d.put(i, d);
                    ahq.g(bhs.class, "cachePreparedFrame(%d) cached. Pending frames: %s", Integer.valueOf(i), this.d);
                }
                kclVar.close();
            } catch (Throwable th) {
                th = th;
                uvf.q(kclVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            kclVar = null;
        }
    }

    @Override // xsna.dc7
    public final synchronized void b(int i, uvf uvfVar) {
        kcl kclVar;
        f(i);
        try {
            kclVar = uvf.v(xvf.B2(uvfVar, gpw.d, 0, 0));
            if (kclVar != null) {
                try {
                    uvf.q(this.e);
                    sj2 sj2Var = this.b;
                    this.e = sj2Var.b.d(new sj2.a(sj2Var.a, i), kclVar, sj2Var.c);
                } catch (Throwable th) {
                    th = th;
                    uvf.q(kclVar);
                    throw th;
                }
            }
            uvf.q(kclVar);
        } catch (Throwable th2) {
            th = th2;
            kclVar = null;
        }
    }

    @Override // xsna.dc7
    public final synchronized uvf c() {
        return a.b(uvf.o(this.e));
    }

    @Override // xsna.dc7
    public final synchronized void clear() {
        try {
            uvf.q(this.e);
            this.e = null;
            int size = this.d.size();
            for (int i = 0; i < size; i++) {
                uvf.q(this.d.valueAt(i));
            }
            this.d.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // xsna.dc7
    public final synchronized uvf d() {
        ww8 ww8Var;
        uvf uvfVar = null;
        if (!this.c) {
            return null;
        }
        sj2 sj2Var = this.b;
        while (true) {
            synchronized (sj2Var) {
                Iterator<ww8> it = sj2Var.d.iterator();
                if (it.hasNext()) {
                    ww8Var = it.next();
                    it.remove();
                } else {
                    ww8Var = null;
                }
            }
            if (ww8Var == null) {
                break;
            }
            uvf e = sj2Var.b.e(ww8Var);
            if (e != null) {
                uvfVar = e;
                break;
            }
        }
        return a.b(uvfVar);
    }

    @Override // xsna.dc7
    public final synchronized boolean e(int i) {
        sj2 sj2Var;
        sj2Var = this.b;
        return sj2Var.b.g(new sj2.a(sj2Var.a, i));
    }

    public final synchronized void f(int i) {
        uvf<svf> uvfVar = this.d.get(i);
        if (uvfVar != null) {
            this.d.delete(i);
            uvfVar.close();
            ahq.g(bhs.class, "removePreparedReference(%d) removed. Pending frames: %s", Integer.valueOf(i), this.d);
        }
    }

    @Override // xsna.dc7
    public final synchronized uvf<Bitmap> g(int i) {
        sj2 sj2Var;
        sj2Var = this.b;
        return a.b(sj2Var.b.get(new sj2.a(sj2Var.a, i)));
    }

    @Override // xsna.dc7
    public final synchronized int u() {
        int i;
        int a2 = a.a(this.e);
        synchronized (this) {
            int size = this.d.size();
            i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                i += a.a(this.d.valueAt(i2));
            }
        }
        return a2 + i;
        return a2 + i;
    }
}
