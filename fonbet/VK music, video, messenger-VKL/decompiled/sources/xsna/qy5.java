package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.BadgeAppearance;
import com.vk.core.compose.component.defaults.CounterAppearance;
import com.vk.core.compose.component.defaults.CounterMode;
import com.vk.core.compose.component.defaults.CounterSize;
import com.vk.core.view.components.badge.VkBadge;
import com.vk.core.view.components.counter.VkCounter;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.proto.PublisherConfiguration;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: BadgeAndCounterScreenContent.kt */
/* loaded from: classes18.dex */
public final class qy5 implements yah0 {

    /* compiled from: BadgeAndCounterScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent$AnimatedCounter$count$2$1", f = "BadgeAndCounterScreenContent.kt", l = {165, 167}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<qhd0<Integer>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public a() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            a aVar = new a(2, spjVar);
            aVar.L$0 = obj;
            return aVar;
        }

        @Override // xsna.wzs
        public final Object invoke(qhd0<Integer> qhd0Var, spj<? super s3q0> spjVar) {
            return ((a) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        
            if (xsna.qsl.b(2000, r7) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            if (xsna.qsl.b(2000, r7) != r1) goto L14;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            qhd0 qhd0Var = (qhd0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.L$0 = qhd0Var;
                this.label = 1;
            } else if (i == 1) {
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(((Number) qhd0Var.getValue()).intValue() * 4));
                this.L$0 = qhd0Var;
                this.label = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(((Number) qhd0Var.getValue()).intValue() / 2));
                if (((Number) qhd0Var.getValue()).intValue() < 0) {
                    qhd0Var.setValue(new Integer(1));
                }
                this.L$0 = qhd0Var;
                this.label = 1;
            }
        }
    }

    /* compiled from: BadgeAndCounterScreenContent.kt */
    @b6l(c = "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent$AnimatedCounterView$count$2$1", f = "BadgeAndCounterScreenContent.kt", l = {186, 188}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<qhd0<Integer>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            b bVar = new b(2, spjVar);
            bVar.L$0 = obj;
            return bVar;
        }

