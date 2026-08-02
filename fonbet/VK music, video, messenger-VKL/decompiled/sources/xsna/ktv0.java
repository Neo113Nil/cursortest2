package xsna;

import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import xsna.bap;
import xsna.c6j;
import xsna.cp10;
import xsna.cri;
import xsna.dp10;
import xsna.dt1;
import xsna.e4p0;
import xsna.eo20;
import xsna.ep10;
import xsna.itv0;
import xsna.izs;
import xsna.ja8;
import xsna.jgp;
import xsna.jtv0;
import xsna.k9q0;
import xsna.ktv0;
import xsna.mtv0;
import xsna.n34;
import xsna.ntv0;
import xsna.op10;
import xsna.otv0;
import xsna.pq3;
import xsna.ptv0;
import xsna.q630;
import xsna.qri;
import xsna.qtv0;
import xsna.rtv0;
import xsna.s200;
import xsna.s3q0;
import xsna.s5j;
import xsna.sy90;
import xsna.tgi0;
import xsna.tra0;
import xsna.ty6;
import xsna.ur;
import xsna.wh50;
import xsna.zo10;

/* compiled from: VkTooltipGravityEdge.kt */
/* loaded from: classes17.dex */
public abstract class ktv0 {

    /* compiled from: VkTooltipGravityEdge.kt */
    public static final class a extends b {
        public static final a a = new a();

