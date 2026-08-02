package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.common.core.Uid;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.AcceptDeviceAuthorizationPerformer$performMethod$1", f = "AcceptDeviceAuthorizationPerformer.kt", l = {36}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AcceptDeviceAuthorizationPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.w $method;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcceptDeviceAuthorizationPerformer$performMethod$1(com.yandex.passport.internal.methods.w wVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$method = wVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AcceptDeviceAuthorizationPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AcceptDeviceAuthorizationPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
            a aVar = this.this$0;
            com.yandex.passport.internal.methods.w wVar = this.$method;
            String str = (String) wVar.c.c;
            String str2 = (String) wVar.d.c;
            this.label = 1;
            b = a.b(aVar, B, str, str2, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            b = ((Result) obj).getValue();
        }
        a aVar2 = this.this$0;
        Throwable a = Result.a(b);
        if (a != null) {
            try {
                com.yandex.passport.internal.methods.performer.error.a aVar3 = aVar2.y;
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(aVar3, a, null, new PassportFailedResponseException(message), null, null, null, 58);
            } catch (Throwable th) {
                b = new Result.Failure(th);
            }
        }
        return new Result(b);
    }
}
