package com.yandex.go.summary.interactor.expanded.action;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.summary.interactor.expanded.action.TariffCardUiActionInteractor", f = "TariffCardUiActionInteractor.kt", l = {35, 42, 49, 70, 71, HProv.ALG_SID_SHA3_256, 102, 109}, m = "handleAction", v = 2)
/* loaded from: classes14.dex */
final class TariffCardUiActionInteractor$handleAction$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffCardUiActionInteractor$handleAction$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
