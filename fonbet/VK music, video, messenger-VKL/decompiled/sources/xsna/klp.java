package xsna;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.Nullable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import xsna.l80;
import xsna.l900;
import xsna.r7l;
import xsna.uan;
import xsna.vlp;
import xsna.yhq;

/* compiled from: Engine.java */
/* loaded from: classes12.dex */
public final class klp implements rlp, vlp.a {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final mo8 a;
    public final edi b;
    public final s900 c;
    public final b d;
    public final yag0 e;
    public final a f;
    public final l80 g;

    /* compiled from: Engine.java */
    public static class a {
        public final c a;
        public final yhq.c b = yhq.a(150, new C3186a());
        public int c;

        /* compiled from: Engine.java */
        /* renamed from: xsna.klp$a$a, reason: collision with other inner class name */
        public class C3186a implements yhq.b<r7l<?>> {
            public C3186a() {
            }

            @Override // xsna.yhq.b
            public final r7l<?> create() {
                a aVar = a.this;
                return new r7l<>(aVar.a, aVar.b);
            }
        }

        public a(c cVar) {
            this.a = cVar;
        }
    }

    /* compiled from: Engine.java */
    public static class b {
        public final z0u a;
        public final z0u b;
        public final z0u c;
        public final z0u d;
        public final klp e;
        public final klp f;
        public final yhq.c g = yhq.a(150, new a());

        /* compiled from: Engine.java */
        public class a implements yhq.b<qlp<?>> {
            public a() {
            }

            @Override // xsna.yhq.b
            public final qlp<?> create() {
                b bVar = b.this;
                return new qlp<>(bVar.a, bVar.b, bVar.c, bVar.d, bVar.e, bVar.f, bVar.g);
            }
        }

        public b(z0u z0uVar, z0u z0uVar2, z0u z0uVar3, z0u z0uVar4, klp klpVar, klp klpVar2) {
            this.a = z0uVar;
            this.b = z0uVar2;
            this.c = z0uVar3;
            this.d = z0uVar4;
            this.e = klpVar;
            this.f = klpVar2;
        }
    }

    /* compiled from: Engine.java */
    public static class c implements r7l.d {
        public final uan.a a;
        public volatile uan b;

        public c(uan.a aVar) {
            this.a = aVar;
        }

        public final uan a() {
            if (this.b == null) {
                synchronized (this) {
                    try {
                        if (this.b == null) {
                            File cacheDir = ((Context) ((obn) this.a).a.a).getCacheDir();
                            pbn pbnVar = null;
                            File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                            if (file != null && (file.isDirectory() || file.mkdirs())) {
                                pbnVar = new pbn(file);
                            }
                            this.b = pbnVar;
                        }
                        if (this.b == null) {
                            this.b = new zjq();
                        }
                    } finally {
                    }
                }
            }
            return this.b;
        }
    }

    /* compiled from: Engine.java */
    public class d {
        public final qlp<?> a;
        public final svj0 b;

        public d(svj0 svj0Var, qlp qlpVar) {
            this.b = svj0Var;
            this.a = qlpVar;
        }
    }

