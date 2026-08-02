package com.yandex.go.requirements.order;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import defpackage.lmw0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p7h;
import defpackage.pex0;
import defpackage.rqv0;
import defpackage.tse;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.requirements.order.GluedRequirementOrderPart$showTariffCardAndOptionSelector$1", f = "GluedRequirementOrderPart.kt", l = {HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class GluedRequirementOrderPart$showTariffCardAndOptionSelector$1 extends SuspendLambda implements wls {
    final /* synthetic */ lmw0 $requirement;
    final /* synthetic */ pex0 $tariff;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluedRequirementOrderPart$showTariffCardAndOptionSelector$1(a aVar, pex0 pex0Var, lmw0 lmw0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$tariff = pex0Var;
        this.$requirement = lmw0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GluedRequirementOrderPart$showTariffCardAndOptionSelector$1(this.this$0, this.$tariff, this.$requirement, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GluedRequirementOrderPart$showTariffCardAndOptionSelector$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            vqv0 vqv0Var = aVar.f;
            pex0 pex0Var = this.$tariff;
            rqv0 rqv0Var = new rqv0(pex0Var.J0, SummaryExpandReason.AUTO_GLUED_REQUIREMENT_ON_ORDER, new p7h(19, this.$requirement, aVar, pex0Var));
            this.label = 1;
            if (vqv0Var.a.emit(rqv0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
