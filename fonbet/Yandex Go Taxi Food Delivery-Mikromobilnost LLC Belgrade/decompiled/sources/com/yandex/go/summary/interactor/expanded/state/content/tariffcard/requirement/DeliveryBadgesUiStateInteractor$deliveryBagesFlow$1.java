package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.blj0;
import defpackage.bms;
import defpackage.clj0;
import defpackage.d4h0;
import defpackage.evu0;
import defpackage.gkj0;
import defpackage.hkj0;
import defpackage.j73;
import defpackage.jdj0;
import defpackage.mja1;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.olj0;
import defpackage.owh;
import defpackage.pkj0;
import defpackage.qgi;
import defpackage.uij0;
import defpackage.uti;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "isRedesignEnabled", "Luti;", "payOnDeliveryState", "Lqgi;", "paidInsuranceState", "", "Lamj0;", "<anonymous>", "(ZLuti;Lqgi;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DeliveryBadgesUiStateInteractor$deliveryBagesFlow$1", f = "DeliveryBadgesUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DeliveryBadgesUiStateInteractor$deliveryBagesFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ owh this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryBadgesUiStateInteractor$deliveryBagesFlow$1(owh owhVar, Continuation continuation) {
        super(4, continuation);
        this.this$0 = owhVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        DeliveryBadgesUiStateInteractor$deliveryBagesFlow$1 deliveryBadgesUiStateInteractor$deliveryBagesFlow$1 = new DeliveryBadgesUiStateInteractor$deliveryBagesFlow$1(this.this$0, (Continuation) obj4);
        deliveryBadgesUiStateInteractor$deliveryBagesFlow$1.Z$0 = booleanValue;
        deliveryBadgesUiStateInteractor$deliveryBagesFlow$1.L$0 = (uti) obj2;
        deliveryBadgesUiStateInteractor$deliveryBagesFlow$1.L$1 = (qgi) obj3;
        return deliveryBadgesUiStateInteractor$deliveryBagesFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        amj0 amj0Var;
        boolean z = this.Z$0;
        uti utiVar = (uti) this.L$0;
        qgi qgiVar = (qgi) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        amj0 amj0Var2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (utiVar != null) {
            com.yandex.go.summary.mapper.a aVar = this.this$0.d;
            aVar.getClass();
            String str = utiVar.c;
            if (str == null) {
                str = "";
            }
            uij0 uij0Var = (!evu0.J(str) || z) ? new uij0(mja1.b(str, null, 6), Integer.valueOf(d4h0.ic_pay_on_delivery), null) : null;
            String str2 = utiVar.a;
            String str3 = utiVar.b;
            if (str3 == null) {
                str3 = "";
            }
            jdj0 jdj0Var = new jdj0(str2, str3);
            String str4 = utiVar.d;
            if (str4 == null) {
                str4 = "";
            }
            gkj0 gkj0Var = !evu0.J(str4) ? new gkj0(mja1.b(str4, null, 6), null) : null;
            boolean z2 = utiVar.e;
            amj0Var = new amj0("pay_on_delivery", "pay_on_delivery", true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, gkj0Var, new pkj0(z2, null, ""), new olj0(z2, HapticEffect.Tick), com.yandex.go.summary.mapper.a.b(aVar, str2, str3, null, 12), RequirementTypeUiState.DEFAULT);
        } else {
            amj0Var = null;
        }
        if (qgiVar != null) {
            String str5 = qgiVar.a;
            com.yandex.go.summary.mapper.a aVar2 = this.this$0.d;
            aVar2.getClass();
            uij0 uij0Var2 = z ? new uij0(mja1.b("", null, 6), Integer.valueOf(d4h0.ic_paid_insurance), null) : null;
            jdj0 jdj0Var2 = new jdj0(str5, "");
            String str6 = qgiVar.b;
            hkj0 hkj0Var = (str6 == null || evu0.J(str6)) ? null : new hkj0(null, str6, "");
            boolean z3 = qgiVar.c;
            amj0Var2 = new amj0("paid_insurance", "paid_insurance", true, com.yandex.go.summary.mapper.a.c(z), RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var2, jdj0Var2, hkj0Var, new pkj0(z3, new clj0(z3, HapticEffect.Tick), str5.toString()), new blj0(HapticEffect.ClickMedium), com.yandex.go.summary.mapper.a.b(aVar2, str5, null, str6, 8), RequirementTypeUiState.DEFAULT);
        }
        return j73.A(new amj0[]{amj0Var, amj0Var2});
    }
}
