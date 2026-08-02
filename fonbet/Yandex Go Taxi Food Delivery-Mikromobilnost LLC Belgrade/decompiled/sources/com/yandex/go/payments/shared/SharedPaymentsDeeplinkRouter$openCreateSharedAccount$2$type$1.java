package com.yandex.go.payments.shared;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ltmr0;", "<anonymous>", "(Ltse;)Ltmr0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1", f = "SharedPaymentsDeeplinkRouter.kt", l = {106}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $typeId;
    int label;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1(z zVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = zVar;
        this.$typeId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1(this.this$0, this.$typeId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentsDeeplinkRouter$openCreateSharedAccount$2$type$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        v vVar = this.this$0.a;
        String str = this.$typeId;
        this.label = 1;
        tpr c = vVar.l.c();
        vVar.p.getClass();
        Object y = kotlinx.coroutines.flow.e.y(new s(kotlinx.coroutines.flow.e.F(c, uyj.a), vVar, str), this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
