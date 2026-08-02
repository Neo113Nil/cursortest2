package xsna;

import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: KeyPoint.java */
/* loaded from: classes8.dex */
public final class xdy {
    public final hlb0 a;
    public final float b;
    public final float c;
    public final float d;
    public final int e;
    public final int f;

    public xdy(float f, float f2, float f3, float f4, int i, int i2, float f5) {
        this.a = new hlb0(f, f2);
        this.b = f3;
        this.c = f4;
        this.d = f5;
        this.e = i;
        this.f = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPoint [pt=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", angle=");
        sb.append(this.c);
        sb.append(", response=");
        sb.append(this.d);
        sb.append(", octave=");
        sb.append(this.e);
        sb.append(", class_id=");
        return h5s.c(this.f, X3.j.e, sb);
    }

    public xdy() {
        this(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -1.0f, 0, -1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
