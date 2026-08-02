package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.group.header.f;
import com.vk.music.ui.subscription.BuyMusicSubscriptionComposeButtonKt;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;
import xsna.wkj;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ywq implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ywq(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                axq axqVar = (axq) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (aVar.t(intValue & 1, (intValue & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-851233279, intValue, -1, "com.vk.design.demo.presentation.screens.feed.FeedAvatarAnimatedStackScreenContent.AvatarAnimatedStackList.<anonymous>.<anonymous>.<anonymous> (FeedAvatarAnimatedStackScreenContent.kt:72)");
                    }
                    axqVar.j("Текстом и анимация", aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                v0r v0rVar = (v0r) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2058228640, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:74)");
                    }
                    aVar2.K(2022203106);
                    aVar2.j();
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, q630.a.a);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
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
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    v0rVar.b(0, aVar2);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            default:
                izs izsVar = (izs) this.c;
                s890 s890Var = (s890) obj;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= aVar4.J(s890Var) ? 4 : 2;
                }
                if (aVar4.t(intValue3 & 1, (intValue3 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(425049791, intValue3, -1, "com.vk.music.ui.subscription.MusicBuySubscription.<anonymous>.<anonymous>.<anonymous> (MusicBuySubscription.kt:95)");
                    }
                    q630.a aVar5 = q630.a.a;
                    q630 C = s200.C(aVar5, s890Var);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    ty6.a aVar6 = dt1.a.n;
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar4, 0);
                    int hashCode2 = Long.hashCode(n34.n(aVar4));
                    sy90 D2 = aVar4.D();
                    q630 c2 = qri.c(aVar4, C);
                    cri.h7.getClass();
                    LayoutNode.a aVar7 = cri.a.b;
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar7);
                    } else {
                        aVar4.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar4, a, cVar);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar4, D2, eVar);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar4, valueOf, bVar);
                    cri.a.C2678a c2678a = cri.a.h;
                    k9q0.t(aVar4, c2678a);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar4, c2, dVar);
                    q630 d2 = txj0.d(aVar5, 1.0f);
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    q630 D3 = p490.D(defpackage.j0.d(1.0f, d2, true), p490.x(aVar4), 14);
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, aVar6, aVar4, 0);
                    int hashCode3 = Long.hashCode(n34.n(aVar4));
                    sy90 D4 = aVar4.D();
                    q630 c3 = qri.c(aVar4, D3);
                    if (aVar4.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar4.H();
                    if (aVar4.L()) {
                        aVar4.I(aVar7);
                    } else {
                        aVar4.f();
                    }
                    k9q0.w(aVar4, a2, cVar);
                    k9q0.w(aVar4, D4, eVar);
                    ur.d(hashCode3, aVar4, bVar, aVar4, c2678a);
                    k9q0.w(aVar4, c3, dVar);
                    vjw.a(pg90.a(R.drawable.illustration_vk_music_headphones_220h, 0, aVar4), "", txj0.h(txj0.f(aVar5, 1.0f), Sdk.SDKError.Reason.AD_RESPONSE_RETRY_AFTER_VALUE), null, wkj.a.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 25016, 104);
                    String N = d370.N(R.string.music_subscription_paywall_header, 0, aVar4);
                    Object x = aVar4.x();
                    if (x == a.C0011a.a) {
                        x = new j0r(10);
                        aVar4.R(x);
                    }
                    com.vk.core.compose.component.group.header.g.b(f.a.a(N, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), null, false, aVar4, 805306368, 446), null, null, null, null, null, false, aVar4, 0, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    sc40.c(0, aVar4);
                    aVar4.G();
                    q630 f = txj0.f(aVar5, 1.0f);
                    float f2 = 16;
                    BuyMusicSubscriptionComposeButtonKt.a(s200.E(f, f2, f2), null, null, null, null, izsVar, aVar4, 6, 30);
                    aVar4.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
        }
    }
}
