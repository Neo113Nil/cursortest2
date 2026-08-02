package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import defpackage.dkw;
import defpackage.glw;
import defpackage.jlw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$handlePreferredTariff$1", f = "IntercityDashboardPresenter.kt", l = {237}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$handlePreferredTariff$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $preferredTariffClass;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$handlePreferredTariff$1(g gVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$preferredTariffClass = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$handlePreferredTariff$1(this.this$0, this.$preferredTariffClass, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$handlePreferredTariff$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object m;
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
        com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar = this.this$0.z;
        String str = this.$preferredTariffClass;
        this.label = 1;
        jlw a = fVar.d.a();
        String str2 = a instanceof glw ? ((glw) a).f.a : null;
        IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.DEEPLINK;
        j jVar = fVar.j;
        jVar.getClass();
        int i2 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
        if (i2 == 1) {
            m = jVar.m(str, str2, this);
        } else if (i2 == 2) {
            m = zy11Var;
        } else {
            if (i2 != 3 && i2 != 4) {
                w511.b();
                return null;
            }
            m = jVar.j(str, str2, intercityDashboardSelectTariffSource, this);
        }
        return m == coroutineSingletons ? coroutineSingletons : zy11Var;
    }
}
