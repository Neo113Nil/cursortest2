package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.d;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.decoration.ClipsFeedDecorationPayload;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.core.compose.component.defaults.SpinnerState;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import kotlin.Pair;
import xsna.b78;
import xsna.cri;
import xsna.dt1;
import xsna.f0r;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hx9 implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hx9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar = q630.a.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                mtk0 mtk0Var = (mtk0) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                int intValue = ((Integer) obj3).intValue();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1885956577, intValue, -1, "com.vk.ecomm.cart.impl.common.ui.compose.map.CartMapLoadingForeground.<anonymous> (CartMapLoadingForeground.kt:37)");
                }
                q630 m = hr80.m(aVar, ((l5g) mtk0Var.getValue()).a, androidx.compose.ui.graphics.e.a);
                Object x = aVar2.x();
                if (x == c0012a) {
                    x = new n1(10);
                    aVar2.R(x);
                }
                q630 c = ojc.c(m, false, null, null, (gzs) x, 14);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(aVar2));
                sy90 D = aVar2.D();
                q630 c2 = qri.c(aVar2, c);
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
                k9q0.w(aVar2, c2, cri.a.d);
                zfr0.f(SpinnerState.Loading, ra8.a.b(aVar, dt1.a.f), null, 0L, null, null, aVar2, 6, 60);
                aVar2.G();
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                return s3q0.a;
            case 1:
                f0r.b bVar = (f0r.b) obj4;
                Pair pair = (Pair) obj;
                bpd bpdVar = (bpd) obj2;
                bpd bpdVar2 = (bpd) obj3;
                PaginationKey paginationKey = bpdVar.c;
                List<Pair<SdkVideoFile, ClipsFeedDecorationPayload>> list = bpdVar.a;
                PaginationKey paginationKey2 = epx.f(paginationKey, PaginationKey.LoadedFull.b) ? PaginationKey.Initial.b : bpdVar.c;
                bVar.g.invoke(Integer.valueOf(list.size()));
                return new bpd(c5g.v(e43.l(bpdVar2.a, Collections.singletonList(pair), list)), bpdVar2.b, paginationKey2);
            case 2:
                v0r v0rVar = (v0r) obj4;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-170368283, intValue2, -1, "com.vk.design.demo.presentation.screens.feed.FeedInlineCommentsScreenContent.InlineCommentsList.<anonymous>.<anonymous>.<anonymous> (FeedInlineCommentsScreenContent.kt:124)");
                    }
                    v0rVar.n("аватар + имя + текст + вложение", aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 3:
                d.b bVar2 = (d.b) obj4;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 17) != 16)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(612619024, intValue3, -1, "com.vk.catalog2.common.ui.mvp.holder.video.playlist.search.PlaylistInfo.<anonymous>.<anonymous>.<anonymous> (SearchPlaylistCard.kt:298)");
                    }
                    lg90 lg90Var = bVar2.b.c;
                    if (lg90Var == null) {
                        aVar5.K(1217383261);
                        aVar5.j();
                    } else {
                        aVar5.K(1217383262);
                        pzu0.b(lg90Var, null, s200.H(txj0.q(aVar, 16), 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 0L, aVar5, 440, 8);
                        aVar5.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                b78.i iVar = (b78.i) obj4;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= aVar6.l(booleanValue) ? 4 : 2;
                }
                if (aVar6.t(intValue4 & 1, (intValue4 & 19) != 18)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-945064765, intValue4, -1, "com.vk.music.stickyplayer.presentation.components.RadioButtons.<anonymous>.<anonymous> (VkAppBottomPlayer.kt:703)");
                    }
                    if (booleanValue) {
                        aVar6.K(-913731049);
                        q630 E = ahn.E(aVar, "nextBtn");
                        qzu0.a.getClass();
                        lg90 o1 = qzu0.o1(aVar6);
                        String N = d370.N(R.string.music_talkback_player_radio_go_forward, 0, aVar6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j = ylu0Var.getIcon().a;
                        boolean J = aVar6.J(iVar);
                        Object x2 = aVar6.x();
                        if (J || x2 == c0012a) {
                            x2 = new hri0(iVar, 17);
                            aVar6.R(x2);
                        }
                        nzu0.c((gzs) x2, o1, N, E, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j, false, null, false, null, null, aVar6, 3136, 2000);
                        aVar6.j();
                    } else {
                        aVar6.K(-913210094);
                        q630 E2 = ahn.E(aVar, "closeBtn");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1243383292, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Cancel24> (VkSdkIcons.kt:226)");
                        }
                        lg90 b = or.b(aVar6, 1833859693, R.drawable.vk_icon_cancel_24, aVar6, 0);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        String N2 = d370.N(R.string.ui_accessibility_close, 0, aVar6);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar6.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        long j2 = ylu0Var2.getIcon().l;
                        boolean J2 = aVar6.J(iVar);
                        Object x3 = aVar6.x();
                        if (J2 || x3 == c0012a) {
                            x3 = new mll0(iVar, 16);
                            aVar6.R(x3);
                        }
                        nzu0.c((gzs) x3, b, N2, E2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, j2, false, null, false, null, null, aVar6, 3136, 2000);
                        aVar6.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
        }
    }
}
