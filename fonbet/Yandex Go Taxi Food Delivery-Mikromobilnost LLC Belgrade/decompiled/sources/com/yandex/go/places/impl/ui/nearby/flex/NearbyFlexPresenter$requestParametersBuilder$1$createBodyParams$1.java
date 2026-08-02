package com.yandex.go.places.impl.ui.nearby.flex;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.places.impl.ui.nearby.flex.NearbyFlexPresenter$requestParametersBuilder$1", f = "NearbyFlexPresenter.kt", l = {HProv.PP_REBOOT, HProv.PP_SIGNATUREOID}, m = "createBodyParams", v = 2)
/* loaded from: classes13.dex */
final class NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NearbyFlexPresenter$requestParametersBuilder$1$createBodyParams$1(c cVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(this);
    }
}