    public klp(s900 s900Var, uan.a aVar, z0u z0uVar, z0u z0uVar2, z0u z0uVar3, z0u z0uVar4) {
        this.c = s900Var;
        c cVar = new c(aVar);
        l80 l80Var = new l80();
        this.g = l80Var;
        synchronized (this) {
            try {
                synchronized (l80Var) {
                    try {
                        try {
                            l80Var.d = this;
                        } catch (Throwable th) {
                            th = th;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                }
                this.b = new edi(11);
                this.a = new mo8(2);
                this.d = new b(z0uVar, z0uVar2, z0uVar3, z0uVar4, this, this);
                this.f = new a(cVar);
                this.e = new yag0();
                s900Var.d = this;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    public static void e(hag0 hag0Var) {
        if (!(hag0Var instanceof vlp)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((vlp) hag0Var).d();
    }

    @Override // xsna.vlp.a
    public final void a(ady adyVar, vlp<?> vlpVar) {
        l80 l80Var = this.g;
        synchronized (l80Var) {
            l80.a aVar = (l80.a) l80Var.b.remove(adyVar);
            if (aVar != null) {
                aVar.c = null;
                aVar.clear();
            }
        }
        if (vlpVar.b) {
            this.c.d(adyVar, vlpVar);
        } else {
            this.e.a(vlpVar, false);
        }
    }

    public final d b(com.bumptech.glide.c cVar, Object obj, ady adyVar, int i, int i2, Class cls, Class cls2, Priority priority, bbn bbnVar, hy8 hy8Var, boolean z, boolean z2, au80 au80Var, boolean z3, boolean z4, svj0 svj0Var, Executor executor) {
        long j;
        if (h) {
            int i3 = w000.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.b.getClass();
        slp slpVar = new slp(obj, adyVar, i, i2, hy8Var, cls, cls2, au80Var);
        synchronized (this) {
            try {
                vlp<?> c2 = c(slpVar, z3, j);
                if (c2 == null) {
                    return f(cVar, obj, adyVar, i, i2, cls, cls2, priority, bbnVar, hy8Var, z, z2, au80Var, z3, z4, svj0Var, executor, slpVar, j);
                }
                svj0Var.h(c2, DataSource.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public final vlp<?> c(slp slpVar, boolean z, long j) {
        Throwable th;
        vlp<?> vlpVar;
        hag0 hag0Var;
        klp klpVar;
        slp slpVar2;
        vlp<?> vlpVar2;
        if (z) {
            l80 l80Var = this.g;
            synchronized (l80Var) {
                try {
                    l80.a aVar = (l80.a) l80Var.b.get(slpVar);
                    if (aVar == null) {
                        vlpVar = null;
                    } else {
                        vlpVar = aVar.get();
                        if (vlpVar == null) {
                            try {
                                l80Var.b(aVar);
                            } catch (Throwable th2) {
                                th = th2;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th3) {
                                        th = th3;
                                    }
                                    th = th3;
                                }
                            }
                        }
                    }
                    if (vlpVar != null) {
                        vlpVar.c();
                    }
                    if (vlpVar != null) {
                        if (h) {
                            int i = w000.a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(slpVar);
                        }
                        return vlpVar;
                    }
                    s900 s900Var = this.c;
                    synchronized (s900Var) {
                        try {
                            l900.a aVar2 = (l900.a) s900Var.a.remove(slpVar);
                            if (aVar2 == null) {
                                hag0Var = null;
                            } else {
                                s900Var.c -= aVar2.b;
                                hag0Var = aVar2.a;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            while (true) {
                                try {
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    }
                    hag0 hag0Var2 = hag0Var;
                    if (hag0Var2 == null) {
                        klpVar = this;
                        slpVar2 = slpVar;
                        vlpVar2 = null;
                    } else if (hag0Var2 instanceof vlp) {
                        vlpVar2 = (vlp) hag0Var2;
                        klpVar = this;
                        slpVar2 = slpVar;
                    } else {
                        klpVar = this;
                        slpVar2 = slpVar;
                        vlpVar2 = new vlp<>(hag0Var2, true, true, slpVar2, klpVar);
                    }
                    if (vlpVar2 != null) {
                        vlpVar2.c();
                        klpVar.g.a(slpVar2, vlpVar2);
                    }
                    if (vlpVar2 != null) {
                        if (h) {
                            int i2 = w000.a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(slpVar2);
                        }
                        return vlpVar2;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
        }
        return null;
    }

    public final synchronized void d(qlp<?> qlpVar, ady adyVar, vlp<?> vlpVar) {
        if (vlpVar != null) {
            try {
                if (vlpVar.b) {
                    this.g.a(adyVar, vlpVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        mo8 mo8Var = this.a;
        mo8Var.getClass();
        qlpVar.getClass();
        HashMap hashMap = (HashMap) mo8Var.b;
        if (qlpVar.equals(hashMap.get(adyVar))) {
            hashMap.remove(adyVar);
        }
    }

    public final d f(com.bumptech.glide.c cVar, Object obj, ady adyVar, int i, int i2, Class cls, Class cls2, Priority priority, bbn bbnVar, Map map, boolean z, boolean z2, au80 au80Var, boolean z3, boolean z4, svj0 svj0Var, Executor executor, slp slpVar, long j) {
        Executor executor2;
        qlp qlpVar = (qlp) ((HashMap) this.a.b).get(slpVar);
        if (qlpVar != null) {
            qlpVar.a(svj0Var, executor);
            if (h) {
                int i3 = w000.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(slpVar);
            }
            return new d(svj0Var, qlpVar);
        }
        qlp qlpVar2 = (qlp) this.d.g.c();
        synchronized (qlpVar2) {
            qlpVar2.l = slpVar;
            qlpVar2.m = z3;
            qlpVar2.n = z4;
        }
        a aVar = this.f;
        r7l<R> r7lVar = (r7l) aVar.b.c();
        int i4 = aVar.c;
        aVar.c = i4 + 1;
        q7l<R> q7lVar = r7lVar.b;
        r7l.d dVar = r7lVar.e;
        q7lVar.c = cVar;
        q7lVar.d = obj;
        q7lVar.n = adyVar;
        q7lVar.e = i;
        q7lVar.f = i2;
        q7lVar.p = bbnVar;
        q7lVar.g = cls;
        q7lVar.h = dVar;
        q7lVar.k = cls2;
        q7lVar.o = priority;
        q7lVar.i = au80Var;
        q7lVar.j = map;
        q7lVar.q = z;
        q7lVar.r = z2;
        r7lVar.i = cVar;
        r7lVar.j = adyVar;
        r7lVar.k = priority;
        r7lVar.l = slpVar;
        r7lVar.m = i;
        r7lVar.n = i2;
        r7lVar.o = bbnVar;
        r7lVar.p = au80Var;
        r7lVar.q = qlpVar2;
        r7lVar.r = i4;
        r7lVar.t = r7l.f.INITIALIZE;
        r7lVar.u = obj;
        mo8 mo8Var = this.a;
        mo8Var.getClass();
        ((HashMap) mo8Var.b).put(slpVar, qlpVar2);
        qlpVar2.a(svj0Var, executor);
        synchronized (qlpVar2) {
            qlpVar2.u = r7lVar;
            r7l.g k = r7lVar.k(r7l.g.INITIALIZE);
            if (k != r7l.g.RESOURCE_CACHE && k != r7l.g.DATA_CACHE) {
                executor2 = qlpVar2.n ? qlpVar2.j : qlpVar2.i;
                executor2.execute(r7lVar);
            }
            executor2 = qlpVar2.h;
            executor2.execute(r7lVar);
        }
        if (h) {
            int i5 = w000.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(slpVar);
        }
        return new d(svj0Var, qlpVar2);
    }
}
