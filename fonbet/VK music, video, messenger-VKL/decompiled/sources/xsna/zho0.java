package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: TextGeometricTransform.kt */
/* loaded from: classes11.dex */
public final class zho0 {
    public static final zho0 c = new zho0(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    public final float a;
    public final float b;

    public zho0(float f, float f2) {
        this.a = f;
        this.b = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zho0)) {
            return false;
        }
        zho0 zho0Var = (zho0) obj;
        return this.a == zho0Var.a && this.b == zho0Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TextGeometricTransform(scaleX=");
        sb.append(this.a);
        sb.append(", skewX=");
        return xq.c(')', this.b, sb);
    }

    public zho0() {
        this(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
