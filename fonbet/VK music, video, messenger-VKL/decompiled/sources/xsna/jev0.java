package xsna;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.vk.metrics.eventtracking.Event;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: VkProxyReporter.kt */
/* loaded from: classes.dex */
public final class jev0 {
    public final Context a;
    public final fae0 b;
    public final AtomicInteger c = new AtomicInteger(0);
    public final TelephonyManager d;

    public jev0(Context context, fae0 fae0Var) {
        this.a = context;
        this.b = fae0Var;
        this.d = (TelephonyManager) context.getSystemService("phone");
    }

    public final void a() {
        String valueOf = String.valueOf(this.c.get());
        Locale locale = this.a.getResources().getConfiguration().locale;
        String networkOperator = this.d.getNetworkOperator();
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.i("FirebaseTracker");
        aVar.g("CRUCIAL_PROXY_DISABLE");
        aVar.c("events_count", valueOf);
        aVar.a(locale, "locale");
        aVar.c("mobile_code", networkOperator);
        bVar.k(aVar.e());
    }
}
