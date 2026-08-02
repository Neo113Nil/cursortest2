package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class psp implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ psp(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                rsp rspVar = (rsp) this.c;
                q630 q630Var = (q630) obj;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar.J(q630Var) ? 4 : 2;
                }
                if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-476075349, intValue, -1, "com.vk.libvideo.bottomsheet.episode.EpisodeCompactCard.<anonymous> (EpisodeCard.kt:134)");
                    }
                    qsp.b(rspVar.c, s200.H(q630Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                gzs gzsVar = (gzs) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1740740687, intValue2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeContentView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ReviewFriendsComposeContentView.kt:103)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630.a aVar3 = q630.a.a;
                    q630 c = qri.c(aVar2, aVar3);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar2, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar2, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar2, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar2, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar2, c, dVar);
                    f9t.e(txj0.h(aVar3, 22), aVar2, 6);
                    float f = 16;
                    q630 H = s200.H(txj0.f(aVar3, 1.0f), f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
                    androidx.compose.foundation.layout.k a2 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.g, dt1.a.k, aVar2, 6);
                    int hashCode2 = Long.hashCode(n34.n(aVar2));
                    sy90 D2 = aVar2.D();
                    q630 c2 = qri.c(aVar2, H);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar4);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a2, cVar);
                    k9q0.w(aVar2, D2, eVar);
                    ur.d(hashCode2, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c2, dVar);
                    yqv0.c(d370.N(R.string.liblists_err_text, 0, aVar2), null, wlb0.h(aVar2).getText().p, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).p1, aVar2, 0, 0, 8186);
                    yqv0.c(d370.N(R.string.liblists_retry, 0, aVar2), ojc.c(aVar3, false, null, null, gzsVar, 15), wlb0.h(aVar2).getText().c, null, null, 0, 0, null, 0, false, 0, 0, null, wlb0.l(aVar2).e0, aVar2, 0, 0, 8184);
                    if (kr.f(aVar2)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                izs izsVar = (izs) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar5.l(booleanValue) ? 4 : 2;
                }
                if (aVar5.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(533416258, intValue3, -1, "com.vk.music.stickyplayer.presentation.components.PlayPauseTrackButton.<anonymous> (VkAppBottomPlayer.kt:237)");
                    }
                    q630.a aVar6 = q630.a.a;
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (booleanValue) {
                        aVar5.K(-375201102);
                        q630 E = ahn.E(aVar6, "pauseBtn");
                        qzu0.a.getClass();
                        lg90 V0 = qzu0.V0(aVar5);
                        String N = d370.N(R.string.music_talkback_player_pause, 0, aVar5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J = aVar5.J(izsVar);
                        Object x = aVar5.x();
                        if (J || x == c0012a) {
                            x = new h74(izsVar, 7);
                            aVar5.R(x);
                        }
                        nzu0.c((gzs) x, V0, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar5, 3136, 2000);
                        aVar5.j();
                    } else {
                        aVar5.K(-374736939);
                        q630 E2 = ahn.E(aVar6, "playBtn");
                        qzu0.a.getClass();
                        lg90 d1 = qzu0.d1(aVar5);
                        String N2 = d370.N(R.string.music_talkback_player_play, 0, aVar5);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar5.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().a;
                        boolean J2 = aVar5.J(izsVar);
                        Object x2 = aVar5.x();
                        if (J2 || x2 == c0012a) {
                            x2 = new i74(izsVar, 5);
                            aVar5.R(x2);
                        }
                        nzu0.c((gzs) x2, d1, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar5, 3136, 2000);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }
}
