package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.PictureRadius;
import java.util.List;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.gl.tf.Tensorflow;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.z06;

/* compiled from: ProductsManagementBanner.kt */
/* loaded from: classes18.dex */
public final class rsd0 {
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0232, code lost:
    
        if (r10 == r8) goto L75;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v20, types: [int] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(tsd0 tsd0Var, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630.a aVar3;
        boolean z;
        rw6 rw6Var;
        String str;
        y6g y6gVar;
        int i2;
        String str2;
        a.C0011a.C0012a c0012a;
        List<usd0> list;
        ?? r3;
        zp8 zp8Var;
        a.C0011a.C0012a c0012a2;
        androidx.compose.runtime.a aVar4;
        a.C0011a.C0012a c0012a3;
        int i3;
        zp8 zp8Var2;
        androidx.compose.runtime.a aVar5;
        androidx.compose.runtime.a M = aVar.M(-1824238422);
        int i4 = i | (M.J(tsd0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | 384;
        if (M.t(i4 & 1, (i4 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1824238422, i4, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ProductsManagementBanner (ProductsManagementBanner.kt:63)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = ylu0Var.getBackground().g;
            uog0 b = vog0.b(20);
            q630.a aVar6 = q630.a.a;
            q630 D = s200.D(hr80.m(aVar6, j, b), kqu0.r);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar7 = cri.a.b;
            x61 x61Var = null;
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D2, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            y6g y6gVar2 = new y6g(ylu0Var2.getBackground().g);
            String str3 = tsd0Var.c;
            List<usd0> list2 = tsd0Var.d;
            if (str3 == null) {
                M.K(491164019);
                M.j();
                aVar3 = aVar6;
                z = false;
                rw6Var = null;
            } else {
                M.K(491164020);
                aVar3 = aVar6;
                z = false;
                rw6 f = wp80.f(phw.a.a(fwu0.l(null, tsd0Var.c, null, null, M, 0, 61), null, null, null, null, M, 196616, 30), 32, PictureRadius.Large, M, 12607536, 108);
                M = M;
                M.j();
                rw6Var = f;
            }
            String str4 = tsd0Var.a;
            String str5 = tsd0Var.b;
            usd0 usd0Var = (usd0) j5g.a0(list2);
            a.C0011a.C0012a c0012a4 = a.C0011a.a;
            if (usd0Var == null) {
                M.K(491609055);
                M.j();
                q630Var = aVar3;
                str = str4;
                str2 = str5;
                c0012a = c0012a4;
                y6gVar = y6gVar2;
                i2 = i4;
                list = list2;
                zp8Var = null;
                r3 = 1;
            } else {
                M.K(491609056);
                ButtonStyle buttonStyle = usd0Var.b ? ButtonStyle.Primary : ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                ButtonSize buttonSize = ButtonSize.Small;
                String str6 = usd0Var.a;
                q630Var = aVar3;
                boolean J = ((i4 & 112) == 32 ? true : z) | M.J(usd0Var);
                Object x = M.x();
                if (J || x == c0012a4) {
                    x = new fg1(22, izsVar, usd0Var);
                    M.R(x);
                }
                str = str4;
                androidx.compose.runtime.a aVar8 = M;
                y6gVar = y6gVar2;
                i2 = i4;
                str2 = str5;
                c0012a = c0012a4;
                list = list2;
                r3 = 1;
                zp8 a = d16.a.C2697a.a(buttonStyle, buttonAppearance, buttonSize, str6, null, null, null, null, null, null, null, null, (gzs) x, aVar8, Tensorflow.FRAME_WIDTH, 24576, 8176);
                M = aVar8;
                M.j();
                zp8Var = a;
            }
            usd0 usd0Var2 = (usd0) j5g.b0(r3, list);
            if (usd0Var2 == null) {
                M.K(492111999);
                M.j();
                aVar4 = M;
                zp8Var2 = null;
                c0012a3 = c0012a;
                i3 = 32;
            } else {
                M.K(492112000);
                ButtonStyle buttonStyle2 = usd0Var2.b ? ButtonStyle.Primary : ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                ButtonSize buttonSize2 = ButtonSize.Small;
                String str7 = usd0Var2.a;
                boolean J2 = M.J(usd0Var2) | ((i2 & 112) == 32 ? r3 : z);
                Object x2 = M.x();
                if (J2) {
                    c0012a2 = c0012a;
                } else {
                    c0012a2 = c0012a;
                }
                x2 = new com.vk.newsfeed.common.recycler.holders.attachments.a(25, izsVar, usd0Var2);
                M.R(x2);
                aVar4 = M;
                c0012a3 = c0012a2;
                i3 = 32;
                zp8 a2 = d16.a.C2697a.a(buttonStyle2, buttonAppearance2, buttonSize2, str7, null, null, null, null, null, null, null, null, (gzs) x2, aVar4, Tensorflow.FRAME_WIDTH, 24576, 8176);
                aVar4.j();
                zp8Var2 = a2;
            }
            androidx.compose.runtime.a aVar9 = aVar4;
            xl20 a3 = d16.b.a(str, str2, null, zp8Var, zp8Var2, null, null, null, aVar9, 100663296, 228);
            usd0 usd0Var3 = tsd0Var.f;
            if (usd0Var3 == null) {
                aVar9.K(492597831);
                aVar9.j();
                aVar5 = aVar9;
            } else {
                aVar9.K(492597832);
                boolean J3 = aVar9.J(usd0Var3) | ((i2 & 112) == i3 ? true : z);
                Object x3 = aVar9.x();
                if (J3 || x3 == c0012a3) {
                    x3 = new qsd0(0, izsVar, usd0Var3);
                    aVar9.R(x3);
                }
                aVar5 = aVar9;
                x61Var = z06.b.a.a((gzs) x3, null, null, null, null, null, aVar5, 1572864, 62);
                aVar5.j();
            }
            androidx.compose.runtime.a aVar10 = aVar5;
            beu0.a(a3, null, y6gVar, null, null, null, null, rw6Var, x61Var, null, null, null, aVar10, 512, 0, 3706);
            aVar2 = aVar10;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new be0(tsd0Var, izsVar, q630Var2, i);
        }
    }

    public static final void b(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1471263064);
        int i2 = i | 6;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1471263064, i2, -1, "com.vk.ecomm.storefront.impl.community.presentation.ui.productmanagement.ProductsManagementBannerSkeleton (ProductsManagementBanner.kt:111)");
            }
            long j = wlb0.h(M).getBackground().g;
            uog0 b = vog0.b(20);
            q630Var2 = q630.a.a;
            q630 D = s200.D(hr80.m(q630Var2, j, b), kqu0.w);
            dt1.a.getClass();
            ty6.b bVar = dt1.a.k;
            a.l lVar = androidx.compose.foundation.layout.a.a;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g(kqu0.v), bVar, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c = qri.c(M, D);
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D2, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            float f = 8;
            ja8.a(hr80.m(txj0.q(q630Var2, 32), wlb0.h(M).c().a, vog0.b(f)), M, 0);
            float f2 = 4;
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 1, txj0.f(q630Var2, 1.0f));
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            q630 d = defpackage.j0.d(1.0f, F, true);
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(f), dt1.a.n, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c2 = qri.c(M, d);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, a2, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode2, M, bVar2, M, c2678a);
            k9q0.w(M, c2, dVar);
            float f3 = 12;
            ja8.a(hr80.m(txj0.s(q630Var2, 232, f3), wlb0.h(M).c().a, vog0.b(f2)), M, 0);
            ja8.a(hr80.m(txj0.s(q630Var2, 194, f3), wlb0.h(M).c().a, vog0.b(f2)), M, 0);
            ja8.a(hr80.m(txj0.s(q630Var2, 180, f3), wlb0.h(M).c().a, vog0.b(f2)), M, 0);
            M.G();
            if (dt.c(hr80.m(txj0.q(q630Var2, 24), wlb0.h(M).c().a, vog0.a), M, 0)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b1(q630Var2, i, 1);
        }
    }
}
