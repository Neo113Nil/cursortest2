package xsna;

import android.content.Context;
import com.ironsource.C4504q2;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.pushes.NotificationUtils;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;
import java.util.Iterator;

/* compiled from: ImNotificationSettingsMigration.kt */
/* loaded from: classes5.dex */
public final class z9w {
    public static void a() {
        if (BuildInfo.t()) {
            aaw.b.getClass();
            boolean z = false;
            if (!aaw.c().getBoolean("is_migration_done", false)) {
                Iterator<T> it = NotificationUtils.Type.MSG_TYPES.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    NotificationUtils.Type type = (NotificationUtils.Type) it.next();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    boolean z2 = NotificationUtils.a;
                    if (Preference.g(context).contains(C4504q2.x + type.key)) {
                        Context context2 = e43.a;
                        if (context2 == null) {
                            context2 = null;
                        }
                        boolean z3 = Preference.g(context2).getBoolean(C4504q2.x + type.key, true);
                        aaw.b.getClass();
                        qaj0.c(aaw.c(), "are_notifications_enabled_for_" + type, Boolean.valueOf(z3));
                        z = true;
                    }
                    Context context3 = e43.a;
                    if (context3 == null) {
                        context3 = null;
                    }
                    if (Preference.g(context3).contains("notificationNoText" + type)) {
                        Context context4 = e43.a;
                        boolean h = NotificationUtils.h(context4 != null ? context4 : null, type);
                        aaw.b.getClass();
                        aaw.e(type, h);
                        z = true;
                    }
                }
                aaw.b.getClass();
                qaj0.c(aaw.c(), "is_migration_done", Boolean.TRUE);
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.d, new Object[]{zhy0.a("[Push]: Was push settings migration really done: ", z)});
                }
                if (z) {
                    l5m l5mVar = new l5m(null, null, 3);
                    l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.PUSH_SETTINGS_MIGRATION.h(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2, 3, null);
                    l5mVar.q();
                    return;
                }
                return;
            }
        }
        L l2 = L.a;
        l2.getClass();
        if (L.m(LoggerOutputTarget.NONE)) {
            return;
        }
        L.u(l2, L.LogType.d, new Object[]{"[Push]: No need for push settings migration"});
    }
}