        @Override // xsna.ktv0
        public final void a(q630 q630Var, final htv0 htv0Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(1845481626);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(htv0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(jaiVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.y(jaiVar2) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1845481626, i2, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.Bottom.VkTooltipContainer (VkTooltipGravityEdge.kt:365)");
                }
                M.K(-1003410150);
                M.K(212064437);
                M.j();
                azl azlVar = (azl) M.r(uvi.h);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (x == obj) {
                    x = new op10(azlVar);
                    M.R(x);
                }
                final op10 op10Var = (op10) x;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = new c6j();
                    M.R(x2);
                }
                final c6j c6jVar = (c6j) x2;
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x3);
                }
                final wh50 wh50Var = (wh50) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new h6j(c6jVar);
                    M.R(x4);
                }
                final h6j h6jVar = (h6j) x4;
                Object x5 = M.x();
                if (x5 == obj) {
                    x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                    M.R(x5);
                }
                final wh50 wh50Var2 = (wh50) x5;
                boolean y = M.y(op10Var) | M.o(257);
                Object x6 = M.x();
                if (y || x6 == obj) {
                    x6 = new cp10() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Bottom$VkTooltipContainer$$inlined$ConstraintLayout$2
                        @Override // xsna.cp10
                        public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            wh50.this.getValue();
                            long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                            wh50Var.getValue();
                            final op10 op10Var2 = op10Var;
                            return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Bottom$VkTooltipContainer$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tra0.a aVar2) {
                                    op10.this.e(aVar2, list, linkedHashMap);
                                    return s3q0.a;
                                }
                            });
                        }
                    };
                    M.R(x6);
                }
                cp10 cp10Var = (cp10) x6;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Bottom$VkTooltipContainer$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.gzs
                        public final s3q0 invoke() {
                            wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            h6jVar.e = true;
                            return s3q0.a;
                        }
                    };
                    M.R(x7);
                }
                final gzs gzsVar = (gzs) x7;
                boolean y2 = M.y(op10Var);
                Object x8 = M.x();
                if (y2 || x8 == obj) {
                    x8 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Bottom$VkTooltipContainer$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final s3q0 invoke(tgi0 tgi0Var) {
                            e4p0.a(tgi0Var, op10.this);
                            return s3q0.a;
                        }
                    };
                    M.R(x8);
                }
                joy.a(egi0.b(q630Var, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Bottom$VkTooltipContainer$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // xsna.wzs
                    public final s3q0 invoke(a aVar2, Integer num) {
                        a aVar3 = aVar2;
                        int intValue = num.intValue();
                        if ((intValue & 3) == 2 && aVar3.e()) {
                            aVar3.h();
                        } else {
                            if (b.d()) {
                                b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            wh50.this.setValue(s3q0.a);
                            c6j c6jVar2 = c6jVar;
                            int i3 = c6jVar2.b;
                            c6jVar2.l();
                            c6j c6jVar3 = c6jVar;
                            aVar3.K(629567364);
                            c6j c6jVar4 = c6j.this;
                            s5j j = c6jVar4.j();
                            s5j j2 = c6jVar4.j();
                            Object x9 = aVar3.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x9 == c0012a) {
                                x9 = itv0.b;
                                aVar3.R(x9);
                            }
                            q630.a aVar4 = q630.a.a;
                            q630 i4 = c6j.i(aVar4, j, (izs) x9);
                            dt1.a.getClass();
                            ty6 ty6Var = dt1.a.b;
                            cp10 d = ja8.d(ty6Var, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c = qri.c(aVar3, i4);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(aVar3, d, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(aVar3, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(aVar3, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(aVar3, c2678a);
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(aVar3, c, dVar);
                            jaiVar2.invoke(aVar3, 0);
                            aVar3.G();
                            boolean J = aVar3.J(j) | aVar3.J(htv0Var);
                            Object x10 = aVar3.x();
                            if (J || x10 == c0012a) {
                                x10 = new jtv0(j, htv0Var);
                                aVar3.R(x10);
                            }
                            q630 i5 = c6j.i(aVar4, j2, (izs) x10);
                            eo20 e = pq3.e();
                            ktv0.a aVar6 = ktv0.a.a;
                            q630 H = s200.H(i5, e.S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pq3.e().S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                            cp10 d2 = ja8.d(ty6Var, false);
                            int hashCode2 = Long.hashCode(n34.n(aVar3));
                            sy90 D2 = aVar3.D();
                            q630 c2 = qri.c(aVar3, H);
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, d2, cVar);
                            k9q0.w(aVar3, D2, eVar);
                            ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                            k9q0.w(aVar3, c2, dVar);
                            jaiVar.invoke(aVar3, 0);
                            aVar3.G();
                            aVar3.j();
                            if (c6jVar.b != i3) {
                                bap.i(gzsVar, aVar3, 6);
                            }
                            if (b.d()) {
                                b.e();
                            }
                        }
                        return s3q0.a;
                    }
                }, M), cp10Var, M, 48, 0);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new jxn(this, q630Var, htv0Var, jaiVar, jaiVar2, i);
            }
        }

        @Override // xsna.ktv0
        public final Pair<h9x, Float> b(azl azlVar, long j, float f, l9x l9xVar, long j2, int i) {
            a.getClass();
            Pair g = b.g(j, l9xVar, j2, i);
            return new Pair<>(new h9x((((Number) g.d()).intValue() << 32) | ((azlVar.r0(f) + l9xVar.d) & 4294967295L)), Float.valueOf(((Number) g.g()).floatValue()));
        }

        @Override // xsna.ktv0
        public final void c(Path path, long j) {
            int i = (int) (4294967295L & j);
            path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i));
            int i2 = (int) (j >> 32);
            path.b(0.25f * Float.intBitsToFloat(i2), Float.intBitsToFloat(i) * 0.85f, 0.34f * Float.intBitsToFloat(i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            path.b(Float.intBitsToFloat(i2) * 0.66f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) * 0.75f, Float.intBitsToFloat(i) * 0.85f, Float.intBitsToFloat(i2), Float.intBitsToFloat(i));
        }
    }

    /* compiled from: VkTooltipGravityEdge.kt */
    public static abstract class b extends ktv0 {
        public static Pair g(long j, l9x l9xVar, long j2, int i) {
            int i2 = (int) (j2 >> 32);
            return new Pair(Integer.valueOf(swe0.g(((int) (l9xVar.a() >> 32)) - (i2 / 2), i, (((int) (j >> 32)) - i2) - i)), Float.valueOf((((int) (l9xVar.a() >> 32)) - r1) / i2));
        }

        @Override // xsna.ktv0
        public final q630 d(final long j) {
            yzs yzsVar = new yzs() { // from class: xsna.ltv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    aVar.K(545315132);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(545315132, intValue, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.HorizontalVkTooltipGravityEdge.minSize.<anonymous> (VkTooltipGravityEdge.kt:88)");
                    }
                    pq3.e().getClass();
                    float f = eo20.c * 2;
                    long j2 = j;
                    q630 x = txj0.x(Math.max(uco.c(j2), uco.b(j2)) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    return x;
                }
            };
            return qri.a(q630.a.a, a5x.a, yzsVar);
        }

        @Override // xsna.ktv0
        public final float e(float f, float f2) {
            return Math.min(f, f2);
        }

        @Override // xsna.ktv0
        public final float f(float f, float f2) {
            return Math.max(f, f2);
        }
    }

    /* compiled from: VkTooltipGravityEdge.kt */
    public static final class c extends f {
        public static final c a = new c();

        @Override // xsna.ktv0
        public final void a(q630 q630Var, final htv0 htv0Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(433410614);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(htv0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(jaiVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.y(jaiVar2) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(433410614, i2, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.Left.VkTooltipContainer (VkTooltipGravityEdge.kt:134)");
                }
                M.K(-1003410150);
                M.K(212064437);
                M.j();
                azl azlVar = (azl) M.r(uvi.h);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (x == obj) {
                    x = new op10(azlVar);
                    M.R(x);
                }
                final op10 op10Var = (op10) x;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = new c6j();
                    M.R(x2);
                }
                final c6j c6jVar = (c6j) x2;
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x3);
                }
                final wh50 wh50Var = (wh50) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new h6j(c6jVar);
                    M.R(x4);
                }
                final h6j h6jVar = (h6j) x4;
                Object x5 = M.x();
                if (x5 == obj) {
                    x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                    M.R(x5);
                }
                final wh50 wh50Var2 = (wh50) x5;
                boolean y = M.y(op10Var) | M.o(257);
                Object x6 = M.x();
                if (y || x6 == obj) {
                    x6 = new cp10() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Left$VkTooltipContainer$$inlined$ConstraintLayout$2
                        @Override // xsna.cp10
                        public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            wh50.this.getValue();
                            long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                            wh50Var.getValue();
                            final op10 op10Var2 = op10Var;
                            return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Left$VkTooltipContainer$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tra0.a aVar2) {
                                    op10.this.e(aVar2, list, linkedHashMap);
                                    return s3q0.a;
                                }
                            });
                        }
                    };
                    M.R(x6);
                }
                cp10 cp10Var = (cp10) x6;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Left$VkTooltipContainer$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.gzs
                        public final s3q0 invoke() {
                            wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            h6jVar.e = true;
                            return s3q0.a;
                        }
                    };
                    M.R(x7);
                }
                final gzs gzsVar = (gzs) x7;
                boolean y2 = M.y(op10Var);
                Object x8 = M.x();
                if (y2 || x8 == obj) {
                    x8 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Left$VkTooltipContainer$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final s3q0 invoke(tgi0 tgi0Var) {
                            e4p0.a(tgi0Var, op10.this);
                            return s3q0.a;
                        }
                    };
                    M.R(x8);
                }
                joy.a(egi0.b(q630Var, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Left$VkTooltipContainer$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // xsna.wzs
                    public final s3q0 invoke(a aVar2, Integer num) {
                        a aVar3 = aVar2;
                        int intValue = num.intValue();
                        if ((intValue & 3) == 2 && aVar3.e()) {
                            aVar3.h();
                        } else {
                            if (b.d()) {
                                b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            wh50.this.setValue(s3q0.a);
                            c6j c6jVar2 = c6jVar;
                            int i3 = c6jVar2.b;
                            c6jVar2.l();
                            c6j c6jVar3 = c6jVar;
                            aVar3.K(189818443);
                            c6j c6jVar4 = c6j.this;
                            s5j j = c6jVar4.j();
                            s5j j2 = c6jVar4.j();
                            Object x9 = aVar3.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x9 == c0012a) {
                                x9 = mtv0.b;
                                aVar3.R(x9);
                            }
                            q630.a aVar4 = q630.a.a;
                            q630 i4 = c6j.i(aVar4, j, (izs) x9);
                            dt1.a.getClass();
                            ty6 ty6Var = dt1.a.b;
                            cp10 d = ja8.d(ty6Var, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c = qri.c(aVar3, i4);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(aVar3, d, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(aVar3, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(aVar3, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(aVar3, c2678a);
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(aVar3, c, dVar);
                            jaiVar2.invoke(aVar3, 0);
                            aVar3.G();
                            boolean J = aVar3.J(j) | aVar3.J(htv0Var);
                            Object x10 = aVar3.x();
                            if (J || x10 == c0012a) {
                                x10 = new ntv0(j, htv0Var);
                                aVar3.R(x10);
                            }
                            q630 i5 = c6j.i(aVar4, j2, (izs) x10);
                            eo20 e = pq3.e();
                            ktv0.c cVar2 = ktv0.c.a;
                            q630 H = s200.H(i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e.S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pq3.e().S(aVar3), 5);
                            cp10 d2 = ja8.d(ty6Var, false);
                            int hashCode2 = Long.hashCode(n34.n(aVar3));
                            sy90 D2 = aVar3.D();
                            q630 c2 = qri.c(aVar3, H);
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, d2, cVar);
                            k9q0.w(aVar3, D2, eVar);
                            ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                            k9q0.w(aVar3, c2, dVar);
                            jaiVar.invoke(aVar3, 0);
                            aVar3.G();
                            aVar3.j();
                            if (c6jVar.b != i3) {
                                bap.i(gzsVar, aVar3, 6);
                            }
                            if (b.d()) {
                                b.e();
                            }
                        }
                        return s3q0.a;
                    }
                }, M), cp10Var, M, 48, 0);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new tma(this, q630Var, htv0Var, jaiVar, jaiVar2, i);
            }
        }

        @Override // xsna.ktv0
        public final Pair<h9x, Float> b(azl azlVar, long j, float f, l9x l9xVar, long j2, int i) {
            a.getClass();
            return new Pair<>(new h9x((an10.b((l9xVar.a - azlVar.I0(f)) - ((int) (j2 >> 32))) << 32) | (((Number) r9.d()).intValue() & 4294967295L)), Float.valueOf(((Number) f.g(j, l9xVar, j2, i).g()).floatValue()));
        }

        @Override // xsna.ktv0
        public final void c(Path path, long j) {
            path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int i = (int) (4294967295L & j);
            int i2 = (int) (j >> 32);
            path.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.25f * Float.intBitsToFloat(i), Float.intBitsToFloat(i2), 0.34f * Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) / 2);
            path.b(Float.intBitsToFloat(i2), 0.66f * Float.intBitsToFloat(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i) * 0.75f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i));
        }
    }

    /* compiled from: VkTooltipGravityEdge.kt */
    public static final class d extends f {
        public static final d a = new d();

        @Override // xsna.ktv0
        public final void a(q630 q630Var, final htv0 htv0Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-1198655371);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(htv0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(jaiVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.y(jaiVar2) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1198655371, i2, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.Right.VkTooltipContainer (VkTooltipGravityEdge.kt:288)");
                }
                M.K(-1003410150);
                M.K(212064437);
                M.j();
                azl azlVar = (azl) M.r(uvi.h);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (x == obj) {
                    x = new op10(azlVar);
                    M.R(x);
                }
                final op10 op10Var = (op10) x;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = new c6j();
                    M.R(x2);
                }
                final c6j c6jVar = (c6j) x2;
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x3);
                }
                final wh50 wh50Var = (wh50) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new h6j(c6jVar);
                    M.R(x4);
                }
                final h6j h6jVar = (h6j) x4;
                Object x5 = M.x();
                if (x5 == obj) {
                    x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                    M.R(x5);
                }
                final wh50 wh50Var2 = (wh50) x5;
                boolean y = M.y(op10Var) | M.o(257);
                Object x6 = M.x();
                if (y || x6 == obj) {
                    x6 = new cp10() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Right$VkTooltipContainer$$inlined$ConstraintLayout$2
                        @Override // xsna.cp10
                        public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            wh50.this.getValue();
                            long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                            wh50Var.getValue();
                            final op10 op10Var2 = op10Var;
                            return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Right$VkTooltipContainer$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tra0.a aVar2) {
                                    op10.this.e(aVar2, list, linkedHashMap);
                                    return s3q0.a;
                                }
                            });
                        }
                    };
                    M.R(x6);
                }
                cp10 cp10Var = (cp10) x6;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Right$VkTooltipContainer$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.gzs
                        public final s3q0 invoke() {
                            wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            h6jVar.e = true;
                            return s3q0.a;
                        }
                    };
                    M.R(x7);
                }
                final gzs gzsVar = (gzs) x7;
                boolean y2 = M.y(op10Var);
                Object x8 = M.x();
                if (y2 || x8 == obj) {
                    x8 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Right$VkTooltipContainer$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final s3q0 invoke(tgi0 tgi0Var) {
                            e4p0.a(tgi0Var, op10.this);
                            return s3q0.a;
                        }
                    };
                    M.R(x8);
                }
                joy.a(egi0.b(q630Var, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Right$VkTooltipContainer$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // xsna.wzs
                    public final s3q0 invoke(a aVar2, Integer num) {
                        a aVar3 = aVar2;
                        int intValue = num.intValue();
                        if ((intValue & 3) == 2 && aVar3.e()) {
                            aVar3.h();
                        } else {
                            if (b.d()) {
                                b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            wh50.this.setValue(s3q0.a);
                            c6j c6jVar2 = c6jVar;
                            int i3 = c6jVar2.b;
                            c6jVar2.l();
                            c6j c6jVar3 = c6jVar;
                            aVar3.K(-2112617988);
                            c6j c6jVar4 = c6j.this;
                            s5j j = c6jVar4.j();
                            s5j j2 = c6jVar4.j();
                            Object x9 = aVar3.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x9 == c0012a) {
                                x9 = otv0.b;
                                aVar3.R(x9);
                            }
                            q630.a aVar4 = q630.a.a;
                            q630 i4 = c6j.i(aVar4, j, (izs) x9);
                            dt1.a.getClass();
                            ty6 ty6Var = dt1.a.b;
                            cp10 d = ja8.d(ty6Var, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c = qri.c(aVar3, i4);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(aVar3, d, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(aVar3, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(aVar3, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(aVar3, c2678a);
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(aVar3, c, dVar);
                            jaiVar2.invoke(aVar3, 0);
                            aVar3.G();
                            boolean J = aVar3.J(j) | aVar3.J(htv0Var);
                            Object x10 = aVar3.x();
                            if (J || x10 == c0012a) {
                                x10 = new ptv0(j, htv0Var);
                                aVar3.R(x10);
                            }
                            q630 i5 = c6j.i(aVar4, j2, (izs) x10);
                            eo20 e = pq3.e();
                            ktv0.d dVar2 = ktv0.d.a;
                            q630 H = s200.H(i5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e.S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pq3.e().S(aVar3), 5);
                            cp10 d2 = ja8.d(ty6Var, false);
                            int hashCode2 = Long.hashCode(n34.n(aVar3));
                            sy90 D2 = aVar3.D();
                            q630 c2 = qri.c(aVar3, H);
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, d2, cVar);
                            k9q0.w(aVar3, D2, eVar);
                            ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                            k9q0.w(aVar3, c2, dVar);
                            jaiVar.invoke(aVar3, 0);
                            aVar3.G();
                            aVar3.j();
                            if (c6jVar.b != i3) {
                                bap.i(gzsVar, aVar3, 6);
                            }
                            if (b.d()) {
                                b.e();
                            }
                        }
                        return s3q0.a;
                    }
                }, M), cp10Var, M, 48, 0);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new uma(this, q630Var, htv0Var, jaiVar, jaiVar2, i, 4);
            }
        }

        @Override // xsna.ktv0
        public final Pair<h9x, Float> b(azl azlVar, long j, float f, l9x l9xVar, long j2, int i) {
            a.getClass();
            Pair g = f.g(j, l9xVar, j2, i);
            return new Pair<>(new h9x((an10.b(azlVar.I0(f) + l9xVar.c) << 32) | (((Number) g.d()).intValue() & 4294967295L)), Float.valueOf(((Number) g.g()).floatValue()));
        }

        @Override // xsna.ktv0
        public final void c(Path path, long j) {
            int i = (int) (j >> 32);
            path.a(Float.intBitsToFloat(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int i2 = (int) (4294967295L & j);
            path.b(Float.intBitsToFloat(i) * 0.85f, Float.intBitsToFloat(i2) * 0.25f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.34f * Float.intBitsToFloat(i2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) / 2.0f);
            path.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Float.intBitsToFloat(i2) * 0.66f, Float.intBitsToFloat(i) * 0.85f, Float.intBitsToFloat(i2) * 0.75f, Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        }
    }

    /* compiled from: VkTooltipGravityEdge.kt */
    public static final class e extends b {
        public static final e a = new e();

        @Override // xsna.ktv0
        public final void a(q630 q630Var, final htv0 htv0Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, int i) {
            int i2;
            androidx.compose.runtime.a M = aVar.M(-157321554);
            if ((i & 6) == 0) {
                i2 = (M.J(q630Var) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= M.J(htv0Var) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= M.y(jaiVar) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i2 |= M.y(jaiVar2) ? 2048 : 1024;
            }
            if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-157321554, i2, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.Top.VkTooltipContainer (VkTooltipGravityEdge.kt:211)");
                }
                M.K(-1003410150);
                M.K(212064437);
                M.j();
                azl azlVar = (azl) M.r(uvi.h);
                Object x = M.x();
                Object obj = a.C0011a.a;
                if (x == obj) {
                    x = new op10(azlVar);
                    M.R(x);
                }
                final op10 op10Var = (op10) x;
                Object x2 = M.x();
                if (x2 == obj) {
                    x2 = new c6j();
                    M.R(x2);
                }
                final c6j c6jVar = (c6j) x2;
                Object x3 = M.x();
                if (x3 == obj) {
                    x3 = androidx.compose.runtime.k.b(Boolean.FALSE);
                    M.R(x3);
                }
                final wh50 wh50Var = (wh50) x3;
                Object x4 = M.x();
                if (x4 == obj) {
                    x4 = new h6j(c6jVar);
                    M.R(x4);
                }
                final h6j h6jVar = (h6j) x4;
                Object x5 = M.x();
                if (x5 == obj) {
                    x5 = androidx.compose.runtime.k.a(s3q0.a, w65.e);
                    M.R(x5);
                }
                final wh50 wh50Var2 = (wh50) x5;
                boolean y = M.y(op10Var) | M.o(257);
                Object x6 = M.x();
                if (y || x6 == obj) {
                    x6 = new cp10() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Top$VkTooltipContainer$$inlined$ConstraintLayout$2
                        @Override // xsna.cp10
                        public final dp10 b(ep10 ep10Var, final List<? extends zo10> list, long j) {
                            final LinkedHashMap linkedHashMap = new LinkedHashMap();
                            wh50.this.getValue();
                            long f = op10Var.f(j, ep10Var.getLayoutDirection(), h6jVar, list, linkedHashMap);
                            wh50Var.getValue();
                            final op10 op10Var2 = op10Var;
                            return ep10Var.Q((int) (f >> 32), (int) (f & 4294967295L), jgp.b, new izs<tra0.a, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Top$VkTooltipContainer$$inlined$ConstraintLayout$2.1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(1);
                                }

                                @Override // xsna.izs
                                public final s3q0 invoke(tra0.a aVar2) {
                                    op10.this.e(aVar2, list, linkedHashMap);
                                    return s3q0.a;
                                }
                            });
                        }
                    };
                    M.R(x6);
                }
                cp10 cp10Var = (cp10) x6;
                Object x7 = M.x();
                if (x7 == obj) {
                    x7 = new gzs<s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Top$VkTooltipContainer$$inlined$ConstraintLayout$3
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // xsna.gzs
                        public final s3q0 invoke() {
                            wh50.this.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                            h6jVar.e = true;
                            return s3q0.a;
                        }
                    };
                    M.R(x7);
                }
                final gzs gzsVar = (gzs) x7;
                boolean y2 = M.y(op10Var);
                Object x8 = M.x();
                if (y2 || x8 == obj) {
                    x8 = new izs<tgi0, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Top$VkTooltipContainer$$inlined$ConstraintLayout$4
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final s3q0 invoke(tgi0 tgi0Var) {
                            e4p0.a(tgi0Var, op10.this);
                            return s3q0.a;
                        }
                    };
                    M.R(x8);
                }
                joy.a(egi0.b(q630Var, false, (izs) x8), kai.c(1200550679, new wzs<androidx.compose.runtime.a, Integer, s3q0>() { // from class: com.vk.core.compose.component.tooltip.VkTooltipGravityEdge$Top$VkTooltipContainer$$inlined$ConstraintLayout$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // xsna.wzs
                    public final s3q0 invoke(a aVar2, Integer num) {
                        a aVar3 = aVar2;
                        int intValue = num.intValue();
                        if ((intValue & 3) == 2 && aVar3.e()) {
                            aVar3.h();
                        } else {
                            if (b.d()) {
                                b.f(1200550679, intValue, -1, "androidx.constraintlayout.compose.ConstraintLayout.<anonymous> (ConstraintLayout.kt:459)");
                            }
                            wh50.this.setValue(s3q0.a);
                            c6j c6jVar2 = c6jVar;
                            int i3 = c6jVar2.b;
                            c6jVar2.l();
                            c6j c6jVar3 = c6jVar;
                            aVar3.K(-292506102);
                            c6j c6jVar4 = c6j.this;
                            s5j j = c6jVar4.j();
                            s5j j2 = c6jVar4.j();
                            Object x9 = aVar3.x();
                            a.C0011a.C0012a c0012a = a.C0011a.a;
                            if (x9 == c0012a) {
                                x9 = qtv0.b;
                                aVar3.R(x9);
                            }
                            q630.a aVar4 = q630.a.a;
                            q630 i4 = c6j.i(aVar4, j, (izs) x9);
                            dt1.a.getClass();
                            ty6 ty6Var = dt1.a.b;
                            cp10 d = ja8.d(ty6Var, false);
                            int hashCode = Long.hashCode(n34.n(aVar3));
                            sy90 D = aVar3.D();
                            q630 c = qri.c(aVar3, i4);
                            cri.h7.getClass();
                            LayoutNode.a aVar5 = cri.a.b;
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            cri.a.c cVar = cri.a.f;
                            k9q0.w(aVar3, d, cVar);
                            cri.a.e eVar = cri.a.e;
                            k9q0.w(aVar3, D, eVar);
                            Integer valueOf = Integer.valueOf(hashCode);
                            cri.a.b bVar = cri.a.g;
                            k9q0.w(aVar3, valueOf, bVar);
                            cri.a.C2678a c2678a = cri.a.h;
                            k9q0.t(aVar3, c2678a);
                            cri.a.d dVar = cri.a.d;
                            k9q0.w(aVar3, c, dVar);
                            jaiVar2.invoke(aVar3, 0);
                            aVar3.G();
                            boolean J = aVar3.J(j) | aVar3.J(htv0Var);
                            Object x10 = aVar3.x();
                            if (J || x10 == c0012a) {
                                x10 = new rtv0(j, htv0Var);
                                aVar3.R(x10);
                            }
                            q630 i5 = c6j.i(aVar4, j2, (izs) x10);
                            eo20 e = pq3.e();
                            ktv0.e eVar2 = ktv0.e.a;
                            q630 H = s200.H(i5, e.S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, pq3.e().S(aVar3), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                            cp10 d2 = ja8.d(ty6Var, false);
                            int hashCode2 = Long.hashCode(n34.n(aVar3));
                            sy90 D2 = aVar3.D();
                            q630 c2 = qri.c(aVar3, H);
                            if (aVar3.N() == null) {
                                n34.r();
                                throw null;
                            }
                            aVar3.H();
                            if (aVar3.L()) {
                                aVar3.I(aVar5);
                            } else {
                                aVar3.f();
                            }
                            k9q0.w(aVar3, d2, cVar);
                            k9q0.w(aVar3, D2, eVar);
                            ur.d(hashCode2, aVar3, bVar, aVar3, c2678a);
                            k9q0.w(aVar3, c2, dVar);
                            jaiVar.invoke(aVar3, 0);
                            aVar3.G();
                            aVar3.j();
                            if (c6jVar.b != i3) {
                                bap.i(gzsVar, aVar3, 6);
                            }
                            if (b.d()) {
                                b.e();
                            }
                        }
                        return s3q0.a;
                    }
                }, M), cp10Var, M, 48, 0);
                M.j();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
            } else {
                M.h();
            }
            androidx.compose.runtime.f s = M.s();
            if (s != null) {
                s.d = new vma(this, q630Var, htv0Var, jaiVar, jaiVar2, i);
            }
        }

        @Override // xsna.ktv0
        public final Pair<h9x, Float> b(azl azlVar, long j, float f, l9x l9xVar, long j2, int i) {
            a.getClass();
            return new Pair<>(new h9x((((Number) r9.d()).intValue() << 32) | (((l9xVar.b - azlVar.r0(f)) - ((int) (j2 & 4294967295L))) & 4294967295L)), Float.valueOf(((Number) b.g(j, l9xVar, j2, i).g()).floatValue()));
        }

        @Override // xsna.ktv0
        public final void c(Path path, long j) {
            path.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            int i = (int) (j >> 32);
            int i2 = (int) (4294967295L & j);
            path.b(Float.intBitsToFloat(i) * 0.25f, Float.intBitsToFloat(i2) * 0.25f, Float.intBitsToFloat(i) * 0.34f, Float.intBitsToFloat(i2), Float.intBitsToFloat(i) / 2.0f, Float.intBitsToFloat(i2));
            path.b(0.66f * Float.intBitsToFloat(i), Float.intBitsToFloat(i2), 0.75f * Float.intBitsToFloat(i), Float.intBitsToFloat(i2) * 0.25f, Float.intBitsToFloat(i), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        }
    }

    /* compiled from: VkTooltipGravityEdge.kt */
    public static abstract class f extends ktv0 {
        public static Pair g(long j, l9x l9xVar, long j2, int i) {
            int i2 = (int) (j2 & 4294967295L);
            return new Pair(Integer.valueOf(swe0.g(((int) (l9xVar.a() & 4294967295L)) - (i2 / 2), i, (((int) (j & 4294967295L)) - i2) - i)), Float.valueOf((((int) (l9xVar.a() & 4294967295L)) - r2) / i2));
        }

        @Override // xsna.ktv0
        public final q630 d(final long j) {
            yzs yzsVar = new yzs() { // from class: xsna.stv0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    q630 q630Var = (q630) obj;
                    androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    aVar.K(-1179653938);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1179653938, intValue, -1, "com.vk.core.compose.component.tooltip.VkTooltipGravityEdge.VerticalVkTooltipGravityEdge.minSize.<anonymous> (VkTooltipGravityEdge.kt:59)");
                    }
                    pq3.e().getClass();
                    float f = eo20.c * 2;
                    long j2 = j;
                    q630 j3 = txj0.j(Math.max(uco.c(j2), uco.b(j2)) + f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    aVar.j();
                    return j3;
                }
            };
            return qri.a(q630.a.a, a5x.a, yzsVar);
        }

        @Override // xsna.ktv0
        public final float e(float f, float f2) {
            return Math.max(f, f2);
        }

        @Override // xsna.ktv0
        public final float f(float f, float f2) {
            return Math.min(f, f2);
        }
    }

    public abstract void a(q630 q630Var, htv0 htv0Var, jai jaiVar, jai jaiVar2, androidx.compose.runtime.a aVar, int i);

    public Pair<h9x, Float> b(azl azlVar, long j, float f2, l9x l9xVar, long j2, int i) {
        long j3 = 0;
        return new Pair<>(new h9x((j3 & 4294967295L) | (j3 << 32)), Float.valueOf(0.5f));
    }

    public abstract void c(Path path, long j);

    public abstract q630 d(long j);

    public abstract float e(float f2, float f3);

    public abstract float f(float f2, float f3);
}
