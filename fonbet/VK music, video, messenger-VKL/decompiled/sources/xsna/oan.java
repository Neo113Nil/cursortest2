package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.hzp0;
import xsna.pan;

/* compiled from: DiscoveryUiViewTracker.kt */
/* loaded from: classes3.dex */
public final class oan extends d680<pan.b> {
    public final /* synthetic */ CommonVideoStat$TypeScreenMode b;

    public oan(pan.a aVar, CommonVideoStat$TypeScreenMode commonVideoStat$TypeScreenMode) {
        this.b = commonVideoStat$TypeScreenMode;
    }

    @Override // xsna.d680
    public final List j(pan.b bVar) {
        UserId userId;
        pan.b bVar2 = bVar;
        int i = bVar2.a;
        VideoFile videoFile = bVar2.b;
        if (videoFile == null) {
            return EmptyList.b;
        }
        SchemeStat$EventItem.Type type = SchemeStat$EventItem.Type.VIDEO_CONTENT_ITEM;
        Long valueOf = Long.valueOf(videoFile.o0());
        Owner s = videoFile.s();
        hzp0.o0 o0Var = null;
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, valueOf, (s == null || (userId = s.b) == null) ? null : Long.valueOf(userId.b), null, videoFile.r(), null, 40, null);
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        hzp0.o0 o0Var2 = new hzp0.o0(schemeStat$EventItem, i, mobileOfficialAppsCoreNavStat$EventScreen, null);
        String r = videoFile.r();
        if (r != null) {
            o0Var = new hzp0.o0(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), i, mobileOfficialAppsCoreNavStat$EventScreen, new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.SHOW, this.b));
        }
        return rl3.I(new hzp0.o0[]{o0Var2, o0Var});
    }
}
