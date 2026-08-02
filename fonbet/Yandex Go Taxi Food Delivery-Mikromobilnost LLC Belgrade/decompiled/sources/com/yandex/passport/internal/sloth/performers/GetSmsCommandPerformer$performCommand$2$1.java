package com.yandex.passport.internal.sloth.performers;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.sloth.performers.GetSmsCommandPerformer$performCommand$2$1", f = "GetSmsCommandPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetSmsCommandPerformer$performCommand$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ GetSmsCommandPerformer$SmsCodeLocalReceiver $smsCodeLocalReceiver;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetSmsCommandPerformer$performCommand$2$1(g gVar, GetSmsCommandPerformer$SmsCodeLocalReceiver getSmsCommandPerformer$SmsCodeLocalReceiver, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$smsCodeLocalReceiver = getSmsCommandPerformer$SmsCodeLocalReceiver;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetSmsCommandPerformer$performCommand$2$1(this.this$0, this.$smsCodeLocalReceiver, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        GetSmsCommandPerformer$performCommand$2$1 getSmsCommandPerformer$performCommand$2$1 = (GetSmsCommandPerformer$performCommand$2$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        getSmsCommandPerformer$performCommand$2$1.invokeSuspend(zy11Var);
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
        ((androidx.localbroadcastmanager.content.a) this.this$0.e.getValue()).d(this.$smsCodeLocalReceiver);
        return zy11.a;
    }
}
