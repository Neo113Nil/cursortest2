package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
/* loaded from: classes12.dex */
public final class itc0 implements thd0<uvf<svf>> {
    public final n220<ww8, svf> a;
    public final ecl b;
    public final ltc0 c;

    /* compiled from: PostprocessedBitmapMemoryCacheProducer.java */
    public static class a extends wtl<uvf<svf>, uvf<svf>> {
        public final ww8 c;
        public final boolean d;
        public final n220<ww8, svf> e;
        public final boolean f;

        public a(l7j<uvf<svf>> l7jVar, ww8 ww8Var, boolean z, n220<ww8, svf> n220Var, boolean z2) {
            super(l7jVar);
            this.c = ww8Var;
            this.d = z;
            this.e = n220Var;
            this.f = z2;
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            uvf<svf> uvfVar = (uvf) obj;
            l7j<O> l7jVar = this.b;
            if (uvfVar == null) {
                if (ac6.d(i)) {
                    l7jVar.b(i, null);
                }
            } else if (!ac6.e(i) || this.d) {
                uvf<svf> c = this.f ? this.e.c(this.c, uvfVar) : null;
                try {
                    l7jVar.c(1.0f);
                    if (c != null) {
                        uvfVar = c;
                    }
                    l7jVar.b(i, uvfVar);
                } finally {
                    uvf.q(c);
                }
            }
        }
    }

    public itc0(n220 n220Var, ecl eclVar, ltc0 ltc0Var) {
        this.a = n220Var;
        this.b = eclVar;
        this.c = ltc0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        yhd0 q = uhd0Var.q();
        ImageRequest r = uhd0Var.r();
        Object m = uhd0Var.m();
        ktc0 ktc0Var = r.o;
        ltc0 ltc0Var = this.c;
        if (ktc0Var == null || ktc0Var.a() == null) {
            ltc0Var.b(l7jVar, uhd0Var);
            return;
        }
        q.k(uhd0Var, "PostprocessedBitmapMemoryCacheProducer");
        nc7 e = this.b.e(r, m);
        uvf<svf> uvfVar = uhd0Var.r().n(1) ? this.a.get(e) : null;
        if (uvfVar == null) {
            a aVar = new a(l7jVar, e, ktc0Var instanceof p0g0, this.a, uhd0Var.r().n(2));
            q.f(uhd0Var, "PostprocessedBitmapMemoryCacheProducer", q.i(uhd0Var, "PostprocessedBitmapMemoryCacheProducer") ? ImmutableMap.a("cached_value_found", CredentialEntry.FALSE_STRING) : null);
            ltc0Var.b(aVar, uhd0Var);
        } else {
            q.f(uhd0Var, "PostprocessedBitmapMemoryCacheProducer", q.i(uhd0Var, "PostprocessedBitmapMemoryCacheProducer") ? ImmutableMap.a("cached_value_found", "true") : null);
            q.e(uhd0Var, "PostprocessedBitmapMemoryCacheProducer", true);
            uhd0Var.s("memory_bitmap", "postprocessed");
            l7jVar.c(1.0f);
            l7jVar.b(1, uvfVar);
            uvfVar.close();
        }
    }
}
