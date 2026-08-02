package ru.mail.verify.core.utils;

import android.app.IntentService;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* loaded from: classes9.dex */
public class IntentProcessService extends IntentService {
    public IntentProcessService() {
        super("IntentProcessService");
        setIntentRedelivery(true);
    }

    public static void a(@NonNull Context context, @NonNull Intent intent) {
        FileLog.v("IntentProcessService", "start %s (extras: %s)", intent, ru.mail.libverify.n0.e.a(intent.getExtras()));
        Intent intent2 = new Intent(intent);
        intent2.setComponent(new ComponentName(context, (Class<?>) IntentProcessService.class));
        try {
            context.startService(intent2);
        } catch (Throwable th) {
            FileLog.e("IntentProcessService", "failed to start settings service", th);
        }
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        FileLog.v("IntentProcessService", "handle %s (extras: %s)", intent, ru.mail.libverify.n0.e.a(intent.getExtras()));
        try {
            ru.mail.libverify.d0.a.a((Service) this, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.valueOf(intent.getAction()), intent.getExtras()));
        } catch (IllegalArgumentException unused) {
            FileLog.e("IntentProcessService", "there is no type %s in allowed message types", intent.getAction());
        }
    }
}
