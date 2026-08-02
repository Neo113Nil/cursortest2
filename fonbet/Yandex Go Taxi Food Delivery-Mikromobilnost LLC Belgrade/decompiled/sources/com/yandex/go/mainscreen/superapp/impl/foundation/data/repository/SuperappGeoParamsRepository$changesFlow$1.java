package com.yandex.go.mainscreen.superapp.impl.foundation.data.repository;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.waw0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lwaw0;", "it", "Lzy11;", "<anonymous>", "(Lwaw0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.mainscreen.superapp.impl.foundation.data.repository.SuperappGeoParamsRepository$changesFlow$1", f = "SuperappGeoParamsRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes.dex */
final class SuperappGeoParamsRepository$changesFlow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SuperappGeoParamsRepository$changesFlow$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SuperappGeoParamsRepository$changesFlow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        SuperappGeoParamsRepository$changesFlow$1 superappGeoParamsRepository$changesFlow$1 = (SuperappGeoParamsRepository$changesFlow$1) create((waw0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        superappGeoParamsRepository$changesFlow$1.invokeSuspend(zy11Var);
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
        this.this$0.a.a.l(null);
        return zy11.a;
    }
}
