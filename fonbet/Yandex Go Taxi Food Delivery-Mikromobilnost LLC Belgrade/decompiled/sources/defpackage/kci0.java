package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.OkHttpClient;

/* loaded from: classes9.dex */
public final class kci0 implements Runnable {
    public final al7 a;
    public volatile AtomicInteger b = new AtomicInteger(0);
    public final /* synthetic */ nci0 c;

    public kci0(nci0 nci0Var, al7 al7Var) {
        this.c = nci0Var;
        this.a = al7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        OkHttpClient okHttpClient;
        String concat = "OkHttp ".concat(this.c.b.a.k());
        nci0 nci0Var = this.c;
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        currentThread.setName(concat);
        try {
            nci0Var.y.i();
            boolean z = false;
            try {
                try {
                } catch (Throwable th) {
                    nci0Var.a.a.b(this);
                    throw th;
                }
            } catch (IOException e) {
                e = e;
            } catch (Throwable th2) {
                th = th2;
            }
            try {
                this.a.onResponse(nci0Var, nci0Var.e());
                okHttpClient = nci0Var.a;
            } catch (IOException e2) {
                e = e2;
                z = true;
                if (z) {
                    d72 d72Var = dvc0.a;
                    dvc0.a.e(4, "Callback failure for ".concat(nci0.a(nci0Var)), e);
                } else {
                    this.a.onFailure(nci0Var, e);
                }
                okHttpClient = nci0Var.a;
                okHttpClient.a.b(this);
            } catch (Throwable th3) {
                th = th3;
                z = true;
                nci0Var.cancel();
                if (!z) {
                    IOException iOException = new IOException("canceled due to " + th);
                    iOException.initCause(th);
                    this.a.onFailure(nci0Var, iOException);
                }
                if (!(th instanceof InterruptedException)) {
                    throw th;
                }
                Thread.currentThread().interrupt();
                okHttpClient = nci0Var.a;
                okHttpClient.a.b(this);
            }
            okHttpClient.a.b(this);
        } finally {
            currentThread.setName(name);
        }
    }
}
