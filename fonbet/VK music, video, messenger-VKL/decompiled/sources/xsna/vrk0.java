package xsna;

import com.huawei.hms.common.data.DataBufferUtils;
import com.vk.metrics.trackers.CriticalException;
import com.vk.newsfeed.domain.model.DiscoverCustomIntent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$ClientCacheStatus;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$FeedIntent;
import kotlin.NoWhenBranchMatchedException;
import xsna.p1n;

/* compiled from: StatFeedTimelineConverter.kt */
/* loaded from: classes.dex */
public final class vrk0 {
    public static MobileOfficialAppsCoreNavStat$EventScreen a(int i, boolean z) {
        return i != -6 ? i != -5 ? i != -4 ? i != -2 ? i != 0 ? i <= -10 ? MobileOfficialAppsCoreNavStat$EventScreen.FEED_PROMOTED : MobileOfficialAppsCoreNavStat$EventScreen.FEED_CUSTOM : z ? MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP : MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT : MobileOfficialAppsCoreNavStat$EventScreen.FEED_FRIENDS : MobileOfficialAppsCoreNavStat$EventScreen.FEED_PHOTOS : MobileOfficialAppsCoreNavStat$EventScreen.FEED_VIDEOS : MobileOfficialAppsCoreNavStat$EventScreen.FEED_LIVES;
    }

    public static MobileOfficialAppsFeedStat$ClientCacheStatus b(p1n p1nVar) {
        if (p1nVar.equals(p1n.a.a)) {
            return MobileOfficialAppsFeedStat$ClientCacheStatus.EXPIRED;
        }
        if (p1nVar.equals(p1n.c.a)) {
            return MobileOfficialAppsFeedStat$ClientCacheStatus.WATCHED;
        }
        if (p1nVar.equals(p1n.b.a)) {
            return MobileOfficialAppsFeedStat$ClientCacheStatus.NONE;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static MobileOfficialAppsFeedStat$FeedIntent c(String str) {
        if (epx.f(str, "initial")) {
            return MobileOfficialAppsFeedStat$FeedIntent.INITIAL;
        }
        if (epx.f(str, "fresh")) {
            return MobileOfficialAppsFeedStat$FeedIntent.FRESH;
        }
        if (epx.f(str, "reload")) {
            return MobileOfficialAppsFeedStat$FeedIntent.RELOAD;
        }
        if (epx.f(str, "ptr")) {
            return MobileOfficialAppsFeedStat$FeedIntent.PTR;
        }
        if (epx.f(str, DataBufferUtils.NEXT_PAGE)) {
            return MobileOfficialAppsFeedStat$FeedIntent.NEXT_PAGE;
        }
        if (epx.f(str, DiscoverCustomIntent.PRELOAD.h())) {
            return MobileOfficialAppsFeedStat$FeedIntent.PRELOAD;
        }
        com.vk.metrics.eventtracking.b.a.a(new CriticalException(new IllegalArgumentException(go9.b("unknown intent: ", str))));
        return MobileOfficialAppsFeedStat$FeedIntent.INITIAL;
    }
}
