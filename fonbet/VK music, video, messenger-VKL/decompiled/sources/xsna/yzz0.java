package xsna;

import android.os.Looper;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzfk;
import java.util.Locale;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public final class yzz0 {
    public static final Object i = new Object();
    public final o100 a;
    public final long b;
    public final String c;

    @Nullable
    public nzz0 g;

    @Nullable
    public vzz0 h;
    public long e = -1;
    public long f = 0;
    public final zzfk d = new zzfk(Looper.getMainLooper());

    public yzz0(long j, String str) {
        this.b = j;
        this.c = str;
        this.a = new o100("RequestTracker", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Runnable, xsna.vzz0] */
    public final void a(long j, @Nullable nzz0 nzz0Var) {
        nzz0 nzz0Var2;
        long j2;
        long j3;
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = i;
        synchronized (obj) {
            nzz0Var2 = this.g;
            j2 = this.e;
            j3 = this.f;
            this.e = j;
            this.g = nzz0Var;
            this.f = currentTimeMillis;
        }
        if (nzz0Var2 != null) {
            nzz0Var2.b(j2, j3, currentTimeMillis, this.c);
        }
        synchronized (obj) {
            try {
                vzz0 vzz0Var = this.h;
                if (vzz0Var != null) {
                    this.d.removeCallbacks(vzz0Var);
                }
                ?? r10 = new Runnable() { // from class: xsna.vzz0
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        yzz0 yzz0Var = yzz0.this;
                        synchronized (yzz0.i) {
                            try {
                                if (yzz0Var.b()) {
                                    yzz0Var.e(15);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                };
                this.h = r10;
                this.d.postDelayed(r10, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (i) {
            z = this.e != -1;
        }
        return z;
    }

    public final boolean c(long j) {
        boolean z;
        synchronized (i) {
            long j2 = this.e;
            z = false;
            if (j2 != -1 && j2 == j) {
                z = true;
            }
        }
        return z;
    }

    public final void d(long j, int i2, @Nullable c2f0 c2f0Var) {
        synchronized (i) {
            try {
                if (c(j)) {
                    Locale locale = Locale.ROOT;
                    f(i2, "request " + j + " completed", c2f0Var);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(int i2) {
        synchronized (i) {
            try {
                if (!b()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                f(i2, "clearing request " + this.e, null);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i2, String str, @Nullable Object obj) {
        this.a.a(str, new Object[0]);
        Object obj2 = i;
        synchronized (obj2) {
            try {
                if (this.g != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    nzz0 nzz0Var = this.g;
                    exc0.i(nzz0Var);
                    nzz0Var.a(this.c, this.e, i2, obj, this.f, currentTimeMillis);
                }
                this.e = -1L;
                this.g = null;
                synchronized (obj2) {
                    vzz0 vzz0Var = this.h;
                    if (vzz0Var != null) {
                        this.d.removeCallbacks(vzz0Var);
                        this.h = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }
}
