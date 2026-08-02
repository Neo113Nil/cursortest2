package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SpinnerSize;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.performance.scroll.ScrollScreenType;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.b6l;
import xsna.cri;
import xsna.dt1;
import xsna.epx;
import xsna.ksr;
import xsna.lsr;
import xsna.q630;
import xsna.r2a;
import xsna.s3q0;
import xsna.sga;
import xsna.smk;
import xsna.spj;
import xsna.tlo0;

/* compiled from: CatalogSectionViewImpl.kt */
/* loaded from: classes16.dex */
public final class rga implements bga {
    public final Map a;

    /* compiled from: CatalogSectionViewImpl.kt */
    public static final class a implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ ksy b;
        public final /* synthetic */ r2a c;
        public final /* synthetic */ int d;
        public final /* synthetic */ ksr e;
        public final /* synthetic */ k2a f;
        public final /* synthetic */ a8a g;
        public final /* synthetic */ qm1 h;

        public a(ksy ksyVar, r2a r2aVar, int i, ksr ksrVar, k2a k2aVar, d8a d8aVar, qm1 qm1Var) {
            this.b = ksyVar;
            this.c = r2aVar;
            this.d = i;
            this.e = ksrVar;
            this.f = k2aVar;
            this.g = d8aVar;
            this.h = qm1Var;
        }

