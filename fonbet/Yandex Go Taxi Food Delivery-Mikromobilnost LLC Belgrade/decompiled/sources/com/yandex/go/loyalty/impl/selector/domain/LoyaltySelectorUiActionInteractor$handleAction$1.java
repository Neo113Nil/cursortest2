package com.yandex.go.loyalty.impl.selector.domain;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.loyalty.impl.selector.domain.LoyaltySelectorUiActionInteractor", f = "LoyaltySelectorUiActionInteractor.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 74, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384}, m = "handleAction-PKIS5XI", v = 2)
/* loaded from: classes12.dex */
final class LoyaltySelectorUiActionInteractor$handleAction$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltySelectorUiActionInteractor$handleAction$1(d dVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.e(null, null, null, null, this);
    }
}
