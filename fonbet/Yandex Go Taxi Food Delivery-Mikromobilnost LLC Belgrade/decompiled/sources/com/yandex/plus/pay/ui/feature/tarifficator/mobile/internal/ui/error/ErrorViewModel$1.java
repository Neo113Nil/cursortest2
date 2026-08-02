package com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error;

import defpackage.ind0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oz90;
import defpackage.pz40;
import defpackage.tse;
import defpackage.u9o;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.feature.tarifficator.mobile.internal.ui.error.ErrorViewModel$1", f = "ErrorViewModel.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ErrorViewModel$1 extends SuspendLambda implements wls {
    final /* synthetic */ ind0 $scenarioContext;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ErrorViewModel$1(a aVar, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ErrorViewModel$1(this.this$0, this.$scenarioContext, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ErrorViewModel$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        pz40 pz40Var;
        oz90 oz90Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            a aVar = this.this$0;
            r0 r0Var = aVar.E;
            oz90 oz90Var2 = aVar.D;
            ind0 ind0Var = this.$scenarioContext;
            this.L$0 = r0Var;
            this.L$1 = oz90Var2;
            this.label = 1;
            obj = a.W(aVar, ind0Var, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            pz40Var = r0Var;
            oz90Var = oz90Var2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            oz90Var = (oz90) this.L$1;
            pz40Var = (pz40) this.L$0;
            b.b(obj);
        }
        u9o u9oVar = new u9o(oz90Var, (CharSequence) obj);
        r0 r0Var2 = (r0) pz40Var;
        r0Var2.getClass();
        r0Var2.m(null, u9oVar);
        return zy11.a;
    }
}
