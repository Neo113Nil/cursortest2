package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* loaded from: classes10.dex */
public final class he2 extends HandlerThread implements Handler.Callback {
    public sl0 b;
    public Handler c;
    public Error d;
    public RuntimeException e;
    public ie2 f;

    public he2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final ie2 a(int i) {
        boolean z;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.c = handler;
        this.b = new sl0(handler);
        synchronized (this) {
            z = false;
            this.c.obtainMessage(1, i, 0).sendToTarget();
            while (this.f == null && this.e == null && this.d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.d;
        if (error != null) {
            throw error;
        }
        ie2 ie2Var = this.f;
        ie2Var.getClass();
        return ie2Var;
    }

    public final void b(int i) {
        this.b.getClass();
        this.b.a(i);
        this.f = new ie2(this, this.b.a(), i != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        try {
            if (i != 1) {
                if (i != 2) {
                    return true;
                }
                try {
                    this.b.getClass();
                    this.b.b();
                } finally {
                    try {
                        return true;
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e) {
                    ji1.b("PlaceholderSurface", ji1.a("Failed to initialize placeholder surface", e));
                    this.d = e;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e2) {
                ji1.b("PlaceholderSurface", ji1.a("Failed to initialize placeholder surface", e2));
                this.e = e2;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th) {
            synchronized (this) {
                notify();
                throw th;
            }
        }
    }
}
