package ru.mail.libverify.i;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import kotlin.random.Random;
import ru.mail.libverify.notifications.NotificationService;
import ru.mail.libverify.notifications.SettingsActivity;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class e {
    public static PendingIntent a(SmsCodeNotificationActivity smsCodeNotificationActivity, String str) {
        Random.b.getClass();
        int j = Random.c.j();
        Intent intent = new Intent(smsCodeNotificationActivity, (Class<?>) NotificationService.class);
        intent.setAction("action_cancel");
        intent.putExtra("notification_id", str);
        s3q0 s3q0Var = s3q0.a;
        return PendingIntent.getService(smsCodeNotificationActivity, j, intent, new ru.mail.libverify.z.a().b().c().a());
    }

    public static PendingIntent b(SmsCodeNotificationActivity smsCodeNotificationActivity, String str) {
        Random.b.getClass();
        int j = Random.c.j();
        Intent intent = new Intent(smsCodeNotificationActivity, (Class<?>) NotificationService.class);
        intent.setAction("action_confirm");
        intent.putExtra("notification_id", str);
        s3q0 s3q0Var = s3q0.a;
        return PendingIntent.getService(smsCodeNotificationActivity, j, intent, new ru.mail.libverify.z.a().b().c().a());
    }

    public static PendingIntent c(SmsCodeNotificationActivity smsCodeNotificationActivity, String str) {
        Random.b.getClass();
        int j = Random.c.j();
        Intent intent = new Intent(smsCodeNotificationActivity, (Class<?>) SettingsActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("notification_id", str);
        s3q0 s3q0Var = s3q0.a;
        return PendingIntent.getActivity(smsCodeNotificationActivity, j, intent, new ru.mail.libverify.z.a().b().c().a());
    }

    public static PendingIntent a(Context context, String str) {
        Random.b.getClass();
        int j = Random.c.j();
        Intent intent = new Intent(context, (Class<?>) NotificationService.class);
        intent.setAction("action_delete");
        intent.putExtra("notification_id", str);
        s3q0 s3q0Var = s3q0.a;
        return PendingIntent.getService(context, j, intent, new ru.mail.libverify.z.a().b().c().a());
    }

    public static PendingIntent b(Context context, String str) {
        Random.b.getClass();
        int j = Random.c.j();
        Intent intent = new Intent(context, (Class<?>) SmsCodeNotificationActivity.class);
        intent.setFlags(335544320);
        intent.putExtra("notification_id", str);
        s3q0 s3q0Var = s3q0.a;
        return PendingIntent.getActivity(context, j, intent, new ru.mail.libverify.z.a().b().c().a());
    }
}
