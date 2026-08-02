package xsna;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.maps.model.CameraPosition;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import xsna.io00;
import xsna.io00.a;
import xsna.mcl;
import xsna.s9u;
import xsna.uwf;

/* compiled from: ClusterManager.java */
/* loaded from: classes13.dex */
public class vwf<T extends uwf> implements s9u.c, s9u.h, s9u.e {
    public final io00 b;
    public final io00.a c;
    public final io00.a d;
    public kah0<T> e;
    public mcl f;
    public final s9u g;
    public CameraPosition h;
    public vwf<T>.a i;
    public final ReentrantReadWriteLock j;
    public gs00 k;
    public uq80 l;

    /* compiled from: ClusterManager.java */
    public class a extends AsyncTask<Float, Void, Set<? extends kwf<T>>> {
        public a() {
        }

        @Override // android.os.AsyncTask
        public final Object doInBackground(Float[] fArr) {
            Float[] fArr2 = fArr;
            kah0<T> kah0Var = vwf.this.e;
            kah0Var.lock();
            try {
                return kah0Var.K(fArr2[0].floatValue());
            } finally {
                kah0Var.unlock();
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            Set set = (Set) obj;
            mcl<T>.m mVar = vwf.this.f.n;
            synchronized (mVar) {
                mVar.b = new mcl.l(set);
            }
            mVar.sendEmptyMessage(0);
        }
    }

    /* compiled from: ClusterManager.java */
    public interface b<T extends uwf> {
    }

    /* compiled from: ClusterManager.java */
    public interface c<T extends uwf> {
    }

    public vwf(Context context, s9u s9uVar) {
        io00 io00Var = new io00(s9uVar);
        this.j = new ReentrantReadWriteLock();
        this.g = s9uVar;
        this.b = io00Var;
        this.d = io00Var.new a();
        this.c = io00Var.new a();
        this.f = new mcl(context, s9uVar, this);
        this.e = new lah0(new xwc0(new z570()));
        this.i = new a();
        this.f.i();
    }

    @Override // xsna.s9u.c
    public void a() {
        Object obj = this.f;
        if (obj instanceof s9u.c) {
            ((s9u.c) obj).a();
        }
        kah0<T> kah0Var = this.e;
        s9u s9uVar = this.g;
        s9uVar.d();
        kah0Var.getClass();
        this.e.getClass();
        CameraPosition cameraPosition = this.h;
        if (cameraPosition == null || cameraPosition.c != s9uVar.d().c) {
            this.h = s9uVar.d();
            g();
        }
    }

    @Override // xsna.s9u.h
    public final boolean e(eo00 eo00Var) {
        return this.b.e(eo00Var);
    }

    @Override // xsna.s9u.e
    public final void f(eo00 eo00Var) {
        this.b.f(eo00Var);
    }

    public final void g() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.j;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.i.cancel(true);
            vwf<T>.a aVar = new a();
            this.i = aVar;
            aVar.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.g.d().c));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    public void j() {
        g();
    }

    public final void l(kah0<T> kah0Var) {
        kah0Var.lock();
        try {
            kah0<T> kah0Var2 = this.e;
            this.e = kah0Var;
            if (kah0Var2 != null) {
                kah0Var2.lock();
                try {
                    kah0Var.a(kah0Var2.getItems());
                    kah0Var2.unlock();
                } catch (Throwable th) {
                    kah0Var2.unlock();
                    throw th;
                }
            }
            kah0Var.unlock();
            this.e.getClass();
            g();
        } catch (Throwable th2) {
            kah0Var.unlock();
            throw th2;
        }
    }
}
