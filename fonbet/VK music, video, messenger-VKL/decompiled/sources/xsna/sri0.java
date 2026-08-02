package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: ServicesCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class sri0 implements p9c {
    public final ForegroundEvent a = ForegroundEvent.SERVICES;

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        return mt50Var.a == MobileOfficialAppsCoreNavStat$EventScreen.MINI_APPS_CATALOG;
    }
}
