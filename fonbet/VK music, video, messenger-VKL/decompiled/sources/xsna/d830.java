package xsna;

import androidx.annotation.NonNull;
import com.unity3d.services.UnityAdsConstants;
import java.util.concurrent.TimeUnit;

/* compiled from: MonotonicClock.java */
/* loaded from: classes3.dex */
public final class d830 {
    public final float a;
    public final long b;

    public d830(@NonNull d830 d830Var) {
        this.a = d830Var.a;
        this.b = d830Var.b;
    }

    public final long a(long j) {
        float f = this.a;
        if (f == 1.0f) {
            return j;
        }
        return this.b + ((long) ((j - r2) / f));
    }

    public final String toString() {
        return d830.class.getSimpleName() + '@' + hashCode() + "{s=" + this.a + "|pts=" + TimeUnit.NANOSECONDS.toMillis(a(System.nanoTime())) + " ms}";
    }

    public d830(float f) {
        if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            this.b = System.nanoTime();
            this.a = f;
            return;
        }
        throw new IllegalArgumentException();
    }
}
