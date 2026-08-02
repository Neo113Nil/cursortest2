package xsna;

import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.core.compose.component.defaults.PictureRadius;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.api.analytics.MarketAnalyticsParams;
import com.vk.ecomm.catalog.api.catalog.MarketCatalogSectionId;
import com.vk.ecomm.catalog.impl.catalog.root.ClassifiedsCatalogFragment;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleFragment;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.List;
import xsna.cri;
import xsna.d16;
import xsna.dt1;
import xsna.gpp0;
import xsna.phw;
import xsna.q630;
import xsna.tzp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class jd4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jd4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, java.util.List] */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i = this.b;
        int i2 = 7;
        int i3 = 8;
        Object obj3 = a.C0011a.a;
        ?? r10 = this.c;
        switch (i) {
            case 0:
                kd4 kd4Var = (kd4) r10;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1437127235, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content.<anonymous> (AudioBookBigPlayerControls.kt:40)");
                    }
                    kd4Var.b(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 1:
                jai jaiVar = (jai) r10;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(208426639, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BigPlayerScaffold.kt:566)");
                    }
                    if (cq.i(0, aVar2, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                izs izsVar = (izs) r10;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1968383070, intValue3, -1, "com.vk.ecomm.onlinebooking.impl.records.ui.BookingRecordsScreenMviView.ThemedContent.<anonymous> (BookingRecordsScreenMviView.kt:85)");
                    }
                    wv7.d(izsVar, aVar3, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                ((CatalogLegacyBlockImpl) r10).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 4:
                ClassifiedsCatalogSimpleFragment classifiedsCatalogSimpleFragment = (ClassifiedsCatalogSimpleFragment) r10;
                String str2 = (String) obj;
                Integer num = (Integer) obj2;
                int i4 = ClassifiedsCatalogSimpleFragment.R;
                ClassifiedsCatalogFragment.a aVar4 = new ClassifiedsCatalogFragment.a();
                if (str2 != null) {
                    aVar4.D(str2);
                }
                UserId c = classifiedsCatalogSimpleFragment.go().c();
                yfc yfcVar = aVar4.n;
                if (c != null) {
                    yfcVar.a.putString("KEY_SEARCH_SECTION_ID", MarketCatalogSectionId.SEARCH_STOREFRONT.h());
                    aVar4.E(c);
                }
                Bundle bundle = classifiedsCatalogSimpleFragment.go().a;
                Long valueOf = bundle.containsKey("KEY_PRICE_MIN") ? Long.valueOf(bundle.getLong("KEY_PRICE_MIN")) : null;
                yfc yfcVar2 = aVar4.m;
                if (valueOf != null) {
                    yfcVar2.a.putLong("KEY_PRICE_MIN", valueOf.longValue());
                }
                Bundle bundle2 = classifiedsCatalogSimpleFragment.go().a;
                Long valueOf2 = bundle2.containsKey("KEY_PRICE_MAX") ? Long.valueOf(bundle2.getLong("KEY_PRICE_MAX")) : null;
                if (valueOf2 != null) {
                    yfcVar2.a.putLong("KEY_PRICE_MAX", valueOf2.longValue());
                }
                Integer a = classifiedsCatalogSimpleFragment.go().a();
                if (a != null) {
                    aVar4.B(a.intValue());
                }
                if (num != null) {
                    yfcVar2.a.putInt("KEY_CATEGORY_ID", num.intValue());
                }
                MarketAnalyticsParams b = classifiedsCatalogSimpleFragment.go().b();
                if (b != null && (str = b.h) != null) {
                    UserId c2 = classifiedsCatalogSimpleFragment.go().c();
                    Long valueOf3 = c2 != null ? Long.valueOf(c2.b) : null;
                    MarketAnalyticsParams b2 = classifiedsCatalogSimpleFragment.go().b();
                    mt00.g(valueOf3, b2 != null ? b2.d : null, str);
                }
                MarketAnalyticsParams b3 = classifiedsCatalogSimpleFragment.go().b();
                if (b3 != null) {
                    aVar4.C(b3);
                }
                yfcVar.a.putBoolean("KEY_MODE_SEARCH_ONLY", true);
                aVar4.l(classifiedsCatalogSimpleFragment);
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                tzp0.c.a aVar5 = poc.l1;
                ((poc) r10).Zn(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 6:
                ogh oghVar = (ogh) r10;
                VideoFile videoFile = (VideoFile) obj;
                View view = (View) obj2;
                Clips clips = (Clips) oghVar.t;
                if (clips != null) {
                    oghVar.E.f(clips, new dnc(videoFile, clips), new WeakReference<>(view), 0);
                }
                return s3q0.a;
            case 7:
                final DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) r10;
                final int intValue4 = ((Integer) obj2).intValue();
                if (intValue4 >= 0) {
                    RecyclerView recyclerView = discoverSimilarFeedFragment.b0;
                    if (recyclerView != null) {
                        wjf0.c(recyclerView, new gzs() { // from class: xsna.h7n
                            @Override // xsna.gzs
                            public final Object invoke() {
                                RecyclerView recyclerView2 = DiscoverSimilarFeedFragment.this.b0;
                                RecyclerView.o layoutManager = recyclerView2 != null ? recyclerView2.getLayoutManager() : null;
                                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                                if (linearLayoutManager != null) {
                                    linearLayoutManager.K(intValue4, 0);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                } else {
                    qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                }
                return s3q0.a;
            case 8:
                DisplayAudioBookChaptersFragment displayAudioBookChaptersFragment = (DisplayAudioBookChaptersFragment) r10;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i5 = DisplayAudioBookChaptersFragment.b0;
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1916481277, intValue5, -1, "com.vk.music.playlist.display.audiobook.presentation.fragment.DisplayAudioBookChaptersFragment.showFreeBookBottomSheet.<anonymous>.<anonymous> (DisplayAudioBookChaptersFragment.kt:206)");
                    }
                    boolean y = aVar6.y(displayAudioBookChaptersFragment);
                    Object x = aVar6.x();
                    if (y || x == obj3) {
                        x = new c5f(displayAudioBookChaptersFragment, 13);
                        aVar6.R(x);
                    }
                    gzs gzsVar = (gzs) x;
                    boolean y2 = aVar6.y(displayAudioBookChaptersFragment);
                    Object x2 = aVar6.x();
                    if (y2 || x2 == obj3) {
                        x2 = new jrh(displayAudioBookChaptersFragment, i2);
                        aVar6.R(x2);
                    }
                    yg4.a(gzsVar, (gzs) x2, aVar6, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                ((v0r) r10).k(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 10:
                ((Integer) obj2).getClass();
                kb00.h(r10, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 11:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                e2g0 e2g0Var = ((MarketItemReviewRepliesFragment) r10).Y;
                if (e2g0Var != null) {
                    e2g0Var.t(booleanValue);
                }
                return s3q0.a;
            case 12:
                mjd0 mjd0Var = (mjd0) r10;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1905980071, intValue6, -1, "com.vk.ecomm.market.good.ui.holder.ProductCardBannerHolder.onBind.<anonymous>.<anonymous> (ProductCardBannerHolder.kt:40)");
                    }
                    float f = 40;
                    int I0 = (int) ((azl) aVar7.r(uvi.h)).I0(f);
                    xl20 a2 = d16.b.a(mjd0Var.a, mjd0Var.b, null, null, null, null, null, null, aVar7, 100663296, 252);
                    float f2 = kqu0.b;
                    q630 f3 = txj0.f(s200.H(q630.a.a, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, kqu0.r, 2), 1.0f);
                    ImageSize imageSize = (ImageSize) ixj0.c(mjd0Var.c.b, I0, I0);
                    beu0.a(a2, f3, null, null, null, null, null, wp80.f(phw.a.a(fwu0.l(null, imageSize != null ? imageSize.d.d : null, null, null, aVar7, 0, 61), null, null, null, null, aVar7, 196616, 30), f, PictureRadius.Large, aVar7, 12607536, 108), null, null, null, null, aVar7, 0, 0, 3964);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar7.h();
                }
                return s3q0.a;
            case 13:
                ((Integer) obj2).getClass();
                nud0.a((ut9) r10, (androidx.compose.runtime.a) obj, ne7.I(7));
                return s3q0.a;
            case 14:
                ((Integer) obj2).getClass();
                com.vk.libvideo.design.compose.base.timeline.a.c((q630) r10, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 15:
                gpp0.a aVar8 = (gpp0.a) r10;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1650428115, intValue7, -1, "com.vk.video.ui.discovery.minimizable.banner_trap.TrapBannerDelegate.ViewHolder.<anonymous> (TrapBannerDelegate.kt:61)");
                    }
                    AboutVideoItem.a0 a0Var = (AboutVideoItem.a0) ((zak0) aVar8.m).getValue();
                    if (a0Var == null) {
                        aVar9.K(881673672);
                        aVar9.j();
                    } else {
                        aVar9.K(881673673);
                        rrv0.e(true, null, null, null, null, null, kai.c(-620903450, new wd0(i3, a0Var, aVar8), aVar9), aVar9, 1572870, 62);
                        aVar9.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar9.h();
                }
                return s3q0.a;
            case 16:
                UIBlockList uIBlockList = (UIBlockList) obj;
                wot0.b(uIBlockList, (List) r10, true);
                return uIBlockList;
            case 17:
                tet0 tet0Var = (tet0) r10;
                androidx.compose.runtime.a aVar10 = (androidx.compose.runtime.a) obj;
                int intValue8 = ((Integer) obj2).intValue();
                if (aVar10.t(intValue8 & 1, (intValue8 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1332376204, intValue8, -1, "com.vk.search.tool.view.VideoSearchFiltersModalPageContentComposeView.Content.<anonymous> (VideoSearchFiltersModalPageContentComposeView.kt:124)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar10, 0);
                    int hashCode = Long.hashCode(n34.n(aVar10));
                    sy90 D = aVar10.D();
                    q630.a aVar11 = q630.a.a;
                    q630 c3 = qri.c(aVar10, aVar11);
                    cri.h7.getClass();
                    LayoutNode.a aVar12 = cri.a.b;
                    if (aVar10.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar10.H();
                    if (aVar10.L()) {
                        aVar10.I(aVar12);
                    } else {
                        aVar10.f();
                    }
                    k9q0.w(aVar10, a3, cri.a.f);
                    k9q0.w(aVar10, D, cri.a.e);
                    k9q0.w(aVar10, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar10, cri.a.h);
                    k9q0.w(aVar10, c3, cri.a.d);
                    tet0Var.z(8, aVar10);
                    f9t.e(txj0.h(aVar11, 10), aVar10, 6);
                    float f4 = 0;
                    q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 1, aVar11);
                    String N = d370.N(R.string.video_catalog_filters_high_quality, 0, aVar10);
                    boolean d = ((set0) ((zak0) tet0Var.m).getValue()).d();
                    boolean booleanValue2 = ((Boolean) tet0Var.v.getValue()).booleanValue();
                    boolean y3 = aVar10.y(tet0Var);
                    Object x3 = aVar10.x();
                    Object obj4 = x3;
                    if (y3 || x3 == obj3) {
                        Object qkd0Var = new qkd0(tet0Var, 28);
                        aVar10.R(qkd0Var);
                        obj4 = qkd0Var;
                    }
                    eku0.d(N, (gzs) obj4, F, d, null, booleanValue2, false, aVar10, 384, 80);
                    if (tet0Var.l) {
                        aVar10.K(-1343152092);
                    } else {
                        aVar10.K(-1336838601);
                        q630 F2 = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, 1, aVar11);
                        String N2 = d370.N(R.string.video_filters_authors, 0, aVar10);
                        boolean booleanValue3 = ((Boolean) tet0Var.w.getValue()).booleanValue();
                        boolean booleanValue4 = ((Boolean) tet0Var.x.getValue()).booleanValue();
                        boolean y4 = aVar10.y(tet0Var);
                        Object x4 = aVar10.x();
                        Object obj5 = x4;
                        if (y4 || x4 == obj3) {
                            Object hbj0Var = new hbj0(tet0Var, 24);
                            aVar10.R(hbj0Var);
                            obj5 = hbj0Var;
                        }
                        eku0.d(N2, (gzs) obj5, F2, booleanValue3, null, booleanValue4, false, aVar10, 384, 80);
                    }
                    aVar10.j();
                    aVar10.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar10.h();
                }
                return s3q0.a;
            default:
                ((u4a) r10).b.e.b(new oyp0((UIBlockList) obj, (CatalogExtendedData) obj2), false);
                return s3q0.a;
        }
    }

    public /* synthetic */ jd4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }

    public /* synthetic */ jd4(c6s0 c6s0Var, List list) {
        this.b = 16;
        this.c = list;
    }
}
