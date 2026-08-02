package ru.mail.libverify.h;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import androidx.annotation.NonNull;
import ru.mail.libverify.api.q;
import ru.mail.libverify.ipc.IpcNotificationService;
import ru.mail.verify.core.utils.FileLog;

/* loaded from: classes9.dex */
final class d extends ru.mail.libverify.h.a {

    @NonNull
    private final c e;

    @NonNull
    private final String f;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[c.values().length];
            a = iArr;
            try {
                iArr[c.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[c.STOPPED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b implements ru.mail.libverify.h.c {

        @NonNull
        private final q a;

        @NonNull
        private final Context b;

        @NonNull
        private final c c;

        public b(@NonNull q qVar, @NonNull Context context, @NonNull c cVar) {
            this.a = qVar;
            this.b = context;
            this.c = cVar;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final Class<?> a() {
            return IpcNotificationService.class;
        }

        @Override // ru.mail.libverify.h.c
        @NonNull
        public final ru.mail.libverify.h.a b() {
            return new d(this.a, this.c, this.b.getPackageName(), 0);
        }
    }

    public enum c {
        STARTED,
        STOPPED
    }

    public /* synthetic */ d(q qVar, c cVar, String str, int i) {
        this(qVar, cVar, str);
    }

    @NonNull
    private Message a(@NonNull c cVar) {
        Message obtain;
        int i = a.a[cVar.ordinal()];
        if (i == 1) {
            obtain = Message.obtain(this, 6);
        } else {
            if (i != 2) {
                throw new IllegalArgumentException("unknown fetcher state");
            }
            obtain = Message.obtain(this, 7);
        }
        obtain.replyTo = b();
        Bundle bundle = new Bundle();
        bundle.putString("data", this.f);
        obtain.setData(bundle);
        return obtain;
    }

    @Override // ru.mail.libverify.h.a
    public final void d() {
        try {
            this.b.send(a(this.e));
            this.a.a(true);
        } catch (Throwable th) {
            FileLog.e("FetcherState", "postDataToService", th);
        }
    }

    private d(@NonNull q qVar, @NonNull c cVar, @NonNull String str) {
        super(qVar);
        this.e = cVar;
        this.f = str;
    }
}
