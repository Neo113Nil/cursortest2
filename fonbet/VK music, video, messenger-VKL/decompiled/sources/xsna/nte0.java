package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.music.stickyplayer.presentation.components.ParentBottomSheetState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.gfp0;
import xsna.q630;

/* compiled from: RadioActionsPanel.kt */
/* loaded from: classes3.dex */
public final class nte0 {
    public static final long a = l2l0.l(21);

    public static final void a(final gfp0.d dVar, final dz40.c cVar, final boolean z, final ParentBottomSheetState parentBottomSheetState, final boolean z2, final izs izsVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-554181489);
        int i2 = i | (M.J(dVar) ? 4 : 2) | (M.J(cVar) ? 32 : 16) | (M.l(z) ? 256 : 128) | (M.o(parentBottomSheetState.ordinal()) ? 2048 : 1024) | (M.l(z2) ? 16384 : 8192) | (M.y(izsVar) ? 131072 : 65536);
        if (M.t(i2 & 1, (74899 & i2) != 74898)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-554181489, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioActionsPanel (RadioActionsPanel.kt:54)");
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
            b(dVar, cVar, izsVar, parentBottomSheetState, null, z2, z, M, (i2 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) | ((i2 >> 9) & 896) | (i2 & 7168) | ((i2 << 3) & 458752) | ((i2 << 12) & 3670016));
            if (xga0.c(aVar2, 16, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(cVar, z, parentBottomSheetState, z2, izsVar, i) { // from class: xsna.lte0
                public final /* synthetic */ dz40.c c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ ParentBottomSheetState e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ izs g;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    nte0.a(gfp0.d.this, this.c, this.d, this.e, this.f, this.g, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(final gfp0.d dVar, dz40.c cVar, izs izsVar, final ParentBottomSheetState parentBottomSheetState, q630 q630Var, final boolean z, final boolean z2, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        final q630 q630Var2;
        q630.a aVar2;
        final dz40.c cVar2 = cVar;
        final izs izsVar2 = izsVar;
        androidx.compose.runtime.a M = aVar.M(2028238203);
        if ((i & 6) == 0) {
            i2 = (M.J(dVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(cVar2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.y(izsVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= M.o(parentBottomSheetState.ordinal()) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if ((196608 & i) == 0) {
            i3 |= M.l(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= M.l(z2) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if (M.t(i3 & 1, (599187 & i3) != 599186)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2028238203, i3, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioInfo (RadioActionsPanel.kt:77)");
            }
            q630.a aVar3 = q630.a.a;
            q630 f = txj0.f(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3), 1.0f);
            a.l lVar = androidx.compose.foundation.layout.a.a;
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.h(12, dt1.a.o), dt1.a.l, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            cri.a.c cVar3 = cri.a.f;
            k9q0.w(M, a2, cVar3);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c, dVar2);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                szw.a("invalid weight; must be greater than zero");
            }
            xpy xpyVar = new xpy(1.0f, true);
            Object x2 = M.x();
            int i4 = 24;
            if (x2 == c0012a) {
                x2 = new lw20(wh50Var, i4);
                M.R(x2);
            }
            q630 z3 = sv1.z(xpyVar, (izs) x2);
            androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.n, M, 0);
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
            k9q0.w(M, a3, cVar3);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar2);
            float f2 = 10;
            eg10.a(z3r0.g(dVar.c, null, M, 2), ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "title"), 0L, a, 0L, 0L, 0, false, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 24960, 524264);
            eg10.b(d370.N(R.string.music_player_radio_station, 0, M), ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 5), "artistTitle"), l5g.c(14, l5g.d, 0.6f), 0, 0, false, 0, wlb0.l(M).m0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, M, 3456, 7152);
            M.G();
            cp10 d = ja8.d(dt1.a.b, false);
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
            k9q0.w(M, d, cVar3);
            k9q0.w(M, D3, eVar);
            ur.d(hashCode3, M, bVar, M, c2678a);
            k9q0.w(M, c3, dVar2);
            q630 E = ahn.E(aVar3, "addTrackButton");
            cVar2 = cVar;
            boolean z4 = cVar2.b;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new e750(10);
                M.R(x3);
            }
            int i5 = i3 & 896;
            M = M;
            int i6 = i3;
            po0.a(z4, (izs) x3, izsVar, E, z2, M, i5 | 3120 | (57344 & (i3 >> 6)), 0);
            if (z && cVar2.a) {
                M.K(-797791859);
                uo0.a((i6 >> 3) & 112, 4, M, izsVar, null, parentBottomSheetState == ParentBottomSheetState.EXPANDED);
                M = M;
                izsVar2 = izsVar;
            } else {
                izsVar2 = izsVar;
                M.K(-802946787);
            }
            M.j();
            M.G();
            View view = (View) M.r(AndroidCompositionLocals_androidKt.f);
            long j = wlb0.h(M).getBackground().m;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(950398620, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreVertical28> (VkSdkIcons.kt:2670)");
            }
            lg90 a4 = pg90.a(R.drawable.vk_icon_more_vertical_28, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.music_talkback_player_more, 0, M);
            long j2 = wlb0.h(M).getIcon().c;
            float f3 = 24;
            q630 q = txj0.q(aVar3, 40);
            boolean p = M.p(j);
            Object x4 = M.x();
            if (p || x4 == c0012a) {
                aVar2 = aVar3;
                x4 = new fyb0(j, 1);
                M.R(x4);
            } else {
                aVar2 = aVar3;
            }
            q630 E2 = ahn.E(bu00.e(q, (izs) x4), "moreButtonInPlayer");
            boolean y = M.y(view) | (i5 == 256);
            Object x5 = M.x();
            if (y || x5 == c0012a) {
                x5 = new ume0(1, view, izsVar2);
                M.R(x5);
            }
            nzu0.c((gzs) x5, a4, N, E2, f3, j2, false, null, false, null, null, M, 24640, 1984);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs() { // from class: xsna.mte0
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    nte0.b(gfp0.d.this, cVar2, izsVar2, parentBottomSheetState, q630Var2, z, z2, (androidx.compose.runtime.a) obj, ne7.I(i | 1));
                    return s3q0.a;
                }
            };
        }
    }
}
