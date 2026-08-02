package com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal;

import com.yandex.go.taxi.intercity.dashboard.impl.domain.entity.IntercityDashboardSelectTariffSource;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.j;
import defpackage.afw;
import defpackage.dkw;
import defpackage.glw;
import defpackage.jlw;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkw;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.presentation.modal.IntercityDashboardPresenter$onTariffClicked$1", f = "IntercityDashboardPresenter.kt", l = {413}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardPresenter$onTariffClicked$1 extends SuspendLambda implements wls {
    final /* synthetic */ pkw $tariffSelectorItem;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardPresenter$onTariffClicked$1(g gVar, pkw pkwVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$tariffSelectorItem = pkwVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new IntercityDashboardPresenter$onTariffClicked$1(this.this$0, this.$tariffSelectorItem, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((IntercityDashboardPresenter$onTariffClicked$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        pkw d;
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
        String str = this.$tariffSelectorItem.a;
        this.label = 1;
        jlw a = fVar.d.a();
        if (a instanceof glw) {
            afw afwVar = ((glw) a).f;
            String str2 = afwVar.b;
            String str3 = afwVar.a;
            IntercityDashboardSelectTariffSource intercityDashboardSelectTariffSource = IntercityDashboardSelectTariffSource.USER;
            j jVar = fVar.j;
            jVar.getClass();
            int i2 = dkw.a[intercityDashboardSelectTariffSource.ordinal()];
            if (i2 == 1) {
                obj2 = jVar.m(str2, str3, this);
            } else if (i2 != 2) {
                if (i2 != 3 && i2 != 4) {
                    w511.b();
                    return null;
                }
                obj2 = jVar.j(str2, str3, intercityDashboardSelectTariffSource, this);
            } else if (str != null && (d = j.d(jVar.e(), str)) != null) {
                String str4 = d.b;
                jVar.k(d, intercityDashboardSelectTariffSource);
                jVar.a.c(d.a, str4);
                if (jVar.h(str4)) {
                    obj2 = jVar.l(str4, str3, SelectionOrigin.USER, this);
                }
            }
            return obj2 != coroutineSingletons ? coroutineSingletons : zy11Var;
        }
        obj2 = zy11Var;
        if (obj2 != coroutineSingletons) {
        }
    }
}
