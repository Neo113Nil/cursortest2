package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.Resources;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.google.android.material.R$dimen;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: MaterialBottomContainerBackHelper.java */
/* loaded from: classes13.dex */
public final class rl10 extends ml10<View> {
    public final float g;
    public final float h;

    public rl10(@NonNull View view) {
        super(view);
        Resources resources = view.getResources();
        this.g = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_x_distance);
        this.h = resources.getDimension(R$dimen.m3_back_progress_bottom_container_max_scale_y_distance);
    }

    public final AnimatorSet a() {
        AnimatorSet animatorSet = new AnimatorSet();
        V v = this.b;
        animatorSet.playTogether(ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_X, 1.0f), ObjectAnimator.ofFloat(v, (Property<V, Float>) View.SCALE_Y, 1.0f));
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                animatorSet.playTogether(ObjectAnimator.ofFloat(viewGroup.getChildAt(i), (Property<View, Float>) View.SCALE_Y, 1.0f));
            }
        }
        animatorSet.setInterpolator(new ilq());
        return animatorSet;
    }

    public final void b(float f) {
        float interpolation = this.a.getInterpolation(f);
        V v = this.b;
        float width = v.getWidth();
        float height = v.getHeight();
        if (width <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || height <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return;
        }
        float f2 = this.g / width;
        float f3 = this.h / height;
        float a = 1.0f - rq2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, interpolation);
        float a2 = 1.0f - rq2.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, interpolation);
        v.setScaleX(a);
        v.setPivotY(height);
        v.setScaleY(a2);
        if (v instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) v;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.setPivotY(-childAt.getTop());
                childAt.setScaleY(a2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? a / a2 : 1.0f);
            }
        }
    }
}
