package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoFullscreenTracker.kt */
/* loaded from: classes7.dex */
public final class dns0 {
    public static void a(VideoFile videoFile, Boolean bool, boolean z) {
        UserId userId;
        if (videoFile == null || bool == null) {
            return;
        }
        MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen = new MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen(bool.booleanValue() ? MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.EventType.GO_TO_FULLSCREEN : MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.EventType.EXIT_FULLSCREEN, z ? MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.EventSubtype.SWIPE : MobileOfficialAppsVideoStat$TypeVideoToggleFullscreen.EventSubtype.BUTTON);
        long o0 = videoFile.o0();
        Owner s = videoFile.s();
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(o0), (s == null || (userId = s.b) == null) ? null : Long.valueOf(userId.b), null, null, null, 56, null), mobileOfficialAppsVideoStat$TypeVideoToggleFullscreen, 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
