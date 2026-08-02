package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: BlurStyle.kt */
/* loaded from: classes17.dex */
public final class wbl implements dh7 {
    public static final wbl a = new wbl();
    public static final long b = eh7.a;
    public static final float c = eh7.b;

    @Override // xsna.dh7
    public final float a() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.dh7
    public final long c() {
        return b;
    }

    @Override // xsna.dh7
    public final float d() {
        return c;
    }

    @Override // xsna.dh7
    public final float e() {
        return 15.0f;
    }
}
