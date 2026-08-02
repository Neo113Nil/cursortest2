package ru.mail.libverify.ipc;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.j;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
public class IpcNotificationService extends Service {
    private b a;

    @Override // android.app.Service
    @Nullable
    public final IBinder onBind(@NonNull Intent intent) {
        FileLog.v("IpcNotifyService", "onBind from initiator %s", intent.getStringExtra("bind_initiator"));
        if (!VerificationFactory.hasInstallation(this)) {
            Log.e("IpcNotifyService", "libverify isn't initialized for this application");
            return null;
        }
        if (this.a == null) {
            this.a = new b(ru.mail.libverify.d0.a.c(this).get(), (j) VerificationFactory.get(this));
        }
        return this.a.a().getBinder();
    }
}
