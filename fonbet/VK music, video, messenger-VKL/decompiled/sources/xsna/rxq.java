package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: FeedCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class rxq implements p9c {
    public final ForegroundEvent a = ForegroundEvent.FEED;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.FEED, MobileOfficialAppsCoreNavStat$EventScreen.FEED_COMMENT, MobileOfficialAppsCoreNavStat$EventScreen.FEED_CUSTOM, MobileOfficialAppsCoreNavStat$EventScreen.FEED_FRIENDS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_PHOTOS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST, MobileOfficialAppsCoreNavStat$EventScreen.FEED_POST_SIMILAR_NEWS, MobileOfficialAppsCoreNavStat$EventScreen.FEED_PROMOTED, MobileOfficialAppsCoreNavStat$EventScreen.FEED_RECENT, MobileOfficialAppsCoreNavStat$EventScreen.FEED_TOP});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        return this.b.contains(mt50Var.a);
    }
}
