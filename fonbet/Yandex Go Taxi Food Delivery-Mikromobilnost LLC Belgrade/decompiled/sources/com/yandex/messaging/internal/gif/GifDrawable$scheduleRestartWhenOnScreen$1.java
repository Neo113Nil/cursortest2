package com.yandex.messaging.internal.gif;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.GifDrawable$scheduleRestartWhenOnScreen$1", f = "GifDrawable.kt", l = {176}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class GifDrawable$scheduleRestartWhenOnScreen$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ GifDrawable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GifDrawable$scheduleRestartWhenOnScreen$1(GifDrawable gifDrawable, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gifDrawable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GifDrawable$scheduleRestartWhenOnScreen$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GifDrawable$scheduleRestartWhenOnScreen$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object waitTargetViewToGetOnScreen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            GifDrawable gifDrawable = this.this$0;
            this.label = 1;
            waitTargetViewToGetOnScreen = gifDrawable.waitTargetViewToGetOnScreen(this);
            if (waitTargetViewToGetOnScreen == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        this.this$0.startAnimations();
        return zy11.a;
    }
}
