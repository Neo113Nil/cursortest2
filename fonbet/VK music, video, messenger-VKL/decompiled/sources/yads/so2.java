package yads;

import android.graphics.Bitmap;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public final class so2 {
    public static void a(g82 g82Var, vo2 vo2Var, Bitmap bitmap) {
        vo2Var.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vo2Var.animate().alpha(1.0f).setDuration(700L).withStartAction(new ro2(vo2Var, bitmap)).withEndAction(new qo2(g82Var, vo2Var)).start();
    }
}
