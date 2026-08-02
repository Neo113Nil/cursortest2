package coil3.graphics;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "coil3.gif.AnimatedImageDecoder$wrapDrawable$2", f = "AnimatedImageDecoder.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: classes10.dex */
final class AnimatedImageDecoder$wrapDrawable$2 extends SuspendLambda implements wls {
    final /* synthetic */ Drawable $baseDrawable;
    final /* synthetic */ sls $onEnd;
    final /* synthetic */ sls $onStart;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedImageDecoder$wrapDrawable$2(Drawable drawable, sls slsVar, sls slsVar2, Continuation continuation) {
        super(2, continuation);
        this.$baseDrawable = drawable;
        this.$onStart = slsVar;
        this.$onEnd = slsVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AnimatedImageDecoder$wrapDrawable$2(this.$baseDrawable, this.$onStart, this.$onEnd, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = (AnimatedImageDecoder$wrapDrawable$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        animatedImageDecoder$wrapDrawable$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        AnimatedImageDrawable animatedImageDrawable = (AnimatedImageDrawable) this.$baseDrawable;
        final sls slsVar = this.$onStart;
        final sls slsVar2 = this.$onEnd;
        animatedImageDrawable.registerAnimationCallback(new Animatable2.AnimationCallback() { // from class: coil3.gif.internal.UtilsKt$animatable2CallbackOf$1
            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationEnd(Drawable drawable) {
                sls slsVar3 = slsVar2;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }

            @Override // android.graphics.drawable.Animatable2.AnimationCallback
            public void onAnimationStart(Drawable drawable) {
                sls slsVar3 = sls.this;
                if (slsVar3 != null) {
                    slsVar3.invoke();
                }
            }
        });
        return zy11.a;
    }
}
