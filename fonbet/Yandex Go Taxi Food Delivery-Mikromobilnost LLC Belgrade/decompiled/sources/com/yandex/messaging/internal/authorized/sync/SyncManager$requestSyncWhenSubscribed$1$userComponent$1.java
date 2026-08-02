package com.yandex.messaging.internal.authorized.sync;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.el21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcl21;", "<anonymous>", "(Ltse;)Lcl21;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.sync.SyncManager$requestSyncWhenSubscribed$1$userComponent$1", f = "SyncManager.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SyncManager$requestSyncWhenSubscribed$1$userComponent$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SyncManager$requestSyncWhenSubscribed$1$userComponent$1(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SyncManager$requestSyncWhenSubscribed$1$userComponent$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SyncManager$requestSyncWhenSubscribed$1$userComponent$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
        el21 el21Var = (el21) this.this$0.a.get();
        this.label = 1;
        Object a = com.yandex.messaging.internal.authorized.i.a(el21Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
