package xsna;

import android.graphics.Bitmap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: PostprocessorProducer.java */
/* loaded from: classes12.dex */
public final class ltc0 implements thd0<uvf<svf>> {
    public final thd0<uvf<svf>> a;
    public final hta0 b;
    public final Executor c;

    /* compiled from: PostprocessorProducer.java */
    public class a extends wtl<uvf<svf>, uvf<svf>> {
        public final yhd0 c;
        public final uhd0 d;
        public final ktc0 e;
        public boolean f;
        public uvf<svf> g;
        public int h;
        public boolean i;
        public boolean j;

        /* compiled from: PostprocessorProducer.java */
        /* renamed from: xsna.ltc0$a$a, reason: collision with other inner class name */
        public class C3296a extends uk6 {
            public C3296a() {
            }

            @Override // xsna.vhd0
            public final void c() {
                a aVar = a.this;
                if (aVar.m()) {
                    aVar.b.a();
                }
            }
        }

        public a(l7j<uvf<svf>> l7jVar, yhd0 yhd0Var, ktc0 ktc0Var, uhd0 uhd0Var) {
            super(l7jVar);
            this.g = null;
            this.h = 0;
            this.i = false;
            this.j = false;
            this.c = yhd0Var;
            this.e = ktc0Var;
            this.d = uhd0Var;
            uhd0Var.p(new C3296a());
        }

        public static void l(a aVar, uvf uvfVar, int i) {
            ktc0 ktc0Var = aVar.e;
            uhd0 uhd0Var = aVar.d;
            yhd0 yhd0Var = aVar.c;
            if (!uvf.t(uvfVar)) {
                throw new IllegalArgumentException();
            }
            if (!(((svf) uvfVar.r()) instanceof xvf)) {
                aVar.n(i, uvfVar);
                return;
            }
            yhd0Var.k(uhd0Var, "PostprocessorProducer");
            kcl kclVar = null;
            Map<String, String> a = null;
            try {
                try {
                    kcl o = aVar.o((svf) uvfVar.r());
                    try {
                        if (yhd0Var.i(uhd0Var, "PostprocessorProducer")) {
                            a = ImmutableMap.a("Postprocessor", ktc0Var.getName());
                        }
                        yhd0Var.f(uhd0Var, "PostprocessorProducer", a);
                        aVar.n(i, o);
                        uvf.q(o);
                    } catch (Throwable th) {
                        th = th;
                        kclVar = o;
                        uvf.q(kclVar);
                        throw th;
                    }
                } catch (Exception e) {
                    yhd0Var.b(uhd0Var, "PostprocessorProducer", e, !yhd0Var.i(uhd0Var, "PostprocessorProducer") ? null : ImmutableMap.a("Postprocessor", ktc0Var.getName()));
                    if (aVar.m()) {
                        aVar.b.onFailure(e);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // xsna.wtl, xsna.ac6
        public final void f() {
            if (m()) {
                this.b.a();
            }
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            if (m()) {
                this.b.onFailure(th);
            }
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            uvf uvfVar = (uvf) obj;
            if (!uvf.t(uvfVar)) {
                if (ac6.d(i)) {
                    n(i, null);
                    return;
                }
                return;
            }
            synchronized (this) {
                try {
                    if (this.f) {
                        return;
                    }
                    uvf<svf> uvfVar2 = this.g;
                    this.g = uvf.o(uvfVar);
                    this.h = i;
                    this.i = true;
                    boolean p = p();
                    uvf.q(uvfVar2);
                    if (p) {
                        ltc0.this.c.execute(new mtc0(this));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean m() {
            synchronized (this) {
                try {
                    if (this.f) {
                        return false;
                    }
                    uvf<svf> uvfVar = this.g;
                    this.g = null;
                    this.f = true;
                    uvf.q(uvfVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:7:0x000a, code lost:
        
            if (r1 != false) goto L12;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final void n(int i, uvf uvfVar) {
            boolean d = ac6.d(i);
            if (!d) {
                synchronized (this) {
                    boolean z = this.f;
                }
            }
            if (!d || !m()) {
                return;
            }
            this.b.b(i, uvfVar);
        }

        public final kcl o(svf svfVar) {
            xvf xvfVar = (xvf) svfVar;
            uvf<Bitmap> b = this.e.b(xvfVar.W3(), ltc0.this.b);
            try {
                lcl B2 = xvf.B2(b, svfVar.R3(), xvfVar.getRotationAngle(), xvfVar.w0());
                B2.b(xvfVar.getExtras());
                return uvf.v(B2);
            } finally {
                uvf.q(b);
            }
        }

        public final synchronized boolean p() {
            if (this.f || !this.i || this.j || !uvf.t(this.g)) {
                return false;
            }
            this.j = true;
            return true;
        }
    }

    /* compiled from: PostprocessorProducer.java */
    public class b extends wtl<uvf<svf>, uvf<svf>> {
        public boolean c;
        public uvf<svf> d;

        @Override // xsna.wtl, xsna.ac6
        public final void f() {
            if (l()) {
                this.b.a();
            }
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            if (l()) {
                this.b.onFailure(th);
            }
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            uvf uvfVar = (uvf) obj;
            if (ac6.e(i)) {
                return;
            }
            synchronized (this) {
                try {
                    if (!this.c) {
                        uvf<svf> uvfVar2 = this.d;
                        this.d = uvf.o(uvfVar);
                        uvf.q(uvfVar2);
                    }
                } finally {
                }
            }
            synchronized (this) {
                try {
                    if (this.c) {
                        return;
                    }
                    uvf o = uvf.o(this.d);
                    try {
                        this.b.b(0, o);
                    } finally {
                        uvf.q(o);
                    }
                } finally {
                }
            }
        }

        public final boolean l() {
            synchronized (this) {
                try {
                    if (this.c) {
                        return false;
                    }
                    uvf<svf> uvfVar = this.d;
                    this.d = null;
                    this.c = true;
                    uvf.q(uvfVar);
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: PostprocessorProducer.java */
    public class c extends wtl<uvf<svf>, uvf<svf>> {
        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            uvf uvfVar = (uvf) obj;
            if (ac6.e(i)) {
                return;
            }
            this.b.b(i, uvfVar);
        }
    }

    public ltc0(thd0<uvf<svf>> thd0Var, hta0 hta0Var, Executor executor) {
        thd0Var.getClass();
        this.a = thd0Var;
        this.b = hta0Var;
        executor.getClass();
        this.c = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        c cVar;
        yhd0 q = uhd0Var.q();
        ktc0 ktc0Var = uhd0Var.r().o;
        ktc0Var.getClass();
        a aVar = new a(l7jVar, q, ktc0Var, uhd0Var);
        if (ktc0Var instanceof p0g0) {
            b bVar = new b(aVar);
            bVar.c = false;
            bVar.d = null;
            ((p0g0) ktc0Var).c();
            uhd0Var.p(new ntc0(bVar));
            cVar = bVar;
        } else {
            cVar = new c(aVar);
        }
        this.a.b(cVar, uhd0Var);
    }
}
