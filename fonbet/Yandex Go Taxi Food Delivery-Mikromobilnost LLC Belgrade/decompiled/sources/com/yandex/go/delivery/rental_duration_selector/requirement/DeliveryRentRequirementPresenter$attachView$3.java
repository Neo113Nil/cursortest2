package com.yandex.go.delivery.rental_duration_selector.requirement;

import defpackage.ami;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.theme.ThemeType;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lru/yandex/taxi/theme/ThemeType;", "it", "Lzy11;", "<anonymous>", "(Lru/yandex/taxi/theme/ThemeType;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.delivery.rental_duration_selector.requirement.DeliveryRentRequirementPresenter$attachView$3", f = "DeliveryRentRequirementPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class DeliveryRentRequirementPresenter$attachView$3 extends SuspendLambda implements wls {
    final /* synthetic */ ami $mvpView;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryRentRequirementPresenter$attachView$3(ami amiVar, Continuation continuation) {
        super(2, continuation);
        this.$mvpView = amiVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        DeliveryRentRequirementPresenter$attachView$3 deliveryRentRequirementPresenter$attachView$3 = new DeliveryRentRequirementPresenter$attachView$3(this.$mvpView, continuation);
        deliveryRentRequirementPresenter$attachView$3.L$0 = obj;
        return deliveryRentRequirementPresenter$attachView$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        DeliveryRentRequirementPresenter$attachView$3 deliveryRentRequirementPresenter$attachView$3 = (DeliveryRentRequirementPresenter$attachView$3) create((ThemeType) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        deliveryRentRequirementPresenter$attachView$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ThemeType themeType = (ThemeType) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.$mvpView.setTheme(themeType);
        return zy11.a;
    }
}
