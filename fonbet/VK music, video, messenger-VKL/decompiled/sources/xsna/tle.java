package xsna;

import com.vk.clips.sdk.shared.clips.SdkClipAudioTemplate;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipTemplateItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;

/* compiled from: ClipsMusicTemplateAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class tle {
    public final MobileOfficialAppsClipsStat$ClipsCreateContext a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TEMPLATES_VIEWER;

    public tle(MobileOfficialAppsClipsStat$ClipsCreateContext mobileOfficialAppsClipsStat$ClipsCreateContext) {
        this.a = mobileOfficialAppsClipsStat$ClipsCreateContext;
    }

    public final void a(FeedItem feedItem) {
        SdkClipAudioTemplate a5;
        SdkClipAudioTemplate.a Ab;
        FeedItem.k kVar = feedItem instanceof FeedItem.k ? (FeedItem.k) feedItem : null;
        if (kVar == null || (a5 = kVar.e.a5()) == null || (Ab = a5.Ab()) == null) {
            return;
        }
        c(MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType.OPEN_TEMPLATE, Ab);
    }

    public final void b(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = this.b;
    }

    public final void c(MobileOfficialAppsClipsStat$TypeClipTemplateItem.EventType eventType, SdkClipAudioTemplate.a aVar) {
        new n8f(this.b, SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsClipsStat$TypeClipTemplateItem(eventType, aVar.b, aVar.a, this.a), 3)).q();
    }
}
