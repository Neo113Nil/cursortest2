package com.yandex.go.flex.main_screen.presentation.divkit.azimuth;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.airbnb.lottie.LottieAnimationView;
import defpackage.d9w0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView$playIntroAnimation$1", f = "SuperappAzimuthRotatableIconView.kt", l = {143}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class SuperappAzimuthRotatableIconView$playIntroAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ d9w0 $icon;
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ SuperappAzimuthRotatableIconView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappAzimuthRotatableIconView$playIntroAnimation$1(SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView, String str, d9w0 d9w0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superappAzimuthRotatableIconView;
        this.$url = str;
        this.$icon = d9w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappAzimuthRotatableIconView$playIntroAnimation$1(this.this$0, this.$url, this.$icon, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappAzimuthRotatableIconView$playIntroAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ytz ytzVar;
        final LottieAnimationView lottieAnimationView;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ytzVar = this.this$0.lottieLoader;
            String str = this.$url;
            this.label = 1;
            obj = ((com.yandex.go.lottie_loader.a) ytzVar).a(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        nsz nszVar = (nsz) obj;
        SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView = this.this$0;
        zy11 zy11Var = zy11.a;
        if (nszVar == null) {
            superappAzimuthRotatableIconView.finishIntro();
            return zy11Var;
        }
        superappAzimuthRotatableIconView.cancelAnimationFallback();
        lottieAnimationView = this.this$0.animationView;
        d9w0 d9w0Var = this.$icon;
        final SuperappAzimuthRotatableIconView superappAzimuthRotatableIconView2 = this.this$0;
        lottieAnimationView.setComposition(nszVar);
        boolean z = d9w0Var.h;
        Integer num = d9w0Var.g;
        lottieAnimationView.setRepeatCount(z ? num != null ? num.intValue() : 0 : num != null ? num.intValue() : -1);
        lottieAnimationView.removeAllAnimatorListeners();
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.flex.main_screen.presentation.divkit.azimuth.SuperappAzimuthRotatableIconView$playIntroAnimation$1$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                LottieAnimationView.this.removeAnimatorListener(this);
                superappAzimuthRotatableIconView2.finishIntro();
            }
        });
        lottieAnimationView.playAnimation();
        return zy11Var;
    }
}
