package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: VkAlertNewDefaults.kt */
/* loaded from: classes17.dex */
public final class q7u0 implements mr1 {
    public static final u890 d;
    public static final q7u0 a = new q7u0();
    public static final uog0 b = vog0.b(28);
    public static final u890 c = s200.m(4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
    public static final u890 e = s200.n(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 25, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);

    static {
        float f = 24;
        d = new u890(f, 6, f, 20);
    }

    @Override // xsna.mr1
    public final u890 a() {
        return d;
    }

    @Override // xsna.mr1
    public final u890 b() {
        return e;
    }

    @Override // xsna.mr1
    public final uog0 c() {
        return b;
    }
}
