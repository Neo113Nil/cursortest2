package com.yandex.passport.common.ui;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.passport.R;
import com.yandex.passport.api.ProgressAnimation;
import com.yandex.passport.common.ui.view.CommonSpinner;
import com.yandex.passport.common.ui.view.LottieAnimationViewBuilder;
import com.yandex.passport.internal.properties.ProgressPropertiesImpl;
import com.yandex.passport.internal.ui.c;
import defpackage.kp31;
import defpackage.lzx;
import defpackage.w511;
import defpackage.wj91;

/* loaded from: classes2.dex */
public abstract class b {
    public static final View a(kp31 kp31Var, Context context, ProgressPropertiesImpl progressPropertiesImpl, boolean z, float f, boolean z2) {
        ProgressAnimation animation = progressPropertiesImpl.getAnimation();
        if (animation instanceof ProgressAnimation.Lottie) {
            View view = (View) PassportProgressViewKt$passportProgressView$$inlined$lottieProgressBar$default$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
            if (kp31Var instanceof lzx) {
                ((lzx) kp31Var).addToParent(view);
            }
            LottieAnimationViewBuilder lottieAnimationViewBuilder = (LottieAnimationViewBuilder) view;
            lottieAnimationViewBuilder.setVisibility(0);
            lottieAnimationViewBuilder.setRepeatCount(-1);
            lottieAnimationViewBuilder.setAlpha(f);
            lottieAnimationViewBuilder.setAnimation(((ProgressAnimation.Lottie) progressPropertiesImpl.getAnimation()).getLottieAnimationResId());
            return (LottieAnimationView) view;
        }
        if (!(animation instanceof ProgressAnimation.Default)) {
            w511.b();
            return null;
        }
        View view2 = (View) PassportProgressViewKt$passportProgressView$$inlined$commonSpinner$default$1.b.invoke(wj91.e(0, kp31Var.getCtx()), 0, 0);
        if (kp31Var instanceof lzx) {
            ((lzx) kp31Var).addToParent(view2);
        }
        CommonSpinner commonSpinner = (CommonSpinner) view2;
        commonSpinner.setColorResource(z2 ? R.color.passport_white : R.color.passport_roundabout_text_primary);
        return c.e(kp31Var, context, z, commonSpinner, f, ((ProgressAnimation.Default) progressPropertiesImpl.getAnimation()).getVisibilityDelay());
    }

    public static /* synthetic */ View b(kp31 kp31Var, Activity activity, ProgressPropertiesImpl progressPropertiesImpl, boolean z, float f, int i) {
        if ((i & 2) != 0) {
            progressPropertiesImpl = new ProgressPropertiesImpl(null, null, null, false, 15, null);
        }
        return a(kp31Var, activity, progressPropertiesImpl, z, f, false);
    }
}
