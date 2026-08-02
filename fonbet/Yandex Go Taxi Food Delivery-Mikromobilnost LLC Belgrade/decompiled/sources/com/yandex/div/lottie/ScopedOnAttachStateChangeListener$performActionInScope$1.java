package com.yandex.div.lottie;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 8, 0})
@mvg(c = "com.yandex.div.lottie.ScopedOnAttachStateChangeListener$performActionInScope$1", f = "DivLottieUtils.kt", l = {47}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScopedOnAttachStateChangeListener$performActionInScope$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ScopedOnAttachStateChangeListener this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopedOnAttachStateChangeListener$performActionInScope$1(ScopedOnAttachStateChangeListener scopedOnAttachStateChangeListener, Continuation continuation) {
        super(2, continuation);
        this.this$0 = scopedOnAttachStateChangeListener;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScopedOnAttachStateChangeListener$performActionInScope$1 scopedOnAttachStateChangeListener$performActionInScope$1 = new ScopedOnAttachStateChangeListener$performActionInScope$1(this.this$0, continuation);
        scopedOnAttachStateChangeListener$performActionInScope$1.L$0 = obj;
        return scopedOnAttachStateChangeListener$performActionInScope$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScopedOnAttachStateChangeListener$performActionInScope$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            tse tseVar = (tse) this.L$0;
            wls action = this.this$0.getAction();
            this.label = 1;
            if (action.invoke(tseVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
