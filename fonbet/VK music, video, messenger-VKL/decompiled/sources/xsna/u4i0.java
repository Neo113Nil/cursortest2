package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SegmentSize;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: SegmentControlContent.kt */
/* loaded from: classes18.dex */
public final class u4i0 implements yah0 {
    public final Object b = pn00.k(new Pair("medium", SegmentSize.Medium), new Pair("large", SegmentSize.Large));
    public final wh50 c = androidx.compose.runtime.k.b("medium");
    public final wh50 d = androidx.compose.runtime.k.b(2);
    public final wh50 e = androidx.compose.runtime.k.b(Boolean.FALSE);
    public final wh50 f = androidx.compose.runtime.k.b(Boolean.TRUE);

    /* compiled from: SegmentControlContent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SegmentSize.values().length];
            try {
                iArr[SegmentSize.Medium.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SegmentSize.Large.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.yah0
    public final void a(gzs gzsVar, gzs gzsVar2, x5 x5Var, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        int i2;
        gzs gzsVar4;
        lg90 c;
        androidx.compose.runtime.a M = aVar.M(-456447159);
        if ((i & 6) == 0) {
            gzsVar3 = gzsVar;
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            gzsVar3 = gzsVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 32 : 16;
        } else {
            gzsVar4 = gzsVar2;
        }
        int i3 = i & 24576;
        q630.a aVar2 = q630.a.a;
        if (i3 == 0) {
            i2 |= M.J(aVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= M.J(this) ? 131072 : 65536;
        }
        if (M.t(i2 & 1, (73747 & i2) != 73746)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-456447159, i2, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.Content (SegmentControlContent.kt:54)");
            }
            q630 f = txj0.f(aVar2, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, f);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            TopBar$Middle.Text a3 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Segmented Control", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            TopBar$Before.e a4 = TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(714006187);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(714007020);
                c = j8.c(qzu0.a, M);
            }
            muv0.h(a3, null, null, null, null, a4, d.a.a(d.c.C0760d.a.a(c, null, gzsVar4, null, null, null, M, 1572872 | ((i2 << 3) & 896), 58), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            M = M;
            djn0.a(true, true, M, 438, 0);
            c(null, M, (i2 >> 12) & 112);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new a9t(this, gzsVar, gzsVar2, x5Var, izsVar, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, java.util.Map] */
    public final void b(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(1273567646);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1273567646, i3, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.ComposeContent (SegmentControlContent.kt:127)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = qq.h(0, M);
            }
            wh50 wh50Var = (wh50) x;
            ejv0.a(txj0.f(aVar2, 1.0f), Integer.valueOf(((Number) wh50Var.getValue()).intValue()), !z, (SegmentSize) this.b.get((String) ((zak0) this.c).getValue()), kai.c(-1057988421, new sab0(1, this, wh50Var), M), M, 24582, 0);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new p4i0(this, z, q630Var, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v22, types: [java.lang.Object, java.util.Map] */
    public final void c(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1931893464);
        int i2 = i | 6;
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1931893464, i2, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.SegmentControls (SegmentControlContent.kt:76)");
            }
            q630.a aVar2 = q630.a.a;
            q630 D = s200.D(txj0.f(aVar2, 1.0f), 16);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar3 = dt1.a.n;
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
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
            float f = 8;
            int i3 = i2;
            w0n0.a(54, 0, M, "Compose", s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar2));
            wh50 wh50Var = this.e;
            int i4 = (i3 << 3) & 896;
            b(i4, M, null, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue());
            w0n0.a(54, 0, M, "View", s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, aVar2));
            e(i4, M, null, ((Boolean) ((zak0) wh50Var).getValue()).booleanValue());
            q630 H = s200.H(aVar2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            q630Var2 = aVar2;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar3, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, H);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            boolean booleanValue = ((Boolean) ((zak0) wh50Var).getValue()).booleanValue();
            int i5 = i3 & 112;
            boolean z = i5 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new lbc0(this, 13);
                M.R(x);
            }
            eku0.d("Disabled", (gzs) x, null, booleanValue, null, false, false, M, 6, 116);
            boolean booleanValue2 = ((Boolean) ((zak0) this.f).getValue()).booleanValue();
            boolean z2 = i5 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new myd0(this, 9);
                M.R(x2);
            }
            eku0.d("Text", (gzs) x2, null, booleanValue2, null, false, false, M, 6, 116);
            M.K(1956509077);
            String str = (String) ((zak0) this.c).getValue();
            boolean z3 = i5 == 32;
            Object x3 = M.x();
            if (z3 || x3 == c0012a) {
                x3 = new h440(this, 17);
                M.R(x3);
            }
            y9i0.a("Size", this.b, str, (izs) x3, null, M, 6, 16);
            M.j();
            q630 F = s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, q630Var2);
            float intValue = ((Number) ((zak0) this.d).getValue()).intValue();
            awf awfVar = new awf(2.0f, 5.0f);
            boolean z4 = i5 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a) {
                x4 = new ux40(this, 26);
                M.R(x4);
            }
            hkv0.d(intValue, (izs) x4, F, null, false, null, awfVar, 0, null, M, 384, 952);
            M = M;
            if (kr.f(M)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new o7c(this, q630Var2, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [int] */
    /* JADX WARN: Type inference failed for: r11v3 */
    public final void d(final y4i0 y4i0Var, final int i, final int i2, final izs<? super Integer, s3q0> izsVar, androidx.compose.runtime.a aVar, final int i3) {
        y4i0 y4i0Var2;
        int i4;
        androidx.compose.runtime.a M = aVar.M(-837023997);
        if ((i3 & 6) == 0) {
            Object obj = y4i0Var;
            i4 = (M.J(obj) ? 4 : 2) | i3;
            y4i0Var2 = obj;
        } else {
            y4i0Var2 = y4i0Var;
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= M.o(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= M.o(i2) ? 256 : 128;
        }
        int i5 = 2048;
        if ((i3 & 3072) == 0) {
            i4 |= M.y(izsVar) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= M.J(this) ? 16384 : 8192;
        }
        boolean z = 0;
        if (M.t(i4 & 1, (i4 & 9363) != 9362)) {
            int i6 = -1;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-837023997, i4, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.Segments (SegmentControlContent.kt:195)");
            }
            final int i7 = 0;
            while (i7 < i2) {
                boolean z2 = i == i7 ? true : z;
                boolean o = ((i4 & 7168) == i5 ? true : z) | M.o(i7);
                Object x = M.x();
                if (o || x == a.C0011a.a) {
                    x = new gzs() { // from class: xsna.r4i0
                        @Override // xsna.gzs
                        public final Object invoke() {
                            izs.this.invoke(Integer.valueOf(i7));
                            return s3q0.a;
                        }
                    };
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                String a2 = ((Boolean) ((zak0) this.f).getValue()).booleanValue() ? lhg.a(i7, "Seg ") : null;
                qzu0.a.getClass();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(964461088, z, i6, "com.vk.core.compose.icons.generated.VkIcons.<get-Ghost20> (VkIcons.kt:2976)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_ghost_20, z, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                y4i0Var2.b(32768 | ((i4 << 15) & 458752), M, a2, gzsVar, null, a3, z2);
                i7++;
                i4 = i4;
                i6 = i6;
                z = z;
                i5 = 2048;
                y4i0Var2 = y4i0Var;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.s4i0
                @Override // xsna.wzs
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).intValue();
                    u4i0.this.d(y4i0Var, i, i2, izsVar, (androidx.compose.runtime.a) obj2, ne7.I(i3 | 1));
                    return s3q0.a;
                }
            };
        }
    }

    public final void e(int i, androidx.compose.runtime.a aVar, q630 q630Var, boolean z) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(303282191);
        if ((i & 6) == 0) {
            i2 = (M.l(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= M.J(this) ? 256 : 128;
        }
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(303282191, i3, -1, "com.vk.design.demo.presentation.screens.SegmentControlContent.ViewContent (SegmentControlContent.kt:142)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar2 = q630.a.a;
            q630 c = qri.c(M, aVar2);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = qq.h(0, M);
            }
            wh50 wh50Var = (wh50) x;
            q630 f = txj0.f(aVar2, 1.0f);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = t4i0.b;
                M.R(x2);
            }
            izs izsVar = (izs) x2;
            boolean z2 = ((i3 & 896) == 256) | ((i3 & 14) == 4);
            Object x3 = M.x();
            if (z2 || x3 == c0012a) {
                x3 = new q4i0(this, z, wh50Var);
                M.R(x3);
            }
            ae2.a(54, 0, M, izsVar, (izs) x3, f);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new t7b0(this, z, q630Var, i);
        }
    }
}
