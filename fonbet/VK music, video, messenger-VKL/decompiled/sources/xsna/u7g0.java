package xsna;

import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* compiled from: RequestLimiter.java */
/* loaded from: classes.dex */
public final class u7g0 {
    public static final long d = TimeUnit.HOURS.toMillis(24);
    public static final long e = TimeUnit.MINUTES.toMillis(30);
    public final h3r0 a;
    public long b;
    public int c;

    public u7g0() {
        if (yfb.b == null) {
            Pattern pattern = h3r0.c;
            yfb.b = new yfb();
        }
        yfb yfbVar = yfb.b;
        if (h3r0.d == null) {
            h3r0.d = new h3r0(yfbVar);
        }
        this.a = h3r0.d;
    }

    public final synchronized boolean a() {
        boolean z;
        if (this.c != 0) {
            this.a.a.getClass();
            z = System.currentTimeMillis() > this.b;
        }
        return z;
    }

    public final synchronized void b(int i) {
        long min;
        if ((i >= 200 && i < 300) || i == 401 || i == 404) {
            synchronized (this) {
                this.c = 0;
            }
            return;
        }
        this.c++;
        synchronized (this) {
            if (i == 429 || (i >= 500 && i < 600)) {
                double pow = Math.pow(2.0d, this.c);
                this.a.getClass();
                min = (long) Math.min(pow + ((long) (Math.random() * 1000.0d)), e);
            } else {
                min = d;
            }
            this.a.a.getClass();
            this.b = System.currentTimeMillis() + min;
        }
        return;
    }
}
