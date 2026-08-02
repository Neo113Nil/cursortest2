package xsna;

import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: BranchOnSeparateImagesProducer.java */
/* loaded from: classes12.dex */
public final class za8 implements thd0<rip> {
    public final v9g0 a;
    public final aso0 b;

    /* compiled from: BranchOnSeparateImagesProducer.java */
    public class a extends wtl<rip, rip> {
        public final uhd0 c;

        public a(l7j l7jVar, uhd0 uhd0Var) {
            super(l7jVar);
            this.c = uhd0Var;
        }

        @Override // xsna.wtl, xsna.ac6
        public final void g(Throwable th) {
            za8.this.b.b(this.b, this.c);
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            uhd0 uhd0Var = this.c;
            ImageRequest r = uhd0Var.r();
            boolean d = ac6.d(i);
            boolean x = m4s.x(ripVar, r.h);
            l7j<O> l7jVar = this.b;
            if (ripVar != null && (x || r.e)) {
                if (d && x) {
                    l7jVar.b(i, ripVar);
                } else {
                    l7jVar.b(i & (-2), ripVar);
                }
            }
            if (!d || x || r.d()) {
                return;
            }
            rip.c(ripVar);
            za8.this.b.b(l7jVar, uhd0Var);
        }
    }

    public za8(v9g0 v9g0Var, aso0 aso0Var) {
        this.a = v9g0Var;
        this.b = aso0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        this.a.b(new a(l7jVar, uhd0Var), uhd0Var);
    }
}
