package ru.mail.libverify.ipc;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import ru.mail.libverify.api.j;
import ru.mail.libverify.g0.d;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class c extends a {
    public c(@NonNull d dVar, @NonNull j jVar) {
        super(dVar, jVar);
    }

    @Override // ru.mail.libverify.ipc.a
    public final void a(@NonNull Message message) {
        FileLog.v("SmsTextServiceHandler", "handleMessage %s", message.toString());
        int i = message.what;
        if (i == 1) {
            FileLog.v("SmsTextServiceHandler", "processGetSessionsMessage");
            ArrayList b = this.b.b();
            if (b.isEmpty()) {
                FileLog.e("SmsTextServiceHandler", "processGetSessionsMessage skipped");
                return;
            }
            try {
                message.replyTo.send(a(b));
                return;
            } catch (Exception e) {
                FileLog.e("SmsTextServiceHandler", "processGetSessionsMessage", e);
                return;
            }
        }
        if (i != 3) {
            ru.mail.libverify.n0.b.a("SmsTextServiceHandler", "handleMessage", new IllegalArgumentException("Can't process message with type " + message.what));
            return;
        }
        try {
            String string = message.getData().getString("data");
            String string2 = message.getData().getString("receiver");
            if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2)) {
                FileLog.v("SmsTextServiceHandler", "processPostSmsTextMessage sms %s for receiver %s", string, string2);
                this.a.post(e.a(ru.mail.libverify.p0.a.SERVICE_IPC_SMS_MESSAGE_RECEIVED, string2, string));
                Messenger messenger = message.replyTo;
                Message obtain = Message.obtain(this, 4);
                obtain.replyTo = a();
                obtain.setData(new Bundle());
                messenger.send(obtain);
                return;
            }
            FileLog.e("SmsTextServiceHandler", "processPostSmsTextMessage smsText and receiver shouldn't be empty");
        } catch (Exception e2) {
            FileLog.e("SmsTextServiceHandler", "processPostSmsTextMessage", e2);
        }
    }

    @NonNull
    private Message a(@NonNull List<String> list) {
        Message obtain = Message.obtain(this, 2);
        obtain.replyTo = a();
        Bundle bundle = new Bundle();
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            if (sb.length() != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(ru.mail.libverify.n0.e.f(str));
        }
        bundle.putString("data", sb.toString());
        obtain.setData(bundle);
        return obtain;
    }
}
