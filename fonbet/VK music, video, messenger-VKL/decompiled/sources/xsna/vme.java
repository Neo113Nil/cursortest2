package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.ClipVideoFile;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClipsNewsFeedOverlayAnalyticsImpl.kt */
/* loaded from: classes17.dex */
public final class vme implements ume {
    public static void c(ClipVideoFile clipVideoFile, MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.ClickType clickType) {
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, null, null, null, null, null, 62, null), new MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem(new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W), clickType), 2)).q();
    }

    @Override // xsna.ume
    public final void a(ClipVideoFile clipVideoFile) {
        c(clipVideoFile, MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.ClickType.MORE_IN_CLIPS);
    }

    @Override // xsna.ume
    public final void b(ClipVideoFile clipVideoFile) {
        c(clipVideoFile, MobileOfficialAppsClipsStat$TypeClipInFeedOverlayClickItem.ClickType.WATCH_AGAIN);
    }
}
