package ru.mail.libverify.fetcher;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import ru.mail.libverify.n0.b;
import ru.mail.libverify.n0.e;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class FetcherService extends Service {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        FileLog.v("FetcherService", "service destroyed");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(@Nullable Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        FileLog.v("FetcherService", "onStartCommand with action %s, extra %s", intent == null ? null : intent.getAction(), intent == null ? null : e.a(intent.getExtras()));
        if (intent == null || TextUtils.isEmpty(intent.getAction())) {
            try {
                ru.mail.libverify.d0.a.a((Context) this, ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SERVICE_FETCHER_START_WITH_CHECK, (Object) null));
                return 1;
            } catch (Throwable th) {
                b.a("FetcherService", "failed to process fetcher start", th);
                return 1;
            }
        }
        String action = intent.getAction();
        action.getClass();
        if (action.equals("fetcher_stop")) {
            FileLog.d("FetcherService", "fetcher service has been stopped from an application");
            stopSelf();
            return 1;
        }
        if (action.equals("fetcher_start")) {
            FileLog.d("FetcherService", "fetcher service has been started from an application");
            return 1;
        }
        b.a("FetcherService", "illegal fetcher service action", new IllegalAccessException("illegal fetcher service action"));
        stopSelf();
        return 1;
    }
}
