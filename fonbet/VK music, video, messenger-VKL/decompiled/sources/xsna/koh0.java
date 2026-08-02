package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;
import xsna.ty6;
import xsna.yk8;
import xsna.z3g;

/* compiled from: SearchCommunitiesOnMapDetailsView.kt */
/* loaded from: classes5.dex */
public final class koh0 extends i6v0<loh0, ynh0> implements z3g {
    public final uog0 f;
    public float g;
    public float h;
    public z3g.a i;

    /* compiled from: SearchCommunitiesOnMapDetailsView.kt */
    public static final class a implements wzs<Float, Float, s3q0> {
        public a() {
        }

        @Override // xsna.wzs
        public final s3q0 invoke(Float f, Float f2) {
            koh0.this.r(f.floatValue(), f2.floatValue());
            return s3q0.a;
        }
    }

    public koh0(Context context, f5z f5zVar) {
        super(context, f5zVar);
        float f = 20;
        this.f = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
        bwt0.h(this.d, new tju(this, 25));
    }

    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        q((loh0) ao50Var, izsVar, aVar, 512);
    }

    @Override // xsna.z3g
    public final void e4(z3g.a aVar) {
        this.i = aVar;
        r(this.g, this.h);
    }

    public final void h(String str, c1h c1hVar, lop0 lop0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(2130661393);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(c1hVar) ? 32 : 16) | (M.J(lop0Var) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2130661393, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.CollapsibleCommunityAvatar (SearchCommunitiesOnMapDetailsView.kt:352)");
            }
            q630 H = s200.H(q630.a.a, 20, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new q130(c1hVar, 25);
                M.R(x);
            }
            q630 a2 = rdu.a(H, (izs) x);
            boolean z2 = (i3 == 32) | ((i2 & 896) == 256);
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new cq3(26, c1hVar, lop0Var);
                M.R(x2);
            }
            esg.a(str, bu00.f(a2, (izs) x2), M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new y7p(this, str, c1hVar, lop0Var, i);
        }
    }

    public final void i(loh0.c cVar, c1h c1hVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(113720523);
        int i2 = (M.J(cVar) ? 4 : 2) | i | (M.J(c1hVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(113720523, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.CollapsibleCoverImage (SearchCommunitiesOnMapDetailsView.kt:288)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new xka0(c1hVar, 9);
                M.R(x);
            }
            q630 z2 = sv1.z(q630.a.a, (izs) x);
            boolean z3 = i3 == 32;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new whg0(c1hVar, 3);
                M.R(x2);
            }
            q630 a2 = rdu.a(z2, (izs) x2);
            boolean z4 = i3 == 32;
            Object x3 = M.x();
            if (z4 || x3 == c0012a) {
                x3 = new uh40(c1hVar, 25);
                M.R(x3);
            }
            d1h.a(cVar, bu00.f(a2, (izs) x3), M, i2 & 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ijl(i, 4, this, cVar, c1hVar);
        }
    }

    public final void j(loh0.e.a aVar, c1h c1hVar, lop0 lop0Var, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super ynh0, s3q0> izsVar2;
        androidx.compose.runtime.a M = aVar2.M(-39767270);
        int i2 = (M.J(aVar) ? 4 : 2) | i | (M.J(c1hVar) ? 32 : 16) | (M.J(lop0Var) ? 256 : 128);
        if ((i & 3072) == 0) {
            izsVar2 = izsVar;
            i2 |= M.y(izsVar2) ? 2048 : 1024;
        } else {
            izsVar2 = izsVar;
        }
        if ((i & 24576) == 0) {
            i2 |= M.J(this) ? 16384 : 8192;
        }
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-39767270, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.CollapsibleReviewsHeader (SearchCommunitiesOnMapDetailsView.kt:313)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = bbk0.b(new a1h(c1hVar, 1));
                M.R(x);
            }
            mtk0 mtk0Var = (mtk0) x;
            float f = 49;
            q630.a aVar3 = q630.a.a;
            q630 b = txj0.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 1, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13));
            int i3 = i2 & 112;
            boolean z = ((i2 & 57344) == 16384) | (i3 == 32);
            Object x2 = M.x();
            if (z || x2 == c0012a) {
                x2 = new ju(23, c1hVar, this);
                M.R(x2);
            }
            q630 z2 = sv1.z(b, (izs) x2);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new svz(27);
                M.R(x3);
            }
            q630 a2 = rdu.a(aVar3, (izs) x3);
            boolean z3 = ((i2 & 896) == 256) | (i3 == 32);
            Object x4 = M.x();
            if (z3 || x4 == c0012a) {
                x4 = new zf1(28, lop0Var, c1hVar);
                M.R(x4);
            }
            lig0.e(aVar, this.f, izsVar2, mtk0Var, z2, bu00.f(a2, (izs) x4), M, (i2 & 14) | 3072 | ((i2 >> 3) & 896));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new es3(i, 3, this, aVar, c1hVar, lop0Var, izsVar);
        }
    }

    public final void k(String str, c1h c1hVar, izs<? super ljo0, s3q0> izsVar, gzs<s3q0> gzsVar, androidx.compose.runtime.a aVar, int i) {
        izs<? super ljo0, s3q0> izsVar2;
        androidx.compose.runtime.a aVar2;
        a.C0011a.C0012a c0012a;
        a.C0011a.C0012a c0012a2;
        gzs<s3q0> gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(-2004050047);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(c1hVar) ? 32 : 16) | (M.y(gzsVar2) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2004050047, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.CollapsibleTitle (SearchCommunitiesOnMapDetailsView.kt:443)");
            }
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630.a aVar3 = q630.a.a;
            q630 c = qri.c(M, aVar3);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            M.K(677642835);
            float f = 8;
            float f2 = 6;
            float f3 = 16;
            q630 G = s200.G(aVar3, f3, f, 56, f2);
            boolean booleanValue = ((Boolean) c1hVar.w.getValue()).booleanValue();
            a.C0011a.C0012a c0012a3 = a.C0011a.a;
            if (booleanValue) {
                M.K(-30775370);
                boolean z = (i2 & 7168) == 2048;
                Object x = M.x();
                if (z || x == c0012a3) {
                    x = new by20(gzsVar2, 28);
                    M.R(x);
                }
                c0012a = c0012a3;
                G = ojc.c(G, false, null, null, (gzs) x, 15);
                M.j();
            } else {
                c0012a = c0012a3;
                M.K(-30691639);
                M.j();
            }
            M.j();
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a) {
                x2 = new hs00(c1hVar, 27);
                M.R(x2);
            }
            a.C0011a.C0012a c0012a4 = c0012a;
            int i4 = i2 & 14;
            yqv0.c(str, rdu.a(G, (izs) x2), wlb0.h(M).getText().m, null, null, 0, 0, null, 2, false, 0, 1, null, wlb0.l(M).g, M, i4 | 100663296, 48, 5880);
            M.K(677667029);
            q630 G2 = s200.G(aVar3, f3, f, f3, f2);
            if (((Boolean) c1hVar.v.getValue()).booleanValue()) {
                M.K(1795597744);
                boolean z3 = (i2 & 7168) == 2048;
                Object x3 = M.x();
                c0012a2 = c0012a4;
                if (z3 || x3 == c0012a2) {
                    gzsVar2 = gzsVar;
                    x3 = new ln20(gzsVar2, 26);
                    M.R(x3);
                } else {
                    gzsVar2 = gzsVar;
                }
                G2 = ojc.c(G2, false, null, null, (gzs) x3, 15);
                M.j();
            } else {
                gzsVar2 = gzsVar;
                c0012a2 = c0012a4;
                M.K(1795681475);
                M.j();
            }
            M.j();
            boolean z4 = i3 == 32;
            Object x4 = M.x();
            if (z4 || x4 == c0012a2) {
                x4 = new r9c0(c1hVar, 6);
                M.R(x4);
            }
            q630 a2 = rdu.a(G2, (izs) x4);
            frv0 frv0Var = wlb0.l(M).g;
            long j = wlb0.h(M).getText().m;
            boolean z5 = i3 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a2) {
                izsVar2 = izsVar;
                x5 = new ll1(23, (Object) c1hVar, (izs) izsVar2);
                M.R(x5);
            } else {
                izsVar2 = izsVar;
            }
            aVar2 = M;
            yqv0.c(str, a2, j, null, null, 0, 0, null, 0, false, 0, 2, (izs) x5, frv0Var, aVar2, i4, 48, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new hoh0(this, str, c1hVar, izsVar2, gzsVar2, i);
        }
    }

    public final void l(loh0.e.a aVar, c1h c1hVar, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a M = aVar2.M(-2125022255);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(c1hVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2125022255, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.GroupDetailsContent (SearchCommunitiesOnMapDetailsView.kt:193)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630.a.a);
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
            int i3 = i2 & 8190;
            n(aVar, c1hVar, izsVar, M, i3);
            m(aVar, c1hVar, izsVar, M, i3);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h3h(i, 1, this, aVar, c1hVar, izsVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void m(loh0.e.a aVar, c1h c1hVar, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super ynh0, s3q0> izsVar2;
        c1h c1hVar2;
        wh50 wh50Var;
        q630.a aVar3;
        androidx.compose.runtime.a M = aVar2.M(208171727);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.J(c1hVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(208171727, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.GroupDetailsContentBody (SearchCommunitiesOnMapDetailsView.kt:381)");
            }
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                x = new wq20(c1hVar, 26);
                M.R(x);
            }
            q630.a aVar4 = q630.a.a;
            q630 a2 = rdu.a(aVar4, (izs) x);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a3, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            wh50 d = jk50.d(aVar.a, "", M, 48);
            wh50 d2 = jk50.d(aVar.b, "", M, 48);
            wh50 d3 = jk50.d(aVar.e, EmptyList.b, M, 48);
            wh50 d4 = jk50.d(aVar.f, new loh0.b(null, 3), M, 48);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = qq.h(1, M);
            }
            wh50 wh50Var2 = (wh50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = bbk0.b(new xy0(20, wh50Var2, d3));
                M.R(x3);
            }
            mtk0 mtk0Var = (mtk0) x3;
            String str = (String) d.getValue();
            Object x4 = M.x();
            if (x4 == c0012a) {
                wh50Var = d4;
                x4 = new s8s(1, wh50Var2);
                M.R(x4);
            } else {
                wh50Var = d4;
            }
            izs<? super ljo0, s3q0> izsVar3 = (izs) x4;
            int i4 = i2 & 896;
            boolean z2 = i4 == 256;
            Object x5 = M.x();
            if (z2 || x5 == c0012a) {
                aVar3 = aVar4;
                x5 = new r0(izsVar, 6);
                M.R(x5);
            } else {
                aVar3 = aVar4;
            }
            q630.a aVar7 = aVar3;
            k(str, c1hVar, izsVar3, (gzs) x5, M, i3 | 384 | ((i2 << 3) & 57344));
            Object x6 = M.x();
            if (x6 == c0012a) {
                x6 = bbk0.b(new tbe0(c1hVar, 4));
                M.R(x6);
            }
            mtk0 mtk0Var2 = (mtk0) x6;
            boolean z3 = i4 == 256;
            Object x7 = M.x();
            if (z3 || x7 == c0012a) {
                x7 = new o2h(izsVar, 5);
                M.R(x7);
            }
            q630 c2 = ojc.c(aVar7, false, null, null, (gzs) x7, 15);
            boolean z4 = i3 == 32;
            Object x8 = M.x();
            if (z4 || x8 == c0012a) {
                x8 = new f410(c1hVar, 29);
                M.R(x8);
            }
            float f = 16;
            q630 H = s200.H(sv1.z(c2, (izs) x8), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 8, 2);
            Object x9 = M.x();
            if (x9 == c0012a) {
                x9 = new hb40(mtk0Var2, 16);
                M.R(x9);
            }
            q630 a4 = rdu.a(H, (izs) x9);
            String str2 = (String) d2.getValue();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.e0;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str2, a4, ylu0Var.getText().r, null, null, 0, 0, null, 2, false, 0, ((Number) mtk0Var.getValue()).intValue(), null, frv0Var, M, 100663296, 0, 5880);
            M = M;
            boolean z5 = i3 == 32;
            Object x10 = M.x();
            if (z5 || x10 == c0012a) {
                c1hVar2 = c1hVar;
                x10 = new z6f0(c1hVar2, 5);
                M.R(x10);
            } else {
                c1hVar2 = c1hVar;
            }
            q630 a5 = rdu.a(aVar7, (izs) x10);
            androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(mVar, aVar5, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, a5);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            M.K(-2136778347);
            Iterator it = ((List) d3.getValue()).iterator();
            while (it.hasNext()) {
                r1h.b((loh0.d) it.next(), izsVar, M, (i2 >> 3) & 112);
            }
            izsVar2 = izsVar;
            M.j();
            jqu0.a(s200.H(aVar7, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
            sju.a((loh0.b) wh50Var.getValue(), c1hVar2, izsVar2, M, i2 & 1008);
            M.G();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            c1hVar2 = c1hVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tx7(this, aVar, c1hVar2, izsVar2, i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0280, code lost:
    
        if (r2 == r1) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(loh0.e.a aVar, c1h c1hVar, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar2, int i) {
        izs<? super ynh0, s3q0> izsVar2;
        int i2;
        wh50 wh50Var;
        a.C0011a.C0012a c0012a;
        androidx.compose.runtime.a M = aVar2.M(-2127396860);
        int i3 = i | (M.J(aVar) ? 4 : 2) | (M.J(c1hVar) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(this) ? 2048 : 1024);
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2127396860, i3, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.GroupDetailsContentHeader (SearchCommunitiesOnMapDetailsView.kt:214)");
            }
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object x = M.x();
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z || x == c0012a2) {
                x = new vlc0(c1hVar, 5);
                M.R(x);
            }
            q630.a aVar3 = q630.a.a;
            q630 a2 = rdu.a(aVar3, (izs) x);
            dt1.a.getClass();
            ty6 ty6Var = dt1.a.b;
            cp10 d = ja8.d(ty6Var, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a2);
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
            k9q0.w(M, d, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            a.j g = androidx.compose.foundation.layout.a.g(-69);
            q630 d2 = rte0.d(aVar3, androidx.compose.ui.graphics.e.a);
            boolean z2 = i4 == 32;
            Object x2 = M.x();
            if (z2 || x2 == c0012a2) {
                i2 = i4;
                x2 = new waf0(c1hVar, 2);
                M.R(x2);
            } else {
                i2 = i4;
            }
            q630 z3 = sv1.z(d2, (izs) x2);
            ty6.a aVar5 = dt1.a.n;
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(g, aVar5, M, 6);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, z3);
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
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            wh50 a4 = jk50.a(aVar.c, M, 0, 3);
            wh50 a5 = jk50.a(aVar.d, M, 0, 3);
            i((loh0.c) a4.getValue(), c1hVar, M, i2 | ((i3 >> 3) & 896));
            cp10 d3 = ja8.d(ty6Var, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c3 = qri.c(M, aVar3);
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
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar);
            q630 H = s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 49, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            float f = 20;
            q630 f2 = txj0.f(txj0.h(H, f), 1.0f);
            if (androidx.compose.runtime.b.d()) {
                wh50Var = a5;
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            } else {
                wh50Var = a5;
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            f9t.e(hr80.m(f2, ylu0Var.getBackground().g, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), M, 0);
            androidx.compose.foundation.layout.c a6 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, aVar5, M, 0);
            int hashCode4 = Long.hashCode(n34.n(M));
            sy90 D4 = M.D();
            q630 c4 = qri.c(M, aVar3);
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
            k9q0.w(M, a6, cVar);
            k9q0.w(M, D4, eVar);
            ur.d(hashCode4, M, bVar, M, c2678a);
            k9q0.w(M, c4, dVar);
            androidx.compose.foundation.layout.k a7 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, M, 0);
            int hashCode5 = Long.hashCode(n34.n(M));
            sy90 D5 = M.D();
            q630 c5 = qri.c(M, aVar3);
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
            k9q0.w(M, a7, cVar);
            k9q0.w(M, D5, eVar);
            ur.d(hashCode5, M, bVar, M, c2678a);
            k9q0.w(M, c5, dVar);
            Object r = M.r(uvi.h);
            boolean J = M.J(r);
            Object x3 = M.x();
            if (J) {
                c0012a = c0012a2;
            } else {
                c0012a = c0012a2;
            }
            x3 = new lop0(((azl) r).I0(8));
            M.R(x3);
            lop0 lop0Var = (lop0) x3;
            a.C0011a.C0012a c0012a3 = c0012a;
            h((String) wh50Var.getValue(), c1hVar, lop0Var, M, i3 & 7280);
            int i5 = i3 << 3;
            j(aVar, c1hVar, lop0Var, izsVar, M, (i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | (i5 & 7168) | (i5 & 57344));
            izsVar2 = izsVar;
            M.G();
            M.G();
            M.G();
            M.G();
            boolean z4 = (i3 & 896) == 256;
            Object x4 = M.x();
            if (z4 || x4 == c0012a3) {
                x4 = new lq0(izsVar2, 7);
                M.R(x4);
            }
            gzs gzsVar = (gzs) x4;
            q630 H2 = s200.H(ra8.a.b(aVar3, dt1.a.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, 16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 9);
            boolean z5 = i2 == 32;
            Object x5 = M.x();
            if (z5 || x5 == c0012a3) {
                x5 = new gda0(c1hVar, 12);
                M.R(x5);
            }
            nzu0.e(gzsVar, rdu.a(H2, (izs) x5), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, false, null, null, kai.c(-370129303, new com.vk.movika.tools.controls.seekbar.h(c1hVar, 11), M), M, 100663296, 252);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            izsVar2 = izsVar;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pcb0(this, aVar, c1hVar, izsVar2, i);
        }
    }

    public final void o(int i, androidx.compose.runtime.a aVar) {
        androidx.compose.runtime.a M = aVar.M(1793088441);
        int i2 = i & 1;
        if (M.t(i2, i2 != 0)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1793088441, i, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.GroupDetailsLoadingPlaceholder (SearchCommunitiesOnMapDetailsView.kt:175)");
            }
            q630.a aVar2 = q630.a.a;
            q630 h = txj0.h(txj0.f(aVar2, 1.0f), 400);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, h);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            zfr0.f(SpinnerState.Loading, ra8.a.b(aVar2, dt1.a.f), null, 0L, null, null, M, 6, 60);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vg3(this, i, 7);
        }
    }

    public final void p(mtk0<? extends loh0.e<?>> mtk0Var, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1109450080);
        int i2 = i | (M.J(mtk0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1109450080, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.SearchCommunitiesOnMapDetailsContent (SearchCommunitiesOnMapDetailsView.kt:118)");
            }
            iyk0 iyk0Var = uvi.h;
            Object r = M.r(iyk0Var);
            boolean J = M.J(r);
            Object x = M.x();
            Object obj = a.C0011a.a;
            if (J || x == obj) {
                x = new c1h((azl) r, new a());
                M.R(x);
            }
            c1h c1hVar = (c1h) x;
            Object r2 = M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            boolean J2 = M.J(r2) | M.J(ylu0Var);
            Object x2 = M.x();
            if (J2 || x2 == obj) {
                x2 = yk8.a.g(e43.l(new l5g(l5g.c(14, ylu0Var.getBackground().g, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), new l5g(l5g.c(14, ylu0Var.getBackground().g, 0.5f))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((azl) r2).I0(20), 10);
                M.R(x2);
            }
            Object obj2 = (yk8) x2;
            Object x3 = M.x();
            if (x3 == obj) {
                x3 = bbk0.b(new gkc0(c1hVar, 5));
                M.R(x3);
            }
            mtk0 mtk0Var2 = (mtk0) x3;
            boolean J3 = M.J(obj2) | M.J(c1hVar);
            Object x4 = M.x();
            if (J3 || x4 == obj) {
                x4 = new defpackage.l(obj2, c1hVar, mtk0Var2, 6);
                M.R(x4);
            }
            c4g.a(c1hVar, this.f, null, bu00.f(q630.a.a, (izs) x4), kai.c(-1116544899, new joh0(mtk0Var, this, c1hVar, izsVar, 0), M), M, 24576);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new g6i(i, 3, this, mtk0Var, izsVar);
        }
    }

    public final void q(loh0 loh0Var, izs<? super ynh0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1411044500);
        int i2 = (M.J(loh0Var) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16) | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1411044500, i2, -1, "com.vk.search.communities.map.impl.ui.details.compose.SearchCommunitiesOnMapDetailsView.ThemedContent (SearchCommunitiesOnMapDetailsView.kt:104)");
            }
            p(d(loh0.e.b.a, new n0u0[]{loh0Var.a, loh0Var.b}, M, (i2 & 896) | 6), izsVar, M, i2 & 1008);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og5(this, loh0Var, izsVar, i, 4);
        }
    }

    public final void r(final float f, final float f2) {
        this.g = f;
        this.h = f2;
        final z3g.a aVar = this.i;
        if (aVar == null) {
            return;
        }
        this.d.post(new Runnable() { // from class: xsna.ioh0
            @Override // java.lang.Runnable
            public final void run() {
                this.d.getHeight();
                z3g.a.this.a(an10.b(f), an10.b(f2));
            }
        });
    }
}
