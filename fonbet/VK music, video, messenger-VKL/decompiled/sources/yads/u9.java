package yads;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.unity3d.services.UnityAdsConstants;

/* loaded from: classes10.dex */
public abstract class u9 {
    public static final GradientDrawable a;

    static {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Color.parseColor("#ff303030"), Color.parseColor("#ff181818"), Color.parseColor("#ff000000")});
        gradientDrawable.setCornerRadius(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        a = gradientDrawable;
    }
}
