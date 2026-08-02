package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewConfiguration.kt */
/* loaded from: classes11.dex */
public interface rut0 {
    default float a() {
        return 16.0f;
    }

    long b();

    long c();

    default float d() {
        return 2.0f;
    }

    float e();

    default float f() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    default long g() {
        float f = 48;
        return byc0.b(f, f);
    }

    default float h() {
        return Float.MAX_VALUE;
    }
}
