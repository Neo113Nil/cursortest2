package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: VideoCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class cbs0 implements p9c {
    public final ForegroundEvent a = ForegroundEvent.VIDEO;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CAROUSEL, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DOWNLOADS, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_CATALOG, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_FOR_YOU, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_LIVE, MobileOfficialAppsCoreNavStat$EventScreen.SEARCH_VIDEO_SERVICE, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_EMBED, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_VIDEO, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SINGLE_INTERACTIVE_VIDEO, MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_SHOPPABLE_AD});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        return this.b.contains(mt50Var.a);
    }
}
