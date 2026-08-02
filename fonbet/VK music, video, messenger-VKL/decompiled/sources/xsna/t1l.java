package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Set;

/* compiled from: DatingCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class t1l implements p9c {
    public final ForegroundEvent a = ForegroundEvent.DATING;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP, MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP_INTERNAL});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        SchemeStat$EventItem schemeStat$EventItem;
        Long b;
        return this.b.contains(mt50Var.a) && (schemeStat$EventItem = mt50Var.b) != null && (b = schemeStat$EventItem.b()) != null && b.longValue() == 7058363;
    }
}
