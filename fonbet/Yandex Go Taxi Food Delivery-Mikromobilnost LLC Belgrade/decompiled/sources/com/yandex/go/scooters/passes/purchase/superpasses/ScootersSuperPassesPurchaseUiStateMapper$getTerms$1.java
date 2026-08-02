package com.yandex.go.scooters.passes.purchase.superpasses;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.passes.purchase.superpasses.ScootersSuperPassesPurchaseUiStateMapper", f = "ScootersSuperPassesPurchaseUiStateMapper.kt", l = {HProv.PP_DHOID, HProv.PP_RESERVED1}, m = "getTerms", v = 2)
/* loaded from: classes13.dex */
final class ScootersSuperPassesPurchaseUiStateMapper$getTerms$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ h this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersSuperPassesPurchaseUiStateMapper$getTerms$1(h hVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return h.b(this.this$0, null, this);
    }
}
