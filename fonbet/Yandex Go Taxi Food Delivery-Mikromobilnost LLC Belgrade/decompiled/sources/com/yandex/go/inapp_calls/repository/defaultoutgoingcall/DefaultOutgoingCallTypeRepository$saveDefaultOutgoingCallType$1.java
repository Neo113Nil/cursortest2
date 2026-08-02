package com.yandex.go.inapp_calls.repository.defaultoutgoingcall;

import com.yandex.go.inapp_calls.api.defaultoutgoingcall.DefaultOutgoingCallType;
import defpackage.lgh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.inapp_calls.repository.defaultoutgoingcall.DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1", f = "DefaultOutgoingCallTypeRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1 extends SuspendLambda implements wls {
    final /* synthetic */ DefaultOutgoingCallType $callType;
    int label;
    final /* synthetic */ lgh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1(lgh lghVar, DefaultOutgoingCallType defaultOutgoingCallType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lghVar;
        this.$callType = defaultOutgoingCallType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1(this.this$0, this.$callType, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1 defaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1 = (DefaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        defaultOutgoingCallTypeRepository$saveDefaultOutgoingCallType$1.invokeSuspend(zy11Var);
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
        this.this$0.b.r("DEFAULT_CALL_TYPE", this.$callType.getWireName());
        return zy11.a;
    }
}
