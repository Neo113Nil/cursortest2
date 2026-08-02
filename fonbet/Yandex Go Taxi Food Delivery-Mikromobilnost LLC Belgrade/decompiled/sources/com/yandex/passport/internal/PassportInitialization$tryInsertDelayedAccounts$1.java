package com.yandex.passport.internal;

import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import com.yandex.passport.internal.report.h6;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$tryInsertDelayedAccounts$1", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$tryInsertDelayedAccounts$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $component;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$tryInsertDelayedAccounts$1(PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$component = passportProcessGlobalComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitialization$tryInsertDelayedAccounts$1(this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassportInitialization$tryInsertDelayedAccounts$1 passportInitialization$tryInsertDelayedAccounts$1 = (PassportInitialization$tryInsertDelayedAccounts$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        passportInitialization$tryInsertDelayedAccounts$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.passport.internal.core.accounts.m delayedAccountRepairer = this.$component.getDelayedAccountRepairer();
        delayedAccountRepairer.getClass();
        try {
            ArrayList b = delayedAccountRepairer.a.b(delayedAccountRepairer.c.b());
            com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
            if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                com.yandex.passport.common.logger.a.c(LogLevel.DEBUG, null, "tryInsertDelayedAccounts delayedAccounts: " + b, 8);
            }
            Iterator it = b.iterator();
            while (it.hasNext()) {
                delayedAccountRepairer.b.a((ModernAccount) it.next(), com.yandex.passport.internal.analytics.i.q, true);
            }
        } catch (Throwable th) {
            com.yandex.passport.internal.report.reporters.t tVar = delayedAccountRepairer.d;
            tVar.getClass();
            tVar.f(h6.w, new yd(th));
        }
        return zy11.a;
    }
}
