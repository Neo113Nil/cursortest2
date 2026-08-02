package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: PlaylistDownloadProgressTracker.kt */
/* loaded from: classes3.dex */
public final class o8b0 {
    public final float a;
    public float b;
    public int c;
    public int d;

    public o8b0(int i, int i2) {
        float f = i > 0 ? 1.0f / i : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.a = f;
        this.b = f * i2;
        this.c = i - i2;
    }
}
