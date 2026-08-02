package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportChallengeRequiredException;
import com.yandex.passport.api.exception.PassportChallengeType;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.network.BackendError;
import com.yandex.passport.data.exceptions.BackendErrorException;
import com.yandex.passport.internal.methods.j2;
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
@mvg(c = "com.yandex.passport.internal.methods.performer.SendAuthToTrackPerformer$performMethod$1", f = "SendAuthToTrackPerformer.kt", l = {25}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class SendAuthToTrackPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ j2 $method;
    int label;
    final /* synthetic */ f1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendAuthToTrackPerformer$performMethod$1(j2 j2Var, f1 f1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = j2Var;
        this.this$0 = f1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SendAuthToTrackPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SendAuthToTrackPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SendAuthToTrackPerformer$performMethod$1 sendAuthToTrackPerformer$performMethod$1;
        Object b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
            com.yandex.passport.internal.helper.d dVar = this.this$0.a;
            j2 j2Var = this.$method;
            String str = (String) j2Var.c.c;
            String str2 = (String) j2Var.d.c;
            String str3 = (String) j2Var.e.c;
            this.label = 1;
            sendAuthToTrackPerformer$performMethod$1 = this;
            b = dVar.b(B, str, str2, str3, sendAuthToTrackPerformer$performMethod$1);
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
            sendAuthToTrackPerformer$performMethod$1 = this;
        }
        f1 f1Var = sendAuthToTrackPerformer$performMethod$1.this$0;
        j2 j2Var2 = sendAuthToTrackPerformer$performMethod$1.$method;
        Throwable a = Result.a(b);
        if (a != null) {
            try {
                if ((a instanceof BackendErrorException) && ((BackendErrorException) a).getBackendError() == BackendError.NUMBER_FOR_PICTURE_CHALLENGE_NEEDED) {
                    throw new PassportChallengeRequiredException(PassportChallengeType.NUMBER);
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(f1Var.b, a, (String) j2Var2.c.c, new PassportIOException(a), null, null, null, 56);
            } catch (Throwable th) {
                b = new Result.Failure(th);
            }
        }
        return new Result(b);
    }
}
