package com.yandex.go.splash.dynamic;

import android.os.VibrationEffect;
import android.os.Vibrator;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.splash.dynamic.DynamicSplashView$vibrate$1", f = "DynamicSplashView.kt", l = {222}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class DynamicSplashView$vibrate$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $amplitude;
    final /* synthetic */ long $delay;
    final /* synthetic */ long $duration;
    int label;
    final /* synthetic */ DynamicSplashView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DynamicSplashView$vibrate$1(long j, DynamicSplashView dynamicSplashView, long j2, int i, Continuation continuation) {
        super(2, continuation);
        this.$delay = j;
        this.this$0 = dynamicSplashView;
        this.$duration = j2;
        this.$amplitude = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DynamicSplashView$vibrate$1(this.$delay, this.this$0, this.$duration, this.$amplitude, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DynamicSplashView$vibrate$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Vibrator vibrator;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$delay;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        vibrator = this.this$0.vibrator;
        vibrator.vibrate(VibrationEffect.createOneShot(this.$duration, this.$amplitude));
        return zy11.a;
    }
}
