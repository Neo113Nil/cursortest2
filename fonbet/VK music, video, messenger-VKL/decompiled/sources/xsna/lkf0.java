package xsna;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.photo.editor.markup.view.tools.utils.Anchor;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: RecyclerViewUtils.kt */
/* loaded from: classes4.dex */
public final class lkf0 {
    public static final ilq a = new ilq();
    public static final hlq b = new hlq();
    public static final OvershootInterpolator c = new OvershootInterpolator(0.8f);

    /* compiled from: RecyclerViewUtils.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Anchor.values().length];
            try {
                iArr[Anchor.Start.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Anchor.End.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AnimatorSet a(View view, final View view2, float f, final View view3, Anchor anchor) {
        float width;
        view.setNestedScrollingEnabled(false);
        int i = a.$EnumSwitchMapping$0[anchor.ordinal()];
        if (i == 1) {
            width = (-f) + view3.getWidth();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            width = f - view3.getWidth();
        }
        view3.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view3.setVisibility(0);
        view.setTranslationX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, width);
        OvershootInterpolator overshootInterpolator = c;
        ofFloat.setInterpolator(overshootInterpolator);
        ofFloat.addUpdateListener(new ikf0(view, 0));
        s3q0 s3q0Var = s3q0.a;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setInterpolator(overshootInterpolator);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.jkf0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view2.setAlpha(1.0f - valueAnimator.getAnimatedFraction());
                view3.setAlpha(lkf0.a.getInterpolation(valueAnimator.getAnimatedFraction()));
            }
        });
        ofFloat2.addListener(new mkf0(view2, view));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static final AnimatorSet b(View view, final View view2, float f, final View view3, Anchor anchor) {
        float width;
        view.setNestedScrollingEnabled(false);
        int i = a.$EnumSwitchMapping$0[anchor.ordinal()];
        if (i == 1) {
            width = (-f) + view3.getWidth();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            width = f - view3.getWidth();
        }
        view.setTranslationX(width);
        view2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        view2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(width, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        OvershootInterpolator overshootInterpolator = c;
        ofFloat.setInterpolator(overshootInterpolator);
        ofFloat.addUpdateListener(new l6f0(view, 1));
        s3q0 s3q0Var = s3q0.a;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        ofFloat2.setInterpolator(overshootInterpolator);
        ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.kkf0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                view2.setAlpha(valueAnimator.getAnimatedFraction());
                view3.setAlpha(lkf0.b.getInterpolation(1.0f - valueAnimator.getAnimatedFraction()));
            }
        });
        ofFloat2.addListener(new nkf0(view3, view));
        animatorSet.playTogether(ofFloat, ofFloat2);
        return animatorSet;
    }

    public static final void c(RecyclerView recyclerView, int i) {
        if (i != -1) {
            try {
                recyclerView.scrollToPosition(i);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }

    public static final void d(RecyclerView recyclerView, int i) {
        if (i != -1) {
            try {
                recyclerView.smoothScrollToPosition(i);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
        }
    }
}
