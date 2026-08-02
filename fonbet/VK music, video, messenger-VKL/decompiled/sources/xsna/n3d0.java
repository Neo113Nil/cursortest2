package xsna;

import android.graphics.Rect;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.g;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Executor;
import xsna.pi20;
import xsna.vfq0;

/* compiled from: Preview.java */
/* loaded from: classes11.dex */
public final class n3d0 extends vfq0 {
    public static final c r = new c();
    public static final mtu s = xo9.t();

    @Nullable
    public d l;

    @NonNull
    public Executor m;
    public DeferrableSurface n;

    @Nullable
    public zjn0 o;
    public boolean p;

    @Nullable
    public Size q;

    /* compiled from: Preview.java */
    public class a extends gg9 {
        public final /* synthetic */ rjw a;

        public a(rjw rjwVar) {
            this.a = rjwVar;
        }

        @Override // xsna.gg9
        public final void b(@NonNull he9 he9Var) {
            if (this.a.a()) {
                n3d0 n3d0Var = n3d0.this;
                Iterator it = n3d0Var.a.iterator();
                while (it.hasNext()) {
                    ((vfq0.d) it.next()).a(n3d0Var);
                }
            }
        }
    }

    /* compiled from: Preview.java */
    public static final class b implements u.a<n3d0, androidx.camera.core.impl.p, b>, l.a<b> {
        public final androidx.camera.core.impl.n a;

