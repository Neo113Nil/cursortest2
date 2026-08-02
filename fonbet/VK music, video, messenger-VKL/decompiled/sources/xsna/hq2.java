package xsna;

import android.animation.TimeInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;

/* compiled from: AnimationSettings.kt */
/* loaded from: classes7.dex */
public final class hq2 {
    public final long a;
    public final TimeInterpolator b;

    public hq2() {
        this((PathInterpolator) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq2)) {
            return false;
        }
        hq2 hq2Var = (hq2) obj;
        return this.a == hq2Var.a && epx.f(this.b, hq2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AnimationSettings(duration=" + this.a + ", interpolator=" + this.b + ')';
    }

    public hq2(long j, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = timeInterpolator;
    }

    public /* synthetic */ hq2(PathInterpolator pathInterpolator, int i) {
        this((i & 1) != 0 ? 400L : 100L, (i & 2) != 0 ? new LinearInterpolator() : pathInterpolator);
    }
}
