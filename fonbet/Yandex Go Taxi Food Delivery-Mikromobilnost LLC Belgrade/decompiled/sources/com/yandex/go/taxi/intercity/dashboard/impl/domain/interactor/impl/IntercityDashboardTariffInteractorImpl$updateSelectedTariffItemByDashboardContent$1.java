package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.impl.IntercityDashboardTariffInteractorImpl", f = "IntercityDashboardTariffInteractorImpl.kt", l = {HProv.PP_DELETE_KEYSET, HProv.PP_DELETE_SAVED_PASSWD, HProv.PP_CONTAINER_DEFAULT, HProv.PP_LCD_QUERY}, m = "updateSelectedTariffItemByDashboardContent", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ j this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardTariffInteractorImpl$updateSelectedTariffItemByDashboardContent$1(j jVar, Continuation continuation) {
        super(continuation);
        this.this$0 = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m(null, null, this);
    }
}
