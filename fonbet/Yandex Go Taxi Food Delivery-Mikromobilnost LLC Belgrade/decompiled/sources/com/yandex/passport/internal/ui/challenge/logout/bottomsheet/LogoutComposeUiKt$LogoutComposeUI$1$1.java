package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.report.x7;
import com.yandex.passport.internal.report.yd;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.ui.challenge.logout.bottomsheet.LogoutComposeUiKt$LogoutComposeUI$1$1", f = "LogoutComposeUi.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class LogoutComposeUiKt$LogoutComposeUI$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.report.reporters.f0 $logoutReporter;
    final /* synthetic */ o0 $params;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogoutComposeUiKt$LogoutComposeUI$1$1(com.yandex.passport.internal.report.reporters.f0 f0Var, o0 o0Var, Continuation continuation) {
        super(2, continuation);
        this.$logoutReporter = f0Var;
        this.$params = o0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LogoutComposeUiKt$LogoutComposeUI$1$1(this.$logoutReporter, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LogoutComposeUiKt$LogoutComposeUI$1$1 logoutComposeUiKt$LogoutComposeUI$1$1 = (LogoutComposeUiKt$LogoutComposeUI$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        logoutComposeUiKt$LogoutComposeUI$1$1.invokeSuspend(zy11Var);
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
        com.yandex.passport.internal.report.reporters.f0 f0Var = this.$logoutReporter;
        Uid uid = this.$params.a;
        com.yandex.passport.internal.report.reporters.g0 g0Var = (com.yandex.passport.internal.report.reporters.g0) f0Var;
        g0Var.getClass();
        g0Var.f(x7.w, new yd(uid));
        return zy11.a;
    }
}
