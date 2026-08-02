package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.libvideo.design.compose.base.datacontent.presets.VideoMetaViewState;
import com.vk.libvideo.design.compose.base.preview.PreviewViewState;
import com.vk.libvideo.design.compose.video.videocell.VideoCellViewState;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.cri;
import xsna.dai;
import xsna.dt1;
import xsna.mno0;
import xsna.q630;
import xsna.rmw;

/* compiled from: EpisodeFullCardState.kt */
/* loaded from: classes2.dex */
public final class zsp {
    public static final void a(ysp yspVar, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        q630 q630Var2;
        q630 q630Var3;
        cri.a.e eVar;
        androidx.compose.runtime.a aVar2;
        String str;
        LayoutNode.a aVar3;
        ra8 ra8Var;
        q630.a aVar4;
        boolean z = yspVar.f;
        androidx.compose.runtime.a M = aVar.M(1130068988);
        int i2 = i | (M.J(yspVar) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1130068988, i2, -1, "com.vk.libvideo.bottomsheet.episode.EpisodeFullCard (EpisodeFullCardState.kt:77)");
            }
            int i3 = i2 & 14;
            boolean z2 = i3 == 4;
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (z2 || x == c0012a) {
                x = new VideoCellViewState(new PreviewViewState(new q020(new rmw.h(yspVar.a), null, yspVar.d, yspVar.e, new pco(kqu0.e), VkColorToken.BackgroundSecondaryAlpha, false, 402), null, null, null, null, null, 1.7777778f, 510), new VideoCellViewState.g(new VideoMetaViewState(new VideoMetaViewState.i(new mno0.i(yspVar.b), 2), new VideoMetaViewState.a(null, null, null, false, null, new mno0.i(yspVar.c), null, 0, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE), 4)), new VideoCellViewState.c(new rmw.d(R.drawable.vk_icon_share_outline_24)), null, null, 24);
                M.R(x);
            }
            VideoCellViewState videoCellViewState = (VideoCellViewState) x;
            videoCellViewState.f().c(VideoCellViewState.Size.Small, M, 6);
            dai.c d = videoCellViewState.d();
            boolean z3 = i3 == 4;
            Object x2 = M.x();
            if (z3 || x2 == c0012a) {
                x2 = new qfj(yspVar, 5);
                M.R(x2);
            }
            d.c((gzs) x2, M, 0);
            VideoCellViewState.c a = videoCellViewState.a();
            dai.c a2 = a != null ? a.a() : null;
            if (a2 == null) {
                M.K(1933016863);
                M.j();
            } else {
                M.K(-630381278);
                boolean z4 = i3 == 4;
                Object x3 = M.x();
                if (z4 || x3 == c0012a) {
                    x3 = new h20(yspVar, 26);
                    M.R(x3);
                }
                a2.c((gzs) x3, M, 0);
                M.j();
                s3q0 s3q0Var = s3q0.a;
            }
            e.a aVar5 = androidx.compose.ui.graphics.e.a;
            q630.a aVar6 = q630.a.a;
            if (z) {
                M.K(1933159991);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630Var3 = hr80.m(aVar6, ylu0Var.getBackground().z, aVar5);
                M.j();
            } else {
                M.K(1933274102);
                M.j();
                q630Var3 = aVar6;
            }
            float f = 16;
            q630 E = s200.E(q630Var3, f, 6);
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, d2, cVar);
            cri.a.e eVar2 = cri.a.e;
            k9q0.w(M, D, eVar2);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            com.vk.libvideo.design.compose.video.videocell.a.g(videoCellViewState, null, M, 0, 2);
            ra8 ra8Var2 = ra8.a;
            if (z) {
                M.K(32378883);
                ra8Var = ra8Var2;
                q630 d3 = rte0.d(sua.d(1.7777778f, txj0.v(ra8Var2.b(aVar6, dt1.a.e), 142), false), vog0.b(kqu0.e));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                }
                ylu0 ylu0Var2 = (ylu0) M.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m = hr80.m(d3, ylu0Var2.j().a, aVar5);
                cp10 d4 = ja8.d(dt1.a.f, false);
                int hashCode2 = Long.hashCode(n34.n(M));
                sy90 D2 = M.D();
                q630 c2 = qri.c(M, m);
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
                k9q0.w(M, d4, cVar);
                k9q0.w(M, D2, eVar2);
                ur.d(hashCode2, M, bVar, M, c2678a);
                k9q0.w(M, c2, dVar);
                aVar4 = aVar6;
                eVar = eVar2;
                aVar2 = M;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                aVar3 = aVar7;
                ltp.a(yspVar.g, yspVar.i, txj0.q(aVar6, f), 0L, aVar2, 384);
                aVar2.G();
            } else {
                eVar = eVar2;
                aVar2 = M;
                str = "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)";
                aVar3 = aVar7;
                ra8Var = ra8Var2;
                aVar4 = aVar6;
                aVar2.K(27449728);
            }
            aVar2.j();
            if (!yspVar.h || z) {
                M = aVar2;
                q630Var2 = aVar4;
                M.K(27449728);
            } else {
                aVar2.K(33101865);
                q630 d5 = rte0.d(sua.d(1.7777778f, txj0.v(ra8Var.b(aVar4, dt1.a.e), 142), false), vog0.b(kqu0.e));
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1040687336, 0, -1, str);
                }
                ylu0 ylu0Var3 = (ylu0) aVar2.r(rrv0.a);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                q630 m2 = hr80.m(d5, ylu0Var3.j().b, aVar5);
                ty6 ty6Var = dt1.a.f;
                cp10 d6 = ja8.d(ty6Var, false);
                int hashCode3 = Long.hashCode(n34.n(aVar2));
                sy90 D3 = aVar2.D();
                q630 c3 = qri.c(aVar2, m2);
                if (aVar2.N() == null) {
                    n34.r();
                    throw null;
                }
                aVar2.H();
                if (aVar2.L()) {
                    aVar2.I(aVar3);
                } else {
                    aVar2.f();
                }
                k9q0.w(aVar2, d6, cVar);
                k9q0.w(aVar2, D3, eVar);
                ur.d(hashCode3, aVar2, bVar, aVar2, c2678a);
                k9q0.w(aVar2, c3, dVar);
                q630Var2 = aVar4;
                M = aVar2;
                r0v0.a(pg90.a(R.drawable.vk_icon_globe_cross_outline_20, 0, aVar2), txj0.q(aVar4, 20), ty6Var, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, null, M, 440, 248);
                M.G();
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new jn7(yspVar, q630Var2, i, 5);
        }
    }
}
