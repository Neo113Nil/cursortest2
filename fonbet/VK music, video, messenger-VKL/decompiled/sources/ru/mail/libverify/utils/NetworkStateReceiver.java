package ru.mail.libverify.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.Nullable;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(@Nullable Context context, @Nullable Intent intent) {
        if (context == null || intent == null) {
            return;
        }
        try {
            FileLog.d("OldNetworkStateReceiver", "pass an intent to a new receiver");
            new ru.mail.verify.core.utils.network.NetworkStateReceiver().onReceive(context, intent);
        } catch (Throwable th) {
            FileLog.e("OldNetworkStateReceiver", "an error raised during an old request processing", th);
        }
    }
}
