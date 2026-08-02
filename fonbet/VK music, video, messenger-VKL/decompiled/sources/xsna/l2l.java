package xsna;

import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: Debouncer.kt */
/* loaded from: classes2.dex */
public final class l2l<T> {
    public final long a;
    public final ScheduledExecutorService b;
    public final a<T> c;
    public boolean d;
    public long e;
    public ScheduledFuture<?> f;
    public boolean g;
    public final String h;
    public final fh50<T> i;
    public final fh50<T> j;
    public final ReentrantLock k;
    public T l;
    public final to2 m;

    /* compiled from: Debouncer.kt */
    public interface a<T> {
        boolean a(T t, T t2, rp70<T> rp70Var);
    }

    public l2l(String str, long j, a aVar) {
        asu0.a.getClass();
        ScheduledExecutorService v = asu0.v();
        this.a = j;
        this.b = v;
        this.c = aVar;
        this.h = str.concat("/Debouncer");
        this.i = new fh50<>(32);
        this.j = new fh50<>(7);
        this.k = new ReentrantLock(true);
        this.m = new to2(this, 5);
    }

    public final void a(T t) {
        ReentrantLock reentrantLock = this.k;
        reentrantLock.lock();
        try {
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{"submit in " + Thread.currentThread() + " for " + t});
            }
            if (this.d) {
                L.G("canceled!");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                long j = currentTimeMillis - this.e;
                long j2 = this.a;
                if (j < j2) {
                    ScheduledFuture<?> scheduledFuture = this.f;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(true);
                    }
                    this.f = null;
                }
                this.e = currentTimeMillis;
                boolean z = this.g;
                fh50<T> fh50Var = this.j;
                if (z) {
                    String str = this.h;
                    l.getClass();
                    if (!L.m(loggerOutputTarget)) {
                        L.u(l, L.LogType.d, new Object[]{str, "items are processed"});
                    }
                    if (!fh50Var.b(t)) {
                        fh50Var.j(t);
                    }
                } else {
                    boolean f = fh50Var.f();
                    fh50<T> fh50Var2 = this.i;
                    if (!f) {
                        Object[] objArr = fh50Var2.a;
                        int length = objArr.length + fh50Var.b;
                        if (objArr.length < length) {
                            fh50Var2.q(length, objArr);
                        }
                        Object[] objArr2 = fh50Var.a;
                        int i = fh50Var.b;
                        boolean z2 = false;
                        for (int i2 = 0; i2 < i; i2++) {
                            Object obj = objArr2[i2];
                            if (!z2) {
                                if (fh50Var2.b(obj)) {
                                    z2 = false;
                                } else {
                                    fh50Var2.j(obj);
                                }
                            }
                            z2 = true;
                        }
                    }
                    fh50Var.m();
                    if (!fh50Var2.b(t)) {
                        fh50Var2.j(t);
                    }
                }
                this.f = this.b.schedule(this.m, j2, TimeUnit.MILLISECONDS);
            }
            s3q0 s3q0Var = s3q0.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
