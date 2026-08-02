package com.yandex.go.overdraft.domain;

import com.yandex.go.address.models.Address;
import com.yandex.go.overdraft.data.model.DebtAvailablePaymentMethod;
import com.yandex.go.overdraft.data.model.DebtStatusesParam;
import defpackage.fug;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.lea0;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.tea0;
import defpackage.u0k;
import defpackage.uea0;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loea0;", "paymentModels", "Lcom/yandex/go/overdraft/data/model/DebtStatusesParam;", "<anonymous>", "(Loea0;)Lcom/yandex/go/overdraft/data/model/DebtStatusesParam;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1", f = "DebtStatusesRequestInteractor.kt", l = {47}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ jw90 $availabilityChecker;
    final /* synthetic */ tea0 $paymentModelsToPaymentOptionsForConverterMapper;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fug this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1(fug fugVar, tea0 tea0Var, jw90 jw90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fugVar;
        this.$paymentModelsToPaymentOptionsForConverterMapper = tea0Var;
        this.$availabilityChecker = jw90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1 debtStatusesRequestInteractor$debtStatusesParamObservable$2$1 = new DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1(this.this$0, this.$paymentModelsToPaymentOptionsForConverterMapper, this.$availabilityChecker, continuation);
        debtStatusesRequestInteractor$debtStatusesParamObservable$2$1.L$0 = obj;
        return debtStatusesRequestInteractor$debtStatusesParamObservable$2$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DebtStatusesRequestInteractor$debtStatusesParamObservable$2$1) create((oea0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        DebtAvailablePaymentMethod debtAvailablePaymentMethod;
        oea0 oea0Var = (oea0) this.L$0;
        Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zzs zzsVar = null;
        boolean z = true;
        if (i == 0) {
            kotlin.b.b(obj);
            fug fugVar = this.this$0;
            this.L$0 = oea0Var;
            this.label = 1;
            fugVar.getClass();
            if ((oea0Var.a() ? kotlinx.coroutines.a.i(1000L, this) : zy11.a) == obj2) {
                return obj2;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        List<nea0> list = ((uea0) this.$paymentModelsToPaymentOptionsForConverterMapper).a(oea0Var, this.$availabilityChecker, null).a;
        fug fugVar2 = this.this$0;
        ArrayList arrayList = new ArrayList();
        for (nea0 nea0Var : list) {
            fugVar2.getClass();
            u0k u0kVar = nea0Var.a;
            if (u0kVar instanceof lea0) {
                lea0 lea0Var = (lea0) u0kVar;
                debtAvailablePaymentMethod = new DebtAvailablePaymentMethod(lea0Var.c().getCode(), lea0Var.getId());
            } else {
                debtAvailablePaymentMethod = null;
            }
            if (debtAvailablePaymentMethod != null) {
                arrayList.add(debtAvailablePaymentMethod);
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (jl40.l(((DebtAvailablePaymentMethod) it.next()).a, PaymentMethod$Type.CASH.getCode())) {
                    break;
                }
            }
        }
        z = false;
        Address e = this.this$0.a.e();
        zzs B = e != null ? e.B() : null;
        if (B != null && !B.equals(zzs.f)) {
            zzsVar = B;
        }
        return new DebtStatusesParam(zzsVar, arrayList, z);
    }
}
