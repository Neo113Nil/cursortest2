package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.entities.TrackId;
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
@mvg(c = "com.yandex.passport.internal.methods.performer.AuthorizeByForwardTrackPerformer$performMethod$1", f = "AuthorizeByForwardTrackPerformer.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AuthorizeByForwardTrackPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.d0 $method;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizeByForwardTrackPerformer$performMethod$1(g gVar, com.yandex.passport.internal.methods.d0 d0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$method = d0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthorizeByForwardTrackPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthorizeByForwardTrackPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.authorize.h hVar = this.this$0.a;
            com.yandex.passport.internal.usecase.authorize.g gVar = new com.yandex.passport.internal.usecase.authorize.g((TrackId) this.$method.b.c);
            this.label = 1;
            obj = hVar.a(gVar, this);
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
        g gVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            try {
                com.yandex.passport.internal.methods.performer.error.a aVar = gVar2.b;
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, new PassportFailedResponseException(message), null, new PassportIOException(a), null, 42);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
