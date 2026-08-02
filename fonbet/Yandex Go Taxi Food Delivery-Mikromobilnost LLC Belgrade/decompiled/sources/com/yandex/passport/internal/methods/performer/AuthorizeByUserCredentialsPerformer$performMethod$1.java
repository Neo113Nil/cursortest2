package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.analytics.AnalyticsFromValue;
import com.yandex.passport.internal.entities.UserCredentials;
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
@mvg(c = "com.yandex.passport.internal.methods.performer.AuthorizeByUserCredentialsPerformer$performMethod$1", f = "AuthorizeByUserCredentialsPerformer.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthorizeByUserCredentialsPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.e0 $method;
    int label;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByUserCredentialsPerformer$performMethod$1(i iVar, com.yandex.passport.internal.methods.e0 e0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
        this.$method = e0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeByUserCredentialsPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeByUserCredentialsPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AnalyticsFromValue analyticsFromValue;
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.account.c cVar = this.this$0.a;
            UserCredentials userCredentials = (UserCredentials) this.$method.b.c;
            AnalyticsFromValue.Companion.getClass();
            analyticsFromValue = AnalyticsFromValue.AUTOLOGIN;
            this.label = 1;
            a = cVar.a(userCredentials, null, analyticsFromValue, this);
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
        if (!(a instanceof Result.Failure)) {
            a = com.yandex.passport.internal.a0.g0((ModernAccount) a);
        }
        i iVar = this.this$0;
        Throwable a2 = Result.a(a);
        if (a2 != null) {
            try {
                throw com.yandex.passport.internal.methods.performer.error.a.a(iVar.b, a2, null, null, null, null, new PassportRuntimeUnknownException(a2), 30);
            } catch (Throwable th) {
                a = new Result.Failure(th);
            }
        }
        return new Result(a);
    }
}
