package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.api.exception.PassportFailedResponseException;
import com.yandex.passport.api.exception.PassportIOException;
import com.yandex.passport.api.exception.PassportWebViewRequiredException;
import com.yandex.passport.api.impl.PassportEnvironmentImpl;
import com.yandex.passport.common.core.Environment;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$State;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.account.PassportAccountImpl;
import com.yandex.passport.internal.report.u7;
import com.yandex.passport.internal.report.yd;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lcom/yandex/passport/internal/account/PassportAccountImpl;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.AuthByQrLinkPerformer$performMethod$1", f = "AuthByQrLinkPerformer.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AuthByQrLinkPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.y $method;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthByQrLinkPerformer$performMethod$1(com.yandex.passport.internal.methods.y yVar, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$method = yVar;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AuthByQrLinkPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AuthByQrLinkPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Result.Failure failure;
        Object obj2;
        Throwable a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Environment u = com.yandex.passport.internal.util.p.u((PassportEnvironmentImpl) this.$method.b.c);
                com.yandex.passport.internal.methods.y yVar = this.$method;
                c cVar = this.this$0;
                if (!jl40.l((GetTrackFromMagicRequest$State) yVar.d.c, GetTrackFromMagicRequest$State.Ready.INSTANCE)) {
                    throw new PassportWebViewRequiredException(((GetTrackFromMagicRequest$State) yVar.d.c).toString());
                }
                com.yandex.passport.internal.usecase.authorize.l lVar = cVar.a;
                com.yandex.passport.internal.usecase.authorize.k kVar = new com.yandex.passport.internal.usecase.authorize.k((String) yVar.c.c, u);
                this.label = 1;
                obj = lVar.a(kVar, this);
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
                try {
                    value = com.yandex.passport.internal.a0.g0((ModernAccount) value);
                } catch (Throwable th) {
                    value = new Result.Failure(th);
                }
            }
            kotlin.b.b(value);
            obj2 = (PassportAccountImpl) value;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
            obj2 = failure;
            c cVar2 = this.this$0;
            com.yandex.passport.internal.methods.y yVar2 = this.$method;
            a = Result.a(obj2);
            if (a != null) {
            }
            return new Result(obj2);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th2) {
            failure = new Result.Failure(th2);
            obj2 = failure;
            c cVar22 = this.this$0;
            com.yandex.passport.internal.methods.y yVar22 = this.$method;
            a = Result.a(obj2);
            if (a != null) {
            }
            return new Result(obj2);
        }
        c cVar222 = this.this$0;
        com.yandex.passport.internal.methods.y yVar222 = this.$method;
        a = Result.a(obj2);
        if (a != null) {
            try {
                com.yandex.passport.internal.report.reporters.d0 d0Var = cVar222.c;
                String str = (String) yVar222.c.c;
                d0Var.getClass();
                d0Var.f(u7.w, new yd(a), new yd(str, 12));
                com.yandex.passport.internal.methods.performer.error.a aVar = cVar222.b;
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                throw com.yandex.passport.internal.methods.performer.error.a.a(aVar, a, null, new PassportFailedResponseException(message), null, new PassportIOException(a), null, 42);
            } catch (Throwable th3) {
                obj2 = new Result.Failure(th3);
            }
        }
        return new Result(obj2);
    }
}
