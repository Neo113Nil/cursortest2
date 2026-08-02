package com.yandex.passport.internal.methods.performer;

import android.content.Context;
import com.yandex.passport.R;
import com.yandex.passport.api.PassportUidImpl;
import com.yandex.passport.api.exception.PassportAccountNotFoundException;
import com.yandex.passport.api.exception.PassportRuntimeUnknownException;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.methods.g2;
import com.yandex.passport.internal.report.reporters.RevokePlace;
import defpackage.cvu0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w53;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.RemoveAccountPerformer$performMethod$1", f = "RemoveAccountPerformer.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class RemoveAccountPerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ g2 $method;
    int label;
    final /* synthetic */ e1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RemoveAccountPerformer$performMethod$1(g2 g2Var, e1 e1Var, Continuation continuation) {
        super(2, continuation);
        this.$method = g2Var;
        this.this$0 = e1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RemoveAccountPerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RemoveAccountPerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                Uid B = com.yandex.passport.internal.util.p.B((PassportUidImpl) this.$method.b.c);
                Context context = this.this$0.a;
                String packageName = context.getPackageName();
                int i2 = 0;
                while (true) {
                    if (i2 >= 3) {
                        z = false;
                        break;
                    }
                    if (cvu0.x(packageName, e1.x[i2], false)) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                if (!z) {
                    z = context.getResources().getBoolean(R.bool.passport_accounts_remove_allowed);
                }
                com.yandex.passport.internal.analytics.c0 c0Var = this.this$0.b;
                c0Var.getClass();
                w53 w53Var = new w53();
                w53Var.put("allowed", String.valueOf(z));
                c0Var.a.a(com.yandex.passport.internal.analytics.n.f, w53Var);
                if (!z) {
                    throw new PassportRuntimeUnknownException("Unauthorized attempt to remove account.");
                }
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "RemoveAccountPerformer started", 8);
                }
                ModernAccount e = this.this$0.w.b(false).e(B);
                if (e == null) {
                    throw new PassportAccountNotFoundException(B);
                }
                com.yandex.passport.internal.core.accounts.z zVar = this.this$0.c;
                com.yandex.passport.internal.core.accounts.y yVar = new com.yandex.passport.internal.core.accounts.y(new com.yandex.passport.internal.core.accounts.w(e), true, true, RevokePlace.REMOVE_ACCOUNT_API, false);
                this.label = 1;
                zVar.a(yVar);
                if (zy11Var == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11Var;
        } catch (PassportAccountNotFoundException e2) {
            throw e2;
        } catch (InterruptedException unused) {
            throw new PassportRuntimeUnknownException("timeout while waiting for account removal");
        } catch (CancellationException e3) {
            throw e3;
        } catch (Exception e4) {
            throw new PassportRuntimeUnknownException(e4);
        }
    }
}
