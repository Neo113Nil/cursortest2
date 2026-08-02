package xsna;

import com.mbridge.msdk.out.reveue.MBridgeRevenueParamsEntity;
import com.vk.metrics.eventtracking.Event;

/* compiled from: WebAppTracker.kt */
/* loaded from: classes7.dex */
public final class ffx0 implements ocn0 {
    public static final ffx0 a = new ffx0();

    @Override // xsna.ocn0
    public final void a(String str) {
        if (str == null) {
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("open_superapp");
            aVar.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
            com.vk.metrics.eventtracking.b.a.k(aVar.e());
            return;
        }
        el3 el3Var2 = Event.b;
        Event.a aVar2 = new Event.a();
        aVar2.g("bloggers_view");
        aVar2.c("blogger_id", str);
        aVar2.i(MBridgeRevenueParamsEntity.ATTRIBUTION_PLATFORM_MY_TRACKER);
        com.vk.metrics.eventtracking.b.a.k(aVar2.e());
    }
}
