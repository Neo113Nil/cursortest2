package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ConstantRateTimestampIterator.java */
/* loaded from: classes12.dex */
public final class k5j {
    public final float a;
    public final double b;
    public final int c;
    public final long d;
    public int e;

    public k5j(int i, long j, float f) {
        fxc0.p(j > 0);
        fxc0.p(f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        fxc0.p(0 < j);
        this.d = j;
        this.a = f;
        this.c = Math.max(Math.round((j / 1000000.0f) * f), 1);
        this.b = 1000000.0f / f;
    }

    public final k5j a() {
        return new k5j(0, this.d, this.a);
    }

    public final boolean b() {
        return this.e < this.c;
    }
}
