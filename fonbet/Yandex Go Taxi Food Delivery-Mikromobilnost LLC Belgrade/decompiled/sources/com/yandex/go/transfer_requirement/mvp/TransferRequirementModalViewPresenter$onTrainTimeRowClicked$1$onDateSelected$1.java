package com.yandex.go.transfer_requirement.mvp;

import defpackage.ctb1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.op01;
import defpackage.rsb1;
import defpackage.tse;
import defpackage.wf7;
import defpackage.wls;
import defpackage.xo01;
import defpackage.yo01;
import defpackage.zo01;
import defpackage.zy11;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.transfer_requirement.mvp.TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1", f = "TransferRequirementModalViewPresenter.kt", l = {HProv.PP_BIO_STATISTICA_LEN}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1 extends SuspendLambda implements wls {
    final /* synthetic */ Calendar $date;
    int label;
    final /* synthetic */ op01 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1(op01 op01Var, Calendar calendar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = op01Var;
        this.$date = calendar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1(this.this$0, this.$date, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TransferRequirementModalViewPresenter$onTrainTimeRowClicked$1$onDateSelected$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return zy11Var;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.transfer_requirement.card_state.a aVar = this.this$0.A;
        Calendar calendar = this.$date;
        this.label = 1;
        zo01 zo01Var = aVar.e;
        yo01 a2 = zo01Var.a();
        Calendar a3 = ctb1.a(a2);
        wf7 wf7Var = wf7.a;
        if (calendar == null || a3 == null ? calendar != a3 : !(wf7.e(calendar, a3) && calendar.get(11) == a3.get(11) && calendar.get(12) == a3.get(12))) {
            yo01 a4 = yo01.a(a2, rsb1.d(wf7.a(calendar), 0, 0), new xo01(calendar.get(11), calendar.get(12)), null, null, 0, null, null, null, 252);
            zo01Var.b(a4);
            a = aVar.a(a4, this);
        } else {
            a = zy11Var;
        }
        return a == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
