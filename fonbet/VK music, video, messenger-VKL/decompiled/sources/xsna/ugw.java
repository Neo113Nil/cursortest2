package xsna;

import android.util.Rational;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.f;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import xsna.as9;
import xsna.l9s;
import xsna.pi20;
import xsna.snw;
import xsna.ub9;
import xsna.vfq0;

/* compiled from: ImageCapture.java */
/* loaded from: classes11.dex */
public final class ugw extends vfq0 {
    public static final f z = new f();
    public int l;
    public Rational m;
    public ExecutorService n;
    public androidx.camera.core.impl.f o;
    public zr9 p;
    public int q;
    public es9 r;
    public boolean s;
    public r.b t;
    public czg0 u;
    public ghd0 v;
    public gg9 w;
    public unw x;
    public h y;

    /* compiled from: ImageCapture.java */
    public class a extends gg9 {
    }

    /* compiled from: ImageCapture.java */
    public class b implements ThreadFactory {
        public final AtomicInteger b = new AtomicInteger(0);

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(@NonNull Runnable runnable) {
            return new Thread(runnable, "CameraX-image_capture_" + this.b.getAndIncrement());
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class c implements u.a<ugw, androidx.camera.core.impl.j, c>, l.a<c> {
        public final androidx.camera.core.impl.n a;

        public c() {
            this(androidx.camera.core.impl.n.z());
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final c a(@NonNull Size size) {
            this.a.C(androidx.camera.core.impl.l.d, size);
            return this;
        }

        @Override // androidx.camera.core.impl.u.a
        @NonNull
        public final androidx.camera.core.impl.j b() {
            return new androidx.camera.core.impl.j(androidx.camera.core.impl.o.y(this.a));
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final c c(int i) {
            this.a.C(androidx.camera.core.impl.l.c, Integer.valueOf(i));
            return this;
        }

        @Override // xsna.hbq
        @NonNull
        public final androidx.camera.core.impl.m d() {
            return this.a;
        }

        public c(androidx.camera.core.impl.n nVar) {
            Object obj;
            this.a = nVar;
            Object obj2 = null;
            try {
                obj = nVar.f(x3o0.p);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(ugw.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.n nVar2 = this.a;
            nVar2.C(x3o0.p, ugw.class);
            try {
                obj2 = nVar2.f(x3o0.o);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.a.C(x3o0.o, ugw.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class d extends gg9 {

        /* compiled from: ImageCapture.java */
        public interface a<T> {
        }

        public final ugz d(a aVar, long j, Boolean bool) {
            throw null;
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class e extends RuntimeException {
    }

    /* compiled from: ImageCapture.java */
    public static final class f {
        public static final androidx.camera.core.impl.j a;

        static {
            c cVar = new c();
            androidx.camera.core.impl.a aVar = androidx.camera.core.impl.u.l;
            androidx.camera.core.impl.n nVar = cVar.a;
            nVar.C(aVar, 4);
            nVar.C(androidx.camera.core.impl.l.b, 0);
            a = new androidx.camera.core.impl.j(androidx.camera.core.impl.o.y(nVar));
        }
    }

    /* compiled from: ImageCapture.java */
    public static class g {
    }

    /* compiled from: ImageCapture.java */
    public static class h implements l9s.a {
        public final p5w e;
        public final ArrayDeque a = new ArrayDeque();
        public g b = null;
        public ub9.d c = null;
        public int d = 0;
        public final Object g = new Object();
        public final int f = 2;

        /* compiled from: ImageCapture.java */
        public class a implements o0t<alw> {
            public final /* synthetic */ g b;

            public a(g gVar) {
                this.b = gVar;
            }

            @Override // xsna.o0t
            public final void onFailure(Throwable th) {
                synchronized (h.this.g) {
                    try {
                        if (!(th instanceof CancellationException)) {
                            f fVar = ugw.z;
                            if (th == null) {
                                throw null;
                            }
                            th.getMessage();
                            throw null;
                        }
                        h hVar = h.this;
                        hVar.b = null;
                        hVar.c = null;
                        hVar.a();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }

            @Override // xsna.o0t
            public final void onSuccess(@Nullable alw alwVar) {
                alw alwVar2 = alwVar;
                synchronized (h.this.g) {
                    try {
                        alwVar2.getClass();
                        new HashSet().add(h.this);
                        h.this.d++;
                        this.b.getClass();
                        throw null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }

        public h(@NonNull p5w p5wVar) {
            this.e = p5wVar;
        }

        public final void a() {
            synchronized (this.g) {
                try {
                    if (this.b != null) {
                        return;
                    }
                    if (this.d >= this.f) {
                        return;
                    }
                    g gVar = (g) this.a.poll();
                    if (gVar == null) {
                        return;
                    }
                    this.b = gVar;
                    ub9.d a2 = ub9.a(new vpn((ugw) this.e.c, gVar));
                    this.c = a2;
                    r0t.a(a2, new a(gVar), xo9.g());
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // xsna.l9s.a
        public final void f(l9s l9sVar) {
            synchronized (this.g) {
                this.d--;
                a();
            }
        }
    }

    /* compiled from: ImageCapture.java */
    public static final class i {
        public androidx.camera.core.impl.c a;
        public boolean b;
        public boolean c;
    }

    @Override // xsna.vfq0
    @Nullable
    public final androidx.camera.core.impl.u<?> d(boolean z2, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config a2 = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE);
        if (z2) {
            z.getClass();
            a2 = Config.w(a2, f.a);
        }
        if (a2 == null) {
            return null;
        }
        return new androidx.camera.core.impl.j(androidx.camera.core.impl.o.y(((c) f(a2)).a));
    }

    @Override // xsna.vfq0
    @NonNull
    public final u.a<?, ?, ?> f(@NonNull Config config) {
        return new c(androidx.camera.core.impl.n.A(config));
    }

    @Override // xsna.vfq0
    public final void l() {
        androidx.camera.core.impl.j jVar = (androidx.camera.core.impl.j) this.f;
        f.b bVar = (f.b) jVar.g(androidx.camera.core.impl.u.k, null);
        if (bVar == null) {
            throw new IllegalStateException("Implementation is missing option unpacker for " + jVar.i(jVar.toString()));
        }
        f.a aVar = new f.a();
        bVar.a(jVar, aVar);
        this.o = aVar.d();
        this.r = (es9) jVar.g(androidx.camera.core.impl.j.w, null);
        this.q = ((Integer) jVar.g(androidx.camera.core.impl.j.y, 2)).intValue();
        this.p = (zr9) jVar.g(androidx.camera.core.impl.j.v, as9.a());
        this.s = ((Boolean) jVar.g(androidx.camera.core.impl.j.A, Boolean.FALSE)).booleanValue();
        this.n = Executors.newFixedThreadPool(1, new b());
    }

    @Override // xsna.vfq0
    public final void m() {
        throw null;
    }

    @Override // xsna.vfq0
    public final void o() {
        t();
        fsk.m();
        unw unwVar = this.x;
        this.x = null;
        this.u = null;
        this.v = null;
        if (unwVar != null) {
            unwVar.a();
        }
        this.s = false;
        this.n.shutdown();
    }

    /* JADX WARN: Type inference failed for: r8v20, types: [androidx.camera.core.impl.u, androidx.camera.core.impl.u<?>] */
    @Override // xsna.vfq0
    @NonNull
    public final androidx.camera.core.impl.u<?> p(@NonNull ui9 ui9Var, @NonNull u.a<?, ?, ?> aVar) {
        boolean z2;
        Object obj;
        Object obj2;
        Object obj3;
        Iterator it = ui9Var.d().a.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (mek0.class.isAssignableFrom(((rse0) it.next()).getClass())) {
                Object d2 = aVar.d();
                androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.j.A;
                Object obj4 = Boolean.TRUE;
                androidx.camera.core.impl.o oVar = (androidx.camera.core.impl.o) d2;
                oVar.getClass();
                try {
                    obj4 = oVar.f(aVar2);
                } catch (IllegalArgumentException unused) {
                }
                if (((Boolean) obj4).booleanValue()) {
                    ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.j.A, Boolean.TRUE);
                }
            }
        }
        Object d3 = aVar.d();
        androidx.camera.core.impl.a aVar3 = androidx.camera.core.impl.j.A;
        Object obj5 = Boolean.FALSE;
        androidx.camera.core.impl.o oVar2 = (androidx.camera.core.impl.o) d3;
        oVar2.getClass();
        try {
            obj5 = oVar2.f(aVar3);
        } catch (IllegalArgumentException unused2) {
        }
        Object obj6 = null;
        if (((Boolean) obj5).booleanValue()) {
            try {
                obj2 = oVar2.f(androidx.camera.core.impl.j.x);
            } catch (IllegalArgumentException unused3) {
                obj2 = null;
            }
            Integer num = (Integer) obj2;
            z2 = num == null || num.intValue() == 256;
            try {
                obj3 = oVar2.f(androidx.camera.core.impl.j.w);
            } catch (IllegalArgumentException unused4) {
                obj3 = null;
            }
            if (obj3 != null) {
                z2 = false;
            }
            if (!z2) {
                ((androidx.camera.core.impl.n) d3).C(androidx.camera.core.impl.j.A, Boolean.FALSE);
            }
        } else {
            z2 = false;
        }
        Object d4 = aVar.d();
        androidx.camera.core.impl.a aVar4 = androidx.camera.core.impl.j.x;
        androidx.camera.core.impl.o oVar3 = (androidx.camera.core.impl.o) d4;
        oVar3.getClass();
        try {
            obj = oVar3.f(aVar4);
        } catch (IllegalArgumentException unused5) {
            obj = null;
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            Object d5 = aVar.d();
            androidx.camera.core.impl.a aVar5 = androidx.camera.core.impl.j.w;
            androidx.camera.core.impl.o oVar4 = (androidx.camera.core.impl.o) d5;
            oVar4.getClass();
            try {
                obj6 = oVar4.f(aVar5);
            } catch (IllegalArgumentException unused6) {
            }
            obr.a("Cannot set buffer format with CaptureProcessor defined.", obj6 == null);
            ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.k.a, Integer.valueOf(z2 ? 35 : num2.intValue()));
        } else {
            Object d6 = aVar.d();
            androidx.camera.core.impl.a aVar6 = androidx.camera.core.impl.j.w;
            androidx.camera.core.impl.o oVar5 = (androidx.camera.core.impl.o) d6;
            oVar5.getClass();
            try {
                obj6 = oVar5.f(aVar6);
            } catch (IllegalArgumentException unused7) {
            }
            if (obj6 != null || z2) {
                ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.k.a, 35);
            } else {
                ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.k.a, 256);
            }
        }
        Object d7 = aVar.d();
        androidx.camera.core.impl.a aVar7 = androidx.camera.core.impl.j.y;
        Object obj7 = 2;
        androidx.camera.core.impl.o oVar6 = (androidx.camera.core.impl.o) d7;
        oVar6.getClass();
        try {
            obj7 = oVar6.f(aVar7);
        } catch (IllegalArgumentException unused8) {
        }
        obr.a("Maximum outstanding image count must be at least 1", ((Integer) obj7).intValue() >= 1);
        return aVar.b();
    }

    @Override // xsna.vfq0
    public final void q() {
        t();
    }

    @Override // xsna.vfq0
    @NonNull
    public final Size r(@NonNull Size size) {
        r.b u = u(c(), (androidx.camera.core.impl.j) this.f, size);
        this.t = u;
        this.k = u.b();
        this.c = vfq0.c.ACTIVE;
        j();
        return size;
    }

    public final void t() {
        g gVar;
        ub9.d dVar;
        ArrayList arrayList;
        ah9 ah9Var = new ah9("Camera is closed.");
        h hVar = this.y;
        synchronized (hVar.g) {
            gVar = hVar.b;
            hVar.b = null;
            dVar = hVar.c;
            hVar.c = null;
            arrayList = new ArrayList(hVar.a);
            hVar.a.clear();
        }
        if (gVar != null && dVar != null) {
            ah9Var.getMessage();
            throw null;
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            g gVar2 = (g) it.next();
            ah9Var.getMessage();
            gVar2.getClass();
            throw null;
        }
    }

    @NonNull
    public final String toString() {
        return "ImageCapture:" + e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [xsna.es9] */
    public final r.b u(@NonNull final String str, @NonNull final androidx.camera.core.impl.j jVar, @NonNull final Size size) {
        t5y0 t5y0Var;
        pi20.a aVar;
        ugz e2;
        fsk.m();
        r.b c2 = r.b.c(jVar);
        c2.b.b(null);
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.j.z;
        t5y0 t5y0Var2 = null;
        if (((ilw) jVar.g(aVar2, null)) != null) {
            ilw ilwVar = (ilw) jVar.g(aVar2, null);
            size.getWidth();
            size.getHeight();
            this.f.getInputFormat();
            this.u = new czg0(ilwVar.b());
            this.w = new a();
        } else {
            ?? r2 = this.r;
            if (r2 != 0 || this.s) {
                int inputFormat = this.f.getInputFormat();
                int inputFormat2 = this.f.getInputFormat();
                if (this.s) {
                    obr.f("CaptureProcessor should not be set if software JPEG is to be used.", this.r == null);
                    t5y0Var2 = new t5y0(100, this.q);
                    inputFormat2 = 256;
                    t5y0Var = t5y0Var2;
                } else {
                    t5y0Var = r2;
                }
                ghd0 ghd0Var = new ghd0(size.getWidth(), size.getHeight(), inputFormat, this.q, this.n, v(as9.a()), t5y0Var, inputFormat2);
                this.v = ghd0Var;
                synchronized (ghd0Var.a) {
                    aVar = ghd0Var.g.b;
                }
                this.w = aVar;
                this.u = new czg0(this.v);
                if (t5y0Var2 != null) {
                    ghd0 ghd0Var2 = this.v;
                    synchronized (ghd0Var2.a) {
                        try {
                            if (!ghd0Var2.e || ghd0Var2.f) {
                                if (ghd0Var2.l == null) {
                                    ghd0Var2.l = ub9.a(new tp1(ghd0Var2, 26));
                                }
                                e2 = r0t.e(ghd0Var2.l);
                            } else {
                                e2 = snw.c.c;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    e2.addListener(new ep0(t5y0Var2, 5), xo9.g());
                }
            } else {
                pi20 pi20Var = new pi20(size.getWidth(), size.getHeight(), this.f.getInputFormat(), 2);
                this.w = pi20Var.b;
                this.u = new czg0(pi20Var);
            }
        }
        this.y = new h(new p5w(this, 1));
        this.u.a(null, xo9.t());
        czg0 czg0Var = this.u;
        unw unwVar = this.x;
        if (unwVar != null) {
            unwVar.a();
        }
        unw unwVar2 = new unw(this.u.getSurface());
        this.x = unwVar2;
        ugz e3 = r0t.e(unwVar2.e);
        Objects.requireNonNull(czg0Var);
        e3.addListener(new yv6(czg0Var, 3), xo9.t());
        c2.a.add(this.x);
        c2.e.add(new r.c() { // from class: xsna.rgw
            @Override // androidx.camera.core.impl.r.c
            public final void onError() {
                fsk.m();
                ugw ugwVar = ugw.this;
                unw unwVar3 = ugwVar.x;
                ugwVar.x = null;
                ugwVar.u = null;
                ugwVar.v = null;
                if (unwVar3 != null) {
                    unwVar3.a();
                }
                String str2 = str;
                if (ugwVar.g(str2)) {
                    r.b u = ugwVar.u(str2, jVar, size);
                    ugwVar.t = u;
                    ugwVar.k = u.b();
                    ugwVar.i();
                }
            }
        });
        return c2;
    }

    public final zr9 v(as9.a aVar) {
        List<androidx.camera.core.impl.g> a2 = this.p.a();
        return (a2 == null || a2.isEmpty()) ? aVar : new as9.a(a2);
    }

    public final int w() {
        throw null;
    }

    public final void x(i iVar) {
        if (iVar.b || iVar.c) {
            b().c(iVar.b, iVar.c);
            iVar.b = false;
            iVar.c = false;
        }
        throw null;
    }
}
