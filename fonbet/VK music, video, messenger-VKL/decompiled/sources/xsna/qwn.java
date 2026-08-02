package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.stat.scheme.CommonCommunitiesStat$TypeDonutBanner;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import xsna.hzp0;

/* compiled from: DonutBannerAnalytics.kt */
/* loaded from: classes5.dex */
public final class qwn {
    public final UserId a;
    public boolean b;
    public boolean c;

    public qwn(UserId userId) {
        this.a = userId;
    }

    public final void a() {
        new hzp0.h(new SchemeStat$EventItem(SchemeStat$EventItem.Type.BROWSER, null, Long.valueOf(-this.a.b), null, null, null, 58, null), MobileOfficialAppsCoreNavStat$EventScreen.FRIENDS_IN_GROUP, new CommonCommunitiesStat$TypeDonutBanner(CommonCommunitiesStat$TypeDonutBanner.EventType.DONUT_BANNER_VIEW)).a();
    }
}
