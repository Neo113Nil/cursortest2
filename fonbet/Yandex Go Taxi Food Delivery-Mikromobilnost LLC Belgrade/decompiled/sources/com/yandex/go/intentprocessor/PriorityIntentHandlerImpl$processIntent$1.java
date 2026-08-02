package com.yandex.go.intentprocessor;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.intentprocessor.PriorityIntentHandlerImpl", f = "PriorityIntentHandlerImpl.kt", l = {HProv.PP_CACHE_SIZE, SystemProfileProtos$SystemProfileProto.ComponentId.SODA_ES_ES_VALUE, 69, HProv.PROV_GOST_2001_DH, HProv.ALG_SID_SHA3_384, HProv.PP_HASHOID}, m = "processIntent", v = 2)
/* loaded from: classes.dex */
final class PriorityIntentHandlerImpl$processIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$10;
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
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriorityIntentHandlerImpl$processIntent$1(l lVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, this);
    }
}
