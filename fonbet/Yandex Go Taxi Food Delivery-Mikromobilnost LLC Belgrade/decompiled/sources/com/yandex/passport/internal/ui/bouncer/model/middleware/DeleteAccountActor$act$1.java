package com.yandex.passport.internal.ui.bouncer.model.middleware;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.ui.bouncer.model.s1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.TimeoutCancellationException;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/yandex/passport/internal/ui/bouncer/model/m;", "action", "Lcom/yandex/passport/internal/ui/bouncer/model/s1;", "loginState", "Lcom/yandex/passport/internal/ui/bouncer/model/n0;", "<anonymous>", "(Lcom/yandex/passport/internal/ui/bouncer/model/m;Lcom/yandex/passport/internal/ui/bouncer/model/s1;)Lcom/yandex/passport/internal/ui/bouncer/model/n0;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.bouncer.model.middleware.DeleteAccountActor$act$1", f = "DeleteAccountActor.kt", l = {28}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DeleteAccountActor$act$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ t this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeleteAccountActor$act$1(t tVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = tVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeleteAccountActor$act$1 deleteAccountActor$act$1 = new DeleteAccountActor$act$1(this.this$0, (Continuation) obj3);
        deleteAccountActor$act$1.L$0 = (com.yandex.passport.internal.ui.bouncer.model.m) obj;
        deleteAccountActor$act$1.L$1 = (s1) obj2;
        return deleteAccountActor$act$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        s1 s1Var;
        com.yandex.passport.internal.ui.bouncer.model.g1 g1Var;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.passport.internal.ui.bouncer.model.m mVar = (com.yandex.passport.internal.ui.bouncer.model.m) this.L$0;
                s1 s1Var2 = (s1) this.L$1;
                com.yandex.passport.internal.usecase.ui.r rVar = this.this$0.a;
                ModernAccount modernAccount = mVar.a;
                this.L$0 = s1Var2;
                this.label = 1;
                if (rVar.a(modernAccount, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
                s1Var = s1Var2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                s1Var = (s1) this.L$0;
                kotlin.b.b(obj);
            }
            g1Var = s1Var.d;
        } catch (TimeoutCancellationException e) {
            failure = new Result.Failure(e);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (g1Var == null) {
            throw new IllegalStateException("loginProperties is missing");
        }
        failure = new com.yandex.passport.internal.ui.bouncer.model.r(g1Var.a);
        Throwable a = Result.a(failure);
        if (a == null) {
            return failure;
        }
        com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
        if (com.yandex.passport.common.logger.a.a.isEnabled()) {
            com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Error deleting account", a);
        }
        return new com.yandex.passport.internal.ui.bouncer.model.o("DeleteAccountActor", "Error deleting account", a);
    }
}
