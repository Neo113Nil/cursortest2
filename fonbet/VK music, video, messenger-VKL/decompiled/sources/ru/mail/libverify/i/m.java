package ru.mail.libverify.i;

import android.app.NotificationChannel;
import android.content.Context;
import android.text.TextUtils;
import ru.mail.libverify.R;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public final class m {
    private final Context a;
    private final int b = R.string.libverify_low_notification_id;
    private final int c = R.string.libverify_high_notification_id;
    private final int d = R.string.libverify_low_notification_name;
    private final int e = R.string.libverify_high_notification_name;
    private final int f = R.string.libverify_low_notification_description;
    private final int g = R.string.libverify_high_notification_description;
    private final int h = R.string.libverify_resource_led_color_id;

    public m(Context context) {
        this.a = context;
    }

    public final NotificationChannel a() {
        NotificationChannel notificationChannel = new NotificationChannel(this.a.getString(this.c), this.a.getString(this.e), 4);
        notificationChannel.setDescription(this.a.getString(this.g));
        Context context = this.a;
        String string = context.getString(this.h);
        Integer num = null;
        if (!TextUtils.isEmpty(string)) {
            int identifier = context.getResources().getIdentifier(string, null, context.getPackageName());
            if (identifier > 0) {
                num = Integer.valueOf(context.getColor(identifier));
            } else {
                FileLog.e("Utils", "Color id %d not found for color name (from resources) %s", Integer.valueOf(identifier), string);
            }
        }
        notificationChannel.setLightColor(num == null ? -1 : num.intValue());
        notificationChannel.enableLights(true);
        notificationChannel.enableVibration(true);
        notificationChannel.setVibrationPattern(new long[]{500, 500});
        return notificationChannel;
    }

    public final NotificationChannel b() {
        NotificationChannel notificationChannel = new NotificationChannel(this.a.getString(this.b), this.a.getString(this.d), 3);
        notificationChannel.setDescription(this.a.getString(this.f));
        notificationChannel.enableLights(false);
        notificationChannel.enableVibration(false);
        return notificationChannel;
    }
}
