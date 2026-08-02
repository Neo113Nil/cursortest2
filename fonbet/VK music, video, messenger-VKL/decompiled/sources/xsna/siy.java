package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vkontakte.android.R;
import java.util.Map;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: KidsMusicActionsPanel.kt */
/* loaded from: classes3.dex */
public final class siy {
    public static final long a = l2l0.l(21);

    public static final void a(gfp0.b.a aVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar2, int i) {
        androidx.compose.runtime.a aVar3;
        a.C0011a.C0012a c0012a;
        boolean z;
        androidx.compose.runtime.a M = aVar2.M(1991815580);
        int i2 = i | (M.J(aVar) ? 4 : 2) | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1991815580, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.AdActions (KidsMusicActionsPanel.kt:110)");
            }
            q630 F = s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630Var, 1.0f));
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, F);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            String N = d370.N(R.string.music_player_ad_title, 0, M);
            long j = wlb0.h(M).getText().d;
            frv0 frv0Var = wlb0.l(M).f;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            yqv0.c(N, new xpy(1.0f, true), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8184);
            androidx.compose.runtime.a aVar5 = M;
            boolean z2 = aVar.d;
            a.C0011a.C0012a c0012a2 = a.C0011a.a;
            if (z2) {
                aVar5.K(-1371609466);
                ButtonSize buttonSize = ButtonSize.Medium;
                ButtonStyle buttonStyle = ButtonStyle.Secondary;
                ButtonAppearance buttonAppearance = ButtonAppearance.Overlay;
                String N2 = d370.N(R.string.music_player_ad_goto_title, 0, aVar5);
                uog0 b = vog0.b(kqu0.h);
                boolean z3 = (i2 & 112) == 32;
                Object x = aVar5.x();
                if (z3 || x == c0012a2) {
                    x = new mif(izsVar, 3);
                    aVar5.R(x);
                }
                z = true;
                c0012a = c0012a2;
                bhu0.e(z3r0.d(0, 1, aVar5, (gzs) x), buttonSize, buttonStyle, buttonAppearance, null, b, false, false, null, null, null, N2, null, null, null, null, false, null, null, null, aVar5, X2.b.f, 0, 0, 4190160);
                aVar5 = aVar5;
            } else {
                c0012a = c0012a2;
                z = true;
                aVar5.K(-1376730046);
            }
            aVar5.j();
            long c2 = l5g.c(14, wlb0.h(aVar5).getBackground().m, 0.2f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, aVar5);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N3 = d370.N(R.string.music_talkback_player_more, 0, aVar5);
            long j2 = wlb0.h(aVar5).getIcon().c;
            float f = 24;
            q630 q = txj0.q(s200.H(q630.a.a, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 40);
            boolean p = aVar5.p(c2);
            Object x2 = aVar5.x();
            if (p || x2 == c0012a) {
                x2 = new qiy(c2, 0);
                aVar5.R(x2);
            }
            q630 e = bu00.e(q, (izs) x2);
            if ((i2 & 112) != 32) {
                z = false;
            }
            Object x3 = aVar5.x();
            if (z || x3 == c0012a) {
                x3 = new ega(izsVar, 5);
                aVar5.R(x3);
            }
            aVar3 = aVar5;
            nzu0.c((gzs) x3, a3, N3, e, f, j2, false, null, false, null, null, aVar3, 24640, 1984);
            aVar3.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar3 = M;
            aVar3.h();
        }
        androidx.compose.runtime.f s = aVar3.s();
        if (s != null) {
            s.d = new cqg(i, 4, aVar, izsVar, q630Var);
        }
    }

    public static final void b(gfp0.b bVar, dz40.c cVar, oiy oiyVar, izs izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-948886413);
        int i2 = i | (M.J(bVar) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.J(oiyVar) ? 256 : 128) | (M.y(izsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-948886413, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.KidsMusicActionsPanel (KidsMusicActionsPanel.kt:70)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new y8(27);
                M.R(x);
            }
            izs izsVar2 = (izs) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new g53(24);
                M.R(x2);
            }
            xh2.a(bVar, null, izsVar2, null, "ActionPanel", (izs) x2, kai.c(-447821389, new hys(izsVar, cVar, oiyVar, 1), M), M, (i2 & 14) | 1794432, 10);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new lo7(bVar, cVar, oiyVar, izsVar, i, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(gfp0.b.c cVar, dz40.c cVar2, izs izsVar, oiy oiyVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        cri.a.C2678a c2678a;
        q630.a aVar3;
        dz40.c cVar3 = cVar2;
        androidx.compose.runtime.a M = aVar.M(-993817041);
        int i2 = i | (M.J(cVar) ? 4 : 2) | (M.J(cVar3) ? 32 : 16) | (M.y(izsVar) ? 256 : 128) | (M.J(oiyVar) ? 2048 : 1024) | 24576;
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-993817041, i2, -1, "com.vk.music.stickyplayer.presentation.components.music.KidsMusicInfo (KidsMusicActionsPanel.kt:167)");
            }
            q630.a aVar4 = q630.a.a;
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(12, dt1.a.o), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar4 = cri.a.f;
            k9q0.w(M, a2, cVar4);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                c2678a = c2678a2;
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            } else {
                c2678a = c2678a2;
            }
            wh50 wh50Var = (wh50) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                long j = a;
                aVar3 = aVar4;
                x2 = on00.f(new Pair("explicit", new r0x(new esa0(j, j, 6), znk0.f)));
                M.R(x2);
            } else {
                aVar3 = aVar4;
            }
            Map map = (Map) x2;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new riy(0, wh50Var);
                M.R(x3);
            }
            q630 z = sv1.z(xpyVar, (izs) x3);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object x4 = M.x();
            if (z2 || x4 == c0012a) {
                x4 = new oq5(izsVar, 5);
                M.R(x4);
            }
            q630 c2 = ojc.c(z, false, null, null, (gzs) x4, 15);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c3 = qri.c(M, c2);
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
            k9q0.w(M, a3, cVar4);
            k9q0.w(M, D2, eVar);
            cri.a.C2678a c2678a3 = c2678a;
            ur.d(hashCode2, M, bVar, M, c2678a3);
            k9q0.w(M, c3, dVar);
            float f2 = 10;
            q630.a aVar6 = aVar3;
            eg10.a(z3r0.g(cVar.c, cVar.e ? "explicit" : null, M, 0), ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "title"), 0L, a, 0L, 0L, 0, false, map, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 24960, 491496);
            q630 E = ahn.E(s200.H(aVar6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), "artistTitle");
            String str = cVar.d;
            long j2 = ((q9x) wh50Var.getValue()).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            eg10.b(str, j2, E, l5g.c(14, l5g.d, 0.6f), 0, 0, false, 0, wuv0Var.m0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 3456, 7152);
            M.G();
            yzj0.a(14 & (i2 >> 6), M, izsVar, null, oiyVar.d);
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode3 = Long.hashCode(n34.n(M));
            sy90 D3 = M.D();
            q630 c4 = qri.c(M, aVar6);
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
            k9q0.w(M, d, cVar4);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a3);
            k9q0.w(M, c4, dVar);
            cVar3 = cVar2;
            boolean z3 = cVar3.b;
            boolean z4 = oiyVar.a;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new f1s(5);
                M.R(x5);
            }
            lo0.a(i3 | 48, M, (izs) x5, izsVar, null, z3, z4);
            aVar2 = M;
            if (oiyVar.c && cVar3.a) {
                aVar2.K(-1960014714);
                uo0.a(((i2 >> 3) & 112) | 384, 0, aVar2, izsVar, txj0.v(aVar6, 44), oiyVar.b == ParentBottomSheetState.EXPANDED);
                aVar2 = aVar2;
            } else {
                aVar2.K(-1969325347);
            }
            aVar2.j();
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar6;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new jy7(cVar, cVar3, izsVar, oiyVar, q630Var2, i);
        }
    }
}
