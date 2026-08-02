package xsna;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.TypedValue;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: TopBarOverlayDefaults.kt */
/* loaded from: classes17.dex */
public final class v7p0 {
    public static LinearGradient a(int i, Context context) {
        TypedValue typedValue = krv0.a;
        int i2 = 0;
        if (epx.f(krv0.i(context), Boolean.TRUE)) {
            float f = i;
            float[] fArr = {0.4f, 0.4f, 0.39f, 0.31f, 0.13f, 0.06f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
            ArrayList arrayList = new ArrayList(7);
            while (i2 < 7) {
                arrayList.add(Integer.valueOf(n8g.l(-16777216, an10.b(fArr[i2] * 255))));
                i2++;
            }
            return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, j5g.N0(arrayList), new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.4028f, 0.5288f, 0.6705f, 0.7892f, 0.8731f, 1.0f}, Shader.TileMode.CLAMP);
        }
        float f2 = i;
        float[] fArr2 = {0.6f, 0.6f, 0.58f, 0.53f, 0.45f, 0.3f, 0.19f, 0.09f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT};
        ArrayList arrayList2 = new ArrayList(9);
        while (i2 < 9) {
            arrayList2.add(Integer.valueOf(n8g.l(-1, an10.b(fArr2[i2] * 255))));
            i2++;
        }
        return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, j5g.N0(arrayList2), new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.335f, 0.476f, 0.569f, 0.631f, 0.703f, 0.765f, 0.858f, 1.0f}, Shader.TileMode.CLAMP);
    }
}
