package com.yandex.go.drive.vertical.ui.tariff_card;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.xgm;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lzy11;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.drive.vertical.ui.tariff_card.DriveTariffCardPresenter$attachView$1", f = "DriveTariffCardPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DriveTariffCardPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ xgm $mvpView;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DriveTariffCardPresenter$attachView$1(xgm xgmVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = xgmVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DriveTariffCardPresenter$attachView$1 driveTariffCardPresenter$attachView$1 = new DriveTariffCardPresenter$attachView$1(this.$mvpView, continuation);
        driveTariffCardPresenter$attachView$1.Z$0 = ((Boolean) obj).booleanValue();
        return driveTariffCardPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        DriveTariffCardPresenter$attachView$1 driveTariffCardPresenter$attachView$1 = (DriveTariffCardPresenter$attachView$1) create(bool, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        driveTariffCardPresenter$attachView$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$mvpView.G1(z);
        return zy11.a;
    }
}
