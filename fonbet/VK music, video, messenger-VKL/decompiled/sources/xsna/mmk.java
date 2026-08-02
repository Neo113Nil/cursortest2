package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: BlurStyle.kt */
/* loaded from: classes17.dex */
public final class mmk implements dh7 {
    public final float a;
    public final long b;
    public final float c;

    public mmk(float f, float f2) {
        long j = eh7.a;
        this.a = f;
        this.b = j;
        this.c = f2;
    }

    @Override // xsna.dh7
    public final float a() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.dh7
    public final long c() {
        return this.b;
    }

    @Override // xsna.dh7
    public final float d() {
        return this.c;
    }

    @Override // xsna.dh7
    public final float e() {
        return this.a;
    }
}
