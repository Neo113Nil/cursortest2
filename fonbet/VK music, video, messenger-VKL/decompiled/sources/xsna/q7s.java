package xsna;

import com.vk.core.apps.BuildInfo;
import com.vk.metrics.eventtracking.Event;

/* compiled from: ForegroundServiceStartReporter.kt */
/* loaded from: classes5.dex */
public final class q7s {
    public static void a(String str) {
        if (BuildInfo.h() || BuildInfo.e()) {
            com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
            el3 el3Var = Event.b;
            Event.a aVar = new Event.a();
            aVar.g("foreground_service_start");
            aVar.c("service_name", str);
            com.vk.movika.sdk.base.model.n.c(aVar, e43.l("FirebaseTracker", "LoggingTracker"), bVar);
        }
    }
}
