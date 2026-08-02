package xsna;

import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: BonusGradientShaderFactory.kt */
/* loaded from: classes6.dex */
public final class zk7 {
    public static final int[] a = {n8g.l(16766028, 255), n8g.l(16750126, 255), n8g.l(16734067, 255), n8g.l(16408739, 255)};
    public static final float[] b = {0.04f, 0.35f, 0.7f, 1.0f};

    public static final LinearGradient a(Integer num) {
        Integer num2 = 0;
        float floatValue = num.floatValue();
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 1.0f;
        }
        return new LinearGradient(num2.floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, num2.floatValue() + floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, a, b, Shader.TileMode.CLAMP);
    }

    public static final RadialGradient b(Integer num) {
        Integer num2 = 0;
        float floatValue = num.floatValue();
        if (floatValue <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            floatValue = 1.0f;
        }
        return new RadialGradient(num2.floatValue(), num2.floatValue(), floatValue, a, b, Shader.TileMode.CLAMP);
    }
}
