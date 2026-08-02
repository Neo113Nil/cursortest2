package ru.mail.libverify.h;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import ru.mail.libverify.api.q;
import ru.mail.libverify.ipc.IpcMessageService;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class g extends ru.mail.libverify.h.a {

    @NonNull
    private final String e;

    @NonNull
    private final String f;

    @Nullable
    private String g;

    public static class a implements c {

        @NonNull
        private final q a;

        @NonNull
        private final String b;

        @NonNull
        private final String c;

        public a(@NonNull q qVar, @NonNull String str, @NonNull String str2) {
            this.a = qVar;
            this.b = str;
            this.c = str2;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final Class<?> a() {
            return IpcMessageService.class;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final ru.mail.libverify.h.a b() {
            return new g(this.a, this.b, this.c, 0);
        }
    }

    public /* synthetic */ g(q qVar, String str, String str2, int i) {
        this(qVar, str, str2);
    }

    private boolean a(@NonNull Message message) {
        String string = message.getData().getString("data");
        if (TextUtils.isEmpty(string)) {
            FileLog.e("SmsTextClientHandler", "validateGetSessionsAckMessage can't parse empty ids");
            return false;
        }
        String[] split = string.split(StringUtils.COMMA);
        for (int i = 0; i < split.length && i < 5; i++) {
            if (this.g == null) {
                this.g = ru.mail.libverify.n0.e.f(this.e);
            }
            if (TextUtils.equals(this.g, split[i])) {
                FileLog.v("SmsTextClientHandler", "validateGetSessionsAckMessage found requested session id %s", this.e);
                return true;
            }
        }
        FileLog.e("SmsTextClientHandler", "validateGetSessionsAckMessage session id %s not found", this.e);
        return false;
    }

    @Override // ru.mail.libverify.h.a
    public final void d() {
        try {
            Messenger messenger = this.b;
            Message obtain = Message.obtain(this, 1);
            obtain.replyTo = b();
            obtain.setData(new Bundle());
            messenger.send(obtain);
        } catch (Exception e) {
            FileLog.e("SmsTextClientHandler", "postDataToService", e);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        if (c()) {
            return;
        }
        super.handleMessage(message);
        FileLog.v("SmsTextClientHandler", "handleMessage %s", message.toString());
        int i = message.what;
        if (i != 2) {
            if (i == 4) {
                this.a.a(true);
                return;
            }
            ru.mail.libverify.n0.b.a("SmsTextClientHandler", "handleMessage", new IllegalArgumentException("Can't process message with type " + message.what));
            this.a.a(false);
            return;
        }
        FileLog.v("SmsTextClientHandler", "processGetSessionsAckMessage");
        try {
        } catch (Exception e) {
            FileLog.e("SmsTextClientHandler", "processGetSessionsAckMessage", e);
        }
        if (!a(message)) {
            FileLog.e("SmsTextClientHandler", "processGetSessionsAckMessage - received message is not valid");
            this.a.a(false);
            return;
        }
        Messenger messenger = this.b;
        Message obtain = Message.obtain(this, 3);
        obtain.replyTo = b();
        Bundle bundle = new Bundle();
        bundle.putString("data", this.f);
        if (this.g == null) {
            this.g = ru.mail.libverify.n0.e.f(this.e);
        }
        bundle.putString("receiver", this.g);
        obtain.setData(bundle);
        messenger.send(obtain);
    }

    private g(@NonNull q qVar, @NonNull String str, @NonNull String str2) {
        super(qVar);
        this.e = str;
        this.f = str2;
    }
}
