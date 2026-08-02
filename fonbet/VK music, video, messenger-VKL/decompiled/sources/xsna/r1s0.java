package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.CommonVideoStat$TypeNextVideoAnnouncement;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideoAnnounceStat.kt */
/* loaded from: classes7.dex */
public final class r1s0 {
    public static void a(CommonVideoStat$TypeNextVideoAnnouncement.EventSubtype eventSubtype, VideoFile videoFile, VideoFile videoFile2) {
        SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(videoFile.o0()), Long.valueOf(videoFile.I0().b), null, null, null, 56, null), new CommonVideoStat$TypeNextVideoAnnouncement(eventSubtype, new CommonStat$TypeCommonEventItem(Long.valueOf(videoFile2.o0()), Long.valueOf(videoFile2.I0().b), null, null, 12, null)), 2);
        UiTracker uiTracker = UiTracker.a;
        MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
        uzp0 uzp0Var = UiTracker.h;
        uzp0Var.getClass();
        new bjc(c, b, uzp0Var.a).q();
    }
}
