package xsna;

import androidx.compose.ui.unit.LayoutDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Lambda;
import xsna.q630;
import xsna.tra0;
import xsna.wlp0;

/* compiled from: AnimatedContent.kt */
/* loaded from: classes11.dex */
public final class mi2<S> implements li2<S> {
    public final wlp0<S> a;
    public dt1 b;
    public LayoutDirection c;
    public final wh50 d = androidx.compose.runtime.k.b(new q9x(0));
    public final ph50<S, mtk0<q9x>> e = h5h0.b();
    public wlp0.a.C3941a f;

    /* compiled from: AnimatedContent.kt */
    public static final class b<S> extends d730<c<S>> {
        public final wlp0<S>.a<q9x, tq2> a;
        public final wh50 b;
        public final mi2<S> c;

        public b(wlp0.a aVar, wh50 wh50Var, mi2 mi2Var) {
            this.a = aVar;
            this.b = wh50Var;
            this.c = mi2Var;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(bVar.a, this.a) && epx.f(bVar.b, this.b);
        }

        public final int hashCode() {
            int hashCode = this.c.hashCode() * 31;
            wlp0<S>.a<q9x, tq2> aVar = this.a;
            return this.b.hashCode() + ((hashCode + (aVar != null ? aVar.hashCode() : 0)) * 31);
        }

        @Override // xsna.d730
        public final q630.c r() {
            c cVar = new c();
            cVar.p = this.a;
            cVar.q = this.b;
            cVar.r = this.c;
            cVar.s = xh2.a;
            return cVar;
        }

        @Override // xsna.d730
        public final void s(q630.c cVar) {
            c cVar2 = (c) cVar;
            cVar2.p = this.a;
            cVar2.q = this.b;
            cVar2.r = this.c;
        }
    }

    /* compiled from: AnimatedContent.kt */
    public static final class c<S> extends ooy {
        public wlp0<S>.a<q9x, tq2> p;
        public wh50 q;
        public mi2<S> r;
        public long s;

        /* compiled from: AnimatedContent.kt */
        public static final class a extends Lambda implements izs<tra0.a, s3q0> {
            final /* synthetic */ long $measuredSize;
            final /* synthetic */ tra0 $placeable;
            final /* synthetic */ c<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c<S> cVar, tra0 tra0Var, long j) {
                super(1);
                this.this$0 = cVar;
                this.$placeable = tra0Var;
                this.$measuredSize = j;
            }

            @Override // xsna.izs
            public final s3q0 invoke(tra0.a aVar) {
                dt1 dt1Var = this.this$0.r.b;
                tra0 tra0Var = this.$placeable;
                tra0.a.w(aVar, this.$placeable, dt1Var.a((tra0Var.b << 32) | (tra0Var.c & 4294967295L), this.$measuredSize, LayoutDirection.Ltr));
                return s3q0.a;
            }
        }

        /* compiled from: AnimatedContent.kt */
        public static final class b extends Lambda implements izs<wlp0.b<S>, phr<q9x>> {
            final /* synthetic */ long $currentSize;
            final /* synthetic */ c<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(c<S> cVar, long j) {
                super(1);
                this.this$0 = cVar;
                this.$currentSize = j;
            }

