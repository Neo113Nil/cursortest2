package xsna;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bumptech.glide.load.engine.GlideException;
import com.ironsource.X3;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: RequestFutureTarget.java */
/* loaded from: classes12.dex */
public final class s7g0<R> implements Future, u3o0, x7g0<R> {

    @Nullable
    public R b;

    @Nullable
    public f7g0 c;
    public boolean d;
    public boolean e;
    public boolean f;

    @Nullable
    public GlideException g;

    /* compiled from: RequestFutureTarget.java */
    public static class a {
    }

    @Override // xsna.u3o0
    public final synchronized void a() {
    }

    @Override // xsna.u3o0
    @Nullable
    public final synchronized f7g0 b() {
        return this.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.x7g0
    public final synchronized void c(@NonNull Object obj) {
        this.e = true;
        this.b = obj;
        notifyAll();
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        synchronized (this) {
            try {
                if (isDone()) {
                    return false;
                }
                this.d = true;
                notifyAll();
                f7g0 f7g0Var = null;
                if (z) {
                    f7g0 f7g0Var2 = this.c;
                    this.c = null;
                    f7g0Var = f7g0Var2;
                }
                if (f7g0Var != null) {
                    f7g0Var.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.x7g0
    public final synchronized void d(@Nullable GlideException glideException) {
        this.f = true;
        this.g = glideException;
        notifyAll();
    }

    @Override // xsna.u3o0
    public final void e(@NonNull svj0 svj0Var) {
        svj0Var.k(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // xsna.u3o0
    public final synchronized void g(@NonNull Object obj) {
    }

    @Override // java.util.concurrent.Future
    public final R get() throws InterruptedException, ExecutionException {
        try {
            return i(null);
        } catch (TimeoutException e) {
            throw new AssertionError(e);
        }
    }

    @Override // xsna.u3o0
    public final synchronized void h(@Nullable f7g0 f7g0Var) {
        this.c = f7g0Var;
    }

    public final synchronized R i(Long l) throws ExecutionException, InterruptedException, TimeoutException {
        if (!isDone()) {
            char[] cArr = s2r0.a;
            if (Looper.myLooper() == Looper.getMainLooper()) {
                throw new IllegalArgumentException("You must call this method on a background thread");
            }
        }
        if (this.d) {
            throw new CancellationException();
        }
        if (this.f) {
            throw new ExecutionException(this.g);
        }
        if (this.e) {
            return this.b;
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
        if (this.f) {
            throw new ExecutionException(this.g);
        }
        if (this.d) {
            throw new CancellationException();
        }
        if (this.e) {
            return this.b;
        }
        throw new TimeoutException();
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isCancelled() {
        return this.d;
    }

    @Override // java.util.concurrent.Future
    public final synchronized boolean isDone() {
        boolean z;
        if (!this.d && !this.e) {
            z = this.f;
        }
        return z;
    }

    public final String toString() {
        f7g0 f7g0Var;
        String str;
        String a2 = i5s.a(new StringBuilder(), super.toString(), "[status=");
        synchronized (this) {
            try {
                f7g0Var = null;
                if (this.d) {
                    str = "CANCELLED";
                } else if (this.f) {
                    str = "FAILURE";
                } else if (this.e) {
                    str = "SUCCESS";
                } else {
                    str = "PENDING";
                    f7g0Var = this.c;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (f7g0Var == null) {
            return pzl.b(a2, str, X3.j.e);
        }
        return a2 + str + ", request=[" + f7g0Var + "]]";
    }

    @Override // java.util.concurrent.Future
    public final R get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return i(Long.valueOf(timeUnit.toMillis(j)));
    }

    @Override // xsna.u3o0
    public final void f() {
    }

    @Override // xsna.c5z
    public final void onDestroy() {
    }

    @Override // xsna.c5z
    public final void onStart() {
    }

    @Override // xsna.c5z
    public final void onStop() {
    }
}
