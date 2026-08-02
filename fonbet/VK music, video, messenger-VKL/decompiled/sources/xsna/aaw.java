package xsna;

import android.content.Context;
import android.content.SharedPreferences;
import com.vk.cachecontrol.api.CacheTarget;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.NotificationUtils;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.gx8;

/* compiled from: ImNotificationSettingsPrefs.kt */
/* loaded from: classes5.dex */
public final class aaw implements gx8.a {
    public static final aaw b;
    public static final /* synthetic */ qcy<Object>[] c;
    public static final g9e0 d;
    public static final String e;
    public static final CacheTarget f;

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(aaw.class, "currentUserPrefs", "getCurrentUserPrefs()Landroid/content/SharedPreferences;", 0);
        fpf0.a.getClass();
        c = new qcy[]{propertyReference1Impl};
        b = new aaw();
        d = new g9e0(new l63(19));
        e = "ImNotificationPrefs";
        f = CacheTarget.SYSTEM;
    }

    public static boolean b(NotificationUtils.Type type, UserId userId) {
        return d(userId).getBoolean("are_notifications_enabled_for_" + type, true);
    }

    public static SharedPreferences c() {
        qcy<Object> qcyVar = c[0];
        return (SharedPreferences) d.b();
    }

    public static SharedPreferences d(UserId userId) {
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        return Preference.h(context, 0, "im_notifications_" + userId);
    }

    public static void e(NotificationUtils.Type type, boolean z) {
        if (NotificationUtils.Type.MSG_TYPES.contains(type)) {
            String str = z ? "name_and_text" : "name_only";
            qaj0.c(c(), "notification_payload_for_" + type, str);
        }
    }

    @Override // xsna.gx8.a
    public final CacheTarget a() {
        return f;
    }

    @Override // xsna.gx8.a
    public final void dispose() {
        c().edit().clear().apply();
    }

    @Override // xsna.gx8.a
    public final String getDescription() {
        return e;
    }

    @Override // xsna.gx8.a
    public final long u() {
        return 0L;
    }
}
