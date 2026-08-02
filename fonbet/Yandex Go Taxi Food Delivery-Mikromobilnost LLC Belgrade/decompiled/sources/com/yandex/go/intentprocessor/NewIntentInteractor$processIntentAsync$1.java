package com.yandex.go.intentprocessor;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.o5u;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo5u;", "it", "Lzy11;", "<anonymous>", "(Lo5u;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.intentprocessor.NewIntentInteractor$processIntentAsync$1", f = "NewIntentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class NewIntentInteractor$processIntentAsync$1 extends SuspendLambda implements wls {
    int label;

    public NewIntentInteractor$processIntentAsync$1() {
        super(2, null);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new NewIntentInteractor$processIntentAsync$1(2, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        NewIntentInteractor$processIntentAsync$1 newIntentInteractor$processIntentAsync$1 = (NewIntentInteractor$processIntentAsync$1) create((o5u) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        newIntentInteractor$processIntentAsync$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
