package xsna;

import com.vk.core.ui.tracking.UiTracker;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;

/* compiled from: StatApiTimelineNetworkParams.kt */
/* loaded from: classes4.dex */
public final class krk0 {
    public final boolean a;
    public final MobileOfficialAppsCoreNavStat$EventScreen b;
    public final p1n c;

    public krk0(boolean z, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen, p1n p1nVar) {
        this.a = z;
        this.b = mobileOfficialAppsCoreNavStat$EventScreen;
        this.c = p1nVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ krk0(int i, MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen) {
        this(r0, mobileOfficialAppsCoreNavStat$EventScreen, null);
        boolean z = (i & 1) == 0;
        if ((i & 2) != 0) {
            UiTracker uiTracker = UiTracker.a;
            mobileOfficialAppsCoreNavStat$EventScreen = UiTracker.c();
        }
    }
}
