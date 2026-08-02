package xsna;

import com.vk.core.preference.Preference;

/* compiled from: NotificationPrefs.kt */
/* loaded from: classes4.dex */
public final class he70 {
    public static Long a() {
        if (Preference.v("notification_prefs", "notification_current_source")) {
            return Long.valueOf(Preference.m(0L, "notification_prefs", "notification_current_source"));
        }
        return null;
    }

    public static boolean b() {
        return Preference.d("notification_prefs", "notification_grouping_enabled", true);
    }
}
