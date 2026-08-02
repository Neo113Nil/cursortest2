package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/entities/DeviceCode;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetDeviceCodePerformer$performMethod$1", f = "GetDeviceCodePerformer.kt", l = {19}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetDeviceCodePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.f1 $method;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetDeviceCodePerformer$performMethod$1(c0 c0Var, com.yandex.passport.internal.methods.f1 f1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = c0Var;
        this.$method = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetDeviceCodePerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetDeviceCodePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.helper.d dVar = this.this$0.a;
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
            com.yandex.passport.internal.methods.f1 f1Var = this.$method;
            String str = (String) f1Var.c.c;
            boolean booleanValue = ((Boolean) f1Var.d.c).booleanValue();
            this.label = 1;
            a = dVar.a(u, str, booleanValue, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        c0 c0Var = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            try {
                com.yandex.passport.internal.methods.performer.error.a aVar = c0Var.b;
                String localizedMessage = a2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "";
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a2, null, new PassportFailedResponseException(localizedMessage), null, null, null, 58);
            } catch (Throwable th) {
                a = new Result.Failure(th);
            }
        }
        return new Result(a);
    }
}
