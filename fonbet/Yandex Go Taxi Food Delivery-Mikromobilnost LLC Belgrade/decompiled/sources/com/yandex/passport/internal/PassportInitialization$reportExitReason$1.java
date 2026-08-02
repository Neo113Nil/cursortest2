package com.yandex.passport.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.yandex.passport.R;
import com.yandex.passport.common.logger.LogLevel;
import com.yandex.passport.internal.di.component.PassportProcessGlobalComponent;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.PassportInitialization$reportExitReason$1", f = "PassportInitialization.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes8.dex */
final class PassportInitialization$reportExitReason$1 extends SuspendLambda implements wls {
    final /* synthetic */ PassportProcessGlobalComponent $component;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PassportInitialization$reportExitReason$1(Context context, PassportProcessGlobalComponent passportProcessGlobalComponent, Continuation continuation) {
        super(2, continuation);
        this.$context = context;
        this.$component = passportProcessGlobalComponent;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PassportInitialization$reportExitReason$1(this.$context, this.$component, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PassportInitialization$reportExitReason$1 passportInitialization$reportExitReason$1 = (PassportInitialization$reportExitReason$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        passportInitialization$reportExitReason$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List historicalProcessExitReasons;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                historicalProcessExitReasons = ((ActivityManager) this.$context.getSystemService(ActivityManager.class)).getHistoricalProcessExitReasons(null, 0, 10);
                this.$component.getExitReasonReporter().j(this.$context.getString(R.string.passport_process_name), historicalProcessExitReasons);
            } catch (Throwable th) {
                com.yandex.passport.common.logger.c cVar = com.yandex.passport.common.logger.a.a;
                if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                    com.yandex.passport.common.logger.a.b(LogLevel.ERROR, null, "Can't get historical process exit reasons.", th);
                }
            }
        }
        return zy11.a;
    }
}
