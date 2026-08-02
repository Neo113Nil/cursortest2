package com.yandex.go.delivery.rental_duration_selector.requirement;

import com.yandex.plus.acquisition.sdk.pay.common.api.PlusAcquisitionSmartOffer;
import defpackage.ami;
import defpackage.bmi;
import defpackage.fnx0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zli;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfnx0;", PlusAcquisitionSmartOffer.Texts.TARIFF_PREFIX, "Lzli;", "summaryItem", "Lzy11;", "<anonymous>", "(Lfnx0;Lzli;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementPresenter$attachView$2", f = "DeliveryRentRequirementPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRentRequirementPresenter$attachView$2 extends SuspendLambda implements zls {
    final /* synthetic */ ami $mvpView;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ bmi this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRentRequirementPresenter$attachView$2(ami amiVar, bmi bmiVar, Continuation continuation) {
        super(3, continuation);
        this.$mvpView = amiVar;
        this.this$0 = bmiVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        DeliveryRentRequirementPresenter$attachView$2 deliveryRentRequirementPresenter$attachView$2 = new DeliveryRentRequirementPresenter$attachView$2(this.$mvpView, this.this$0, (Continuation) obj3);
        deliveryRentRequirementPresenter$attachView$2.L$0 = (fnx0) obj;
        deliveryRentRequirementPresenter$attachView$2.L$1 = (zli) obj2;
        zy11 zy11Var = zy11.a;
        deliveryRentRequirementPresenter$attachView$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        fnx0 fnx0Var = (fnx0) this.L$0;
        zli zliVar = (zli) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$mvpView.setVisibility(true);
        this.$mvpView.bind(zliVar);
        this.this$0.B.a(zliVar.e, fnx0Var.c.b);
        return zy11.a;
    }
}
