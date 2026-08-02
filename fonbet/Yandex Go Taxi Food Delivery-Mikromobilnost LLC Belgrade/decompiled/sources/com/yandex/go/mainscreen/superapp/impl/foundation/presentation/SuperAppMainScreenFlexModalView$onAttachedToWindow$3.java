package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import com.yandex.go.preload.g;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zww0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView$onAttachedToWindow$3", f = "SuperAppMainScreenFlexModalView.kt", l = {228}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SuperAppMainScreenFlexModalView$onAttachedToWindow$3 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ SuperAppMainScreenFlexModalView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenFlexModalView$onAttachedToWindow$3(SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView, Continuation continuation) {
        super(2, continuation);
        this.this$0 = superAppMainScreenFlexModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenFlexModalView$onAttachedToWindow$3(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenFlexModalView$onAttachedToWindow$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zww0 zww0Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            zww0Var = this.this$0.suspendUntilMainScreenLoadedInteractor;
            this.label = 1;
            if (((g) zww0Var).a(this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
