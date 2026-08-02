package xsna;

import com.vk.core.network.metrics.traffic.TrafficItem;
import com.vk.log.L;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;

/* compiled from: NetworkTrafficMeter.kt */
/* loaded from: classes.dex */
public final class y560 {
    public final bpn0 a = new bpn0(new dr6(9));
    public final ConcurrentHashMap<okhttp3.p, TrafficItem> b = new ConcurrentHashMap<>();
    public final kip0 c;
    public final x560 d;

    /* compiled from: NetworkTrafficMeter.kt */
    public interface a {
        void b();

        void c();

        default boolean f(String str) {
            return true;
        }
    }

    public y560() {
        kip0 kip0Var = new kip0();
        kip0Var.b = new ArrayList<>(10);
        kip0Var.a = 0;
        this.c = kip0Var;
        x560 x560Var = new x560(this, 0);
        this.d = x560Var;
        asu0.a.getClass();
        asu0.r().d(x560Var, 12000L, TimeUnit.MILLISECONDS);
    }

    public final lip0 a() {
        return (lip0) this.a.getValue();
    }

    public final void b(okhttp3.p pVar) {
        TrafficItem trafficItem = this.b.get(pVar);
        if (trafficItem != null) {
            kip0 kip0Var = this.c;
            kip0Var.getClass();
            try {
                if (epx.f(trafficItem.c, "POST") && brm0.B(trafficItem.d, "https://api.vk.com/method/execute", false)) {
                    if (kip0Var.a >= 10) {
                        kip0Var.a = 0;
                    }
                    kip0Var.a(trafficItem, kip0Var.a);
                    kip0Var.a++;
                }
            } catch (Throwable th) {
                L.g("speed request accumulator", th);
                kip0Var.b = new ArrayList<>(10);
                kip0Var.a = 0;
            }
        }
        this.b.remove(pVar);
    }
}