        @Override // xsna.wzs
        public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue = num.intValue();
            if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1150005274, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.addContent.<anonymous>.<anonymous>.<anonymous> (CatalogSectionViewImpl.kt:191)");
                }
                final r2a r2aVar = this.c;
                BlockId w = r2aVar.w();
                pqo pqoVar = sfo.a;
                q630 a = qri.a(q630.a.a, a5x.a, new ofo(0, w, this.b));
                int i = this.d;
                boolean o = aVar2.o(i);
                Object x = aVar2.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (o || x == c0012a) {
                    x = new qga(i);
                    aVar2.R(x);
                }
                q630 b = egi0.b(a, false, (izs) x);
                BlockId w2 = r2aVar.w();
                final ksr ksrVar = this.e;
                boolean J = aVar2.J(w2) | aVar2.J(ksrVar);
                Object x2 = aVar2.x();
                if (J || x2 == c0012a) {
                    x2 = new a1q(new ksr<smk>() { // from class: com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl$addContent$3$1$1$invoke$lambda$2$$inlined$filter$1

                        /* compiled from: Emitters.kt */
                        /* renamed from: com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl$addContent$3$1$1$invoke$lambda$2$$inlined$filter$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements lsr {
                            public final /* synthetic */ lsr b;
                            public final /* synthetic */ r2a c;

                            @b6l(c = "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl$addContent$3$1$1$invoke$lambda$2$$inlined$filter$1$2", f = "CatalogSectionViewImpl.kt", l = {50}, m = "emit")
                            /* renamed from: com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl$addContent$3$1$1$invoke$lambda$2$$inlined$filter$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                int I$0;
                                Object L$0;
                                Object L$1;
                                Object L$2;
                                Object L$3;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(spj spjVar) {
                                    super(spjVar);
                                }

                                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(lsr lsrVar, r2a r2aVar) {
                                this.b = lsrVar;
                                this.c = r2aVar;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
                            /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
                            @Override // xsna.lsr
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, spj spjVar) {
                                AnonymousClass1 anonymousClass1;
                                int i;
                                if (spjVar instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) spjVar;
                                    int i2 = anonymousClass1.label;
                                    if ((i2 & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i2 - Integer.MIN_VALUE;
                                        Object obj2 = anonymousClass1.result;
                                        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                        i = anonymousClass1.label;
                                        if (i != 0) {
                                            kotlin.a.a(obj2);
                                            if (epx.f(((smk) obj).w(), this.c.w())) {
                                                anonymousClass1.L$0 = null;
                                                anonymousClass1.L$1 = null;
                                                anonymousClass1.L$2 = null;
                                                anonymousClass1.L$3 = null;
                                                anonymousClass1.I$0 = 0;
                                                anonymousClass1.label = 1;
                                                if (this.b.emit(obj, anonymousClass1) == coroutineSingletons) {
                                                    return coroutineSingletons;
                                                }
                                            }
                                        } else {
                                            if (i != 1) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            kotlin.a.a(obj2);
                                        }
                                        return s3q0.a;
                                    }
                                }
                                anonymousClass1 = new AnonymousClass1(spjVar);
                                Object obj22 = anonymousClass1.result;
                                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                                i = anonymousClass1.label;
                                if (i != 0) {
                                }
                                return s3q0.a;
                            }
                        }

                        @Override // xsna.ksr
                        public final Object collect(lsr<? super smk> lsrVar, spj spjVar) {
                            Object collect = ksr.this.collect(new AnonymousClass2(lsrVar, r2aVar), spjVar);
                            return collect == CoroutineSingletons.COROUTINE_SUSPENDED ? collect : s3q0.a;
                        }
                    });
                    aVar2.R(x2);
                }
                this.f.a(this.g, r2aVar, this.h, ((a1q) x2).a, b, aVar2, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class b implements izs<Integer, Object> {
        public final /* synthetic */ vv7 b;
        public final /* synthetic */ List c;

        public b(vv7 vv7Var, List list) {
            this.b = vv7Var;
            this.c = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            int intValue = num.intValue();
            return this.b.invoke(Integer.valueOf(intValue), this.c.get(intValue));
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class c implements izs<Integer, Object> {
        public final /* synthetic */ List b;

        public c(List list) {
            this.b = list;
        }

        @Override // xsna.izs
        public final Object invoke(Integer num) {
            return ((ttk0) this.b.get(num.intValue())).getValue().getClass();
        }
    }

    /* compiled from: LazyDsl.kt */
    public static final class d implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
        public final /* synthetic */ List b;
        public final /* synthetic */ sga.a c;
        public final /* synthetic */ rga d;
        public final /* synthetic */ ksr e;
        public final /* synthetic */ qm1 f;

        public d(List list, sga.a aVar, rga rgaVar, ksr ksrVar, qm1 qm1Var) {
            this.b = list;
            this.c = aVar;
            this.d = rgaVar;
            this.e = ksrVar;
            this.f = qm1Var;
        }

        @Override // xsna.zzs
        public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
            int i;
            ksy ksyVar2 = ksyVar;
            int intValue = num.intValue();
            androidx.compose.runtime.a aVar2 = aVar;
            int intValue2 = num2.intValue();
            if ((intValue2 & 6) == 0) {
                i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
            } else {
                i = intValue2;
            }
            if ((intValue2 & 48) == 0) {
                i |= aVar2.o(intValue) ? 32 : 16;
            }
            if (aVar2.t(i & 1, (i & 147) != 146)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(2039820996, i, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                ttk0 ttk0Var = (ttk0) this.b.get(intValue);
                aVar2.K(-221372902);
                sga.a aVar3 = this.c;
                boolean J = aVar2.J(aVar3.f) | ((((i & 14) ^ 6) > 4 && aVar2.J(ksyVar2)) || (i & 6) == 4);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    x = new d8a(ksyVar2, aVar3.f);
                    aVar2.R(x);
                }
                d8a d8aVar = (d8a) x;
                r2a r2aVar = (r2a) nr2.u(ttk0Var, aVar2).getValue();
                k2a k2aVar = (k2a) this.d.a.get(r2aVar.getClass());
                if (k2aVar == null) {
                    aVar2.K(-221109590);
                } else {
                    aVar2.K(-221109589);
                    sfo.b(aVar3.d, r2aVar.w(), kai.c(1150005274, new a(ksyVar2, r2aVar, intValue, this.e, k2aVar, d8aVar, this.f), aVar2), aVar2, 384);
                }
                aVar2.j();
                aVar2.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                aVar2.h();
            }
            return s3q0.a;
        }
    }

    public rga(Map map) {
        this.a = map;
    }

    @Override // xsna.bga
    public final void a(nvy nvyVar, sga.a aVar, izs izsVar, ksr ksrVar) {
        qm1 qm1Var = new qm1(izsVar, 13);
        List<ttk0<r2a>> list = aVar.e;
        nvyVar.e(list.size(), new b(new vv7(1), list), new c(list), new jai(2039820996, new d(list, aVar, this, ksrVar, qm1Var), true));
    }

    @Override // xsna.bga
    public final void b(sga sgaVar, izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(777055794);
        if ((i & 6) == 0) {
            i2 = (M.J(sgaVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(jaiVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(this) ? 2048 : 1024;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(777055794, i2, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.Content (CatalogSectionViewImpl.kt:110)");
            }
            if (sgaVar instanceof sga.a) {
                M.K(-604193795);
                sga.a aVar2 = (sga.a) sgaVar;
                g(aVar2, M, (i2 >> 6) & 112);
                xvy xvyVar = aVar2.f;
                xvy xvyVar2 = aVar2.f;
                boolean z = aVar2.g;
                int i3 = i2 & 112;
                boolean z2 = i3 == 32;
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (z2 || x == c0012a) {
                    x = new ega(izsVar, 0);
                    M.R(x);
                }
                s101.e(0, 0, M, (gzs) x, xvyVar, z);
                ScrollScreenType scrollScreenType = aVar2.i;
                if (scrollScreenType == null) {
                    M.K(-603717946);
                } else {
                    M.K(-603717945);
                    ow90.a.a(xvyVar2, scrollScreenType, M, ow90.p << 6);
                }
                M.j();
                boolean z3 = aVar2.g;
                boolean z4 = i3 == 32;
                Object x2 = M.x();
                if (z4 || x2 == c0012a) {
                    x2 = new me0(izsVar, 2);
                    M.R(x2);
                }
                tz50 I = s101.I(xvyVar2, z3, (gzs) x2, M);
                boolean z5 = aVar2.d;
                xvy xvyVar3 = aVar2.f;
                boolean z6 = i3 == 32;
                Object x3 = M.x();
                if (z6 || x3 == c0012a) {
                    x3 = new lga(izsVar, 0);
                    M.R(x3);
                }
                zzs zzsVar = (zzs) x3;
                boolean z7 = i3 == 32;
                Object x4 = M.x();
                if (z7 || x4 == c0012a) {
                    x4 = new m77(izsVar, 3);
                    M.R(x4);
                }
                sfo.a(z5, xvyVar3, zzsVar, (gzs) x4, kai.c(851254810, new mga(this, sgaVar, izsVar, jaiVar, I, 0), M), M, 24576);
                M = M;
                s3q0 s3q0Var = s3q0.a;
                boolean z8 = i3 == 32;
                Object x5 = M.x();
                if (z8 || x5 == c0012a) {
                    x5 = new pga(izsVar, null);
                    M.R(x5);
                }
                bap.g(s3q0Var, (wzs) x5, M, 6);
                M.j();
            } else {
                M.K(-602059476);
                jaiVar.invoke(zvy.a(0, 3, M), k7b0.f(0, M), M, Integer.valueOf(i2 & 896));
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new nga(this, sgaVar, izsVar, jaiVar, i, 0);
        }
    }

    @Override // xsna.bga
    public final void c(final s890 s890Var, final sga sgaVar, final izs izsVar, final ksr ksrVar, final q630 q630Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1427281419);
        if ((i & 6) == 0) {
            i2 = (M.J(s890Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(sgaVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(ksrVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(q630Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1427281419, i2, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.FullContent (CatalogSectionViewImpl.kt:67)");
            }
            int i3 = i2 >> 3;
            b(sgaVar, izsVar, kai.c(-513333932, new zzs() { // from class: xsna.jga
                @Override // xsna.zzs
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    int i4;
                    xvy xvyVar = (xvy) obj;
                    tpr tprVar = (tpr) obj2;
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 6) == 0) {
                        i4 = (aVar2.J(xvyVar) ? 4 : 2) | intValue;
                    } else {
                        i4 = intValue;
                    }
                    if ((intValue & 48) == 0) {
                        i4 |= aVar2.J(tprVar) ? 32 : 16;
                    }
                    if (aVar2.t(i4 & 1, (i4 & 147) != 146)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-513333932, i4, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.FullContent.<anonymous> (CatalogSectionViewImpl.kt:69)");
                        }
                        sga sgaVar2 = sgaVar;
                        boolean J = aVar2.J(sgaVar2);
                        rga rgaVar = this;
                        boolean J2 = J | aVar2.J(rgaVar);
                        izs izsVar2 = izsVar;
                        boolean J3 = J2 | aVar2.J(izsVar2);
                        ksr ksrVar2 = ksrVar;
                        boolean J4 = J3 | aVar2.J(ksrVar2);
                        Object x = aVar2.x();
                        if (J4 || x == a.C0011a.a) {
                            x = new bx9(sgaVar2, rgaVar, izsVar2, ksrVar2);
                            aVar2.R(x);
                        }
                        lqy.a(q630.this, xvyVar, s890Var, null, null, tprVar, false, null, (izs) x, aVar2, ((i4 << 3) & 112) | ((i4 << 15) & 3670016), 440);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, (i3 & 112) | (i3 & 14) | 384 | ((i2 >> 6) & 7168));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.kga
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    rga.this.c(s890Var, sgaVar, izsVar, ksrVar, q630Var, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    @Override // xsna.bga
    public final void d(nvy nvyVar, final sga.c cVar, final boolean z, final izs<? super yda, s3q0> izsVar) {
        nvy.g(nvyVar, null, null, new jai(-753865254, new yzs() { // from class: xsna.fga
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-753865254, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.addError.<anonymous> (CatalogSectionViewImpl.kt:237)");
                    }
                    q630.a aVar2 = q630.a.a;
                    float f = 16;
                    q630 D = s200.D(z ? s200.F(32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, ksyVar.d()) : aVar2, f);
                    a.c cVar2 = androidx.compose.foundation.layout.a.e;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(cVar2, dt1.a.o, aVar, 54);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D2 = aVar.D();
                    q630 c2 = qri.c(aVar, D);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a2, cri.a.f);
                    k9q0.w(aVar, D2, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c2, cri.a.d);
                    sga.c cVar3 = cVar;
                    tlo0 tlo0Var = cVar3.b;
                    iyk0 iyk0Var = AndroidCompositionLocals_androidKt.b;
                    CharSequence a3 = tlo0Var.a((Context) aVar.r(iyk0Var));
                    String obj4 = a3 != null ? a3.toString() : null;
                    if (obj4 == null) {
                        obj4 = "";
                    }
                    aVar.K(-1915693869);
                    aVar.j();
                    tlo0.f fVar = cVar3.c;
                    aVar.K(-1724360434);
                    CharSequence a4 = tlo0.b.a(fVar, (Context) aVar.r(iyk0Var));
                    aVar.j();
                    String obj5 = a4 != null ? a4.toString() : null;
                    yqv0.c(obj4, null, wlb0.h(aVar).getText().m, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar).C, aVar, 0, 0, 8186);
                    yqv0.c("", s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(aVar).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar).N, aVar, 48, 0, 8120);
                    androidx.compose.runtime.a aVar4 = aVar;
                    if (obj5 != null) {
                        aVar4.K(-1914950364);
                        ButtonSize buttonSize = ButtonSize.Medium;
                        ButtonStyle buttonStyle = ButtonStyle.Primary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                        izs izsVar2 = izsVar;
                        boolean J = aVar4.J(izsVar2) | aVar4.J(cVar3);
                        Object x = aVar4.x();
                        if (J || x == a.C0011a.a) {
                            x = new zv(4, izsVar2, cVar3);
                            aVar4.R(x);
                        }
                        bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, H, null, false, false, null, null, null, obj5, null, null, null, null, false, null, null, null, aVar4, 28080, 0, 0, 4190176);
                        aVar4 = aVar4;
                    } else {
                        aVar4.K(-1925996718);
                    }
                    aVar4.j();
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true), 3);
    }

    @Override // xsna.bga
    public final void e(nvy nvyVar, final boolean z) {
        nvy.g(nvyVar, null, null, new jai(-314141458, new yzs() { // from class: xsna.oga
            @Override // xsna.yzs
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                ksy ksyVar = (ksy) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(ksyVar) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-314141458, intValue, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.addProgress.<anonymous> (CatalogSectionViewImpl.kt:216)");
                    }
                    if (z) {
                        aVar.K(145639340);
                        zfr0.e(ksyVar.d(), 0L, SpinnerSize.Size56, aVar, 384, 2);
                        aVar.j();
                    } else {
                        aVar.K(145812506);
                        zfr0.e(txj0.h(ksyVar.a(q630.a.a), 70), 0L, null, aVar, 0, 6);
                        aVar.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            }
        }, true), 3);
    }

    public final void f(sga.a aVar, izs izsVar, jai jaiVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-1489297351);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1489297351, i2, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.PullToRefresh (CatalogSectionViewImpl.kt:312)");
            }
            if (aVar.b) {
                M.K(-644988667);
                boolean z = aVar.c;
                boolean z2 = (i2 & 112) == 32;
                Object x = M.x();
                if (z2 || x == a.C0011a.a) {
                    x = new mv7(izsVar, 1);
                    M.R(x);
                }
                dge0.a(z, (gzs) x, null, null, null, kai.c(-248626864, new hga(jaiVar, 0), M), M, 196608, 28);
                M.j();
            } else {
                M.K(-644731832);
                jaiVar.invoke(M, 6);
                M.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new iga(this, aVar, izsVar, jaiVar, i);
        }
    }

    public final void g(sga.a aVar, androidx.compose.runtime.a aVar2, int i) {
        r2a r2aVar;
        androidx.compose.runtime.a M = aVar2.M(-1165444259);
        int i2 = (i & 6) == 0 ? (M.J(aVar) ? 4 : 2) | i : i;
        int i3 = 0;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1165444259, i2, -1, "com.vk.catalog.mvi.section.impl.ui.view.CatalogSectionViewImpl.ValidateContent (CatalogSectionViewImpl.kt:283)");
            }
            Object obj = aVar.e;
            boolean J = M.J(obj);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : (Iterable) obj) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    r2a r2aVar2 = (r2a) ((ttk0) obj2).getValue();
                    if (linkedHashMap.containsKey(r2aVar2.w())) {
                        Pair pair = (Pair) linkedHashMap.get(r2aVar2.w());
                        StringBuilder sb = new StringBuilder("index ");
                        sb.append(pair != null ? (Integer) pair.i() : null);
                        sb.append(", ");
                        sb.append((pair == null || (r2aVar = (r2a) pair.j()) == null) ? null : r2aVar.getClass().getCanonicalName());
                        sb.append(", ");
                        sb.append(pair != null ? (r2a) pair.j() : null);
                        String sb2 = sb.toString();
                        StringBuilder b2 = ji.b(i3, "index ", ", ");
                        b2.append(r2aVar2.getClass().getCanonicalName());
                        b2.append(", ");
                        b2.append(r2aVar2);
                        String sb3 = b2.toString();
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l, L.LogType.e, new Object[]{y57.a("CatalogSectionViewImpl current state has duplicated blocks:\r\n", sb2, "\r\n", sb3)});
                        }
                    } else {
                        linkedHashMap.put(r2aVar2.w(), new Pair(Integer.valueOf(i3), r2aVar2));
                    }
                    i3 = i4;
                }
                M.R(obj);
            } else {
                obj = x;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gga(this, aVar, i, 0);
        }
    }
}
