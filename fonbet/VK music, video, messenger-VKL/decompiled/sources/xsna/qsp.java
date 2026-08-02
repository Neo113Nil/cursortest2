package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocard.VideoCardViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;
import xsna.wkj;

/* compiled from: EpisodeCard.kt */
/* loaded from: classes2.dex */
public final class qsp {
    public static final void a(rsp rspVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        String str;
        wkj wkjVar;
        dt1 dt1Var;
        cri.a.d dVar;
        Throwable th;
        q630.a aVar2;
        cri.a.e eVar;
        cri.a.C2678a c2678a;
        cri.a.b bVar;
        LayoutNode.a aVar3;
        cri.a.c cVar;
        int i2;
        q630.a aVar4;
        int i3 = rspVar.d;
        androidx.compose.runtime.a M = aVar.M(1571335077);
        int i4 = i | (M.J(rspVar) ? 4 : 2);
        if (M.t(i4 & 1, (i4 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1571335077, i4, -1, "com.vk.libvideo.bottomsheet.episode.EpisodeCompactCard (EpisodeCard.kt:102)");
            }
            nwo0 nwo0Var = rspVar.h;
            if (nwo0Var == null || (str = nwo0Var.b(i3)) == null) {
                str = rspVar.a;
            }
            if (nwo0Var == null || (wkjVar = nwo0Var.e) == null) {
                wkjVar = wkj.a.a;
            }
            wkj wkjVar2 = wkjVar;
            if (nwo0Var == null || (dt1Var = nwo0Var.a(i3)) == null) {
                dt1.a.getClass();
                dt1Var = dt1.a.f;
            }
            dt1 dt1Var2 = dt1Var;
            boolean z = (i4 & 14) == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z || x == c0012a) {
                VideoCardViewState videoCardViewState = new VideoCardViewState(new PreviewViewState(new q020(new rmw.h(str), null, wkjVar2, dt1Var2, new pco(kqu0.e), VkColorToken.BackgroundSecondaryAlpha, false, 402), null, null, null, null, null, 1.7777778f, 510), new VideoCardViewState.c(null, new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i(rspVar.b), 2), (VideoMetaViewState.g) null, 6), null, null));
                M.R(videoCardViewState);
                x = videoCardViewState;
            }
            VideoCardViewState videoCardViewState2 = (VideoCardViewState) x;
            videoCardViewState2.d().c(VideoCardViewState.Size.Small, M, 6);
            dai.b b = videoCardViewState2.b();
            String str2 = rspVar.c;
            Object c = kai.c(-476075349, new psp(rspVar, 0), M);
            boolean J = M.J(str2);
            Object x2 = M.x();
            if (J || x2 == c0012a) {
                M.R(c);
            } else {
                c = x2;
            }
            b.c((yzs) c, M, 0);
            float f = 6;
            q630 d = rte0.d(txj0.v(q630Var, Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE), vog0.b(f));
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = ir.h(M);
            }
            q630 b2 = ojc.b(d, (sg50) x3, qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 7, 0L, false), false, null, rspVar.j, 28);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c2 = qri.c(M, b2);
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
            cri.a.c cVar2 = cri.a.f;
            k9q0.w(M, a, cVar2);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar2 = cri.a.g;
            k9q0.w(M, valueOf, bVar2);
            cri.a.C2678a c2678a2 = cri.a.h;
            k9q0.t(M, c2678a2);
            cri.a.d dVar2 = cri.a.d;
            k9q0.w(M, c2, dVar2);
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630.a aVar6 = q630.a.a;
            q630 c3 = qri.c(M, aVar6);
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
            k9q0.w(M, d2, cVar2);
            k9q0.w(M, D2, eVar2);
            ur.d(hashCode2, M, bVar2, M, c2678a2);
            k9q0.w(M, c3, dVar2);
            com.vk.libvideo.design.compose.video.videocard.a.d(videoCardViewState2, null, M, 0, 2);
            if (rspVar.g) {
                M.K(1005753066);
                q630 d3 = rte0.d(sua.d(1.7777778f, txj0.f(aVar6, 1.0f), false), vog0.b(kqu0.e));
                th = null;
                ty6 ty6Var = dt1.a.f;
                cp10 d4 = ja8.d(ty6Var, false);
                int hashCode3 = Long.hashCode(n34.n(M));
                sy90 D3 = M.D();
                q630 c4 = qri.c(M, d3);
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
                k9q0.w(M, d4, cVar2);
                k9q0.w(M, D3, eVar2);
                ur.d(hashCode3, M, bVar2, M, c2678a2);
                k9q0.w(M, c4, dVar2);
                bVar = bVar2;
                dVar = dVar2;
                cVar = cVar2;
                aVar2 = aVar6;
                eVar = eVar2;
                c2678a = c2678a2;
                aVar3 = aVar5;
                i2 = 1000085057;
                r0v0.a(pg90.a(R.drawable.vk_icon_globe_cross_outline_20, 0, M), txj0.q(aVar6, 20), ty6Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 440, 248);
                M.G();
            } else {
                dVar = dVar2;
                th = null;
                aVar2 = aVar6;
                eVar = eVar2;
                c2678a = c2678a2;
                bVar = bVar2;
                aVar3 = aVar5;
                cVar = cVar2;
                i2 = 1000085057;
                M.K(1000085057);
            }
            M.j();
            if (rspVar.e) {
                M.K(1006425084);
                aVar4 = aVar2;
                q630 m = hr80.m(rte0.d(sua.d(1.7777778f, txj0.f(aVar4, 1.0f), false), vog0.b(kqu0.e)), l5g.c(14, l5g.b, 0.45f), androidx.compose.ui.graphics.e.a);
                cp10 d5 = ja8.d(dt1.a.f, false);
                int hashCode4 = Long.hashCode(n34.n(M));
                sy90 D4 = M.D();
                q630 c5 = qri.c(M, m);
                if (M.N() == null) {
                    n34.r();
                    throw th;
                }
                M.H();
                if (M.L()) {
                    M.I(aVar3);
                } else {
                    M.f();
                }
                k9q0.w(M, d5, cVar);
                k9q0.w(M, D4, eVar);
                ur.d(hashCode4, M, bVar, M, c2678a);
                k9q0.w(M, c5, dVar);
                ltp.a(rspVar.f, rspVar.i, txj0.q(aVar4, 16), 0L, M, 384);
                M.G();
            } else {
                aVar4 = aVar2;
                M.K(i2);
            }
            M.j();
            M.G();
            f9t.e(txj0.h(aVar4, f), M, 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jkd(rspVar, q630Var, i, 3);
        }
    }

    public static final void b(String str, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-933616395);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.J(q630Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-933616395, i2, -1, "com.vk.libvideo.bottomsheet.episode.EpisodeDuration (EpisodeCard.kt:50)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.s0;
            long j = l5g.d;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(str, s200.E(hr80.m(q630Var, ylu0Var.getBackground().z, vog0.b(4)), 8, 3), j, null, null, 0, 0, null, 0, false, 0, 0, null, frv0Var, M, (i2 & 14) | 384, 0, 8184);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qm7(str, q630Var, i, 3);
        }
    }
}
