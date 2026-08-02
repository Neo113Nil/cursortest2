package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportAuthorizationPendingException;
import com.yandex.passport.api.exception.PassportException;
import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.internal.ModernAccount;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/account/PassportAccountImpl;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.AuthorizeByDeviceCodePerformer$performMethod$1", f = "AuthorizeByDeviceCodePerformer.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthorizeByDeviceCodePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.b0 $method;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByDeviceCodePerformer$performMethod$1(com.yandex.passport.internal.methods.b0 b0Var, f fVar, Continuation continuation) {
        super(2, continuation);
        this.$method = b0Var;
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeByDeviceCodePerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeByDeviceCodePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PassportException passportAuthorizationPendingException;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
            com.yandex.passport.internal.usecase.authorize.f fVar = this.this$0.a;
            com.yandex.passport.internal.usecase.authorize.e eVar = new com.yandex.passport.internal.usecase.authorize.e((String) this.$method.c.c, u);
            this.label = 1;
            obj = fVar.a(eVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        if (!(value instanceof Result.Failure)) {
            value = com.yandex.passport.internal.a0.g0((ModernAccount) value);
        }
        f fVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            try {
                if ("authorization_pending".equals(a.getMessage())) {
                    passportAuthorizationPendingException = new PassportAuthorizationPendingException();
                } else {
                    String message = a.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    passportAuthorizationPendingException = new PassportFailedResponseException(message);
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(fVar2.b, a, null, null, new PassportFailedResponseException("invalid_token"), new PassportIOException(a), passportAuthorizationPendingException, 6);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
