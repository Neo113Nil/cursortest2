package xsna;

import com.vk.metrics.eventtracking.Event;
import java.util.Locale;

/* compiled from: ProxyInitializer.kt */
/* loaded from: classes.dex */
public final class fae0 {
    public final void a(String str, String str2, Locale locale) {
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.i("FirebaseTracker");
        aVar.g("CRUCIAL_PROXY_ENABLE");
        aVar.c("events_count", str);
        aVar.a(locale, "locale");
        aVar.c("mobile_code", str2);
        bVar.k(aVar.e());
    }
}
