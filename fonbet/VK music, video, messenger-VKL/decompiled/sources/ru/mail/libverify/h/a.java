package ru.mail.libverify.h;

import android.os.Handler;
import android.os.Messenger;
import androidx.annotation.NonNull;
import ru.mail.libverify.api.q;

/* loaded from: classes9.dex */
abstract class a extends Handler {
    protected InterfaceC2203a a;
    protected Messenger b;
    private volatile boolean c = false;
    private Messenger d;

    /* renamed from: ru.mail.libverify.h.a$a, reason: collision with other inner class name */
    public interface InterfaceC2203a {
        void a(boolean z);
    }

    public a(@NonNull q qVar) {
    }

    public final void a() {
        this.c = true;
        removeCallbacksAndMessages(null);
    }

    @NonNull
    public final Messenger b() {
        if (this.d == null) {
            this.d = new Messenger(this);
        }
        return this.d;
    }

    public final boolean c() {
        return this.c;
    }

    public abstract void d();
}
