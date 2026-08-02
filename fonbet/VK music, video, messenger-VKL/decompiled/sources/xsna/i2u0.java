package xsna;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.google.android.material.R$attr;
import com.google.android.material.R$integer;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: ViewUtilsLollipop.java */
/* loaded from: classes.dex */
public final class i2u0 {
    public static final int[] a = {R.attr.stateListAnimator};

    public static void a(@NonNull LinearLayout linearLayout, float f) {
        int integer = linearLayout.getResources().getInteger(R$integer.app_bar_elevation_anim_duration);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, R$attr.state_liftable, -R$attr.state_lifted}, ObjectAnimator.ofFloat(linearLayout, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(j));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(linearLayout, "elevation", f).setDuration(j));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(linearLayout, "elevation", UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(0L));
        linearLayout.setStateListAnimator(stateListAnimator);
    }

    public static void b(@NonNull LinearLayout linearLayout, AttributeSet attributeSet, int i, int i2) {
        Context context = linearLayout.getContext();
        TypedArray d = fpo0.d(context, attributeSet, a, i, i2, new int[0]);
        try {
            if (d.hasValue(0)) {
                linearLayout.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, d.getResourceId(0, 0)));
            }
            d.recycle();
        } catch (Throwable th) {
            d.recycle();
            throw th;
        }
    }
}
