package xsna;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Slider.kt */
/* loaded from: classes11.dex */
public final class x0k0 {
    public static final float a = h1k0.n;
    public static final float b;
    public static final long c;
    public static final ior0 d;

    /* compiled from: Slider.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements wzs<Integer, Integer, Integer> {
        public static final a b = new a(2, an10.class, UcumUtils.UCUM_MINUTES, "min(II)I", 1);

        @Override // xsna.wzs
        public final Integer invoke(Integer num, Integer num2) {
            return Integer.valueOf(Math.min(num.intValue(), num2.intValue()));
        }
    }

    static {
        float f = h1k0.l;
        b = f;
        float f2 = h1k0.j;
        c = byc0.b(f, f2);
        byc0.b(f2, f);
        float f3 = h1k0.a;
        d = new ior0(a.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(final float f, final izs izsVar, final q630 q630Var, boolean z, final gzs gzsVar, i0k0 i0k0Var, sg50 sg50Var, final jai jaiVar, final jai jaiVar2, bwf bwfVar, androidx.compose.runtime.a aVar, final int i, final int i2) {
        boolean z2;
        int i3;
        i0k0 i0k0Var2;
        int i4;
        int i5;
        sg50 sg50Var2;
        int i6;
        androidx.compose.runtime.a aVar2;
        final boolean z3;
        final i0k0 i0k0Var3;
        final sg50 sg50Var3;
        final bwf bwfVar2;
        androidx.compose.runtime.f s;
        sg50 sg50Var4;
        bwf awfVar;
        sg50 sg50Var5;
        androidx.compose.runtime.a M = aVar.M(985901935);
        int i7 = (M.n(f) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if ((i & 384) == 0) {
            i7 |= M.J(q630Var) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i3 = i7 | 3072;
            z2 = z;
        } else {
            z2 = z;
            i3 = i7 | (M.l(z2) ? 2048 : 1024);
        }
        int i9 = i3 | (M.y(gzsVar) ? 16384 : 8192);
        if ((i2 & 32) == 0) {
            i0k0Var2 = i0k0Var;
            if (M.J(i0k0Var2)) {
                i4 = 131072;
                int i10 = i9 | i4;
                i5 = i2 & 64;
                if (i5 == 0) {
                    i10 |= 1572864;
                } else if ((1572864 & i) == 0) {
                    sg50Var2 = sg50Var;
                    i10 |= M.J(sg50Var2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
                    i6 = i10 | 12582912;
                    if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
                        M.V();
                        int i11 = i & 1;
                        a.C0011a.C0012a c0012a = a.C0011a.a;
                        if (i11 == 0 || M.i()) {
                            if (i8 != 0) {
                                z2 = true;
                            }
                            if ((i2 & 32) != 0) {
                                m0k0 m0k0Var = m0k0.a;
                                i0k0Var3 = m0k0.b(6, M);
                                i6 &= -458753;
                            } else {
                                i0k0Var3 = i0k0Var2;
                            }
                            if (i5 != 0) {
                                Object x = M.x();
                                if (x == c0012a) {
                                    x = ir.h(M);
                                }
                                sg50Var4 = (sg50) x;
                            } else {
                                sg50Var4 = sg50Var2;
                            }
                            awfVar = new awf(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                            sg50Var5 = sg50Var4;
                        } else {
                            M.h();
                            if ((i2 & 32) != 0) {
                                i6 &= -458753;
                            }
                            awfVar = bwfVar;
                            i0k0Var3 = i0k0Var2;
                            sg50Var5 = sg50Var2;
                        }
                        M.S();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(985901935, i6, 0, "androidx.compose.material3.Slider (Slider.kt:292)");
                        }
                        boolean J = M.J(awfVar);
                        Object x2 = M.x();
                        if (J || x2 == c0012a) {
                            x2 = new g1k0(f, gzsVar, awfVar);
                            M.R(x2);
                        }
                        g1k0 g1k0Var = (g1k0) x2;
                        g1k0Var.a = gzsVar;
                        g1k0Var.d = izsVar;
                        g1k0Var.d(f);
                        aVar2 = M;
                        boolean z4 = z2;
                        b(g1k0Var, q630Var, z4, null, sg50Var5, jaiVar, jaiVar2, aVar2, ((i6 >> 6) & 57344) | ((i6 >> 3) & 1008) | 1769472);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        bwfVar2 = awfVar;
                        z3 = z4;
                        sg50Var3 = sg50Var5;
                    } else {
                        aVar2 = M;
                        aVar2.h();
                        z3 = z2;
                        i0k0Var3 = i0k0Var2;
                        sg50Var3 = sg50Var2;
                        bwfVar2 = bwfVar;
                    }
                    s = aVar2.s();
                    if (s != null) {
                        s.d = new wzs() { // from class: xsna.w0k0
                            @Override // xsna.wzs
                            public final Object invoke(Object obj, Object obj2) {
                                ((Integer) obj2).getClass();
                                x0k0.a(f, izsVar, q630Var, z3, gzsVar, i0k0Var3, sg50Var3, jaiVar, jaiVar2, bwfVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1), i2);
                                return s3q0.a;
                            }
                        };
                        return;
                    }
                    return;
                }
                sg50Var2 = sg50Var;
                i6 = i10 | 12582912;
                if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
                }
                s = aVar2.s();
                if (s != null) {
                }
            }
        } else {
            i0k0Var2 = i0k0Var;
        }
        i4 = 65536;
        int i102 = i9 | i4;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        sg50Var2 = sg50Var;
        i6 = i102 | 12582912;
        if (M.t(i6 & 1, (306783379 & i6) != 306783378)) {
        }
        s = aVar2.s();
        if (s != null) {
        }
    }

    public static final void b(final g1k0 g1k0Var, final q630 q630Var, final boolean z, i0k0 i0k0Var, final sg50 sg50Var, final jai jaiVar, final jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final i0k0 i0k0Var2;
        i0k0 b2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(409861960);
        if ((i & 6) == 0) {
            i2 = (M.y(g1k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(q630Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(sg50Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= M.y(jaiVar2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i2 & 1, (599187 & i2) != 599186)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                m0k0 m0k0Var = m0k0.a;
                b2 = m0k0.b(6, M);
                i3 = i2 & (-7169);
            } else {
                M.h();
                i3 = i2 & (-7169);
                b2 = i0k0Var;
            }
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(409861960, i3, -1, "androidx.compose.material3.Slider (Slider.kt:371)");
            }
            int i4 = i3 >> 3;
            c(q630Var, g1k0Var, z, sg50Var, jaiVar, jaiVar2, M, (i3 & 896) | (i4 & 14) | ((i3 << 3) & 112) | (i4 & 7168) | (57344 & i4) | (i4 & 458752));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            i0k0Var2 = b2;
        } else {
            M.h();
            i0k0Var2 = i0k0Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.u0k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x0k0.b(g1k0.this, q630Var, z, i0k0Var2, sg50Var, jaiVar, jaiVar2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v10, types: [xsna.jai] */
    public static final void c(final q630 q630Var, g1k0 g1k0Var, final boolean z, final sg50 sg50Var, final jai jaiVar, jai jaiVar2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        g1k0 g1k0Var2;
        jai jaiVar3;
        boolean z2;
        q630 q630Var2;
        jai jaiVar4 = jaiVar2;
        androidx.compose.runtime.a M = aVar.M(898172835);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(g1k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.l(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.J(sg50Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= M.y(jaiVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.y(jaiVar4) ? 131072 : 65536;
        }
        int i3 = i2;
        boolean z3 = false;
        if (M.t(i3 & 1, (74899 & i3) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(898172835, i3, -1, "androidx.compose.material3.SliderImpl (Slider.kt:750)");
            }
            boolean z4 = M.r(uvi.n) == LayoutDirection.Rtl;
            g1k0Var.i = z4;
            Orientation orientation = g1k0Var.l;
            if (orientation == Orientation.Horizontal && z4) {
                z2 = false;
                z3 = true;
            } else {
                z2 = false;
            }
            q630.a aVar2 = q630.a.a;
            if (z) {
                c1k0 c1k0Var = new c1k0(g1k0Var);
                plb0 plb0Var = skn0.a;
                q630Var2 = new okn0(g1k0Var, sg50Var, null, c1k0Var, 4);
            } else {
                q630Var2 = aVar2;
            }
            Orientation orientation2 = g1k0Var.l;
            boolean booleanValue = ((Boolean) ((zak0) g1k0Var.m).getValue()).booleanValue();
            boolean y = M.y(g1k0Var);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (y || x == c0012a) {
                x = new a1k0(g1k0Var, null);
                M.R(x);
            }
            q630 q630Var3 = q630Var2;
            q630 a2 = fho.a(aVar2, g1k0Var, orientation2, z, sg50Var, booleanValue, (yzs) x, z3, 32);
            boolean z5 = z3;
            g1k0Var2 = g1k0Var;
            Orientation orientation3 = Orientation.Vertical;
            q630 z6 = orientation == orientation3 ? txj0.z(vua0.u(aVar2, j0k0.THUMB), null, 3) : txj0.C(vua0.u(aVar2, j0k0.THUMB), null, 3);
            icv icvVar = zax.a;
            q630 g = q630Var.g(zr20.a);
            float f = b;
            float f2 = a;
            q630 b2 = egi0.b(txj0.o(g, orientation == orientation3 ? f2 : f, orientation == orientation3 ? f : f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), false, new grp(z, g1k0Var2));
            bwf<Float> bwfVar = g1k0Var2.b;
            q630 g2 = sdi.o(mxr.a(egi0.b(b2.g(orientation == orientation3 ? vm.d : vm.c), true, new i3e0(g1k0Var2.c(), new awf(bwfVar.getStart().floatValue(), bwfVar.c().floatValue()), 0)), z, sg50Var), new b1k0(z, g1k0Var2.d, g1k0Var2.b, z5, g1k0Var2.c(), g1k0Var2.a)).g(q630Var3).g(a2);
            boolean y2 = M.y(g1k0Var2);
            Object x2 = M.x();
            if (y2 || x2 == c0012a) {
                x2 = new z0k0(g1k0Var2);
                M.R(x2);
            }
            cp10 cp10Var = (cp10) x2;
            int m = n34.m(M);
            sy90 D = M.D();
            q630 c2 = qri.c(M, g2);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, cp10Var, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            cri.a.b bVar = cri.a.g;
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m))) {
                kr.a(m, M, m, bVar);
            }
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c2, dVar);
            boolean y3 = M.y(g1k0Var2);
            Object x3 = M.x();
            if (y3 || x3 == c0012a) {
                x3 = new whg0(g1k0Var2, 5);
                M.R(x3);
            }
            q630 z7 = sv1.z(z6, (izs) x3);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d2 = ja8.d(ty6Var, false);
            int m2 = n34.m(M);
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, z7);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d2, cVar);
            k9q0.w(M, D2, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m2))) {
                kr.a(m2, M, m2, bVar);
            }
            k9q0.w(M, c3, dVar);
            int i4 = (i3 >> 3) & 14;
            jaiVar.invoke(g1k0Var2, M, Integer.valueOf(((i3 >> 9) & 112) | i4));
            M.G();
            q630 u = vua0.u(aVar2, j0k0.TRACK);
            cp10 d3 = ja8.d(ty6Var, false);
            int m3 = n34.m(M);
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, u);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            if (M.L() || !epx.f(M.x(), Integer.valueOf(m3))) {
                kr.a(m3, M, m3, bVar);
            }
            k9q0.w(M, c4, dVar);
            ?? r12 = jaiVar2;
            r12.invoke(g1k0Var2, M, Integer.valueOf(i4 | ((i3 >> 12) & 112)));
            M.G();
            M.G();
            jaiVar3 = r12;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
                jaiVar3 = r12;
            }
        } else {
            g1k0Var2 = g1k0Var;
            M.h();
            jaiVar3 = jaiVar4;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            final g1k0 g1k0Var3 = g1k0Var2;
            final jai jaiVar5 = jaiVar3;
            s.d = new wzs() { // from class: xsna.v0k0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    x0k0.c(q630.this, g1k0Var3, z, sg50Var, jaiVar, jaiVar5, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public static final float d(float f, float f2, float f3, float[] fArr) {
        Float valueOf;
        if (fArr.length == 0) {
            valueOf = null;
        } else {
            float f4 = fArr[0];
            int i = 1;
            int length = fArr.length - 1;
            if (length == 0) {
                valueOf = Float.valueOf(f4);
            } else {
                float abs = Math.abs(q6x.z(f2, f3, f4) - f);
                if (1 <= length) {
                    while (true) {
                        float f5 = fArr[i];
                        float abs2 = Math.abs(q6x.z(f2, f3, f5) - f);
                        if (Float.compare(abs, abs2) > 0) {
                            f4 = f5;
                            abs = abs2;
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
                valueOf = Float.valueOf(f4);
            }
        }
        return valueOf != null ? q6x.z(f2, f3, valueOf.floatValue()) : f;
    }
}
