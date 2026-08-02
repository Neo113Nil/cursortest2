package com.yandex.go.superapp.searchbar.impl.ui.searchbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.yandex.go.lottie_loader.a;
import defpackage.gew0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.o2y;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.ytz;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView$bindLottieAnimation$1", f = "SuperappSearchbarButtonView.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
public final class SuperappSearchbarButtonView$bindLottieAnimation$1 extends SuspendLambda implements wls {
    final /* synthetic */ ytz $lottieLoader;
    final /* synthetic */ tls $onLottieAnimationEnd;
    final /* synthetic */ gew0 $playingAnimation;
    int label;
    final /* synthetic */ SuperappSearchbarButtonView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappSearchbarButtonView$bindLottieAnimation$1(ytz ytzVar, gew0 gew0Var, SuperappSearchbarButtonView superappSearchbarButtonView, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.$lottieLoader = ytzVar;
        this.$playingAnimation = gew0Var;
        this.this$0 = superappSearchbarButtonView;
        this.$onLottieAnimationEnd = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappSearchbarButtonView$bindLottieAnimation$1(this.$lottieLoader, this.$playingAnimation, this.this$0, this.$onLottieAnimationEnd, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappSearchbarButtonView$bindLottieAnimation$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        o2y o2yVar;
        o2y o2yVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            ytz ytzVar = this.$lottieLoader;
            String url = this.$playingAnimation.getUrl();
            this.label = 1;
            obj = ((a) ytzVar).a(url, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        nsz nszVar = (nsz) obj;
        zy11 zy11Var = zy11.a;
        if (nszVar == null) {
            return zy11Var;
        }
        o2yVar = this.this$0.binding;
        LottieAnimationView lottieAnimationView = o2yVar.c;
        final gew0 gew0Var = this.$playingAnimation;
        final SuperappSearchbarButtonView superappSearchbarButtonView = this.this$0;
        final tls tlsVar = this.$onLottieAnimationEnd;
        lottieAnimationView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        lottieAnimationView.setComposition(nszVar);
        Integer a = gew0Var.a();
        lottieAnimationView.setRepeatCount(a != null ? a.intValue() : -1);
        lottieAnimationView.addAnimatorListener(new AnimatorListenerAdapter() { // from class: com.yandex.go.superapp.searchbar.impl.ui.searchbar.SuperappSearchbarButtonView$bindLottieAnimation$1$1$1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                o2y o2yVar3;
                Float f;
                o2yVar3 = SuperappSearchbarButtonView.this.binding;
                o2yVar3.c.removeAnimatorListener(this);
                tlsVar.invoke(gew0Var);
                SuperappSearchbarButtonView superappSearchbarButtonView2 = SuperappSearchbarButtonView.this;
                f = superappSearchbarButtonView2.lastRotationDegrees;
                superappSearchbarButtonView2.updateRotation(f);
            }
        });
        lottieAnimationView.playAnimation();
        lottieAnimationView.setVisibility(0);
        o2yVar2 = this.this$0.binding;
        o2yVar2.b.setVisibility(8);
        return zy11Var;
    }
}
