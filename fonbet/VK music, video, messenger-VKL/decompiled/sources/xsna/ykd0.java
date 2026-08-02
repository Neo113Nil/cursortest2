package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.VideoFile;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.design.compose.gallery.ProductGalleryItem;
import com.vk.ecomm.market.analytics.GoodFragmentAnalyticsParams;
import com.vk.stat.scheme.CommonMarketStat$ProductCardFomoLabels;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketPlayItemVideoItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMarketViewItemMediaItem;
import com.vk.stat.scheme.CommonMarketStat$TypeMedia;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketView;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.ejd0;
import xsna.hzp0;
import xsna.tkd0;

/* compiled from: ProductCardGalleryAnalyticsMiddleware.kt */
/* loaded from: classes18.dex */
public final class ykd0 implements h7f0<nmd0, ejd0, on50, smd0, xld0, tkd0> {
    public final sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> b;
    public final rkd0 c;

    /* compiled from: ProductCardGalleryAnalyticsMiddleware.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProductGalleryItem.Type.values().length];
            try {
                iArr[ProductGalleryItem.Type.Video.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProductGalleryItem.Type.Photo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ykd0(sl50<nmd0, ejd0, on50, smd0, xld0, tkd0> sl50Var, rkd0 rkd0Var) {
        this.b = sl50Var;
        this.c = rkd0Var;
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h7f0
    public final void K(lj50 lj50Var) {
        CommonMarketStat$ProductCardFomoLabels commonMarketStat$ProductCardFomoLabels;
        VideoFile videoFile;
        xkd0 xkd0Var;
        ykd0 ykd0Var;
        List<Photo> list;
        Photo photo;
        Map<String, lpd0> map;
        ejd0 ejd0Var = (ejd0) lj50Var;
        if (ejd0Var instanceof ejd0.d.C2818d) {
            ejd0.d.C2818d c2818d = (ejd0.d.C2818d) ejd0Var;
            ProductGalleryItem.Type type = c2818d.b;
            int i = c2818d.c;
            pld0 pld0Var = ((nmd0) getCurrentState()).l;
            if (pld0Var == null || (map = pld0Var.i) == null) {
                commonMarketStat$ProductCardFomoLabels = null;
            } else {
                ArrayList arrayList = new ArrayList(map.size());
                Iterator<Map.Entry<String, lpd0>> it = map.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().getValue().c);
                }
                ArrayList arrayList2 = new ArrayList(map.size());
                Iterator<Map.Entry<String, lpd0>> it2 = map.entrySet().iterator();
                while (it2.hasNext()) {
                    Integer num = it2.next().getValue().g;
                    arrayList2.add(Integer.valueOf(num != null ? num.intValue() : -1));
                }
                commonMarketStat$ProductCardFomoLabels = new CommonMarketStat$ProductCardFomoLabels(arrayList, arrayList2);
            }
            int i2 = a.$EnumSwitchMapping$0[type.ordinal()];
            if (i2 == 1) {
                cld0 cld0Var = ((nmd0) getCurrentState()).i;
                if (cld0Var != null && (videoFile = (VideoFile) j5g.b0(i, cld0Var.b)) != null) {
                    ykd0Var = this;
                    xkd0Var = new xkd0(CommonMarketStat$TypeMedia.Type.VIDEO, videoFile.o0(), i, ((g7s0) ykd0Var.c.r.getValue()).c(videoFile), commonMarketStat$ProductCardFomoLabels);
                }
                ykd0Var = this;
                xkd0Var = null;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                cld0 cld0Var2 = ((nmd0) getCurrentState()).i;
                int size = cld0Var2 != null ? cld0Var2.b.size() : 0;
                cld0 cld0Var3 = ((nmd0) getCurrentState()).i;
                if (cld0Var3 != null && (list = cld0Var3.a) != null && (photo = (Photo) j5g.b0(i - size, list)) != null) {
                    xkd0Var = new xkd0(CommonMarketStat$TypeMedia.Type.PHOTO, photo.c, i, false, commonMarketStat$ProductCardFomoLabels);
                    ykd0Var = this;
                }
                ykd0Var = this;
                xkd0Var = null;
            }
            if (xkd0Var == null) {
                return;
            }
            nmd0 nmd0Var = (nmd0) ykd0Var.getCurrentState();
            long j = nmd0Var.c;
            long j2 = nmd0Var.b.b;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = nmd0Var.e;
            String str = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = nmd0Var.f;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, str, null, 40, null);
            UiTrackingScreen b = UiTracker.j.b();
            new hzp0.g0(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketView.a.b(b != null ? b.a : null, commonMarketStat$TypeRefSource, null, new CommonMarketStat$TypeMarketViewItemMediaItem(new CommonMarketStat$TypeMedia(xkd0Var.a, Integer.valueOf(xkd0Var.b), Integer.valueOf(xkd0Var.c + 1), null, Boolean.valueOf(xkd0Var.d), 8, null), null, null, xkd0Var.e, 6, null), 26), null).a();
        }
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.h7f0
    public final void T(pk50 pk50Var) {
        tkd0 tkd0Var = (tkd0) pk50Var;
        if (tkd0Var instanceof tkd0.c.b) {
            VideoFile videoFile = ((tkd0.c.b) tkd0Var).a;
            nmd0 nmd0Var = (nmd0) getCurrentState();
            long j = nmd0Var.c;
            long j2 = nmd0Var.b.b;
            GoodFragmentAnalyticsParams goodFragmentAnalyticsParams = nmd0Var.e;
            String str = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.f : null;
            CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = nmd0Var.f;
            String str2 = goodFragmentAnalyticsParams != null ? goodFragmentAnalyticsParams.h : null;
            CommonMarketStat$TypeMedia.Type type = CommonMarketStat$TypeMedia.Type.VIDEO;
            int o0 = videoFile.o0();
            boolean c = ((g7s0) this.c.r.getValue()).c(videoFile);
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.MARKET_ITEM, Long.valueOf(j), Long.valueOf(j2), null, str, null, 40, null);
            UiTrackingScreen b = UiTracker.j.b();
            SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(schemeStat$EventItem, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(null, b != null ? b.a : null, commonMarketStat$TypeRefSource, null, str2, new CommonMarketStat$TypeMarketPlayItemVideoItem(new CommonMarketStat$TypeMedia(type, Integer.valueOf(o0), 1, null, Boolean.valueOf(c), 8, null)), 41), 2);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c2 = UiTracker.c();
            uzp0 uzp0Var = UiTracker.h;
            uzp0Var.getClass();
            new bjc(c2, b2, uzp0Var.a).q();
        }
    }

    @Override // xsna.rl50
    public final lm50 getCurrentState() {
        return this.b.getCurrentState();
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void l(hn50 hn50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void o(yl50 yl50Var) {
    }

    @Override // xsna.h7f0
    public final /* bridge */ /* synthetic */ void u(lm50 lm50Var) {
    }

    @Override // xsna.uic
    public final void clear() {
    }

    @Override // xsna.rl50
    public final void init() {
    }
}
