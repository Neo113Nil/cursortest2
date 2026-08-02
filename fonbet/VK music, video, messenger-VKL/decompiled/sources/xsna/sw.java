package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.video.ShowcaseListItem;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder;
import com.vk.core.compose.component.defaults.ContentBadgeAppearance;
import com.vk.core.compose.component.defaults.ContentBadgeMode;
import com.vk.core.compose.component.defaults.ContentBadgeSize;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vkontakte.android.R;
import kotlin.Pair;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ry;
import xsna.us2;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class sw implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ sw(ComposeView composeView, UIBlockVideo uIBlockVideo, VideoShowcaseViewHolder videoShowcaseViewHolder, ShowcaseListItem showcaseListItem) {
        this.c = composeView;
        this.d = uIBlockVideo;
        this.e = videoShowcaseViewHolder;
        this.f = showcaseListItem;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        cri.a.c cVar;
        String str;
        char c;
        long j;
        cri.a.d dVar;
        cri.a.C2678a c2678a;
        q630.a aVar;
        String a;
        androidx.compose.runtime.a aVar2;
        String title;
        int i;
        Image image;
        ImageSize Cb;
        String str2;
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                ((kx) this.c).j((ry.b) this.d, (izs) this.e, (q630) this.f, (androidx.compose.runtime.a) obj, ne7.I(4097));
                return s3q0.a;
            default:
                ComposeView composeView = (ComposeView) this.c;
                UIBlockVideo uIBlockVideo = (UIBlockVideo) this.d;
                VideoShowcaseViewHolder videoShowcaseViewHolder = (VideoShowcaseViewHolder) this.e;
                ShowcaseListItem showcaseListItem = (ShowcaseListItem) this.f;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(230161165, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.showcase.VideoShowcaseViewHolder.createView.<anonymous>.<anonymous>.<anonymous> (VideoShowcaseViewHolder.kt:96)");
                    }
                    float f = 8;
                    uog0 d = vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                    q630.a aVar4 = q630.a.a;
                    q630 d2 = rte0.d(aVar4, d);
                    boolean y = aVar3.y(composeView) | aVar3.y(uIBlockVideo);
                    Object x = aVar3.x();
                    a.C0011a.C0012a c0012a = a.C0011a.a;
                    if (y || x == c0012a) {
                        x = new com.vk.movika.sdk.base.ui.k(27, composeView, uIBlockVideo);
                        aVar3.R(x);
                    }
                    q630 c2 = ojc.c(d2, false, null, null, (gzs) x, 15);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c3 = qri.c(aVar3, c2);
                    cri.h7.getClass();
                    LayoutNode.a aVar5 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    cri.a.c cVar2 = cri.a.f;
                    k9q0.w(aVar3, a2, cVar2);
                    cri.a.e eVar = cri.a.e;
                    k9q0.w(aVar3, D, eVar);
                    Integer valueOf = Integer.valueOf(hashCode);
                    cri.a.b bVar = cri.a.g;
                    k9q0.w(aVar3, valueOf, bVar);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar3, c2678a2);
                    cri.a.d dVar2 = cri.a.d;
                    k9q0.w(aVar3, c3, dVar2);
                    int width = composeView.getWidth();
                    VideoFile videoFile = uIBlockVideo.B;
                    VideoRestriction O = videoFile.O();
                    cp10 d3 = ja8.d(dt1.a.b, false);
                    int hashCode2 = Long.hashCode(n34.n(aVar3));
                    sy90 D2 = aVar3.D();
                    q630 c4 = qri.c(aVar3, aVar4);
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar5);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, d3, cVar2);
                    k9q0.w(aVar3, D2, eVar);
                    ur.d(hashCode2, aVar3, bVar, aVar3, c2678a2);
                    k9q0.w(aVar3, c4, dVar2);
                    if (showcaseListItem == null || (image = showcaseListItem.f) == null || (Cb = image.Cb(width, true, false)) == null || (str2 = Cb.d.d) == null || O != null) {
                        cVar = cVar2;
                        str = null;
                    } else {
                        str = str2;
                        cVar = cVar2;
                    }
                    lg90 l = fwu0.l(str, null, null, null, aVar3, 0, 62);
                    q630 d4 = rte0.d(txj0.d(sua.d(1.7777778f, aVar4, false), 1.0f), vog0.b(f));
                    if (O != null) {
                        aVar3.K(-1177664102);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var.getImage().b;
                        aVar3.j();
                        c = 65535;
                    } else {
                        aVar3.K(-1177661958);
                        if (androidx.compose.runtime.b.d()) {
                            c = 65535;
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        } else {
                            c = 65535;
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar3.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        j = ylu0Var2.getImage().a;
                        aVar3.j();
                    }
                    vjw.a(l, null, hr80.m(d4, j, androidx.compose.ui.graphics.e.a), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar3, 56, 120);
                    ra8 ra8Var = ra8.a;
                    if (O != null) {
                        aVar3.K(2147277100);
                        q630 b = ra8Var.b(aVar4, dt1.a.f);
                        androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.g(kqu0.q), dt1.a.o, aVar3, 48);
                        int hashCode3 = Long.hashCode(n34.n(aVar3));
                        sy90 D3 = aVar3.D();
                        q630 c5 = qri.c(aVar3, b);
                        if (aVar3.N() == null) {
                            n34.r();
                            throw null;
                        }
                        aVar3.H();
                        if (aVar3.L()) {
                            aVar3.I(aVar5);
                        } else {
                            aVar3.f();
                        }
                        k9q0.w(aVar3, a3, cVar);
                        k9q0.w(aVar3, D3, eVar);
                        ur.d(hashCode3, aVar3, bVar, aVar3, c2678a2);
                        k9q0.w(aVar3, c5, dVar2);
                        ImageSize Cb2 = O.g.Cb(width, true, false);
                        pzu0.b(fwu0.l(Cb2 != null ? Cb2.d.d : null, null, null, null, aVar3, 0, 62), O.b, txj0.q(aVar4, 24), wlb0.h(aVar3).getIcon().l, aVar3, 392, 0);
                        c2678a = c2678a2;
                        aVar = aVar4;
                        dVar = dVar2;
                        yqv0.c(O.b, s200.F(kqu0.w, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar4), wlb0.h(aVar3).getText().s, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).s0, aVar3, 0, 0, 8120);
                        aVar2 = aVar3;
                        aVar2.G();
                        aVar2.j();
                    } else {
                        dVar = dVar2;
                        c2678a = c2678a2;
                        aVar = aVar4;
                        aVar3.K(2147371464);
                        ContentBadgeSize contentBadgeSize = ContentBadgeSize.Medium;
                        ContentBadgeMode contentBadgeMode = ContentBadgeMode.Primary;
                        ContentBadgeAppearance.Design design = ContentBadgeAppearance.Design.Overlay;
                        if (showcaseListItem == null || (a = showcaseListItem.e) == null) {
                            a = z8s.a(videoFile.getDuration());
                        }
                        rnu0.c(contentBadgeSize, contentBadgeMode, design, ra8Var.b(s200.D(aVar, kqu0.t), dt1.a.j), null, null, a, null, null, null, false, null, false, null, aVar3, 438, 0, 16304);
                        aVar2 = aVar3;
                        aVar2.j();
                    }
                    aVar2.G();
                    f9t.e(txj0.h(aVar, kqu0.t), aVar2, 0);
                    boolean y2 = aVar2.y(composeView) | aVar2.y(uIBlockVideo) | aVar2.y(videoShowcaseViewHolder);
                    Object x2 = aVar2.x();
                    if (y2 || x2 == c0012a) {
                        x2 = new s9j(composeView, uIBlockVideo, videoShowcaseViewHolder, 6);
                        aVar2.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    androidx.compose.foundation.layout.k a4 = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.k, aVar2, 0);
                    int hashCode4 = Long.hashCode(n34.n(aVar2));
                    sy90 D4 = aVar2.D();
                    q630 c6 = qri.c(aVar2, aVar);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar5);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a4, cVar);
                    k9q0.w(aVar2, D4, eVar);
                    ur.d(hashCode4, aVar2, bVar, aVar2, c2678a);
                    k9q0.w(aVar2, c6, dVar);
                    ShowcaseListItem showcaseListItem2 = uIBlockVideo.G;
                    if (showcaseListItem2 == null || (title = showcaseListItem2.c) == null) {
                        title = videoFile.getTitle();
                    }
                    String str3 = title;
                    frv0 frv0Var = wlb0.l(aVar2).h0;
                    long j2 = wlb0.h(aVar2).getText().m;
                    if (1.0f <= ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
                        szw.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.runtime.a aVar6 = aVar2;
                    yqv0.c(str3, new xpy(1.0f, true), j2, null, null, 0, 0, null, 2, false, 0, 2, null, frv0Var, aVar6, 100663296, 48, 5880);
                    androidx.compose.runtime.a aVar7 = aVar6;
                    if (videoFile.O() == null) {
                        aVar7.K(-582728655);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1608244924, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-MoreHorizontal16> (VkSdkIcons.kt:2614)");
                        }
                        lg90 b2 = or.b(aVar7, 864521636, R.drawable.vk_icon_more_horizontal_16, aVar7, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        i = 16;
                        nzu0.c(gzsVar, b2, d370.N(R.string.common_actions, 0, aVar7), txj0.v(txj0.h(aVar, 16), 32), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, wlb0.h(aVar7).getIcon().j, false, null, false, null, null, aVar7, 3136, 2000);
                        aVar7 = aVar7;
                    } else {
                        i = 16;
                        aVar7.K(-593006147);
                    }
                    aVar7.j();
                    aVar7.G();
                    if (videoShowcaseViewHolder.b) {
                        aVar7.K(42426688);
                        frv0 frv0Var2 = wlb0.l(aVar7).s0;
                        long j3 = wlb0.h(aVar7).getText().p;
                        us2.b bVar2 = new us2.b();
                        String P = videoFile.P();
                        if (P == null) {
                            P = "";
                        }
                        bVar2.g(P);
                        if (videoFile.Y().b) {
                            s0x.a(bVar2, "verified", "�");
                        }
                        us2 n = bVar2.n();
                        Pair[] pairArr = {new Pair("verified", new r0x(new esa0(l2l0.l(20), l2l0.l(i), 6), kai.c(-1476015786, new ogt0(uIBlockVideo), aVar7)))};
                        f0a0 f0a0Var = f0a0.e;
                        f0a0Var.getClass();
                        g0a0 g0a0Var = new g0a0(f0a0Var);
                        pn00.r(g0a0Var, pairArr);
                        vy90 d5 = g0a0Var.e.d();
                        f0a0 f0a0Var2 = g0a0Var.b;
                        vy90 vy90Var = f0a0Var2.d;
                        f0a0 f0a0Var3 = f0a0Var2;
                        if (d5 != vy90Var) {
                            f0a0Var3 = new f0a0(g0a0Var.c, g0a0Var.d, d5);
                        }
                        f0a0 f0a0Var4 = f0a0Var3;
                        g0a0Var.b = f0a0Var4;
                        androidx.compose.runtime.a aVar8 = aVar7;
                        yqv0.d(n, s200.H(aVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), j3, 0, null, 0, false, 0, null, f0a0Var4, frv0Var2, aVar8, 48, 0, 4088);
                        aVar7 = aVar8;
                    } else {
                        aVar7.K(35396415);
                    }
                    aVar7.j();
                    aVar7.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ sw(kx kxVar, ry.b bVar, izs izsVar, q630 q630Var, int i) {
        this.c = kxVar;
        this.d = bVar;
        this.e = izsVar;
        this.f = q630Var;
    }
}
