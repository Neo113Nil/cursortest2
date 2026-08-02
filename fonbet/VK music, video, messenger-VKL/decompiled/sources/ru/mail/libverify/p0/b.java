package ru.mail.libverify.p0;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.annotation.NonNull;
import xsna.f0;

/* loaded from: classes9.dex */
public final class b extends Handler {

    @NonNull
    private final f a;

    public static final class a implements Runnable {

        @NonNull
        private final Runnable a;
        private boolean b;

        public a(@NonNull Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.a.run();
                synchronized (this) {
                    this.b = true;
                    notifyAll();
                }
            } catch (Throwable th) {
                synchronized (this) {
                    this.b = true;
                    notifyAll();
                    throw th;
                }
            }
        }
    }

    public b(@NonNull Looper looper, @NonNull f fVar) {
        super(looper);
        this.a = fVar;
    }

    public final void b(@NonNull Message message) {
        a aVar = new a(new f0(9, this, message));
        if (post(aVar)) {
            synchronized (aVar) {
                while (!aVar.b) {
                    try {
                        aVar.wait();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(@NonNull Message message) {
        super.handleMessage(message);
        this.a.handleMessage(message);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Message message) {
        this.a.handleMessage(message);
        message.recycle();
    }

    public final boolean a() {
        return getLooper().getThread() == Thread.currentThread();
    }
}
