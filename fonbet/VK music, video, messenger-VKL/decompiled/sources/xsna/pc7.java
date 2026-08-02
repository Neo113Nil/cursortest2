package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: BitmapMemoryCacheProducer.java */
/* loaded from: classes12.dex */
public class pc7 implements thd0<uvf<svf>> {
    public final n220<ww8, svf> a;
    public final ecl b;
    public final thd0<uvf<svf>> c;

    /* compiled from: BitmapMemoryCacheProducer.java */
    public class a extends wtl<uvf<svf>, uvf<svf>> {
        public final /* synthetic */ ww8 c;
        public final /* synthetic */ boolean d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l7j l7jVar, ww8 ww8Var, boolean z) {
            super(l7jVar);
            this.c = ww8Var;
            this.d = z;
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            uvf<svf> uvfVar;
            uvf<svf> uvfVar2 = (uvf) obj;
            n220<ww8, svf> n220Var = pc7.this.a;
            try {
                if (lhs.d()) {
                    lhs.a("BitmapMemoryCacheProducer#onNewResultImpl");
                }
                boolean d = ac6.d(i);
                l7j<O> l7jVar = this.b;
                if (uvfVar2 == null) {
                    if (d) {
                        l7jVar.b(i, null);
                    }
                    if (lhs.d()) {
                        lhs.b();
                        return;
                    }
                    return;
                }
                if (uvfVar2.r().c4() || ac6.k(i, 8)) {
                    l7jVar.b(i, uvfVar2);
                    if (lhs.d()) {
                        lhs.b();
                        return;
                    }
                    return;
                }
                ww8 ww8Var = this.c;
                if (!d && (uvfVar = n220Var.get(ww8Var)) != null) {
                    try {
                        cpe0 R3 = uvfVar2.r().R3();
                        cpe0 R32 = uvfVar.r().R3();
                        if (((gpw) R32).c || ((gpw) R32).a >= ((gpw) R3).a) {
                            l7jVar.b(i, uvfVar);
                            if (lhs.d()) {
                                lhs.b();
                                return;
                            }
                            return;
                        }
                    } finally {
                        uvfVar.close();
                    }
                }
                uvf<svf> c = this.d ? n220Var.c(ww8Var, uvfVar2) : null;
                if (d) {
                    try {
                        l7jVar.c(1.0f);
                    } catch (Throwable th) {
                        uvf.q(c);
                        throw th;
                    }
                }
                if (c != null) {
                    uvfVar2 = c;
                }
                l7jVar.b(i, uvfVar2);
                uvf.q(c);
                if (lhs.d()) {
                    lhs.b();
                }
            } catch (Throwable th2) {
                if (lhs.d()) {
                    lhs.b();
                }
                throw th2;
            }
        }
    }

    public pc7(n220<ww8, svf> n220Var, ecl eclVar, thd0<uvf<svf>> thd0Var) {
        this.a = n220Var;
        this.b = eclVar;
        this.c = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        try {
            if (lhs.d()) {
                lhs.a("BitmapMemoryCacheProducer#produceResults");
            }
            yhd0 q = uhd0Var.q();
            q.k(uhd0Var, d());
            nc7 a2 = this.b.a(uhd0Var.r(), uhd0Var.m());
            uvf<svf> uvfVar = uhd0Var.r().n(1) ? this.a.get(a2) : null;
            if (uvfVar != null) {
                uhd0Var.b(uvfVar.r().getExtras());
                boolean z = ((gpw) uvfVar.r().R3()).c;
                if (z) {
                    q.f(uhd0Var, d(), q.i(uhd0Var, d()) ? ImmutableMap.a("cached_value_found", "true") : null);
                    q.e(uhd0Var, d(), true);
                    uhd0Var.s("memory_bitmap", c());
                    l7jVar.c(1.0f);
                }
                l7jVar.b(z ? 1 : 0, uvfVar);
                uvfVar.close();
                if (z) {
                    if (lhs.d()) {
                        lhs.b();
                        return;
                    }
                    return;
                }
            }
            if (uhd0Var.w().h() >= ImageRequest.RequestLevel.BITMAP_MEMORY_CACHE.h()) {
                q.f(uhd0Var, d(), q.i(uhd0Var, d()) ? ImmutableMap.a("cached_value_found", CredentialEntry.FALSE_STRING) : null);
                q.e(uhd0Var, d(), false);
                uhd0Var.s("memory_bitmap", c());
                l7jVar.b(1, null);
                if (lhs.d()) {
                    lhs.b();
                    return;
                }
                return;
            }
            l7j<uvf<svf>> e = e(l7jVar, a2, uhd0Var.r().n(2));
            q.f(uhd0Var, d(), q.i(uhd0Var, d()) ? ImmutableMap.a("cached_value_found", CredentialEntry.FALSE_STRING) : null);
            if (lhs.d()) {
                lhs.a("mInputProducer.produceResult");
            }
            this.c.b(e, uhd0Var);
            if (lhs.d()) {
                lhs.b();
            }
            if (lhs.d()) {
                lhs.b();
            }
        } catch (Throwable th) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th;
        }
    }

    public String c() {
        return "pipe_bg";
    }

    public String d() {
        return "BitmapMemoryCacheProducer";
    }

    public l7j<uvf<svf>> e(l7j<uvf<svf>> l7jVar, ww8 ww8Var, boolean z) {
        return new a(l7jVar, ww8Var, z);
    }
}
