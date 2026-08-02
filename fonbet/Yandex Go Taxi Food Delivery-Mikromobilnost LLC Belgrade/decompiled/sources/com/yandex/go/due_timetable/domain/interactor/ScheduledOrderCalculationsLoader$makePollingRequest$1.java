package com.yandex.go.due_timetable.domain.interactor;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.due_timetable.domain.interactor.ScheduledOrderCalculationsLoader", f = "ScheduledOrderCalculationsLoader.kt", l = {HProv.ALG_SID_SHA3_256, 85, HProv.ALG_SID_KECCAK_256, HProv.PP_SIGNATUREOID}, m = "makePollingRequest", v = 2)
/* loaded from: classes12.dex */
final class ScheduledOrderCalculationsLoader$makePollingRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScheduledOrderCalculationsLoader$makePollingRequest$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.a(this.this$0, null, false, null, false, this);
    }
}
