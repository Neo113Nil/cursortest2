package com.yandex.go.payments.paymentlist.domain;

import com.yandex.go.payments.paymentlist.data.EditModeState;
import defpackage.dca0;
import defpackage.iy2;
import defpackage.jfa0;
import defpackage.lba0;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.pmn;
import defpackage.s9a0;
import defpackage.tcc;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljfa0;", "paymentOptions", "Lzy11;", "<anonymous>", "(Ljfa0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.domain.PaymentMethodsListPresenter$paymentOptionsFlow$2", f = "PaymentMethodsListPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsListPresenter$paymentOptionsFlow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsListPresenter$paymentOptionsFlow$2(k kVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsListPresenter$paymentOptionsFlow$2 paymentMethodsListPresenter$paymentOptionsFlow$2 = new PaymentMethodsListPresenter$paymentOptionsFlow$2(this.this$0, continuation);
        paymentMethodsListPresenter$paymentOptionsFlow$2.L$0 = obj;
        return paymentMethodsListPresenter$paymentOptionsFlow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentMethodsListPresenter$paymentOptionsFlow$2 paymentMethodsListPresenter$paymentOptionsFlow$2 = (PaymentMethodsListPresenter$paymentOptionsFlow$2) create((jfa0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentMethodsListPresenter$paymentOptionsFlow$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        jfa0 jfa0Var = (jfa0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        k kVar = this.this$0;
        if (kVar.I.c(PaymentMethod$Type.GOOGLE_PAY)) {
            kVar.U.a(new iy2(28, jfa0Var, kVar));
        }
        kVar.D.a(jfa0Var.a);
        k kVar2 = this.this$0;
        dca0 dca0Var = kVar2.x.b;
        if (dca0Var.f && dca0Var.e) {
            pmn pmnVar = kVar2.N;
            List list = jfa0Var.a;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((nea0) it.next()).a);
            }
            if (!kVar2.B.e(arrayList)) {
                pmnVar.a.a.l(EditModeState.GONE);
                lba0 lba0Var = kVar2.M;
                com.yandex.go.payments.paymentlist.domain.converter.i iVar = lba0Var.a;
                s9a0 s9a0Var = lba0Var.b;
                iVar.a = s9a0Var;
                iVar.k.a = s9a0Var;
            } else if (((EditModeState) pmnVar.a.a.getValue()) == EditModeState.GONE) {
                pmnVar.a.a.l(EditModeState.DISABLED);
            }
        }
        return zy11.a;
    }
}
