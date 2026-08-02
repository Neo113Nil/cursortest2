package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportCodeInvalidException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.credentials.CredentialProvider;
import com.yandex.passport.internal.entities.Code;
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
@mvg(c = "com.yandex.passport.internal.methods.performer.AuthorizeByCodePerformer$performMethod$1", f = "AuthorizeByCodePerformer.kt", l = {24}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthorizeByCodePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.z $method;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByCodePerformer$performMethod$1(d dVar, com.yandex.passport.internal.methods.z zVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$method = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeByCodePerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeByCodePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.authorize.d dVar = this.this$0.a;
            com.yandex.passport.internal.methods.z zVar = this.$method;
            Code code = (Code) zVar.b.c;
            CredentialProvider credentialProvider = (CredentialProvider) zVar.c.c;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.CODE;
            com.yandex.passport.internal.usecase.authorize.c cVar = new com.yandex.passport.internal.usecase.authorize.c(code, null, credentialProvider, analyticsFromValue);
            this.label = 1;
            obj = dVar.a(cVar, this);
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
        d dVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            try {
                throw com.yandex.passport.internal.methods.performer.error.a.a(dVar2.b, a, null, null, new PassportCodeInvalidException(), new PassportIOException(a), null, 38);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
