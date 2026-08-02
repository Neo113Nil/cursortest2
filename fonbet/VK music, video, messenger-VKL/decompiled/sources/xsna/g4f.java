package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsClipItem;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeClipViewerItem;

/* compiled from: ClipsShopsClickStatHandler.kt */
/* loaded from: classes4.dex */
public final class g4f implements cnc {
    @Override // xsna.cnc
    public final void a(UserId userId, Integer num, String str) {
        new iof(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS, new SchemeStat$TypeClipViewerItem(SchemeStat$TypeClipViewerItem.ScreenType.TOP, SchemeStat$TypeClipViewerItem.EventType.CLIPS_RETENTION_BLOCK_EVENT, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem(MobileOfficialAppsClipsStat$TypeClipsRetentionBlockEventItem.ObjectType.CLICK_TO_CLIP, str), null, null, null, null, null, null, null, null, userId != null ? new MobileOfficialAppsClipsStat$TypeClipsClipItem(num.intValue(), userId.b, null, 4, null) : null, null, null, 939261948, null)).q();
    }
}
