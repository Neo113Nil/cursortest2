package xsna;

import com.vk.catalog.mvi.block.video.models.VideoCatalogAnalyticsEvent;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: VideoCustomCatalogAnalytics.kt */
/* loaded from: classes.dex */
public final class vds0 implements qmk {
    @Override // xsna.qmk
    public final void a(rmk rmkVar) {
        if (rmkVar instanceof VideoCatalogAnalyticsEvent) {
            VideoCatalogAnalyticsEvent videoCatalogAnalyticsEvent = (VideoCatalogAnalyticsEvent) rmkVar;
            if (!(videoCatalogAnalyticsEvent instanceof VideoCatalogAnalyticsEvent.a)) {
                if (!(videoCatalogAnalyticsEvent instanceof VideoCatalogAnalyticsEvent.VideoCardImageStateDrawn)) {
                    throw new NoWhenBranchMatchedException();
                }
                return;
            }
            VideoCatalogAnalyticsEvent.a aVar = (VideoCatalogAnalyticsEvent.a) rmkVar;
            SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, aVar.c(), null, 46, null);
            UiTracker uiTracker = UiTracker.a;
            MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
            CommonVideoStat$TypeVideoCardEvent commonVideoStat$TypeVideoCardEvent = new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, CommonVideoStat$TypeScreenMode.PREVIEW);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            new bvt0(c, SchemeStat$TypeView.a.b(schemeStat$EventItem, String.valueOf(timeUnit.toMicros(aVar.b())), String.valueOf(timeUnit.toMicros(aVar.a())), null, commonVideoStat$TypeVideoCardEvent, 8)).q();
        }
    }
}
