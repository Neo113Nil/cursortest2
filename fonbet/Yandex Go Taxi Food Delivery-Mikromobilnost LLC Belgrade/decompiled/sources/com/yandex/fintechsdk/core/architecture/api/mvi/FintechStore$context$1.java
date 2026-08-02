package com.yandex.fintechsdk.core.architecture.api.mvi;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "STATE", "Lkotlin/Function1;", "reducer", "Lzy11;", "<anonymous>", "(Ltls;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.core.architecture.api.mvi.FintechStore$context$1", f = "FintechStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class FintechStore$context$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FintechStore$context$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FintechStore$context$1 fintechStore$context$1 = new FintechStore$context$1(this.this$0, continuation);
        fintechStore$context$1.L$0 = obj;
        return fintechStore$context$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FintechStore$context$1 fintechStore$context$1 = (FintechStore$context$1) create((tls) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        fintechStore$context$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object value;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tls tlsVar = (tls) this.L$0;
        r0 r0Var = this.this$0.b;
        do {
            value = r0Var.getValue();
        } while (!r0Var.k(value, tlsVar.invoke(value)));
        return zy11.a;
    }
}
