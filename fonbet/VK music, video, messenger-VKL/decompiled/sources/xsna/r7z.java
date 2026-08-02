package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: LineData.kt */
/* loaded from: classes16.dex */
public final class r7z {
    public static final r7z e;
    public float a;
    public float b;
    public float c;
    public float d;

    static {
        r7z r7zVar = new r7z();
        r7zVar.a = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        r7zVar.b = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        r7zVar.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        r7zVar.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        e = r7zVar;
    }

    public final void a(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
