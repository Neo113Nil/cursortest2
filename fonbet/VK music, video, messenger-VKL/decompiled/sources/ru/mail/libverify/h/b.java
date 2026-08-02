package ru.mail.libverify.h;

import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.NonNull;
import ru.mail.libverify.api.q;
import ru.mail.libverify.ipc.IpcNotificationService;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class b extends ru.mail.libverify.h.a {

    @NonNull
    private final String e;
    private final long f;

    public static class a implements c {

        @NonNull
        private final q a;
        private final long b;

        @NonNull
        private final String c;

        public a(@NonNull q qVar, @NonNull String str, long j) {
            this.a = qVar;
            this.c = str;
            this.b = j;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final Class<?> a() {
            return IpcNotificationService.class;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final ru.mail.libverify.h.a b() {
            return new b(this.a, this.c, this.b, 0);
        }
    }

    public /* synthetic */ b(q qVar, String str, long j, int i) {
        this(qVar, str, j);
    }

    @Override // ru.mail.libverify.h.a
    public final void d() {
        try {
            Messenger messenger = this.b;
            String str = this.e;
            Message obtain = Message.obtain(this, 5);
            obtain.replyTo = b();
            Bundle bundle = new Bundle();
            bundle.putString("data", str);
            bundle.putLong("timestamp", this.f);
            obtain.setData(bundle);
            messenger.send(obtain);
            this.a.a(true);
        } catch (Exception e) {
            FileLog.e("CancelNotification", "postDataToService", e);
        }
    }

    private b(@NonNull q qVar, @NonNull String str, long j) {
        super(qVar);
        this.e = str;
        this.f = j;
    }
}