        public b() {
            this(androidx.camera.core.impl.n.z());
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final b a(@NonNull Size size) {
            this.a.C(androidx.camera.core.impl.l.d, size);
            return this;
        }

        @Override // androidx.camera.core.impl.u.a
        @NonNull
        public final androidx.camera.core.impl.p b() {
            return new androidx.camera.core.impl.p(androidx.camera.core.impl.o.y(this.a));
        }

        @Override // androidx.camera.core.impl.l.a
        @NonNull
        public final b c(int i) {
            this.a.C(androidx.camera.core.impl.l.c, Integer.valueOf(i));
            return this;
        }

        @Override // xsna.hbq
        @NonNull
        public final androidx.camera.core.impl.m d() {
            return this.a;
        }

        public b(androidx.camera.core.impl.n nVar) {
            Object obj;
            this.a = nVar;
            Object obj2 = null;
            try {
                obj = nVar.f(x3o0.p);
            } catch (IllegalArgumentException unused) {
                obj = null;
            }
            Class cls = (Class) obj;
            if (cls != null && !cls.equals(n3d0.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.n nVar2 = this.a;
            nVar2.C(x3o0.p, n3d0.class);
            try {
                obj2 = nVar2.f(x3o0.o);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                this.a.C(x3o0.o, n3d0.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: Preview.java */
    public static final class c {
        public static final androidx.camera.core.impl.p a;

        static {
            b bVar = new b();
            androidx.camera.core.impl.a aVar = androidx.camera.core.impl.u.l;
            androidx.camera.core.impl.n nVar = bVar.a;
            nVar.C(aVar, 2);
            nVar.C(androidx.camera.core.impl.l.b, 0);
            a = new androidx.camera.core.impl.p(androidx.camera.core.impl.o.y(nVar));
        }
    }

    /* compiled from: Preview.java */
    public interface d {
    }

    @Override // xsna.vfq0
    @Nullable
    public final androidx.camera.core.impl.u<?> d(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config a2 = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.PREVIEW);
        if (z) {
            r.getClass();
            a2 = Config.w(a2, c.a);
        }
        if (a2 == null) {
            return null;
        }
        return new androidx.camera.core.impl.p(androidx.camera.core.impl.o.y(((b) f(a2)).a));
    }

    @Override // xsna.vfq0
    @NonNull
    public final u.a<?, ?, ?> f(@NonNull Config config) {
        return new b(androidx.camera.core.impl.n.A(config));
    }

    @Override // xsna.vfq0
    public final void o() {
        DeferrableSurface deferrableSurface = this.n;
        if (deferrableSurface != null) {
            deferrableSurface.a();
        }
        this.o = null;
    }

    /* JADX WARN: Type inference failed for: r3v7, types: [androidx.camera.core.impl.u, androidx.camera.core.impl.u<?>] */
    @Override // xsna.vfq0
    @NonNull
    public final androidx.camera.core.impl.u<?> p(@NonNull ui9 ui9Var, @NonNull u.a<?, ?, ?> aVar) {
        Object obj;
        Object d2 = aVar.d();
        androidx.camera.core.impl.a aVar2 = androidx.camera.core.impl.p.u;
        androidx.camera.core.impl.o oVar = (androidx.camera.core.impl.o) d2;
        oVar.getClass();
        try {
            obj = oVar.f(aVar2);
        } catch (IllegalArgumentException unused) {
            obj = null;
        }
        if (obj != null) {
            ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.k.a, 35);
        } else {
            ((androidx.camera.core.impl.n) aVar.d()).C(androidx.camera.core.impl.k.a, 34);
        }
        return aVar.b();
    }

    @Override // xsna.vfq0
    @NonNull
    public final Size r(@NonNull Size size) {
        this.q = size;
        this.k = t(c(), (androidx.camera.core.impl.p) this.f, this.q).b();
        return size;
    }

    public final r.b t(@NonNull final String str, @NonNull final androidx.camera.core.impl.p pVar, @NonNull final Size size) {
        pi20.a aVar;
        fsk.m();
        r.b c2 = r.b.c(pVar);
        es9 es9Var = (es9) pVar.g(androidx.camera.core.impl.p.u, null);
        DeferrableSurface deferrableSurface = this.n;
        if (deferrableSurface != null) {
            deferrableSurface.a();
        }
        zjn0 zjn0Var = new zjn0(size, a(), es9Var != null);
        this.o = zjn0Var;
        d dVar = this.l;
        if (dVar != null) {
            this.m.execute(new zv4(6, dVar, zjn0Var));
            u();
        } else {
            this.p = true;
        }
        if (es9Var != null) {
            g.a aVar2 = new g.a();
            HandlerThread a2 = h5s.a("CameraX-preview_processing");
            String num = Integer.toString(aVar2.hashCode());
            ihd0 ihd0Var = new ihd0(size.getWidth(), size.getHeight(), pVar.getInputFormat(), new Handler(a2.getLooper()), aVar2, es9Var, zjn0Var.h, num);
            synchronized (ihd0Var.h) {
                if (ihd0Var.i) {
                    throw new IllegalStateException("ProcessingSurface already released!");
                }
                aVar = ihd0Var.n;
            }
            c2.b.b(aVar);
            c2.f.add(aVar);
            r0t.e(ihd0Var.e).addListener(new io.reactivex.rxjava3.android.a(a2, 12), xo9.g());
            this.n = ihd0Var;
            c2.b.f.a.put(num, 0);
        } else {
            rjw rjwVar = (rjw) pVar.g(androidx.camera.core.impl.p.t, null);
            if (rjwVar != null) {
                a aVar3 = new a(rjwVar);
                c2.b.b(aVar3);
                c2.f.add(aVar3);
            }
            this.n = zjn0Var.h;
        }
        c2.a(this.n);
        c2.e.add(new r.c() { // from class: xsna.m3d0
            @Override // androidx.camera.core.impl.r.c
            public final void onError() {
                n3d0 n3d0Var = n3d0.this;
                String str2 = str;
                if (n3d0Var.g(str2)) {
                    n3d0Var.k = n3d0Var.t(str2, pVar, size).b();
                    n3d0Var.i();
                }
            }
        });
        return c2;
    }

    @NonNull
    public final String toString() {
        return "Preview:" + e();
    }

    public final void u() {
        CameraInternal a2 = a();
        d dVar = this.l;
        Size size = this.q;
        Rect rect = this.i;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        zjn0 zjn0Var = this.o;
        if (a2 == null || dVar == null || rect == null) {
            return;
        }
        bo5 bo5Var = new bo5(rect, a2.c().g(((androidx.camera.core.impl.l) this.f).p(0)), ((androidx.camera.core.impl.l) this.f).p(0));
        zjn0Var.i = bo5Var;
        v5d0 v5d0Var = zjn0Var.j;
        if (v5d0Var != null) {
            zjn0Var.k.execute(new nek(3, v5d0Var, bo5Var));
        }
    }

    public final void v(@Nullable d dVar) {
        fsk.m();
        if (dVar == null) {
            this.l = null;
            this.c = vfq0.c.INACTIVE;
            j();
            return;
        }
        this.l = dVar;
        this.m = s;
        this.c = vfq0.c.ACTIVE;
        j();
        if (!this.p) {
            if (this.g != null) {
                this.k = t(c(), (androidx.camera.core.impl.p) this.f, this.g).b();
                i();
                return;
            }
            return;
        }
        zjn0 zjn0Var = this.o;
        d dVar2 = this.l;
        if (dVar2 == null || zjn0Var == null) {
            return;
        }
        this.m.execute(new zv4(6, dVar2, zjn0Var));
        u();
        this.p = false;
    }
}
