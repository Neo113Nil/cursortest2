package com.yandex.go.masstransit.sdk.order.impl.tickets;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.masstransit.sdk.order.impl.tickets.MtTicketsRepository", f = "MtTicketsRepository.kt", l = {HProv.ALG_SID_GR3410_12_256, HProv.PROV_GOST_2001_DH, MSException.ERROR_INVALID_PARAMETER, HProv.ALG_SID_KECCAK_224, HProv.PP_REBOOT, 99, HProv.PP_CACHE_SIZE}, m = "getOrder", v = 2)
/* loaded from: classes12.dex */
final class MtTicketsRepository$getOrder$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ i this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MtTicketsRepository$getOrder$1(i iVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.b(null, this);
    }
}
