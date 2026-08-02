package ru.mail.verify.core.gcm;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.app.JobIntentService;
import androidx.core.app.VerifySafeJobIntentService;
import java.util.Map;
import ru.mail.libverify.R;
import ru.mail.libverify.d0.a;
import ru.mail.libverify.n0.c;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;
import ru.ok.android.sdk.SharedKt;

/* loaded from: classes9.dex */
public class GcmProcessService extends VerifySafeJobIntentService {
    public static void a(@NonNull Context context, @NonNull String str, @NonNull Bundle bundle) {
        Intent intent = new Intent(context, (Class<?>) GcmProcessService.class);
        intent.setAction("process_message");
        intent.putExtra("from", str);
        intent.putExtra("data", bundle);
        enqueueWork(context, intent);
    }

    public static void enqueueWork(@NonNull Context context, @NonNull Intent intent) {
        try {
            JobIntentService.enqueueWork(context.getApplicationContext(), (Class<?>) GcmProcessService.class, context.getResources().getInteger(R.integer.libverify_gcm_process_job_id), intent);
        } catch (Throwable th) {
            FileLog.e("GcmProcessService", "failed to start a service", th);
        }
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final void onDestroy() {
        FileLog.v("GcmProcessService", "service destroyed");
        super.onDestroy();
    }

    @Override // androidx.core.app.JobIntentService
    public final void onHandleWork(@NonNull Intent intent) {
        if (SharedKt.PARAM_REFRESH_TOKEN.equals(intent.getAction())) {
            Bundle bundle = new Bundle();
            bundle.putString("gcm_token_check_type", c.ONCE.name());
            a.a((Service) this, e.a(ru.mail.libverify.p0.a.GCM_REFRESH_TOKEN, bundle));
            return;
        }
        String stringExtra = intent.getStringExtra("from");
        Bundle bundleExtra = intent.getBundleExtra("data");
        if (TextUtils.isEmpty(stringExtra) || bundleExtra == null) {
            FileLog.e("GcmMessageProcessor", "wrong message received (either 'from' or 'data' is empty)");
            return;
        }
        if (!TextUtils.equals(stringExtra, a.d(this))) {
            FileLog.d("GcmMessageProcessor", "skip message from unknown server", stringExtra);
            return;
        }
        String string = bundleExtra.getString("server_info");
        if (!TextUtils.isEmpty(string)) {
            a.a((Service) this, e.a(ru.mail.libverify.p0.a.GCM_SERVER_INFO_RECEIVED, stringExtra, string));
        }
        String string2 = bundleExtra.getString("fetcher_info");
        if (!TextUtils.isEmpty(string2)) {
            a.a((Service) this, e.a(ru.mail.libverify.p0.a.GCM_FETCHER_INFO_RECEIVED, stringExtra, string2));
        }
        String string3 = bundleExtra.getString("data");
        if (TextUtils.isEmpty(string3)) {
            string3 = bundleExtra.getString("libverify_data");
        }
        if (TextUtils.isEmpty(string3)) {
            FileLog.e("GcmMessageProcessor", "wrong message received (message data is empty)");
            return;
        }
        FileLog.v("GcmMessageProcessor", "message received from %s with text %s", stringExtra, string3);
        a.a((Service) this, e.a(ru.mail.libverify.p0.a.GCM_MESSAGE_RECEIVED, stringExtra, string3, bundleExtra.getString("key")));
    }

    @Override // androidx.core.app.JobIntentService, android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        FileLog.v("GcmProcessService", "onStartCommand");
        return super.onStartCommand(intent, i, i2);
    }

    public static void a(@NonNull Context context, @NonNull String str, @NonNull Map<String, String> map) {
        Intent intent = new Intent(context, (Class<?>) GcmProcessService.class);
        intent.setAction("process_message");
        intent.putExtra("from", str);
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        intent.putExtra("data", bundle);
        enqueueWork(context, intent);
    }

    public static void a(@NonNull Context context) {
        Intent intent = new Intent(context, (Class<?>) GcmProcessService.class);
        intent.setAction(SharedKt.PARAM_REFRESH_TOKEN);
        enqueueWork(context, intent);
    }
}
