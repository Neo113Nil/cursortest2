package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.core.os.OperationCanceledException;
import androidx.loader.content.ModernAsyncTask$Status;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes10.dex */
public final class db3 implements Runnable {
    public static Handler y;
    public final /* synthetic */ t091 x;
    public volatile ModernAsyncTask$Status b = ModernAsyncTask$Status.PENDING;
    public final AtomicBoolean c = new AtomicBoolean();
    public final AtomicBoolean w = new AtomicBoolean();
    public final a530 a = new a530(this, new hxj(2, this));

    public db3(t091 t091Var) {
        this.x = t091Var;
    }

    public final void a() {
        try {
            t091 t091Var = this.x;
            Iterator it = t091Var.j.iterator();
            int i = 0;
            while (it.hasNext()) {
                if (((yst) it.next()).k(t091Var)) {
                    i++;
                }
            }
            try {
                t091Var.i.tryAcquire(i, 5L, TimeUnit.SECONDS);
            } catch (InterruptedException e) {
                Log.i("GACSignInLoader", "Unexpected InterruptedException", e);
                Thread.currentThread().interrupt();
            }
        } catch (OperationCanceledException e2) {
            if (!this.c.get()) {
                throw e2;
            }
        }
    }

    public final void b(Object obj) {
        Handler handler;
        synchronized (db3.class) {
            try {
                if (y == null) {
                    y = new Handler(Looper.getMainLooper());
                }
                handler = y;
            } catch (Throwable th) {
                throw th;
            }
        }
        handler.post(new uqs(this, obj, false, 10));
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.x.c();
    }
}
