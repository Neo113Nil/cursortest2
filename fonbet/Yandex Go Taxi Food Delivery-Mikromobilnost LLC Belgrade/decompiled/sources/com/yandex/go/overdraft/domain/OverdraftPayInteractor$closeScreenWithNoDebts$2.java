package com.yandex.go.overdraft.domain;

import defpackage.az80;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sz80;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftPayInteractor$closeScreenWithNoDebts$2", f = "OverdraftPayInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPayInteractor$closeScreenWithNoDebts$2 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPayInteractor$closeScreenWithNoDebts$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new OverdraftPayInteractor$closeScreenWithNoDebts$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        OverdraftPayInteractor$closeScreenWithNoDebts$2 overdraftPayInteractor$closeScreenWithNoDebts$2 = (OverdraftPayInteractor$closeScreenWithNoDebts$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        overdraftPayInteractor$closeScreenWithNoDebts$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ((sz80) this.this$0.b.a).b = false;
        ((sz80) this.this$0.b.a).c = EmptyList.a;
        this.this$0.i.c(az80.a);
        return zy11.a;
    }
}
