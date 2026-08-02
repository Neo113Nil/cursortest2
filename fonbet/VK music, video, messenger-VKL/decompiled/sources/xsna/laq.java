package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: ExponentialBackoff.kt */
/* loaded from: classes.dex */
public final class laq {
    public final long a;
    public final long b;
    public final float c;
    public final float d;
    public final float e;
    public final Random f;
    public volatile long g;
    public volatile int h;

    public laq() {
        this(31, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L);
    }

    public final void a(float f) {
        this.g = (long) Math.min(this.g * f, this.b);
        this.g += (long) (this.f.nextGaussian() * this.g * this.e);
        this.h++;
    }

    public final void b() {
        a(this.c);
    }

    public final void c() {
        this.g = this.a;
        this.h = 0;
    }

    public final boolean d() {
        return this.h > 0;
    }

    public final void e() {
        if (d()) {
            Thread.sleep(this.g);
        }
    }

    public laq(int i, long j, float f, long j2) {
        j = (i & 1) != 0 ? TimeUnit.MILLISECONDS.toMillis(100L) : j;
        j2 = (i & 2) != 0 ? TimeUnit.MINUTES.toMillis(5L) : j2;
        f = (i & 4) != 0 ? 2.0f : f;
        float f2 = (i & 8) != 0 ? 5.0f : 10.0f;
        this.a = j;
        this.b = j2;
        this.c = f;
        this.d = f2;
        this.e = 0.1f;
        this.f = new Random(System.currentTimeMillis());
        this.g = j;
    }
}
