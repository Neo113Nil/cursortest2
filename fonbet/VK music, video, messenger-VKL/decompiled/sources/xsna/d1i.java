package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsMoreMenuItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: CommunityScheduledClipsMoreMenuActionsAnalyticsHelper.kt */
/* loaded from: classes5.dex */
public final class d1i {
    public static void b(d1i d1iVar, ClipVideoFile clipVideoFile, SchemeStat$TypeClipViewerItem.EventType eventType, MobileOfficialAppsClipsStat$ClipsMoreMenuItem.EventSubtype eventSubtype, SchemeStat$TypeClipViewerItem.ScreenType screenType) {
        new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(screenType, eventType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$ClipsMoreMenuItem(eventSubtype, null, new MobileOfficialAppsClipsStat$TypeClipsClipItem(clipVideoFile.c, clipVideoFile.b.b, clipVideoFile.W)), null, null, null, null, null, 1056964604, null)).q();
    }

    public final void a(ClipVideoFile clipVideoFile) {
        throw null;
    }
}
