package com.yandex.go.taxi.summary.verticalsummary.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.taxi.summary.verticalsummary.interactor.TariffsUiStateInteractor", f = "TariffsUiStateInteractor.kt", l = {HProv.PP_INFO, 119}, m = "getTariffUiState", v = 2)
/* loaded from: classes14.dex */
final class TariffsUiStateInteractor$getTariffUiState$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffsUiStateInteractor$getTariffUiState$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return f.a(this.this$0, null, null, this);
    }
}
