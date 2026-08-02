package xsna;

import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.stat.scheme.CommonVideoStat$TypeClickToAuthorCommunity;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;

/* compiled from: ClickToAuthorCommunityEventBuilder.kt */
/* loaded from: classes5.dex */
public final class ejc extends und0 {
    public /* synthetic */ ejc(boolean z, Long l, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonVideoStat$CommunityClickInfo.Direction direction, int i) {
        this(z, l, (i & 4) != 0 ? null : str, mobileOfficialAppsCoreNavStat$EventScreen, (i & 16) != 0 ? CommonVideoStat$CommunityClickInfo.Direction.TO_AUTHOR : direction);
    }

    public ejc(boolean z, Long l, String str, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, CommonVideoStat$CommunityClickInfo.Direction direction) {
        super(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, l, null, str, null, 42, null), new CommonVideoStat$TypeClickToAuthorCommunity(CommonVideoStat$TypeClickToAuthorCommunity.EventType.CLICK_TO_AUTHOR_COMMUNITY, new CommonVideoStat$CommunityClickInfo(z, direction)), 2));
    }
}
