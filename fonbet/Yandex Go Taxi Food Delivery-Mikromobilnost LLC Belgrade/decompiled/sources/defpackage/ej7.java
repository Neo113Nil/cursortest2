package defpackage;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import ru.yandex.in_app_calls.calls.MicrophoneService;

/* loaded from: classes4.dex */
public final class ej7 {
    public final Context a;
    public boolean b;
    public boolean c;
    public boolean d;
    public final NotificationManager e;

    public ej7(Context context) {
        this.a = context;
        this.e = (NotificationManager) context.getSystemService("notification");
    }

    public final void a() {
        f69 f69Var = xi7.a;
        f69.k("hideIncomingCall", Collections.singletonList("CallNotificationManager"));
        if (this.d) {
            this.e.cancel(MicrophoneService.NOTIFICATION_ID);
            this.d = false;
            f69.k("IncomingCall notification canceled", Collections.singletonList("CallNotificationManager"));
        }
    }

    public final boolean b() {
        List<ActivityManager.RunningServiceInfo> runningServices;
        Object systemService = this.a.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        boolean z = false;
        if (activityManager != null && (runningServices = activityManager.getRunningServices(Integer.MAX_VALUE)) != null) {
            List<ActivityManager.RunningServiceInfo> list = runningServices;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (jl40.l(((ActivityManager.RunningServiceInfo) it.next()).service.getClassName(), MicrophoneService.class.getName())) {
                        z = true;
                        break;
                    }
                }
            }
        }
        f69 f69Var = xi7.a;
        f69.k("isServiceRunning: " + z, Collections.singletonList("CallNotificationManager"));
        return z;
    }
}
