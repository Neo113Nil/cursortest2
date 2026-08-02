package defpackage;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes11.dex */
public class dxa1 implements Closeable {
    public static final HashMap y = new HashMap();
    public int a;
    public long b;
    public long c;
    public long w = 2147483647L;
    public long x = -2147483648L;

    public dxa1(String str) {
    }

    public void a() {
        this.b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void c(long j) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j2 = this.c;
        if (j2 != 0 && elapsedRealtimeNanos - j2 >= 1000000) {
            this.a = 0;
            this.b = 0L;
            this.w = 2147483647L;
            this.x = -2147483648L;
        }
        this.c = elapsedRealtimeNanos;
        this.a++;
        this.w = Math.min(this.w, j);
        this.x = Math.max(this.x, j);
        if (this.a % 50 == 0) {
            Locale locale = Locale.US;
            h2b1.k();
        }
        if (this.a % 500 == 0) {
            this.a = 0;
            this.b = 0L;
            this.w = 2147483647L;
            this.x = -2147483648L;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j = this.b;
        if (j != 0) {
            d(j);
        } else {
            ny61.r("Did you forget to call start()?");
        }
    }

    public void d(long j) {
        c((SystemClock.elapsedRealtimeNanos() / 1000) - j);
    }
}
