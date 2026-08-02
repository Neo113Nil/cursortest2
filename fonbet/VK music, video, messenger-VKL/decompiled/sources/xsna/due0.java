package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dt1;
import xsna.dz40;
import xsna.q630;

/* compiled from: RadioPlayerHeader.kt */
/* loaded from: classes3.dex */
public final class due0 {
    public static final void a(dz40.h hVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(658864766);
        if ((i & 6) == 0) {
            i2 = (M.J(hVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= M.J(q630Var) ? 256 : 128;
        }
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(658864766, i2, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioPlayerHeader (RadioPlayerHeader.kt:42)");
            }
            q630 d = txj0.d(q630Var, 1.0f);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
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
            k9q0.w(M, d2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(80869148, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ChevronDownOutline28> (VkSdkIcons.kt:430)");
            }
            lg90 b = or.b(M, -303682241, R.drawable.vk_icon_chevron_down_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            long j = l5g.d;
            String N = d370.N(R.string.music_talkback_player_collapse_player, 0, M);
            q630 E = ahn.E(ra8.a.b(q630.a.a, dt1.a.e), "collapseFullPlayerButton");
            float f = 28;
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new th2(izsVar, 10);
                M.R(x);
            }
            int i3 = i2;
            nzu0.c((gzs) x, b, N, E, f, j, false, null, false, null, null, M, 221248, 1984);
            aVar2 = M;
            b(hVar, izsVar, null, aVar2, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
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
            s.d = new zx9(i, 6, (Object) hVar, izsVar, q630Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(dz40.h hVar, izs izsVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        dz40.h hVar2;
        int i2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-4522685);
        if ((i & 6) == 0) {
            hVar2 = hVar;
            i2 = i | (M.J(hVar2) ? 4 : 2);
        } else {
            hVar2 = hVar;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(izsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (M.t(i3 & 1, (i3 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-4522685, i3, -1, "com.vk.music.stickyplayer.presentation.components.radio.RadioSourceInfo (RadioPlayerHeader.kt:69)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = androidx.compose.runtime.k.b(new q9x(0L));
                M.R(x);
            }
            wh50 wh50Var = (wh50) x;
            M.K(-51320616);
            q630.a aVar3 = q630.a.a;
            float f = 20;
            q630 H = s200.H(txj0.f(aVar3, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            if (hVar2.a()) {
                q630 d = rte0.d(aVar3, vog0.b(8));
                boolean z = (i3 & 112) == 32;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new nyg(izsVar, 3);
                    M.R(x2);
                }
                H = H.g(ojc.c(d, false, null, null, (gzs) x2, 15));
            }
            M.j();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = new cue0(0, wh50Var);
                M.R(x3);
            }
            q630 z2 = sv1.z(H, (izs) x3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, z2);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630Var2 = aVar3;
            yqv0.c(d370.N(hVar2.b(), 0, M), null, l5g.c(14, wlb0.h(M).getText().d, 0.6f), null, null, 0, 0, null, 0, false, 0, 1, null, new frv0(wlb0.l(M).F0.a, true), M, 0, 48, 6138);
            aVar2 = M;
            if (hVar.getTitle() != null) {
                aVar2.K(1672822029);
                eg10.b("«" + hVar.getTitle() + (char) 187, ((q9x) wh50Var.getValue()).a, ahn.E(s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), "sourceTypeTitle"), wlb0.h(aVar2).getText().d, 3, 0, false, 0, wlb0.l(aVar2).P, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, aVar2, 384, 7088);
                aVar2 = aVar2;
            } else {
                aVar2.K(1669274389);
            }
            aVar2.j();
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new lkg(hVar, izsVar, q630Var2, i, 2);
        }
    }
}
