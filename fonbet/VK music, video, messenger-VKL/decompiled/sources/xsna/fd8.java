package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: BringIntoViewSpec.kt */
/* loaded from: classes11.dex */
public interface fd8 {
    public static final a a = a.a;

    /* compiled from: BringIntoViewSpec.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final xmk0 b = jq2.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 7);
        public static final C2866a c = new C2866a();

        /* compiled from: BringIntoViewSpec.kt */
        /* renamed from: xsna.fd8$a$a, reason: collision with other inner class name */
        public static final class C2866a implements fd8 {
        }
    }

    default float a(float f, float f2, float f3) {
        a.getClass();
        float f4 = f2 + f;
        if ((f >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 <= f3) || (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f4 > f3)) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float f5 = f4 - f3;
        return Math.abs(f) < Math.abs(f5) ? f : f5;
    }
}
