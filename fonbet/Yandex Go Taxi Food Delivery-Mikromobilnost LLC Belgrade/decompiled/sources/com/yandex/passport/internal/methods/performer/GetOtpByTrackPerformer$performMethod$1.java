package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportFailedResponseException;
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

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetOtpByTrackPerformer$performMethod$1", f = "GetOtpByTrackPerformer.kt", l = {16}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetOtpByTrackPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.j1 $method;
    int label;
    final /* synthetic */ g0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOtpByTrackPerformer$performMethod$1(g0 g0Var, com.yandex.passport.internal.methods.j1 j1Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = g0Var;
        this.$method = j1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetOtpByTrackPerformer$performMethod$1(this.this$0, this.$method, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetOtpByTrackPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.internal.usecase.q0 q0Var = this.this$0.a;
            com.yandex.passport.internal.usecase.p0 p0Var = new com.yandex.passport.internal.usecase.p0(((PassportUidImpl) this.$method.b.c).getValue(), ((TrackId) this.$method.c.c).getValue(), null);
            this.label = 1;
            obj = q0Var.a(p0Var, this);
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
        g0 g0Var = this.this$0;
        com.yandex.passport.internal.methods.j1 j1Var = this.$method;
        Throwable a = Result.a(value);
        if (a != null) {
            try {
                com.yandex.passport.internal.methods.performer.error.a aVar = g0Var.b;
                String value2 = ((TrackId) j1Var.c.c).getValue();
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, value2, null, null, null, new PassportFailedResponseException(message), 28);
            } catch (Throwable th) {
                value = new Result.Failure(th);
            }
        }
        return new Result(value);
    }
}
