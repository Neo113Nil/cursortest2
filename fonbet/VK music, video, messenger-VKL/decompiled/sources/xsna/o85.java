package xsna;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockHeader;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.sdk.shared.feed.analytics.ClipViewerAnalyticsEvent;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.profile.design.view.onboarding.UserProfileOnBoardingBannerView;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.cri;
import xsna.dt1;
import xsna.loh0;
import xsna.q630;
import xsna.qvq;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class o85 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o85(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ColorFilter porterDuffColorFilter;
        int i = this.b;
        q630.a aVar = q630.a.a;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                rv5 rv5Var = (rv5) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(35006354, intValue, -1, "com.vk.profile.design.compose.header.content.measureBlurPlaceable.<anonymous> (AuthorHeaderHeaderContent.kt:403)");
                    }
                    d95.b(rv5Var, f370.P(txj0.f(aVar, 1.0f), 1.0f), aVar2, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ((qo7) obj3).a(aVar, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                xn50.a.c((d8e) obj3, new qvq.e((String) obj, (ClipViewerAnalyticsEvent.FloatingButtonEvent.EventType) obj2));
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                r1h.d((loh0.d.b) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj).getClass();
                zak0 zak0Var = (zak0) ((f1i) obj3).j1;
                VkGroupsSearchParams copy = ((VkGroupsSearchParams) zak0Var.getValue()).copy();
                copy.c = (VkGroupsSearchParams.CommunityType) obj2;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                xeo.a((izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                ((Integer) obj2).getClass();
                ((v0r) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                ((zdo0) obj3).d(((ov70) obj2).a);
                return s3q0.a;
            case 8:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj3;
                if (((Boolean) obj2).booleanValue()) {
                    xo2.f(marketItemReviewRepliesFragment.W, true, true, 300L);
                } else {
                    ComposeView composeView = marketItemReviewRepliesFragment.W;
                    if (composeView != null) {
                        composeView.postDelayed(marketItemReviewRepliesFragment.R, 400L);
                    }
                }
                return s3q0.a;
            case 9:
                StoryArchiveRecyclerPaginatedView storyArchiveRecyclerPaginatedView = (StoryArchiveRecyclerPaginatedView) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                int i3 = StoryArchiveRecyclerPaginatedView.P;
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(402903470, intValue2, -1, "com.vk.story.archive.impl.presentation.list.StoryArchiveRecyclerPaginatedView.createEmptyView.<anonymous>.<anonymous> (StoryArchiveRecyclerPaginatedView.kt:44)");
                    }
                    q630 d = txj0.d(aVar, 1.0f);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.e, dt1.a.o, aVar3, 54);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, d);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    lg90 a2 = pg90.a(R.drawable.vk_icon_history_outline_56, 0, aVar3);
                    long j = wlb0.h(aVar3).getIcon().l;
                    if (Build.VERSION.SDK_INT >= 29) {
                        se7.b();
                        porterDuffColorFilter = re7.b(f870.H(j), z42.a(5));
                    } else {
                        porterDuffColorFilter = new PorterDuffColorFilter(f870.H(j), z42.b(5));
                    }
                    vjw.a(a2, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new oe7(j, 5, porterDuffColorFilter), aVar3, 56, 60);
                    float f = 12;
                    f9t.e(txj0.h(aVar, f), aVar3, 6);
                    yqv0.c(d370.N(R.string.story_archive_empty_info, 0, aVar3), ahn.E(s200.F(f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar), "empty_info_text"), wlb0.h(aVar3).getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar3).T, aVar3, 48, 0, 8120);
                    f9t.e(txj0.h(aVar, f), aVar3, 6);
                    String N = d370.N(R.string.story_archive_publish, 0, aVar3);
                    ButtonSize buttonSize = ButtonSize.Small;
                    ButtonStyle buttonStyle = ButtonStyle.Tertiary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    q630 E = ahn.E(aVar, "publish_story");
                    boolean y = aVar3.y(storyArchiveRecyclerPaginatedView);
                    Object x = aVar3.x();
                    if (y || x == a.C0011a.a) {
                        x = new qbc0(storyArchiveRecyclerPaginatedView, 16);
                        aVar3.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, N, null, null, null, null, false, null, null, null, aVar3, 28080, 0, 0, 4190176);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                int i4 = UserProfileOnBoardingBannerView.n;
                ((UserProfileOnBoardingBannerView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 11:
                VideoFile videoFile = (VideoFile) obj3;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> Sb = uIBlockList.Sb();
                int i5 = -1;
                int i6 = -1;
                int i7 = 0;
                for (Object obj4 : Sb) {
                    int i8 = i2 + 1;
                    if (i2 < 0) {
                        e43.t();
                        throw null;
                    }
                    UIBlock uIBlock = (UIBlock) obj4;
                    if (uIBlock instanceof UIBlockVideo) {
                        if (i5 != -1) {
                            i2 = i5;
                        }
                        i7++;
                        i5 = i2;
                    } else if (uIBlock instanceof UIBlockHeader) {
                        i6 = i2;
                    }
                    i2 = i8;
                }
                if (i5 != -1) {
                    Sb.add(i5, kwp0.b((UIBlockVideo) Sb.get(i5), videoFile));
                    if (i6 != -1) {
                        Sb.set(i6, kwp0.a((UIBlockHeader) Sb.get(i6), i7 + 1));
                    }
                }
                return new UIBlockList(uIBlockList, Sb);
            default:
                ihs0 ihs0Var = (ihs0) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1076715178, intValue3, -1, "com.vk.com.vk.donut.popup.impl.video.VideoDonutBottomSheet.ThemedContent.<anonymous> (VideoDonutBottomSheet.kt:63)");
                    }
                    int i9 = y1z.a;
                    LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                    aVar5.K(-1605927234);
                    int i10 = ComposeView.n;
                    ihs0Var.eo(8, aVar5);
                    aVar5.j();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ o85(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
