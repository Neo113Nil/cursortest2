package ru.mail.libverify.ipc;

import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import androidx.annotation.NonNull;
import ru.mail.libverify.api.j;
import ru.mail.libverify.g0.d;

/* loaded from: classes9.dex */
abstract class a extends Handler {

    @NonNull
    final d a;

    @NonNull
    final j b;
    private Messenger c;

    public a(@NonNull d dVar, @NonNull j jVar) {
        this.a = dVar;
        this.b = jVar;
    }

    @NonNull
    public final Messenger a() {
        if (this.c == null) {
            this.c = new Messenger(this);
        }
        return this.c;
    }

    public abstract void a(@NonNull Message message);

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        a(message);
    }
}
