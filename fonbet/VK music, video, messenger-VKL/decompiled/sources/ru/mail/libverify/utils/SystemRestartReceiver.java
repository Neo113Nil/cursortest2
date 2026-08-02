package ru.mail.libverify.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.j;
import ru.mail.libverify.n0.c;
import ru.mail.libverify.p0.a;
import ru.mail.verify.core.utils.d;

/* loaded from: classes9.dex */
public class SystemRestartReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null || intent.getAction() == null || !"android.intent.action.BOOT_COMPLETED".equals(intent.getAction()) || !VerificationFactory.hasInstallation(context)) {
            return;
        }
        Intent intent2 = new Intent(a.GCM_REFRESH_TOKEN.name());
        intent2.putExtra("gcm_token_check_type", c.ONCE.name());
        d.a(context, intent2);
        Intent intent3 = new Intent(a.SERVICE_SETTINGS_CHECK.name());
        intent3.putExtra("settings_action_type", j.a.RESTART.name());
        d.a(context, intent3);
    }
}