        @Override // xsna.wzs
        public final Object invoke(qhd0<Integer> qhd0Var, spj<? super s3q0> spjVar) {
            return ((b) create(qhd0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x004c, code lost:
        
            if (xsna.qsl.b(2000, r7) == r1) goto L16;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x004e, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        
            if (xsna.qsl.b(2000, r7) != r1) goto L14;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x004c -> B:6:0x004f). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            qhd0 qhd0Var = (qhd0) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                this.L$0 = qhd0Var;
                this.label = 1;
            } else if (i == 1) {
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(((Number) qhd0Var.getValue()).intValue() * 4));
                this.L$0 = qhd0Var;
                this.label = 2;
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                qhd0Var.setValue(new Integer(((Number) qhd0Var.getValue()).intValue() / 2));
                if (((Number) qhd0Var.getValue()).intValue() < 0) {
                    qhd0Var.setValue(new Integer(1));
                }
                this.L$0 = qhd0Var;
                this.label = 1;
            }
        }
    }

    @Override // xsna.yah0
    public final void a(final gzs gzsVar, final gzs gzsVar2, final x5 x5Var, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        gzs gzsVar3;
        int i2;
        androidx.compose.runtime.a aVar2;
        final qy5 qy5Var = this;
        androidx.compose.runtime.a M = aVar.M(2029571079);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(x5Var) ? 256 : 128;
        }
        int i3 = i & 24576;
        q630.a aVar3 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(qy5Var) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73875 & i2) != 73874)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2029571079, i2, -1, "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent.Content (BadgeAndCounterScreenContent.kt:46)");
            }
            q630 D = p490.D(txj0.f(aVar3, 1.0f), p490.x(M), 14);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar4 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar5 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a2, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            int i4 = i2;
            jjn0.a("Badge & Counters", gzsVar3, x5Var, gzsVar2, null, null, M, ((i2 << 3) & 112) | 6 | (i2 & 896) | ((i2 << 6) & 7168), 48);
            djn0.a(true, true, M, 438, 0);
            float f = 8;
            q630 D3 = s200.D(txj0.f(aVar3, 1.0f), f);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar4, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c2 = qri.c(M, D3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f2 = 4;
            char c3 = '6';
            rzo0.a(54, 0, M, "Compose", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            String str = "Badges:";
            w0n0.a(54, 0, M, "Badges:", H);
            androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c4 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar5);
            } else {
                M.f();
            }
            k9q0.w(M, a4, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            int i5 = (i4 >> 15) & 14;
            qy5Var = this;
            qy5Var.d(i5, M);
            M.G();
            w0n0.a(54, 0, M, "Counters:", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            M.K(645427261);
            Iterator it = CounterSize.h().iterator();
            while (it.hasNext()) {
                CounterSize counterSize = (CounterSize) it.next();
                M.K(645428532);
                for (CounterMode counterMode : CounterMode.h()) {
                    a.l lVar = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a5 = androidx.compose.foundation.layout.j.a(lVar, dt1.a.k, M, 0);
                    int hashCode4 = Long.hashCode(n34.n(M));
                    sy90 D6 = M.D();
                    q630 c5 = qri.c(M, aVar3);
                    cri.h7.getClass();
                    LayoutNode.a aVar6 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar6);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a5, cri.a.f);
                    k9q0.w(M, D6, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode4), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c5, cri.a.d);
                    M.K(-1761780546);
                    Iterator<E> it2 = CounterAppearance.Design.h().iterator();
                    while (it2.hasNext()) {
                        nou0.a(PublisherConfiguration.DEFAULT_MAX_DELAY_MS, counterSize, (CounterAppearance.Design) it2.next(), s200.D(aVar3, f2), counterMode, false, M, 3078, 32);
                        it = it;
                        str = str;
                    }
                    M.j();
                    M.G();
                    c3 = '6';
                    it = it;
                }
                M.j();
                it = it;
            }
            String str2 = str;
            M.j();
            q630 H2 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            ty6.b bVar2 = dt1.a.l;
            a.l lVar2 = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a6 = androidx.compose.foundation.layout.j.a(lVar2, bVar2, M, 48);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D7 = M.D();
            q630 c6 = qri.c(M, H2);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a6, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D7, eVar2);
            Integer valueOf2 = Integer.valueOf(hashCode5);
            cri.a.b bVar3 = cri.a.g;
            k9q0.w(M, valueOf2, bVar3);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c6, dVar2);
            w0n0.a(6, 2, M, "Animation: ", null);
            qy5Var.b(i5, M);
            M.G();
            float f3 = 12;
            float f4 = f2;
            rzo0.a(54, 0, M, "View", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            w0n0.a(54, 0, M, str2, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(lVar2, dt1.a.k, M, 0);
            int hashCode6 = Long.hashCode(n34.n(M));
            sy90 D8 = M.D();
            q630 c7 = qri.c(M, aVar3);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar7);
            } else {
                M.f();
            }
            k9q0.w(M, a7, cVar2);
            k9q0.w(M, D8, eVar2);
            ur.d(hashCode6, M, bVar3, M, c2678a2);
            k9q0.w(M, c7, dVar2);
            qy5Var.e(i5, M);
            M.G();
            w0n0.a(54, 0, M, "Counters:", s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            M.K(645465744);
            for (VkCounter.Size size : VkCounter.Size.h()) {
                M.K(645467108);
                for (VkCounter.Mode mode : VkCounter.Mode.h()) {
                    a.l lVar3 = androidx.compose.foundation.layout.a.a;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.k a8 = androidx.compose.foundation.layout.j.a(lVar3, dt1.a.k, M, 0);
                    int hashCode7 = Long.hashCode(n34.n(M));
                    sy90 D9 = M.D();
                    q630 c8 = qri.c(M, aVar3);
                    cri.h7.getClass();
                    LayoutNode.a aVar8 = cri.a.b;
                    if (M.N() == null) {
                        n34.r();
                        throw null;
                    }
                    M.H();
                    if (M.L()) {
                        M.I(aVar8);
                    } else {
                        M.f();
                    }
                    k9q0.w(M, a8, cri.a.f);
                    k9q0.w(M, D9, cri.a.e);
                    k9q0.w(M, Integer.valueOf(hashCode7), cri.a.g);
                    k9q0.t(M, cri.a.h);
                    k9q0.w(M, c8, cri.a.d);
                    M.K(162174779);
                    for (VkCounter.CounterAppearance.Appearance appearance : VkCounter.CounterAppearance.Appearance.h()) {
                        float f5 = f4;
                        q630 D10 = s200.D(aVar3, f5);
                        boolean o = M.o(mode.ordinal()) | M.o(size.ordinal()) | M.o(appearance.ordinal());
                        Object x = M.x();
                        if (o || x == a.C0011a.a) {
                            x = new jy5(mode, size, appearance, 0);
                            M.R(x);
                        }
                        f4 = f5;
                        androidx.compose.runtime.a aVar9 = M;
                        ae2.a(48, 4, aVar9, (izs) x, null, D10);
                        M = aVar9;
                    }
                    androidx.compose.runtime.a aVar10 = M;
                    aVar10.j();
                    aVar10.G();
                    M = aVar10;
                }
                androidx.compose.runtime.a aVar11 = M;
                aVar11.j();
                M = aVar11;
            }
            aVar2 = M;
            aVar2.j();
            q630 H3 = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a9 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, aVar2, 48);
            int hashCode8 = Long.hashCode(n34.n(aVar2));
            sy90 D11 = aVar2.D();
            q630 c9 = qri.c(aVar2, H3);
            cri.h7.getClass();
            LayoutNode.a aVar12 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar12);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a9, cri.a.f);
            k9q0.w(aVar2, D11, cri.a.e);
            k9q0.w(aVar2, Integer.valueOf(hashCode8), cri.a.g);
            k9q0.t(aVar2, cri.a.h);
            k9q0.w(aVar2, c9, cri.a.d);
            w0n0.a(6, 2, aVar2, "Animation: ", null);
            qy5Var.c(i5, aVar2);
            aVar2.G();
            aVar2.G();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.ky5
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    qy5.this.a(gzsVar, gzsVar2, x5Var, izsVar, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(191725965);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(191725965, i, -1, "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent.AnimatedCounter (BadgeAndCounterScreenContent.kt:161)");
            }
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new a(2, null);
                M.R(x);
            }
            nou0.a(((Number) skd.l(1, (wzs) x, M, 6).getValue()).intValue(), CounterSize.Medium, CounterAppearance.Design.Accent, s200.D(q630.a.a, 4), CounterMode.Primary, false, M, 28080, 32);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ny5(this, i, 0);
        }
    }

    public final void c(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(-1147319662);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1147319662, i, -1, "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent.AnimatedCounterView (BadgeAndCounterScreenContent.kt:182)");
            }
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (x == obj) {
                x = new b(2, null);
                M.R(x);
            }
            wh50 l = skd.l(1, (wzs) x, M, 6);
            q630 D = s200.D(q630.a.a, 4);
            boolean J = M.J(l);
            Object x2 = M.x();
            if (J || x2 == obj) {
                x2 = new oy5(l, 0);
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean J2 = M.J(l);
            Object x3 = M.x();
            if (J2 || x3 == obj) {
                x3 = new qu(l, 6);
                M.R(x3);
            }
            ae2.a(48, 0, M, izsVar, (izs) x3, D);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new py5(this, i, 0);
        }
    }

    public final void d(int i, androidx.compose.runtime.a aVar) {
        q630.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1491038107);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1491038107, i, -1, "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent.DrawComposeBadge (BadgeAndCounterScreenContent.kt:151)");
            }
            M.K(1631458933);
            Iterator<E> it = BadgeAppearance.Design.h().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar2 = q630.a.a;
                if (!hasNext) {
                    break;
                } else {
                    rdu0.a(s200.D(aVar2, 4), (BadgeAppearance.Design) it.next(), M, 6, 0);
                }
            }
            M.j();
            q630 D = s200.D(aVar2, 4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            rdu0.a(D, new BadgeAppearance.a(ylu0Var.getIcon().a), M, 6, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new my5(this, i, 0);
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar) {
        q630.a aVar2;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar.M(-376517874);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-376517874, i, -1, "com.vk.design.demo.presentation.screens.BadgeAndCounterScreenContent.DrawViewBadge (BadgeAndCounterScreenContent.kt:127)");
            }
            M.K(-1056421995);
            Iterator<E> it = VkBadge.Appearance.Design.h().iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                aVar2 = q630.a.a;
                c0012a = a.C0011a.a;
                if (!hasNext) {
                    break;
                }
                VkBadge.Appearance.Design design = (VkBadge.Appearance.Design) it.next();
                q630 D = s200.D(aVar2, 4);
                boolean o = M.o(design.ordinal());
                Object x = M.x();
                if (o || x == c0012a) {
                    x = new hb(design, 9);
                    M.R(x);
                }
                ae2.a(48, 4, M, (izs) x, null, D);
            }
            M.j();
            q630 D2 = s200.D(aVar2, 4);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new oc0(6);
                M.R(x2);
            }
            ae2.a(54, 4, M, (izs) x2, null, D2);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ly5(this, i, 0);
        }
    }
}
