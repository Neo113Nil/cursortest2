package com.yandex.go.permission.location_with_agreement.ui;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.permission.location_with_agreement.ui.LocationWithAgreementPresenter", f = "LocationWithAgreementPresenter.kt", l = {HProv.ALG_SID_KECCAK_256, 169}, m = "finalize", v = 2)
/* loaded from: classes13.dex */
final class LocationWithAgreementPresenter$finalize$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocationWithAgreementPresenter$finalize$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return c.Lg(this.this$0, this);
    }
}
