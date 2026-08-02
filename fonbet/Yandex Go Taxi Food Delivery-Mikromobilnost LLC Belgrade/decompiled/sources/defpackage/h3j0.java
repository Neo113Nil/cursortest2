package defpackage;

import android.os.SystemClock;
import android.util.Log;
import com.google.android.datatransport.Priority;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class h3j0 {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final z211 h;
    public final fy60 i;
    public int j;
    public long k;

    public h3j0(z211 z211Var, m6r0 m6r0Var, fy60 fy60Var) {
        double d = m6r0Var.d;
        double d2 = m6r0Var.e;
        this.a = d;
        this.b = d2;
        this.c = m6r0Var.f * 1000;
        this.h = z211Var;
        this.i = fy60Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int currentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int min = size == this.e ? Math.min(100, i + currentTimeMillis) : Math.max(0, i - currentTimeMillis);
        if (this.j != min) {
            this.j = min;
            this.k = System.currentTimeMillis();
        }
        return min;
    }

    public final void b(h3f h3fVar, atx0 atx0Var) {
        Log.isLoggable("FirebaseCrashlytics", 3);
        this.h.a(new g64(h3fVar.b(), Priority.HIGHEST, null), new imh(SystemClock.elapsedRealtime() - this.d < 2000, this, atx0Var, h3fVar));
    }
}
