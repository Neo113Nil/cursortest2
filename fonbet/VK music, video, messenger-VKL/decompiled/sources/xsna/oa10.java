package xsna;

import com.vk.camera.editor.stories.impl.multi.CameraPhotoDelegate;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.dto.discover.carousel.products.ProductCarouselItem;
import com.vk.dto.stories.model.StoryUploadParams;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketClick;
import com.vk.stat.scheme.MobileOfficialAppsMarketStat$TypeMarketHideItemItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.story.api.media.StoryMediaData;
import com.vk.superapp.api.dto.story.WebStoryBox;
import kotlin.Pair;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class oa10 implements izs {
    public final /* synthetic */ int b = 0;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ oa10(pa10 pa10Var, int i, ProductCarouselItem productCarouselItem) {
        this.d = pa10Var;
        this.c = i;
        this.e = productCarouselItem;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        StoryMediaData b;
        int i = this.b;
        int i2 = this.c;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                pa10 pa10Var = (pa10) obj3;
                ProductCarouselItem productCarouselItem = (ProductCarouselItem) obj2;
                pa10Var.a.invoke(Integer.valueOf(i2));
                Long valueOf = Long.valueOf(productCarouselItem.c);
                UserId userId = productCarouselItem.l;
                Integer num = productCarouselItem.s;
                CommonMarketStat$TypeRefSource commonMarketStat$TypeRefSource = pa10Var.c;
                String str = productCarouselItem.o;
                SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, valueOf, userId != null ? Long.valueOf(userId.b) : null, null, str, null, 40, null);
                UiTrackingScreen b2 = UiTracker.j.b();
                SchemeStat$TypeClick a = SchemeStat$TypeClick.a.a(schemeStat$EventItem, num, MobileOfficialAppsMarketStat$TypeMarketClick.a.b(1, b2 != null ? b2.a : null, commonMarketStat$TypeRefSource, null, null, new MobileOfficialAppsMarketStat$TypeMarketHideItemItem(num != null ? v11.b(1, num) : null, str, null), 56));
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, a, uzp0Var.a).q();
                return s3q0.a;
            default:
                u440 u440Var = (u440) obj3;
                tam0 tam0Var = (tam0) obj2;
                StoryUploadParams storyUploadParams = (StoryUploadParams) obj;
                e2m0 e2m0Var = u440Var.r0;
                CameraPhotoDelegate cameraPhotoDelegate = u440Var.s0;
                bh9 bh9Var = u440Var.t0;
                boolean z = tam0Var.g;
                zcl0 zcl0Var = tam0Var.h;
                if (z) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.d, new Object[]{"MultiStory", "story with sticker content"});
                    }
                    b = bh9Var.a(tam0Var, storyUploadParams);
                } else {
                    WebStoryBox webStoryBox = u440Var.j.x().e;
                    if (webStoryBox != null && webStoryBox.Db()) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.d, new Object[]{"MultiStory", "story with template"});
                        }
                        if (zcl0Var.u()) {
                            b = e2m0Var.b(tam0Var, storyUploadParams);
                        } else {
                            cameraPhotoDelegate.getClass();
                            b = cameraPhotoDelegate.d(tam0Var, CameraPhotoDelegate.ProcessType.STORY_SHARE, storyUploadParams);
                        }
                    } else if (tam0Var.f() && !zcl0Var.p()) {
                        L l3 = L.a;
                        l3.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l3, L.LogType.d, new Object[]{"MultiStory", "story with photo content"});
                        }
                        cameraPhotoDelegate.getClass();
                        b = cameraPhotoDelegate.d(tam0Var, CameraPhotoDelegate.ProcessType.STORY_SHARE, storyUploadParams);
                    } else if (tam0Var.g() || zcl0Var.p()) {
                        L l4 = L.a;
                        l4.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l4, L.LogType.d, new Object[]{"MultiStory", "story with video content"});
                        }
                        b = e2m0Var.b(tam0Var, storyUploadParams);
                    } else {
                        L l5 = L.a;
                        l5.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l5, L.LogType.d, new Object[]{"MultiStory", "story composite content"});
                        }
                        b = bh9Var.a(tam0Var, storyUploadParams);
                    }
                }
                if (b != null) {
                    return new Pair(Integer.valueOf(i2), b);
                }
                throw new IllegalStateException("map story to media data failed");
        }
    }

    public /* synthetic */ oa10(u440 u440Var, tam0 tam0Var, int i) {
        this.d = u440Var;
        this.e = tam0Var;
        this.c = i;
    }
}
