package com.yandex.go.mainscreen.superapp.impl.foundation.presentation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.v1w0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.presentation.SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2", f = "SuperAppMainScreenFlexModalView.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
public final class SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_collectIn;
    int label;
    final /* synthetic */ SuperAppMainScreenFlexModalView receiver$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2(tpr tprVar, Continuation continuation, SuperAppMainScreenFlexModalView superAppMainScreenFlexModalView) {
        super(2, continuation);
        this.$this_collectIn = tprVar;
        this.receiver$inlined = superAppMainScreenFlexModalView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2(this.$this_collectIn, continuation, this.receiver$inlined);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperAppMainScreenFlexModalView$onAttachedToWindow$$inlined$collectIn$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr tprVar = this.$this_collectIn;
            v1w0 v1w0Var = new v1w0(this.receiver$inlined, i2);
            this.label = 1;
            if (tprVar.collect(v1w0Var, this) == coroutineSingletons) {
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
