package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Collections;
import java.util.Set;

/* compiled from: CallsCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class uc9 implements p9c {
    public final /* synthetic */ int a;
    public final ForegroundEvent b;
    public final Set c;

    public uc9(int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = ForegroundEvent.DZEN;
                this.c = Collections.singleton(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_DIGEST_DZEN);
                break;
            default:
                this.b = ForegroundEvent.CALLS;
                this.c = Collections.singleton(MobileOfficialAppsCoreNavStat$EventScreen.VOIP_CALL_LIST);
                break;
        }
    }

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        switch (this.a) {
        }
        return this.c.contains(mt50Var.a);
    }
}
