package ru.mail.libverify.notifications;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import ru.mail.verify.core.utils.d;
import xsna.rl3;

/* loaded from: classes9.dex */
public final class ChangePushPermissionsReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (context == null || intent == null || intent.getExtras() == null || !rl3.G(new String[]{"android.app.action.APP_BLOCK_STATE_CHANGED", "android.app.action.NOTIFICATION_CHANNEL_BLOCK_STATE_CHANGED"}, intent.getAction())) {
            return;
        }
        Intent intent2 = new Intent("SERVICE_SETTINGS_CHECK");
        intent2.putExtra("settings_action_type", "NOTIFICATION_SETTINGS_CHANGE");
        d.a(context, intent2);
    }
}
