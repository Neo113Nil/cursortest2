package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.CommonStat$TypeCommonEventItem;
import com.vk.stat.scheme.CommonVideoStat$TypeNextPrevVideoButtonTap;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: VideosQueueUtils.kt */
/* loaded from: classes7.dex */
public final class ltt0 {
    public static void a(VideoFile videoFile, VideoFile videoFile2, boolean z) {
        UserId userId;
        UserId userId2;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        long o0 = videoFile.o0();
        Owner s = videoFile.s();
        Long l = null;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(SchemeStat$EventItem.Type.VIDEO, Long.valueOf(o0), (s == null || (userId2 = s.b) == null) ? null : Long.valueOf(userId2.b), null, null, null, 56, null);
        CommonVideoStat$TypeNextPrevVideoButtonTap.EventSubtype eventSubtype = z ? CommonVideoStat$TypeNextPrevVideoButtonTap.EventSubtype.PREV : CommonVideoStat$TypeNextPrevVideoButtonTap.EventSubtype.NEXT;
        Long valueOf = Long.valueOf(videoFile2.o0());
        Owner s2 = videoFile2.s();
        if (s2 != null && (userId = s2.b) != null) {
            l = Long.valueOf(userId.b);
        }
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(schemeStat$EventItem, new CommonVideoStat$TypeNextPrevVideoButtonTap(eventSubtype, new CommonStat$TypeCommonEventItem(valueOf, l, null, null, 12, null), null, 4, null), 2)).q();
    }
}
