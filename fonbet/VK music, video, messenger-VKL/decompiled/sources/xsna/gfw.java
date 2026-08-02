package xsna;

import android.media.ImageReader;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.impl.l;
import androidx.camera.core.impl.r;
import androidx.camera.core.impl.u;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.UUID;
import java.util.concurrent.Executor;

/* compiled from: ImageAnalysis.java */
/* loaded from: classes11.dex */
public final class gfw extends vfq0 {
    public static final d p = new d();
    public final jfw l;
    public final Object m;
    public xme0 n;

    @Nullable
    public unw o;

    /* compiled from: ImageAnalysis.java */
    public interface a {
        void b(@NonNull mzi0 mzi0Var);
    }

    /* compiled from: ImageAnalysis.java */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* compiled from: ImageAnalysis.java */
    public static final class c implements l.a<c>, u.a<gfw, androidx.camera.core.impl.i, c> {
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
        public final androidx.camera.core.impl.i b() {
            return new androidx.camera.core.impl.i(androidx.camera.core.impl.o.y(this.a));
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
            if (cls != null && !cls.equals(gfw.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            androidx.camera.core.impl.n nVar2 = this.a;
            nVar2.C(x3o0.p, gfw.class);
            try {
                obj2 = nVar2.f(x3o0.o);
            } catch (IllegalArgumentException unused2) {
            }
            if (obj2 == null) {
                nVar2.C(x3o0.o, gfw.class.getCanonicalName() + "-" + UUID.randomUUID());
            }
        }
    }

    /* compiled from: ImageAnalysis.java */
    public static final class d {
        public static final androidx.camera.core.impl.i a;

        static {
            Size size = new Size(640, 480);
            Size size2 = new Size(1920, 1080);
            c cVar = new c();
            androidx.camera.core.impl.a aVar = androidx.camera.core.impl.l.e;
            androidx.camera.core.impl.n nVar = cVar.a;
            nVar.C(aVar, size);
            nVar.C(androidx.camera.core.impl.l.f, size2);
            nVar.C(androidx.camera.core.impl.u.l, 1);
            nVar.C(androidx.camera.core.impl.l.b, 0);
            a = new androidx.camera.core.impl.i(androidx.camera.core.impl.o.y(nVar));
        }
    }

    public gfw(@NonNull androidx.camera.core.impl.i iVar) {
        super(iVar);
        this.m = new Object();
        if (((Integer) ((androidx.camera.core.impl.i) this.f).g(androidx.camera.core.impl.i.t, 0)).intValue() == 1) {
            this.l = new kfw();
        } else {
            this.l = new lfw((Executor) iVar.g(jqo0.q, xo9.o()));
        }
    }

    @Override // xsna.vfq0
    @Nullable
    public final androidx.camera.core.impl.u<?> d(boolean z, @NonNull UseCaseConfigFactory useCaseConfigFactory) {
        Config a2 = useCaseConfigFactory.a(UseCaseConfigFactory.CaptureType.IMAGE_ANALYSIS);
        if (z) {
            p.getClass();
            a2 = Config.w(a2, d.a);
        }
        if (a2 == null) {
            return null;
        }
        return new androidx.camera.core.impl.i(androidx.camera.core.impl.o.y(((c) f(a2)).a));
    }

    @Override // xsna.vfq0
    @NonNull
    public final u.a<?, ?, ?> f(@NonNull Config config) {
        return new c(androidx.camera.core.impl.n.A(config));
    }

    @Override // xsna.vfq0
    public final void l() {
        this.l.f = true;
    }

    @Override // xsna.vfq0
    public final void o() {
        fsk.m();
        unw unwVar = this.o;
        if (unwVar != null) {
            unwVar.a();
            this.o = null;
        }
        jfw jfwVar = this.l;
        jfwVar.f = false;
        jfwVar.c();
    }

    @Override // xsna.vfq0
    @NonNull
    public final Size r(@NonNull Size size) {
        this.k = t(c(), (androidx.camera.core.impl.i) this.f, size).b();
        return size;
    }

    public final r.b t(@NonNull final String str, @NonNull final androidx.camera.core.impl.i iVar, @NonNull final Size size) {
        czg0 czg0Var;
        fsk.m();
        Executor executor = (Executor) iVar.g(jqo0.q, xo9.o());
        executor.getClass();
        int intValue = ((Integer) ((androidx.camera.core.impl.i) this.f).g(androidx.camera.core.impl.i.t, 0)).intValue() == 1 ? ((Integer) ((androidx.camera.core.impl.i) this.f).g(androidx.camera.core.impl.i.u, 6)).intValue() : 4;
        androidx.camera.core.impl.a aVar = androidx.camera.core.impl.i.v;
        if (((ilw) iVar.g(aVar, null)) != null) {
            ilw ilwVar = (ilw) iVar.g(aVar, null);
            size.getWidth();
            size.getHeight();
            this.f.getInputFormat();
            czg0Var = new czg0(ilwVar.b());
        } else {
            czg0Var = new czg0(new ea2(ImageReader.newInstance(size.getWidth(), size.getHeight(), this.f.getInputFormat(), intValue)));
        }
        CameraInternal a2 = a();
        if (a2 != null) {
            this.l.c = a2.c().g(((androidx.camera.core.impl.l) this.f).p(0));
        }
        czg0Var.a(this.l, executor);
        r.b c2 = r.b.c(iVar);
        unw unwVar = this.o;
        if (unwVar != null) {
            unwVar.a();
        }
        unw unwVar2 = new unw(czg0Var.getSurface());
        this.o = unwVar2;
        r0t.e(unwVar2.e).addListener(new yv6(czg0Var, 3), xo9.t());
        c2.a(this.o);
        c2.e.add(new r.c() { // from class: xsna.ffw
            @Override // androidx.camera.core.impl.r.c
            public final void onError() {
                fsk.m();
                gfw gfwVar = gfw.this;
                unw unwVar3 = gfwVar.o;
                if (unwVar3 != null) {
                    unwVar3.a();
                    gfwVar.o = null;
                }
                gfwVar.l.c();
                String str2 = str;
                if (gfwVar.g(str2)) {
                    gfwVar.k = gfwVar.t(str2, iVar, size).b();
                    gfwVar.i();
                }
            }
        });
        return c2;
    }

    @NonNull
    public final String toString() {
        return "ImageAnalysis:" + e();
    }
}
