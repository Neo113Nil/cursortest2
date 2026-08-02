package com.yandex.go.scooters.qr.preview.data.mapper;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.qr.preview.data.mapper.ScootersPreviewStateMapper", f = "ScootersPreviewStateMapper.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.ALG_SID_SHA3_256, HProv.ALG_SID_SHA3_384, MSException.ERROR_INVALID_PARAMETER, 91, HProv.PP_SIGNATUREOID, 101, 102}, m = "handleOurScooter", v = 2)
/* loaded from: classes13.dex */
final class ScootersPreviewStateMapper$handleOurScooter$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPreviewStateMapper$handleOurScooter$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.c(null, null, 0, this);
    }
}
