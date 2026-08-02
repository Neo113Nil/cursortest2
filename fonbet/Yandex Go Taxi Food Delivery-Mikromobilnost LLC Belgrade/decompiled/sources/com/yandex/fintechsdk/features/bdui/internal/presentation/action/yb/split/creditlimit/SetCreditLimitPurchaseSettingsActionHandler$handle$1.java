package com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit;

import com.yandex.fintechsdk.adapters.yb.sdk.impl.c;
import defpackage.fp51;
import defpackage.ig5;
import defpackage.jh5;
import defpackage.mbf;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.q2r0;
import defpackage.r2r0;
import defpackage.tse;
import defpackage.vm50;
import defpackage.wls;
import defpackage.zy11;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.fintechsdk.features.bdui.internal.presentation.action.yb.split.creditlimit.SetCreditLimitPurchaseSettingsActionHandler$handle$1", f = "SetCreditLimitPurchaseSettingsActionHandler.kt", l = {38}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class SetCreditLimitPurchaseSettingsActionHandler$handle$1 extends SuspendLambda implements wls {
    final /* synthetic */ ig5 $action;
    final /* synthetic */ jh5 $context;
    final /* synthetic */ fp51 $ybAdapter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetCreditLimitPurchaseSettingsActionHandler$handle$1(ig5 ig5Var, fp51 fp51Var, jh5 jh5Var, Continuation continuation) {
        super(2, continuation);
        this.$action = ig5Var;
        this.$ybAdapter = fp51Var;
        this.$context = jh5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SetCreditLimitPurchaseSettingsActionHandler$handle$1(this.$action, this.$ybAdapter, this.$context, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SetCreditLimitPurchaseSettingsActionHandler$handle$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            q2r0 q2r0Var = (q2r0) this.$action;
            String str = q2r0Var.a;
            int i2 = q2r0Var.b;
            String str2 = q2r0Var.c;
            String str3 = q2r0Var.d;
            BigDecimal valueOf = BigDecimal.valueOf(q2r0Var.e);
            String str4 = ((q2r0) this.$action).f;
            Date date = new Date(((q2r0) this.$action).g);
            q2r0 q2r0Var2 = (q2r0) this.$action;
            mbf mbfVar = new mbf(str, i2, str2, str3, valueOf, str4, date, q2r0Var2.k, q2r0Var2.l);
            fp51 fp51Var = this.$ybAdapter;
            this.label = 1;
            obj = ((c) fp51Var).c(mbfVar, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        boolean z = ((r2r0) obj).a;
        ig5 ig5Var = this.$action;
        if (z) {
            vm50 vm50Var = ((q2r0) ig5Var).j;
            if (vm50Var != null) {
                this.$context.a.dispatch(vm50Var);
            }
        } else {
            vm50 vm50Var2 = ((q2r0) ig5Var).h;
            if (vm50Var2 != null) {
                this.$context.a.dispatch(vm50Var2);
            }
        }
        return zy11.a;
    }
}
