package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: DiscoverCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class u1n implements p9c {
    public final ForegroundEvent a = ForegroundEvent.FEED;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS, MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_POST});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        return this.b.contains(mt50Var.a);
    }
}
