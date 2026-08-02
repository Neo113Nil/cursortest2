package xsna;

import android.content.Context;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.api.generated.market.dto.MarketLinkedContentSourceDto;
import com.vk.api.generated.market.dto.MarketProductLinkedContentItemDto;
import com.vk.api.generated.photos.dto.PhotosPhotoDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.api.generated.video.dto.VideoVideoTypeDto;
import com.vk.bridges.ImageViewer;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.api.marketlinkedcontent.router.LinkedContentAnalyticsParams;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketContextContent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketTransitionToLinkedContent;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketViewLinkedContent;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Triple;
import xsna.hzp0;

/* compiled from: MarketProductMediaContentDelegate.kt */
/* loaded from: classes18.dex */
public final class hc10 implements w8i {
    public final g7s0 b;
    public final ImageViewer c;
    public ImageViewer.c<?> d;

    /* compiled from: MarketProductMediaContentDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarketProductLinkedContentItemDto.ContentTypeDto.values().length];
            try {
                iArr[MarketProductLinkedContentItemDto.ContentTypeDto.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarketProductLinkedContentItemDto.ContentTypeDto.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* compiled from: MarketProductMediaContentDelegate.kt */
    public static final class b extends ImageViewer.b {
        public b() {
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final Integer f() {
            return 1;
        }

        @Override // com.vk.bridges.ImageViewer.b, com.vk.bridges.ImageViewer.a
        public final void onDismiss() {
            hc10.this.d = null;
        }
    }

    public hc10(g7s0 g7s0Var, ImageViewer imageViewer) {
        this.b = g7s0Var;
        this.c = imageViewer;
    }

    public static CommonMarketStat$TypeMarketContextContent a(MarketProductLinkedContentItemDto marketProductLinkedContentItemDto) {
        Triple triple;
        int i = a.$EnumSwitchMapping$0[marketProductLinkedContentItemDto.d().ordinal()];
        if (i == 1) {
            VideoVideoFullDto g = marketProductLinkedContentItemDto.g();
            Integer s1 = g != null ? g.s1() : null;
            VideoVideoFullDto g2 = marketProductLinkedContentItemDto.g();
            UserId q = g2 != null ? g2.q() : null;
            VideoVideoFullDto g3 = marketProductLinkedContentItemDto.g();
            triple = new Triple(s1, q, (g3 != null ? g3.R2() : null) == VideoVideoTypeDto.SHORT_VIDEO ? CommonMarketStat$TypeMarketContextContent.Type.CLIP : CommonMarketStat$TypeMarketContextContent.Type.VIDEO);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            if (marketProductLinkedContentItemDto.f() == null) {
                PhotosPhotoDto e = marketProductLinkedContentItemDto.e();
                Integer valueOf = e != null ? Integer.valueOf(e.getId()) : null;
                PhotosPhotoDto e2 = marketProductLinkedContentItemDto.e();
                triple = new Triple(valueOf, e2 != null ? e2.q() : null, CommonMarketStat$TypeMarketContextContent.Type.PHOTO);
            } else {
                MarketLinkedContentSourceDto f = marketProductLinkedContentItemDto.f();
                Integer valueOf2 = f != null ? Integer.valueOf(f.getId()) : null;
                MarketLinkedContentSourceDto f2 = marketProductLinkedContentItemDto.f();
                triple = new Triple(valueOf2, f2 != null ? f2.q() : null, CommonMarketStat$TypeMarketContextContent.Type.POST);
            }
        }
        Integer num = (Integer) triple.d();
        UserId userId = (UserId) triple.g();
        return new CommonMarketStat$TypeMarketContextContent((CommonMarketStat$TypeMarketContextContent.Type) triple.h(), num, userId != null ? Long.valueOf(userId.b) : null);
    }

    public static void c(Context context, MediaContentItem mediaContentItem, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        MarketProductLinkedContentItemDto marketProductLinkedContentItemDto = mediaContentItem.b;
        if (linkedContentAnalyticsParams != null) {
            e(mediaContentItem, linkedContentAnalyticsParams);
        }
        MarketLinkedContentSourceDto f = marketProductLinkedContentItemDto.f();
        UserId q = f != null ? f.q() : null;
        MarketLinkedContentSourceDto f2 = marketProductLinkedContentItemDto.f();
        Integer valueOf = f2 != null ? Integer.valueOf(f2.getId()) : null;
        if (q == null || valueOf == null) {
            return;
        }
        gcd0.t(context, q, valueOf.intValue(), null, 56);
    }

    public static void e(MediaContentItem mediaContentItem, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(linkedContentAnalyticsParams.b), Long.valueOf(linkedContentAnalyticsParams.c), null, linkedContentAnalyticsParams.e, null, 40, null);
        UiTrackingScreen b2 = UiTracker.j.b();
        SchemeStat$TypeClick b3 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b2 != null ? b2.a : null, linkedContentAnalyticsParams.d, null, linkedContentAnalyticsParams.f, new CommonMarketStat$TypeMarketTransitionToLinkedContent(a(mediaContentItem.b)), 41), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b3, uzp0Var.a).q();
    }

    public static void f(MediaContentItem mediaContentItem, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(linkedContentAnalyticsParams.b), Long.valueOf(linkedContentAnalyticsParams.c), null, linkedContentAnalyticsParams.e, null, 40, null);
        CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = linkedContentAnalyticsParams.d;
        UiTrackingScreen b2 = UiTracker.j.b();
        new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b2 != null ? b2.a : null, commonMarketStat$TypeRefSource, linkedContentAnalyticsParams.f, new CommonMarketStat$TypeMarketViewLinkedContent(a(mediaContentItem.b)), 18), null).a();
    }

    public final void b(Context context, MediaContentItem mediaContentItem, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        ImageViewer.c<?> g;
        PhotosPhotoDto e = mediaContentItem.b.e();
        Photo a2 = e != null ? xfa0.a(e) : null;
        if (this.d != null || a2 == null) {
            return;
        }
        if (linkedContentAnalyticsParams != null) {
            e(mediaContentItem, linkedContentAnalyticsParams);
        }
        g = this.c.g(0, Collections.singletonList(a2), context, new b(), o25.a().c());
        this.d = g;
    }

    public final void d(Context context, MediaContentItem mediaContentItem, LinkedContentAnalyticsParams linkedContentAnalyticsParams) {
        VideoVideoFullDto g = mediaContentItem.b.g();
        if (g != null) {
            VideoFileOld d = ums0.d(ums0.a, g, null, null, null, 30);
            g7s0 g7s0Var = this.b;
            if (g7s0Var.c(d) && mediaContentItem.c) {
                g7s0Var.d(d);
            }
            if (linkedContentAnalyticsParams != null) {
                e(mediaContentItem, linkedContentAnalyticsParams);
            }
            g7s0Var.Y().k(context, d, (r43 & 4) != 0 ? null : com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.MARKET_ITEM), (r43 & 8) != 0 ? null : null, (r43 & 16) != 0 ? null : null, (r43 & 32) != 0 ? null : null, (r43 & 64) != 0 ? false : false, (r43 & 128) != 0 ? null : null, (r43 & 256) != 0 ? null : null, (r43 & 512) != 0 ? null : null, true, (r43 & 2048) != 0 ? false : false, (r43 & 4096) == 0, (r43 & 8192) == 0, (r43 & 16384) != 0 ? -1L : 0L, (32768 & r43) != 0 ? null : null, (65536 & r43) != 0 ? null : null, (524288 & r43) != 0 ? false : false, (r43 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? null : null);
        }
    }
}
