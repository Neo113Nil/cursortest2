package xsna;

import com.my.tracker.MyTracker;
import com.vk.metrics.trackers.my.TimeSpentException;
import com.vk.metrics.trackers.my.event.ForegroundEvent;
import com.vk.metrics.trackers.my.event.ServiceEvent;
import com.vk.metrics.trackers.my.event.SingleEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: MyTimeSpentTracker.kt */
/* loaded from: classes.dex */
public final class jt50 {
    public static final ConcurrentHashMap.KeySetView<Object, Boolean> a = ConcurrentHashMap.newKeySet();
    public static final ConcurrentHashMap.KeySetView<MobileOfficialAppsCoreNavStat$EventScreen, Boolean> b = ConcurrentHashMap.newKeySet();

    public static void a(SingleEvent singleEvent) {
        if (b()) {
            return;
        }
        singleEvent.toString();
        MyTracker.incrementEventTimeSpent(singleEvent.h());
    }

    public static boolean b() {
        uc00 uc00Var = uc00.a;
        return !uc00.b;
    }

    public static void c(ForegroundEvent foregroundEvent) {
        if (b()) {
            return;
        }
        foregroundEvent.toString();
        if (!a.add(foregroundEvent)) {
            com.vk.metrics.eventtracking.b.a.q(new TimeSpentException("Already started tracking for " + foregroundEvent));
        }
        MyTracker.startForegroundTimeSpent(foregroundEvent.h());
    }

    public static void d(ServiceEvent serviceEvent) {
        if (b()) {
            return;
        }
        serviceEvent.toString();
        if (!a.add(serviceEvent)) {
            com.vk.metrics.eventtracking.b.a.q(new TimeSpentException("Already started tracking for " + serviceEvent));
        }
        MyTracker.startAnytimeTimeSpent(serviceEvent.h());
    }

    public static void e(ForegroundEvent foregroundEvent) {
        if (b()) {
            return;
        }
        foregroundEvent.toString();
        a.remove(foregroundEvent);
        MyTracker.stopForegroundTimeSpent(foregroundEvent.h());
    }

    public static void f(ServiceEvent serviceEvent) {
        if (b()) {
            return;
        }
        serviceEvent.toString();
        a.remove(serviceEvent);
        MyTracker.stopAnytimeTimeSpent(serviceEvent.h());
    }
}
