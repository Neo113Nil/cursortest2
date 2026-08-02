package com.yandex.go.chargers.station.presentation.partner;

import defpackage.aea;
import defpackage.bea;
import defpackage.cea;
import defpackage.dea;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.station.presentation.partner.ChargersPartnerDetailsRouter$content$1$1$1", f = "ChargersPartnerDetailsRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersPartnerDetailsRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ cea $action;
    final /* synthetic */ dea $chargersPartnerDetailsUiActionInteractor;
    final /* synthetic */ aea $innerNavigator;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersPartnerDetailsRouter$content$1$1$1(dea deaVar, cea ceaVar, aea aeaVar, Continuation continuation) {
        super(2, continuation);
        this.$chargersPartnerDetailsUiActionInteractor = deaVar;
        this.$action = ceaVar;
        this.$innerNavigator = aeaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersPartnerDetailsRouter$content$1$1$1(this.$chargersPartnerDetailsUiActionInteractor, this.$action, this.$innerNavigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersPartnerDetailsRouter$content$1$1$1 chargersPartnerDetailsRouter$content$1$1$1 = (ChargersPartnerDetailsRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersPartnerDetailsRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        dea deaVar = this.$chargersPartnerDetailsUiActionInteractor;
        cea ceaVar = this.$action;
        aea aeaVar = this.$innerNavigator;
        deaVar.getClass();
        if (ceaVar instanceof bea) {
            aeaVar.a.r(new qu(9));
            return zy11.a;
        }
        w511.b();
        return null;
    }
}
