package com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment;

import defpackage.eod0;
import defpackage.fod0;
import defpackage.ind0;
import defpackage.mvg;
import defpackage.nod0;
import defpackage.ny61;
import defpackage.ood0;
import defpackage.pod0;
import defpackage.qod0;
import defpackage.rod0;
import defpackage.sod0;
import defpackage.spd0;
import defpackage.tod0;
import defpackage.uod0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xod0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.common.clid.ClidProvider;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luod0;", ClidProvider.STATE, "Lzy11;", "<anonymous>", "(Luod0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.ui.core.tarifficator.api.domain.payment.PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1", f = "PlusTarifficatorPaymentFacadeImpl.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1 extends SuspendLambda implements wls {
    final /* synthetic */ ind0 $scenarioContext;
    final /* synthetic */ eod0 $webActionController;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1(b bVar, eod0 eod0Var, ind0 ind0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$webActionController = eod0Var;
        this.$scenarioContext = ind0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1 plusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1 = new PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1(this.this$0, this.$webActionController, this.$scenarioContext, continuation);
        plusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1.L$0 = obj;
        return plusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PlusTarifficatorPaymentFacadeImpl$startPayment$terminalState$1) create((uod0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Iterator it;
        ind0 ind0Var;
        int i;
        uod0 uod0Var = (uod0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            List list = this.this$0.b;
            ind0 ind0Var2 = this.$scenarioContext;
            it = list.iterator();
            ind0Var = ind0Var2;
            i = 0;
        } else {
            if (i2 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.I$0;
            it = (Iterator) this.L$3;
            ind0Var = (ind0) this.L$2;
            kotlin.b.b(obj);
        }
        while (it.hasNext()) {
            fod0 fod0Var = (fod0) it.next();
            this.L$0 = uod0Var;
            this.L$1 = null;
            this.L$2 = ind0Var;
            this.L$3 = it;
            this.L$4 = null;
            this.L$5 = null;
            this.I$0 = i;
            this.I$1 = 0;
            this.label = 1;
            if (fod0Var.a(ind0Var, uod0Var) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        b bVar = this.this$0;
        eod0 eod0Var = this.$webActionController;
        bVar.getClass();
        if ((uod0Var instanceof sod0) || (uod0Var instanceof rod0) || (uod0Var instanceof ood0)) {
            if (eod0Var.c) {
                eod0Var.b.invoke();
                eod0Var.c = false;
            }
        } else if (uod0Var instanceof tod0) {
            tod0 tod0Var = (tod0) uod0Var;
            String str = tod0Var.a;
            xod0 xod0Var = tod0Var.b;
            spd0 spd0Var = new spd0(str, new xod0(xod0Var.a, xod0Var.b));
            if (!eod0Var.c) {
                eod0Var.c = true;
                eod0Var.a.invoke(spd0Var);
            }
        } else {
            if (!(uod0Var instanceof qod0) && !(uod0Var instanceof pod0) && !(uod0Var instanceof nod0)) {
                w511.b();
                return null;
            }
            if (eod0Var.c) {
                eod0Var.b.invoke();
                eod0Var.c = false;
            }
        }
        return zy11.a;
    }
}
