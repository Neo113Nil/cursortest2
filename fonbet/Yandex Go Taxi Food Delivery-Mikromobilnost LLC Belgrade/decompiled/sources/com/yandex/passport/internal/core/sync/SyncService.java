package com.yandex.passport.internal.core.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.common.logger.c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0003J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/yandex/passport/internal/core/sync/SyncService;", "Landroid/app/Service;", "<init>", "()V", "Lzy11;", "onCreate", "onDestroy", "Landroid/content/Intent;", "intent", "Landroid/os/IBinder;", "onBind", "(Landroid/content/Intent;)Landroid/os/IBinder;", "passport_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SyncService extends Service {
    public static final int $stable = 0;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        try {
            c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onBind: intent=" + intent, 8);
            }
            return com.yandex.passport.internal.di.a.a().getSyncAdapter().getSyncAdapterBinder();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onCreate", 8);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "onDestroy", 8);
        }
    }
}
