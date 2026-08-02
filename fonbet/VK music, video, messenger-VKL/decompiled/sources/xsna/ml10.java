package xsna;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.animation.PathInterpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.R$attr;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MaterialBackAnimationHelper.java */
/* loaded from: classes13.dex */
public abstract class ml10<V extends View> {

    @NonNull
    public final TimeInterpolator a;

    @NonNull
    public final V b;
    public final int c;
    public final int d;
    public final int e;

    @Nullable
    public wu5 f;

    public ml10(@NonNull V v) {
        this.b = v;
        Context context = v.getContext();
        this.a = tb30.d(context, R$attr.motionEasingStandardDecelerateInterpolator, new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
        this.c = tb30.c(R$attr.motionDurationMedium2, 300, context);
        this.d = tb30.c(R$attr.motionDurationShort3, 150, context);
        this.e = tb30.c(R$attr.motionDurationShort2, 100, context);
    }
}
