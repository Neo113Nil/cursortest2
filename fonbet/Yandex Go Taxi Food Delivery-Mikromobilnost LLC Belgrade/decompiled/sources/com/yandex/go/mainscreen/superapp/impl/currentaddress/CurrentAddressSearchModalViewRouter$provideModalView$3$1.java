package com.yandex.go.mainscreen.superapp.impl.currentaddress;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.currentaddress.CurrentAddressSearchModalViewRouter$provideModalView$3$1", f = "CurrentAddressSearchModalViewRouter.kt", l = {52}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class CurrentAddressSearchModalViewRouter$provideModalView$3$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CurrentAddressSearchModalViewRouter$provideModalView$3$1(c cVar, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CurrentAddressSearchModalViewRouter$provideModalView$3$1(this.this$0, this.$addressInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CurrentAddressSearchModalViewRouter$provideModalView$3$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            c cVar = this.this$0;
            pv0 pv0Var = this.$addressInfo;
            this.label = 1;
            if (c.T(cVar, pv0Var, this) == coroutineSingletons) {
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
