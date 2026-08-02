package xsna;

import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.ui.UIBlockLink;
import com.vk.catalog2.feature.music.holders.MusicGridLinkVh;
import com.vk.dto.discover.carousel.apps.AppCarousel;
import com.vk.dto.discover.carousel.apps.AppCarouselItem;
import com.vk.dto.music.reactions.Reaction;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.video.ui.upload.impl.settings.presentation.fragment.SettingsFragmentInternalComponent;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.oy20;
import xsna.py20;
import xsna.q630;
import xsna.qy20;
import xsna.vp1;
import xsna.vt4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class nq1 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nq1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        AppCarousel appCarousel;
        int i = this.b;
        q630.a aVar = q630.a.a;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.logic.interactor.p) obj3).invoke(new vp1.i((Throwable) obj, ((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 1:
                ((hu4) obj3).c.invoke(new vt4.a((Reaction) obj, !((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 2:
                jyh jyhVar = (jyh) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1340439979, intValue, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.bottomsheet.CommunityReviewsBuySubscriptionInfoDialog.<anonymous> (CommunityReviewsBuySubscriptionInfoDialog.kt:34)");
                    }
                    String str = jyhVar.h;
                    String str2 = jyhVar.i;
                    String str3 = jyhVar.j;
                    c5f c5fVar = jyhVar.l;
                    CharSequence charSequence = jyhVar.k;
                    wcg wcgVar = jyhVar.m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-898740894, 0, -1, "com.vk.ecomm.reviews.impl.communities.reviews.presentation.view.bottomsheet.CommunityReviewsBuySubscriptionInfoDialog.CommunityReviewsBuySubscriptionInfoDialogContent (CommunityReviewsBuySubscriptionInfoDialog.kt:55)");
                    }
                    q630 f = txj0.f(aVar, 1.0f);
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c = qri.c(aVar2, f);
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
                    k9q0.w(aVar2, a, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c, cri.a.d);
                    qzu0.a.getClass();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1500323682, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-PinOutline56> (VkIcons.kt:8770)");
                    }
                    lg90 a2 = pg90.a(R.drawable.vk_icon_pin_outline_56, 0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    e5v0.b(null, qy20.c.a.a(a2, wlb0.h(aVar2).getIcon().a, null, aVar2, 4), py20.a.a(384, 0, aVar2, str, str2), null, oy20.b.a(oy20.a.C3478a.a(str3, c5fVar, null, null, null, null, aVar2, 0, 8188), null, false, aVar2, 6), aVar2, 0, 25);
                    float f2 = 16;
                    q630 H = s200.H(txj0.f(aVar, 1.0f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, 20, 2);
                    boolean J = aVar2.J(wcgVar);
                    Object x = aVar2.x();
                    Object obj4 = x;
                    if (J || x == c0012a) {
                        iyh iyhVar = new iyh(wcgVar, 0);
                        aVar2.R(iyhVar);
                        obj4 = iyhVar;
                    }
                    yqv0.d(ws2.d(charSequence, (izs) obj4), H, wlb0.h(aVar2).getText().p, 3, null, 0, false, 0, null, null, wlb0.l(aVar2).s0, aVar2, 48, 0, 8120);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                t8s.l((v1z) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((bft) obj3).co(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((dqw) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i2 = MarketEditAlbumGoodsFragment.c1;
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-898657767, intValue2, -1, "com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment.initTopBar.<anonymous>.<anonymous> (MarketEditAlbumGoodsFragment.kt:291)");
                    }
                    boolean z = marketEditAlbumGoodsFragment.a1;
                    Object x2 = aVar4.x();
                    if (x2 == c0012a) {
                        x2 = new nly(marketEditAlbumGoodsFragment, 3);
                        aVar4.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    Object x3 = aVar4.x();
                    if (x3 == c0012a) {
                        x3 = new bzj(marketEditAlbumGoodsFragment, 26);
                        aVar4.R(x3);
                    }
                    l1p.a(z, gzsVar, (gzs) x3, txj0.f(ahn.E(aVar, "edit_storefront_album_edit_products_top_bar"), 1.0f), aVar4, X2.b.f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 7:
                yq20 yq20Var = (yq20) obj3;
                Integer num = (Integer) obj;
                int intValue3 = num.intValue();
                Integer num2 = (Integer) obj2;
                num2.getClass();
                vq20 vq20Var = (vq20) yq20Var.C;
                if (vq20Var != null && (appCarousel = vq20Var.i) != null && intValue3 <= e43.h(appCarousel.o) && intValue3 >= 0) {
                    AppCarouselItem appCarouselItem = appCarousel.o.get(intValue3);
                    appCarousel.q.add(num);
                    yq20Var.c7(appCarouselItem, appCarousel, num2);
                }
                return s3q0.a;
            case 8:
                c430 c430Var = (c430) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                int i3 = c430.h1;
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(338098731, intValue4, -1, "com.vk.ecomm.moderation.impl.restrictions.dialogs.ModerationAvailableOnlyForAdultDialog.ThemedContent.<anonymous> (ModerationAvailableOnlyForAdultDialog.kt:33)");
                    }
                    c430Var.eo(8, aVar5);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 9:
                return new c98(new rk7((UIBlockLink) obj2, (MusicGridLinkVh) obj3, (View) obj, r9 ? 1 : 0), r9 ? 1 : 0);
            case 10:
                fgb0 fgb0Var = (fgb0) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1338685084, intValue5, -1, "com.vk.music.stickyplayer.presentation.components.podcast.PodcastBigPlayerControls.Content.<anonymous> (PodcastBigPlayerControls.kt:38)");
                    }
                    fgb0Var.e(0, aVar6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 11:
                ((y8c0) obj3).g.invoke(new nbg(((Boolean) obj2).booleanValue()));
                return s3q0.a;
            case 12:
                ((sti) obj).a(new s0j0(((SettingsFragmentInternalComponent) obj3).a.a, (sl50) obj2));
                return s3q0.a;
            default:
                ((Integer) obj).intValue();
                return Boolean.valueOf(epx.f(((StoriesContainer) obj3).Ob(), ((StoriesContainer) obj2).Ob()));
        }
    }

    public /* synthetic */ nq1(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
