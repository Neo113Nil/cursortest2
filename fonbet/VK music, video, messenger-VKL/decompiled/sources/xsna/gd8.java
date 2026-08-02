package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: BringIntoViewSpec.android.kt */
/* loaded from: classes11.dex */
public final class gd8 {
    public static final fwi a = new fwi(new ur0(1));
    public static final a b = new a();

    /* compiled from: BringIntoViewSpec.android.kt */
    public static final class a implements fd8 {
        @Override // xsna.fd8
        public final float a(float f, float f2, float f3) {
            float abs = Math.abs((f2 + f) - f);
            boolean z = abs <= f3;
            float f4 = (0.3f * f3) - (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT * abs);
            float f5 = f3 - f4;
            if (z && f5 < abs) {
                f4 = f3 - abs;
            }
            return f - f4;
        }
    }
}
