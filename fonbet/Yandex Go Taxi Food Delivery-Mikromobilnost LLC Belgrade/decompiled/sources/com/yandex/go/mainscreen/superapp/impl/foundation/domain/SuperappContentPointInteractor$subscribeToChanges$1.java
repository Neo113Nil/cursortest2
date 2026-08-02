package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import defpackage.jf5;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.domain.SuperappContentPointInteractor$subscribeToChanges$1", f = "SuperappContentPointInteractor.kt", l = {42}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappContentPointInteractor$subscribeToChanges$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappContentPointInteractor$subscribeToChanges$1(j jVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappContentPointInteractor$subscribeToChanges$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SuperappContentPointInteractor$subscribeToChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr t = kotlinx.coroutines.flow.e.t(new i(this.this$0.b.f));
            jf5 jf5Var = new jf5(10, this.this$0.a);
            this.label = 1;
            if (t.collect(jf5Var, this) == coroutineSingletons) {
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
