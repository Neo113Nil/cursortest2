package ru.mail.libverify.utils;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.j;
import ru.mail.libverify.n0.b;
import ru.mail.libverify.n0.c;
import ru.mail.libverify.z.a;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.d;

/* loaded from: classes9.dex */
public class AlarmReceiver extends BroadcastReceiver {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x009d, code lost:
    
        if (r0.equals("unblock_notification") == false) goto L15;
     */
    @Override // android.content.BroadcastReceiver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        AlarmManager alarmManager;
        Intent intent2;
        if (context == null || intent == null || intent.getAction() == null || (alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM)) == null) {
            return;
        }
        char c = 0;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, intent, new a().c().a()));
        if (VerificationFactory.hasInstallation(context)) {
            FileLog.d("OldAlarmReceiver", "received action %s", intent.getAction());
            String action = intent.getAction();
            action.getClass();
            switch (action.hashCode()) {
                case 529905078:
                    break;
                case 1043572956:
                    if (action.equals("check_sms_templates")) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case 1144303715:
                    if (action.equals("app_started")) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case 1153603515:
                    if (action.equals("package_changed")) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 1242322408:
                    if (action.equals("refresh_push_token_once")) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 1361129850:
                    if (action.equals("check_settings")) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 1442811000:
                    if (action.equals("refresh_push_token")) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    String stringExtra = intent.getStringExtra("notification_id");
                    Intent intent3 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_NOTIFICATION_UNBLOCK.name());
                    intent3.putExtra("notification_id", stringExtra);
                    intent2 = intent3;
                    break;
                case 1:
                    intent2 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name());
                    intent2.putExtra("settings_action_type", j.a.SMS_TEMPLATES_CHECK.name());
                    break;
                case 2:
                    intent2 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name());
                    intent2.putExtra("settings_action_type", j.a.RESTART.name());
                    break;
                case 3:
                    String stringExtra2 = intent.getStringExtra("package_change_type");
                    if (stringExtra2 != null) {
                        if (!stringExtra2.equals("package_change_updated")) {
                            if (stringExtra2.equals("package_change_removed")) {
                                intent2 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name());
                                intent2.putExtra("settings_action_type", j.a.PACKAGE_REMOVED.name());
                                break;
                            } else {
                                b.a("OldAlarmReceiver", "failed to process broadcast", new IllegalArgumentException("unknown change type"));
                            }
                        } else {
                            intent2 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name());
                            intent2.putExtra("settings_action_type", j.a.PACKAGE_UPDATED.name());
                            break;
                        }
                    } else {
                        b.a("OldAlarmReceiver", "failed to process broadcast", new IllegalArgumentException("unknown change type"));
                    }
                    intent2 = null;
                    break;
                case 4:
                    intent2 = new Intent(ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN.name());
                    intent2.putExtra("gcm_token_check_type", c.ONCE.name());
                    break;
                case 5:
                    intent2 = new Intent(ru.mail.libverify.p0.a.SERVICE_SETTINGS_CHECK.name());
                    intent2.putExtra("settings_action_type", j.a.TIMER.name());
                    break;
                case 6:
                    intent2 = new Intent(ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN.name());
                    intent2.putExtra("gcm_token_check_type", c.PERIODIC.name());
                    break;
                default:
                    b.a("OldAlarmReceiver", "failed to process broadcast", new IllegalArgumentException("unknown action"));
                    intent2 = null;
                    break;
            }
            if (intent2 != null) {
                d.a(context, intent2);
            }
        }
    }
}
