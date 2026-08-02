package com.yandex.plus.paymentsdk.internal.method.sbp;

import com.yandex.plus.core.activity.result.internal.c;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.a7a0;
import defpackage.b7a0;
import defpackage.gv5;
import defpackage.ksi0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ryh0;
import defpackage.tse;
import defpackage.wls;
import defpackage.x6a0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.paymentsdk.internal.method.sbp.BindNewSbpTokenController$start$1", f = "BindNewSbpTokenController.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class BindNewSbpTokenController$start$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BindNewSbpTokenController$start$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BindNewSbpTokenController$start$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BindNewSbpTokenController$start$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object b;
        Object failure;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            c cVar = c.d;
            gv5 gv5Var = new gv5((ksi0) this.this$0.j.getValue(), "plus://" + this.this$0.b.a.getPackageName() + "/sbp/redirect");
            this.label = 1;
            b = cVar.b(gv5Var, zy11Var, this);
            if (b == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            b = ((Result) obj).getValue();
        }
        if (Result.a(b) != null) {
            b = x6a0.a;
        }
        a7a0 a7a0Var = (a7a0) b;
        a aVar = this.this$0;
        r0 r0Var = aVar.h;
        try {
            failure = aVar.c.getString(ryh0.paymentsdk_select_method_button);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = "";
        }
        r0Var.l(b7a0.a(a7a0Var, (String) failure));
        return zy11Var;
    }
}