            @Override // xsna.izs
            public final phr<q9x> invoke(Object obj) {
                long j;
                phr<q9x> b;
                wlp0.b bVar = (wlp0.b) obj;
                if (epx.f(bVar.b(), this.this$0.r.b())) {
                    c<S> cVar = this.this$0;
                    j = this.$currentSize;
                    if (!q9x.b(cVar.s, xh2.a)) {
                        j = cVar.s;
                    }
                } else {
                    mtk0 mtk0Var = (mtk0) this.this$0.r.e.d(bVar.b());
                    j = mtk0Var != null ? ((q9x) mtk0Var.getValue()).a : 0L;
                }
                mtk0 mtk0Var2 = (mtk0) this.this$0.r.e.d(bVar.f());
                long j2 = mtk0Var2 != null ? ((q9x) mtk0Var2.getValue()).a : 0L;
                wxj0 wxj0Var = (wxj0) this.this$0.q.getValue();
                return (wxj0Var == null || (b = wxj0Var.b(j, j2)) == null) ? jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 400.0f, null, 5) : b;
            }
        }

        /* compiled from: AnimatedContent.kt */
        /* renamed from: xsna.mi2$c$c, reason: collision with other inner class name */
        public static final class C3344c extends Lambda implements izs<S, q9x> {
            final /* synthetic */ long $currentSize;
            final /* synthetic */ c<S> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3344c(c<S> cVar, long j) {
                super(1);
                this.this$0 = cVar;
                this.$currentSize = j;
            }

            @Override // xsna.izs
            public final q9x invoke(Object obj) {
                long j;
                if (epx.f(obj, this.this$0.r.b())) {
                    c<S> cVar = this.this$0;
                    j = this.$currentSize;
                    if (!q9x.b(cVar.s, xh2.a)) {
                        j = cVar.s;
                    }
                } else {
                    mtk0<q9x> d = this.this$0.r.e.d(obj);
                    j = d != null ? d.getValue().a : 0L;
                }
                return new q9x(j);
            }
        }

        public c() {
            throw null;
        }

        @Override // xsna.noy
        public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
            long j2;
            tra0 N = zo10Var.N(j);
            if (ep10Var.z1()) {
                j2 = (N.b << 32) | (N.c & 4294967295L);
            } else {
                wlp0<S>.a<q9x, tq2> aVar = this.p;
                if (aVar == null) {
                    j2 = (N.b << 32) | (N.c & 4294967295L);
                    this.s = j2;
                } else {
                    long j3 = (N.c & 4294967295L) | (N.b << 32);
                    wlp0.a.C3941a a2 = aVar.a(new b(this, j3), new C3344c(this, j3));
                    this.r.f = a2;
                    j2 = ((q9x) a2.getValue()).a;
                    this.s = ((q9x) a2.getValue()).a;
                }
            }
            return ep10Var.Q((int) (j2 >> 32), (int) (4294967295L & j2), jgp.b, new a(this, N, j2));
        }

        @Override // xsna.q630.c
        public final void c2() {
            this.s = xh2.a;
        }
    }

    public mi2(wlp0<S> wlp0Var, dt1 dt1Var, LayoutDirection layoutDirection) {
        this.a = wlp0Var;
        this.b = dt1Var;
        this.c = layoutDirection;
    }

    public static final long g(mi2 mi2Var, long j, long j2) {
        return mi2Var.b.a(j, j2, LayoutDirection.Ltr);
    }

    public static final long h(mi2 mi2Var) {
        wlp0.a.C3941a c3941a = mi2Var.f;
        return c3941a != null ? ((q9x) c3941a.getValue()).a : ((q9x) ((zak0) mi2Var.d).getValue()).a;
    }

    @Override // xsna.wlp0.b
    public final S b() {
        return this.a.e().b();
    }

    @Override // xsna.li2
    public final rpp c(int i, xmk0 xmk0Var, izs izsVar) {
        if (i == 0 || ((i == 4 && this.c == LayoutDirection.Ltr) || (i == 5 && this.c == LayoutDirection.Rtl))) {
            ni2 ni2Var = new ni2(this, izsVar);
            jtp0 jtp0Var = anp.a;
            return new rpp(new gmp0((ciq) null, new b0k0(xmk0Var, new unp(ni2Var)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125));
        }
        if (i != 1 && ((i != 4 || this.c != LayoutDirection.Rtl) && (i != 5 || this.c != LayoutDirection.Ltr))) {
            return i == 2 ? anp.l(xmk0Var, new pi2(this, izsVar)) : i == 3 ? anp.l(xmk0Var, new qi2(this, izsVar)) : qpp.a;
        }
        oi2 oi2Var = new oi2(this, izsVar);
        jtp0 jtp0Var2 = anp.a;
        return new rpp(new gmp0((ciq) null, new b0k0(xmk0Var, new unp(oi2Var)), (vsa) null, (h4h0) null, (LinkedHashMap) null, 125));
    }

    @Override // xsna.li2
    public final llj d(llj lljVar, xxj0 xxj0Var) {
        lljVar.d = xxj0Var;
        return lljVar;
    }

    @Override // xsna.li2
    public final e5q e(int i, xmk0 xmk0Var, izs izsVar) {
        return (i == 0 || (i == 4 && this.c == LayoutDirection.Ltr) || (i == 5 && this.c == LayoutDirection.Rtl)) ? anp.n(xmk0Var, new ri2(this, izsVar)) : (i == 1 || (i == 4 && this.c == LayoutDirection.Rtl) || (i == 5 && this.c == LayoutDirection.Ltr)) ? anp.n(xmk0Var, new si2(this, izsVar)) : i == 2 ? anp.o(xmk0Var, new ti2(this, izsVar)) : i == 3 ? anp.o(xmk0Var, new ui2(this, izsVar)) : d5q.a;
    }

    @Override // xsna.wlp0.b
    public final S f() {
        return this.a.e().f();
    }

    /* compiled from: AnimatedContent.kt */
    public static final class a implements li90 {
        public final wh50 a;

        public a(boolean z) {
            this.a = androidx.compose.runtime.k.b(Boolean.valueOf(z));
        }

        @Override // xsna.li90
        public final Object n() {
            return this;
        }
    }
}
