package com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.IntercityDashboardInteractor", f = "IntercityDashboardInteractor.kt", l = {HProv.PP_FAST_CODE, 150, 152}, m = "updatePriceLoadingState$impl", v = 2)
/* loaded from: classes14.dex */
final class IntercityDashboardInteractor$updatePriceLoadingState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntercityDashboardInteractor$updatePriceLoadingState$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.s(null, this);
    }
}
