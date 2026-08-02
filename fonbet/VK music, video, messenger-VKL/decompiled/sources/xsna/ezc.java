package xsna;

import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.clips.TrendingHashtag;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClipFeedTrendsAnalyticsDelegate.kt */
/* loaded from: classes17.dex */
public final class ezc {
    public static void a(ClipVideoFile clipVideoFile) {
        UserId userId;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_VIEWER;
        SchemeStat$TypeClipViewerItem.ScreenType screenType = SchemeStat$TypeClipViewerItem.ScreenType.TREND;
        SchemeStat$TypeClipViewerItem.EventType eventType = SchemeStat$TypeClipViewerItem.EventType.CHOOSE_TREND;
        MobileOfficialAppsClipsStat$TypeClipsClipItem mobileOfficialAppsClipsStat$TypeClipsClipItem = new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W);
        MusicTrack musicTrack = clipVideoFile.D1;
        Integer valueOf = (musicTrack == null || !musicTrack.X) ? null : Integer.valueOf(musicTrack.b);
        Long valueOf2 = (musicTrack == null || !musicTrack.X || (userId = musicTrack.c) == null) ? null : Long.valueOf(userId.b);
        TrendingHashtag trendingHashtag = (TrendingHashtag) j5g.a0(clipVideoFile.Q1);
        new iof(mobileOfficialAppsCoreNavStat$EventScreen, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsChooseTrendItem(mobileOfficialAppsClipsStat$TypeClipsClipItem, valueOf2, valueOf, cqm0.a(trendingHashtag != null ? trendingHashtag.b : null)), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741692, null)).q();
    }

    public static void b(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.CLIPS_TRENDS_VIEWER;
    }
}
