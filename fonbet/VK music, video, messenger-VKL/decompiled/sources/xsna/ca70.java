package xsna;

import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.service.notification.StatusBarNotification;
import com.vk.core.preference.Preference;
import com.vk.dto.notifications.settings.NotificationSettingsCategory;
import com.vk.dto.notifications.settings.NotificationsSettingsConfig;
import com.vk.pushes.NotificationUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

/* compiled from: NotificationHelper.kt */
/* loaded from: classes.dex */
public final class ca70 {
    public static final ca70 a = new ca70();
    public static final HashMap<Number, Integer> b = new HashMap<>();
    public static final HashSet<Integer> c = new HashSet<>();
    public static final bpn0 d = new bpn0(new tog(6));
    public static final Handler e = new Handler(Looper.getMainLooper());

    public static void a(Context context, String str, Number number) {
        sv1.B(str, number);
        f(context).cancel(str, e(number));
    }

    @ozl
    public static void c(Context context) {
        Context context2 = e43.a;
        if (context2 == null) {
            context2 = null;
        }
        if (context2.getApplicationInfo().targetSdkVersion < 31) {
            context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } else {
            tv4.b("Don't use Intent.ACTION_CLOSE_SYSTEM_DIALOGS on Andorid 12+", com.vk.metrics.eventtracking.b.a);
        }
    }

    public static int d(Context context, String str) {
        try {
            int i = 0;
            for (StatusBarNotification statusBarNotification : f(context).getActiveNotifications()) {
                if (epx.f(statusBarNotification.getNotification().getGroup(), str) && (statusBarNotification.getNotification().flags & 512) == 0) {
                    i++;
                }
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static int e(Number number) {
        if (number instanceof Integer) {
            return number.intValue();
        }
        HashMap<Number, Integer> hashMap = b;
        Integer num = hashMap.get(number);
        if (num != null) {
            return num.intValue();
        }
        for (int i = 0; i < 101; i++) {
            int nextInt = ((Random) d.getValue()).nextInt();
            if (nextInt > 100) {
                Integer valueOf = Integer.valueOf(nextInt);
                HashSet<Integer> hashSet = c;
                if (!hashSet.contains(valueOf)) {
                    hashSet.add(Integer.valueOf(nextInt));
                    hashMap.put(number, Integer.valueOf(nextInt));
                    return nextInt;
                }
            }
        }
        return number.intValue();
    }

    public static NotificationManager f(Context context) {
        return (NotificationManager) context.getSystemService("notification");
    }

    public static boolean g() {
        return !brm0.w(Build.MANUFACTURER, "xiaomi", true) ? gz80.a(24) : gz80.a(26);
    }

    public static void h(NotificationUtils.Type type, NotificationSettingsCategory notificationSettingsCategory) {
        Object obj;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        NotificationUtils.k(context, type, notificationSettingsCategory.Bb());
        ArrayList<NotificationsSettingsConfig> Ab = notificationSettingsCategory.Ab();
        if (Ab != null) {
            Iterator<T> it = Ab.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((NotificationsSettingsConfig) obj).zb()) {
                        break;
                    }
                }
            }
            NotificationsSettingsConfig notificationsSettingsConfig = (NotificationsSettingsConfig) obj;
            if (notificationsSettingsConfig != null) {
                boolean z = !epx.f(notificationsSettingsConfig.getId(), "no_text");
                Context context2 = e43.a;
                NotificationUtils.l(context2 != null ? context2 : null, type, z);
            }
        }
    }

    public final void i(int i, Context context) {
        if (Preference.g(context).getBoolean("notifyShortcutBadge", true)) {
            z4g.d().j(i, context);
        }
    }
}
