package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.features.markup.internal.utils.State;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: Animations.kt */
/* loaded from: classes4.dex */
public final class yq2 {

    /* compiled from: Animations.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[State.values().length];
            try {
                iArr[State.Add.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[State.Remove.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AnimatorSet a(View view, View view2, State state) {
        View view3;
        int[] iArr = a.$EnumSwitchMapping$0;
        int i = iArr[state.ordinal()];
        if (i == 1) {
            view3 = view2;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            view3 = view;
        }
        int i2 = iArr[state.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            view = view2;
        }
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setAlpha(1.0f);
        view.setVisibility(0);
        view3.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view3.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view3.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Property property2 = View.SCALE_Y;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Property property3 = View.ALPHA;
        animatorSet.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(view, (Property<View, Float>) property3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(view3, (Property<View, Float>) property, 1.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) property2, 1.0f), ObjectAnimator.ofFloat(view3, (Property<View, Float>) property3, 1.0f));
        we2.a(animatorSet, new vm1(view, 1));
        return animatorSet;
    }
}
