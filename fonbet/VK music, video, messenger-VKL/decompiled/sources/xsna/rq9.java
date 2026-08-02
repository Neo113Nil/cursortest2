package xsna;

import androidx.core.os.OperationCanceledException;

/* compiled from: CancellationSignal.java */
@Deprecated
/* loaded from: classes11.dex */
public final class rq9 {
    public boolean a;
    public a b;
    public boolean c;

    /* compiled from: CancellationSignal.java */
    public interface a {
        void onCancel();
    }

    public final void a() {
        synchronized (this) {
            try {
                if (this.a) {
                    return;
                }
                this.a = true;
                this.c = true;
                a aVar = this.b;
                if (aVar != null) {
                    try {
                        aVar.onCancel();
                    } catch (Throwable th) {
                        synchronized (this) {
                            this.c = false;
                            notifyAll();
                            throw th;
                        }
                    }
                }
                synchronized (this) {
                    this.c = false;
                    notifyAll();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void b(a aVar) {
        synchronized (this) {
            while (this.c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.b == aVar) {
                return;
            }
            this.b = aVar;
            if (this.a && aVar != null) {
                aVar.onCancel();
            }
        }
    }

    public final void c() {
        boolean z;
        synchronized (this) {
            z = this.a;
        }
        if (z) {
            throw new OperationCanceledException();
        }
    }
}
