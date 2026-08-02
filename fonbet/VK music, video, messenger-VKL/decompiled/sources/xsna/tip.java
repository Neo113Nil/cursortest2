package xsna;

import androidx.credentials.provider.CredentialEntry;
import com.facebook.common.internal.ImmutableMap;
import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.imagepipeline.request.ImageRequest;

/* compiled from: EncodedMemoryCacheProducer.java */
/* loaded from: classes12.dex */
public final class tip implements thd0<rip> {
    public final n220<ww8, PooledByteBuffer> a;
    public final ecl b;
    public final thd0<rip> c;

    /* compiled from: EncodedMemoryCacheProducer.java */
    public static class a extends wtl<rip, rip> {
        public final n220<ww8, PooledByteBuffer> c;
        public final ww8 d;
        public final boolean e;

        public a(l7j l7jVar, n220 n220Var, ww8 ww8Var, boolean z) {
            super(l7jVar);
            this.c = n220Var;
            this.d = ww8Var;
            this.e = z;
        }

        @Override // xsna.ac6
        public final void h(int i, Object obj) {
            rip ripVar = (rip) obj;
            try {
                if (lhs.d()) {
                    lhs.a("EncodedMemoryCacheProducer#onNewResultImpl");
                }
                boolean e = ac6.e(i);
                l7j<O> l7jVar = this.b;
                if (!e && ripVar != null) {
                    if (!((i & 10) != 0)) {
                        ripVar.y();
                        if (ripVar.c != siw.c) {
                            uvf<PooledByteBuffer> o = uvf.o(ripVar.b);
                            if (o != null) {
                                try {
                                    uvf<PooledByteBuffer> c = this.e ? this.c.c(this.d, o) : null;
                                    if (c != null) {
                                        try {
                                            rip ripVar2 = new rip(c);
                                            ripVar2.h(ripVar);
                                            try {
                                                l7jVar.c(1.0f);
                                                l7jVar.b(i, ripVar2);
                                                if (lhs.d()) {
                                                    lhs.b();
                                                    return;
                                                }
                                                return;
                                            } finally {
                                                ripVar2.close();
                                            }
                                        } finally {
                                            c.close();
                                        }
                                    }
                                } finally {
                                    o.close();
                                }
                            }
                            l7jVar.b(i, ripVar);
                            if (lhs.d()) {
                                lhs.b();
                                return;
                            }
                            return;
                        }
                    }
                }
                l7jVar.b(i, ripVar);
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
    }

    public tip(n220<ww8, PooledByteBuffer> n220Var, ecl eclVar, thd0<rip> thd0Var) {
        this.a = n220Var;
        this.b = eclVar;
        this.c = thd0Var;
    }

    @Override // xsna.thd0
    public final void b(l7j<rip> l7jVar, uhd0 uhd0Var) {
        try {
            if (lhs.d()) {
                lhs.a("EncodedMemoryCacheProducer#produceResults");
            }
            yhd0 q = uhd0Var.q();
            q.k(uhd0Var, "EncodedMemoryCacheProducer");
            ww8 d = this.b.d(uhd0Var.r(), uhd0Var.m());
            boolean n = uhd0Var.r().n(4);
            n220<ww8, PooledByteBuffer> n220Var = this.a;
            uvf<PooledByteBuffer> uvfVar = n ? n220Var.get(d) : null;
            try {
                if (uvfVar != null) {
                    rip ripVar = new rip(uvfVar);
                    try {
                        q.f(uhd0Var, "EncodedMemoryCacheProducer", q.i(uhd0Var, "EncodedMemoryCacheProducer") ? ImmutableMap.a("cached_value_found", "true") : null);
                        q.e(uhd0Var, "EncodedMemoryCacheProducer", true);
                        uhd0Var.t("memory_encoded");
                        l7jVar.c(1.0f);
                        l7jVar.b(1, ripVar);
                        ripVar.close();
                        uvfVar.close();
                        if (lhs.d()) {
                            lhs.b();
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        ripVar.close();
                        throw th;
                    }
                }
                if (uhd0Var.w().h() >= ImageRequest.RequestLevel.ENCODED_MEMORY_CACHE.h()) {
                    q.f(uhd0Var, "EncodedMemoryCacheProducer", q.i(uhd0Var, "EncodedMemoryCacheProducer") ? ImmutableMap.a("cached_value_found", CredentialEntry.FALSE_STRING) : null);
                    q.e(uhd0Var, "EncodedMemoryCacheProducer", false);
                    uhd0Var.s("memory_encoded", "nil-result");
                    l7jVar.b(1, null);
                    if (lhs.d()) {
                        lhs.b();
                        return;
                    }
                    return;
                }
                boolean n2 = uhd0Var.r().n(8);
                uhd0Var.n().getExperiments().getClass();
                a aVar = new a(l7jVar, n220Var, d, n2);
                q.f(uhd0Var, "EncodedMemoryCacheProducer", q.i(uhd0Var, "EncodedMemoryCacheProducer") ? ImmutableMap.a("cached_value_found", CredentialEntry.FALSE_STRING) : null);
                this.c.b(aVar, uhd0Var);
                if (lhs.d()) {
                    lhs.b();
                }
            } finally {
                uvf.q(uvfVar);
            }
        } catch (Throwable th2) {
            if (lhs.d()) {
                lhs.b();
            }
            throw th2;
        }
    }
}
