package ru.mail.libverify.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.j;
import ru.mail.libverify.n0.c;
import ru.mail.libverify.p0.a;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.d;

/* loaded from: classes9.dex */
public class PackageStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null || TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        FileLog.d("PackageStateReceiver", "received %s %s", intent.getAction(), intent.getData());
        String action = intent.getAction();
        action.getClass();
        switch (action) {
            case "android.intent.action.PACKAGE_REPLACED":
                if (TextUtils.equals(intent.getData() == null ? null : intent.getData().toString(), "package:" + context.getPackageName()) && VerificationFactory.hasInstallation(context)) {
                    Intent intent2 = new Intent(a.GCM_REFRESH_TOKEN.name());
                    intent2.putExtra("gcm_token_check_type", c.ONCE.name());
                    d.a(context, intent2);
                    ru.mail.libverify.n0.a.a(context, false).a(a.SERVICE_SETTINGS_CHECK.name()).a(3600000L).a("settings_action_type", j.a.PACKAGE_UPDATED.name()).c();
                    break;
                }
                break;
            case "android.intent.action.PACKAGE_REMOVED":
                if (VerificationFactory.hasInstallation(context)) {
                    ru.mail.libverify.n0.a.a(context, false).a(a.SERVICE_SETTINGS_CHECK.name()).a(3600000L).a("settings_action_type", j.a.PACKAGE_REMOVED.name()).c();
                    break;
                }
                break;
            case "android.intent.action.MY_PACKAGE_REPLACED":
                if (VerificationFactory.hasInstallation(context)) {
                    Intent intent3 = new Intent(a.GCM_REFRESH_TOKEN.name());
                    intent3.putExtra("gcm_token_check_type", c.ONCE.name());
                    d.a(context, intent3);
                    ru.mail.libverify.n0.a.a(context, false).a(a.SERVICE_SETTINGS_CHECK.name()).a(3600000L).a("settings_action_type", j.a.PACKAGE_UPDATED.name()).c();
                    break;
                }
                break;
        }
    }
}
