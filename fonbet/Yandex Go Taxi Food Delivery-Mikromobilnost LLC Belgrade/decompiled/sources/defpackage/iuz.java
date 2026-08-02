package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.splash.animated.a;
import com.yandex.go.splash.data.dto.AnimatedSplashScreenExperiment;
import defpackage.aqt0;
import defpackage.cne0;
import defpackage.iuz;

/* loaded from: classes13.dex */
public final class iuz implements ag2 {
    public final a a;
    public final AnimatedSplashScreenExperiment.SplashAnimation b;
    public final LottieAnimationView c;

    public iuz(Context context, a aVar, AnimatedSplashScreenExperiment.SplashAnimation splashAnimation) {
        this.a = aVar;
        this.b = splashAnimation;
        LottieAnimationView lottieAnimationView = new LottieAnimationView(context);
        this.c = lottieAnimationView;
        lottieAnimationView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        lottieAnimationView.setFitsSystemWindows(true);
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        String str = splashAnimation.a;
        lottieAnimationView.setImageAssetsFolder(str);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.splash.animated.LottieSplashViewHolder$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animation) {
                super.onAnimationStart(animation);
                iuz iuzVar = iuz.this;
                a aVar2 = iuzVar.a;
                String str2 = iuzVar.b.a;
                aqt0 aqt0Var = aVar2.b;
                aqt0Var.getClass();
                String str3 = "ID_" + str2;
                cne0 cne0Var = aqt0Var.a;
                cne0Var.p(cne0Var.i(str3, 0) + 1, str3);
            }
        });
        chb1.e(context, str, new qa0(9, lottieAnimationView), null, 24);
    }

    @Override // defpackage.ag2
    public final boolean a() {
        return false;
    }

    @Override // defpackage.ag2
    public final void b(zvg zvgVar, Runnable runnable) {
        LottieAnimationView lottieAnimationView = this.c;
        lottieAnimationView.playAnimation();
        lottieAnimationView.postDelayed(runnable, 200L);
    }

    @Override // defpackage.ag2
    public final void c(Runnable runnable) {
    }

    @Override // defpackage.ag2
    public final int d() {
        return (int) (this.b.d * 1000.0f);
    }

    @Override // defpackage.ag2
    public final boolean e() {
        return false;
    }

    @Override // defpackage.ag2
    public final View getRootView() {
        return this.c;
    }
}
