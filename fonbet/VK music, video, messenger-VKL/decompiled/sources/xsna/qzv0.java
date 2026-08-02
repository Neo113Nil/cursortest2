package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoDraftClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VkVideoClipsActionTracker.kt */
/* loaded from: classes.dex */
public final class qzv0 {
    public static void a(qzv0 qzv0Var, VideoFile videoFile, MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventType eventType) {
        MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype eventSubtype = MobileOfficialAppsVideoStat$TypeVideoDraftClick.EventSubtype.DRAFT;
        qzv0Var.getClass();
        Long valueOf = Long.valueOf(videoFile.o0());
        Long valueOf2 = Long.valueOf(videoFile.I0().b);
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLIP, valueOf, valueOf2, null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoDraftClick(eventType, eventSubtype), 2)).q();
    }
}
