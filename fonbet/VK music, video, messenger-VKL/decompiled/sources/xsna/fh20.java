package xsna;

import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.Set;

/* compiled from: MessengerCheckpointStrategy.kt */
/* loaded from: classes3.dex */
public final class fh20 implements p9c {
    public final ForegroundEvent a = ForegroundEvent.MESSENGER;
    public final Set<MobileOfficialAppsCoreNavStat$EventScreen> b = rl3.y0(new MobileOfficialAppsCoreNavStat$EventScreen[]{MobileOfficialAppsCoreNavStat$EventScreen.IM, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, MobileOfficialAppsCoreNavStat$EventScreen.IM_CONVERSATION_DETAIL});

    @Override // xsna.p9c
    public final ForegroundEvent a() {
        return this.a;
    }

    @Override // xsna.p9c
    public final boolean b(mt50 mt50Var) {
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = mt50Var.a;
        return brm0.B(com.vk.stat.scheme.t0.a(mobileOfficialAppsCoreNavStat$EventScreen), "im", false) || this.b.contains(mobileOfficialAppsCoreNavStat$EventScreen);
    }
}
