package ru.mail.verify.core.utils;

import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.VerifySafeJobIntentService;
import ru.mail.libverify.R;

/* loaded from: classes9.dex */
public class IntentProcessJobService extends VerifySafeJobIntentService {
    public IntentProcessJobService() {
        FileLog.v("IntentProcessJobService", "service created");
    }

    public static void a(@NonNull Context context, @NonNull Intent intent) {
        FileLog.v("IntentProcessJobService", "start %s (extras: %s)", intent, ru.mail.libverify.n0.e.a(intent.getExtras()));
        new Intent(intent).setComponent(new ComponentName(context, (Class<?>) IntentProcessJobService.class));
        JobIntentService.enqueueWork(context.getApplicationContext(), (Class<?>) IntentProcessJobService.class, context.getResources().getInteger(R.integer.libverify_settings_job_id), intent);
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final void onDestroy() {
        FileLog.v("IntentProcessJobService", "service destroyed");
        super.onDestroy();
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(@NonNull Intent intent) {
        if (TextUtils.isEmpty(intent.getAction())) {
            return;
        }
        FileLog.v("IntentProcessJobService", "handle %s (extras: %s)", intent, ru.mail.libverify.n0.e.a(intent.getExtras()));
        try {
            ru.mail.libverify.d0.a.a((Service) this, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.valueOf(intent.getAction()), intent.getExtras()));
        } catch (IllegalArgumentException unused) {
            FileLog.e("IntentProcessJobService", "there is no type %s in allowed message types", intent.getAction());
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        FileLog.v("IntentProcessJobService", "onStartCommand");
        return super.onStartCommand(intent, i, i2);
    }
}
