package ru.mail.libverify.ipc;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import ru.mail.libverify.api.j;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class b extends a {
    public b(@NonNull d dVar, @NonNull j jVar) {
        super(dVar, jVar);
    }

    @Override // ru.mail.libverify.ipc.a
    public final void a(@NonNull Message message) {
        FileLog.v("IpcNotifyHandler", "handleMessage %s", message.toString());
        int i = message.what;
        if (i == 5) {
            try {
                String string = message.getData().getString("data");
                long j = message.getData().getLong("timestamp");
                if (TextUtils.isEmpty(string)) {
                    FileLog.e("IpcNotifyHandler", "serverNotificationId can't be empty");
                    return;
                } else {
                    FileLog.v("IpcNotifyHandler", "process cancel message from %s", string);
                    this.a.post(e.a(ru.mail.libverify.p0.a.SERVICE_IPC_CANCEL_NOTIFICATION_RECEIVED, string, Long.valueOf(j)));
                    return;
                }
            } catch (Exception e) {
                FileLog.e("IpcNotifyHandler", "process cancel message failed", e);
                return;
            }
        }
        if (i == 6) {
            try {
                String string2 = message.getData().getString("data");
                if (TextUtils.isEmpty(string2)) {
                    FileLog.e("IpcNotifyHandler", "fetcher package name can't be empty");
                    return;
                } else {
                    FileLog.v("IpcNotifyHandler", "fetcher started from %s", string2);
                    this.a.post(e.a(ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STARTED_RECEIVED, string2));
                    return;
                }
            } catch (Exception e2) {
                FileLog.e("IpcNotifyHandler", "process fetcher started message failed", e2);
                return;
            }
        }
        if (i != 7) {
            FileLog.e("IpcNotifyHandler", "Can't process message with type " + message.what);
            return;
        }
        try {
            String string3 = message.getData().getString("data");
            if (TextUtils.isEmpty(string3)) {
                FileLog.e("IpcNotifyHandler", "fetcher package name can't be empty");
            } else {
                FileLog.v("IpcNotifyHandler", "fetcher stopped from %s", string3);
                this.a.post(e.a(ru.mail.libverify.p0.a.SERVICE_IPC_FETCHER_STOPPED_RECEIVED, string3));
            }
        } catch (Exception e3) {
            FileLog.e("IpcNotifyHandler", "process fetcher stopped message failed", e3);
        }
    }
}
