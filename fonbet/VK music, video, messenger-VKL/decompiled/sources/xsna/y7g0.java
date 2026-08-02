package xsna;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.q4j;

/* compiled from: RequestManager.java */
/* loaded from: classes12.dex */
public final class y7g0 implements ComponentCallbacks2, c5z {
    public static final d8g0 l;
    public final com.bumptech.glide.a b;
    public final Context c;
    public final x3z d;
    public final n8g0 e;
    public final a8g0 f;
    public final c4o0 g;
    public final a h;
    public final q4j i;
    public final CopyOnWriteArrayList<x7g0<Object>> j;
    public final d8g0 k;

    /* compiled from: RequestManager.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            y7g0 y7g0Var = y7g0.this;
            y7g0Var.d.i(y7g0Var);
        }
    }

    /* compiled from: RequestManager.java */
    public class b implements q4j.a {
        public final n8g0 a;

        public b(@NonNull n8g0 n8g0Var) {
            this.a = n8g0Var;
        }

        @Override // xsna.q4j.a
        public final void a(boolean z) {
            if (z) {
                synchronized (y7g0.this) {
                    n8g0 n8g0Var = this.a;
                    Iterator it = s2r0.e(n8g0Var.a).iterator();
                    while (it.hasNext()) {
                        f7g0 f7g0Var = (f7g0) it.next();
                        if (!f7g0Var.a() && !f7g0Var.f()) {
                            f7g0Var.clear();
                            if (n8g0Var.c) {
                                n8g0Var.b.add(f7g0Var);
                            } else {
                                f7g0Var.i();
                            }
                        }
                    }
                }
            }
        }
    }

    static {
        d8g0 f = new d8g0().f(Bitmap.class);
        f.n = true;
        l = f;
        new d8g0().f(gyt.class).n = true;
    }

    public y7g0(@NonNull com.bumptech.glide.a aVar, @NonNull x3z x3zVar, @NonNull a8g0 a8g0Var, @NonNull Context context) {
        d8g0 d8g0Var;
        n8g0 n8g0Var = new n8g0();
        r4j r4jVar = aVar.g;
        this.g = new c4o0();
        a aVar2 = new a();
        this.h = aVar2;
        this.b = aVar;
        this.d = x3zVar;
        this.f = a8g0Var;
        this.e = n8g0Var;
        this.c = context;
        Context applicationContext = context.getApplicationContext();
        b bVar = new b(n8g0Var);
        ((ycl) r4jVar).getClass();
        q4j xclVar = anj.a(applicationContext, "android.permission.ACCESS_NETWORK_STATE") == 0 ? new xcl(applicationContext, bVar) : new vm70();
        this.i = xclVar;
        synchronized (aVar.h) {
            if (aVar.h.contains(this)) {
                throw new IllegalStateException("Cannot register already registered manager");
            }
            aVar.h.add(this);
        }
        char[] cArr = s2r0.a;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            x3zVar.i(this);
        } else {
            s2r0.f().post(aVar2);
        }
        x3zVar.i(xclVar);
        this.j = new CopyOnWriteArrayList<>(aVar.d.d);
        com.bumptech.glide.c cVar = aVar.d;
        synchronized (cVar) {
            try {
                if (cVar.i == null) {
                    ((com.bumptech.glide.b) cVar.c).getClass();
                    d8g0 d8g0Var2 = new d8g0();
                    d8g0Var2.n = true;
                    cVar.i = d8g0Var2;
                }
                d8g0Var = cVar.i;
            } finally {
            }
        }
        synchronized (this) {
            d8g0 clone = d8g0Var.clone();
            if (clone.n && !clone.p) {
                throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
            }
            clone.p = true;
            clone.n = true;
            this.k = clone;
        }
    }

    public final void c(@Nullable u3o0<?> u3o0Var) {
        if (u3o0Var == null) {
            return;
        }
        boolean k = k(u3o0Var);
        f7g0 b2 = u3o0Var.b();
        if (k) {
            return;
        }
        com.bumptech.glide.a aVar = this.b;
        synchronized (aVar.h) {
            try {
                Iterator it = aVar.h.iterator();
                while (it.hasNext()) {
                    if (((y7g0) it.next()).k(u3o0Var)) {
                        return;
                    }
                }
                if (b2 != null) {
                    u3o0Var.h(null);
                    b2.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void d() {
        try {
            Iterator it = s2r0.e(this.g.b).iterator();
            while (it.hasNext()) {
                c((u3o0) it.next());
            }
            this.g.b.clear();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void i() {
        n8g0 n8g0Var = this.e;
        n8g0Var.c = true;
        Iterator it = s2r0.e(n8g0Var.a).iterator();
        while (it.hasNext()) {
            f7g0 f7g0Var = (f7g0) it.next();
            if (f7g0Var.isRunning()) {
                f7g0Var.pause();
                n8g0Var.b.add(f7g0Var);
            }
        }
    }

    public final synchronized void j() {
        n8g0 n8g0Var = this.e;
        n8g0Var.c = false;
        Iterator it = s2r0.e(n8g0Var.a).iterator();
        while (it.hasNext()) {
            f7g0 f7g0Var = (f7g0) it.next();
            if (!f7g0Var.a() && !f7g0Var.isRunning()) {
                f7g0Var.i();
            }
        }
        n8g0Var.b.clear();
    }

    public final synchronized boolean k(@NonNull u3o0<?> u3o0Var) {
        f7g0 b2 = u3o0Var.b();
        if (b2 == null) {
            return true;
        }
        if (!this.e.a(b2)) {
            return false;
        }
        this.g.b.remove(u3o0Var);
        u3o0Var.h(null);
        return true;
    }

    @Override // xsna.c5z
    public final synchronized void onDestroy() {
        this.g.onDestroy();
        d();
        n8g0 n8g0Var = this.e;
        Iterator it = s2r0.e(n8g0Var.a).iterator();
        while (it.hasNext()) {
            n8g0Var.a((f7g0) it.next());
        }
        n8g0Var.b.clear();
        this.d.j(this);
        this.d.j(this.i);
        s2r0.f().removeCallbacks(this.h);
        com.bumptech.glide.a aVar = this.b;
        synchronized (aVar.h) {
            if (!aVar.h.contains(this)) {
                throw new IllegalStateException("Cannot unregister not yet registered manager");
            }
            aVar.h.remove(this);
        }
    }

    @Override // xsna.c5z
    public final synchronized void onStart() {
        j();
        this.g.onStart();
    }

    @Override // xsna.c5z
    public final synchronized void onStop() {
        this.g.onStop();
        i();
    }

    public final synchronized String toString() {
        return super.toString() + "{tracker=" + this.e + ", treeNode=" + this.f + "}";
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
    }
}
