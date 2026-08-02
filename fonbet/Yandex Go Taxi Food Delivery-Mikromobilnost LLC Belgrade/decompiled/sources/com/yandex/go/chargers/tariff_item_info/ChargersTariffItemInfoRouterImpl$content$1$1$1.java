package com.yandex.go.chargers.tariff_item_info;

import defpackage.jxa;
import defpackage.lxa;
import defpackage.mvg;
import defpackage.mxa;
import defpackage.nxa;
import defpackage.ny61;
import defpackage.qu;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.chargers.tariff_item_info.ChargersTariffItemInfoRouterImpl$content$1$1$1", f = "ChargersTariffItemInfoRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class ChargersTariffItemInfoRouterImpl$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ mxa $action;
    final /* synthetic */ jxa $navigator;
    final /* synthetic */ nxa $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChargersTariffItemInfoRouterImpl$content$1$1$1(nxa nxaVar, mxa mxaVar, jxa jxaVar, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = nxaVar;
        this.$action = mxaVar;
        this.$navigator = jxaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ChargersTariffItemInfoRouterImpl$content$1$1$1(this.$uiActionInteractor, this.$action, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        ChargersTariffItemInfoRouterImpl$content$1$1$1 chargersTariffItemInfoRouterImpl$content$1$1$1 = (ChargersTariffItemInfoRouterImpl$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        chargersTariffItemInfoRouterImpl$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        nxa nxaVar = this.$uiActionInteractor;
        mxa mxaVar = this.$action;
        jxa jxaVar = this.$navigator;
        nxaVar.getClass();
        if (mxaVar instanceof lxa) {
            jxaVar.a.r(new qu(9));
            return zy11.a;
        }
        w511.b();
        return null;
    }
}
