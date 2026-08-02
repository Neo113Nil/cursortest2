package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Looper;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.a;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes10.dex */
public final class o6j0 implements i7j0, Future, iax0 {
    public GlideException A;
    public final int a;
    public final int b;
    public Object c;
    public e5j0 w;
    public boolean x;
    public boolean y;
    public boolean z;

    public o6j0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.i7j0
    public final synchronized boolean a(Object obj, DataSource dataSource) {
        this.y = true;
        this.c = obj;
        notifyAll();
        return false;
    }

    @Override // defpackage.i7j0
    public final synchronized boolean b(GlideException glideException) {
        this.z = true;
        this.A = glideException;
        notifyAll();
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.x = true;
                notifyAll();
                e5j0 e5j0Var = null;
                if (z) {
                    e5j0 e5j0Var2 = this.w;
                    this.w = null;
                    e5j0Var = e5j0Var2;
                }
                if (e5j0Var != null) {
                    e5j0Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized Object e(Long l) {
        if (!isDone() && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalArgumentException("You must call this method on a background thread");
        }
        if (this.x) {
            throw new CancellationException();
        }
        if (this.z) {
            throw new ExecutionException(this.A);
        }
        if (this.y) {
            return this.c;
        }
        if (l == null) {
            wait(0L);
        } else if (l.longValue() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            long longValue = l.longValue() + currentTimeMillis;
            while (!isDone() && currentTimeMillis < longValue) {
                wait(longValue - currentTimeMillis);
                currentTimeMillis = System.currentTimeMillis();
            }
        }
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        if (this.z) {
            throw new ExecutionException(this.A);
        }
        if (this.x) {
            throw new CancellationException();
        }
        if (!this.y) {
            throw new TimeoutException();
        }
        return this.c;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return e(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // defpackage.iax0
    public final synchronized e5j0 getRequest() {
        return this.w;
    }

    @Override // defpackage.iax0
    public final void getSize(ojs0 ojs0Var) {
        ((a) ojs0Var).onSizeReady(this.a, this.b);
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.x;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.x && !this.y) {
            z = this.z;
        }
        return z;
    }

    @Override // defpackage.hey
    public final void onDestroy() {
    }

    @Override // defpackage.iax0
    public final void onLoadCleared(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final synchronized void onLoadFailed(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final void onLoadStarted(Drawable drawable) {
    }

    @Override // defpackage.iax0
    public final synchronized void onResourceReady(Object obj, xx01 xx01Var) {
    }

    @Override // defpackage.hey
    public final void onStart() {
    }

    @Override // defpackage.hey
    public final void onStop() {
    }

    @Override // defpackage.iax0
    public final void removeCallback(ojs0 ojs0Var) {
    }

    @Override // defpackage.iax0
    public final synchronized void setRequest(e5j0 e5j0Var) {
        this.w = e5j0Var;
    }

    public final String toString() {
        e5j0 e5j0Var;
        String str;
        String t = oyr.t(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                e5j0Var = null;
                if (this.x) {
                    str = "CANCELLED";
                } else if (this.z) {
                    str = "FAILURE";
                } else if (this.y) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    e5j0Var = this.w;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (e5j0Var == null) {
            return g8e.p(t, str, "]");
        }
        return t + str + ", request=[" + e5j0Var + "]]";
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        try {
            return e(null);
        } catch (TimeoutException e) {
            ny61.f(e);
            return null;
        }
    }
}
