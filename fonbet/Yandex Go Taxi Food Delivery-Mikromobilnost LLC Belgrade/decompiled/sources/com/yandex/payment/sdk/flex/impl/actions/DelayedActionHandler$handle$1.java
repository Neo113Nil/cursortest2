package com.yandex.payment.sdk.flex.impl.actions;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import defpackage.n6u;
import defpackage.ny61;
import defpackage.tph;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.sdk.flex.impl.actions.DelayedActionHandler$handle$1", f = "ActionHandlers.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_DE_DE_VALUE}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class DelayedActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ tph $action;
    final /* synthetic */ n6u $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DelayedActionHandler$handle$1(tph tphVar, n6u n6uVar, Continuation continuation) {
        super(2, continuation);
        this.$action = tphVar;
        this.$context = n6uVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DelayedActionHandler$handle$1(this.$action, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DelayedActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            long j = this.$action.a;
            this.label = 1;
            if (kotlinx.coroutines.a.i(j, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        n6u n6uVar = this.$context;
        n6uVar.c.b(this.$action.b, n6uVar.b, kotlin.collections.b.f());
        return zy11.a;
    }
}
