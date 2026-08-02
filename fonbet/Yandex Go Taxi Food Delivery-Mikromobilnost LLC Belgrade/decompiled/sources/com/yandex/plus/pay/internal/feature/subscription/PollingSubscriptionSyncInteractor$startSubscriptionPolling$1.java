package com.yandex.plus.pay.internal.feature.subscription;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
@mvg(c = "com.yandex.plus.pay.internal.feature.subscription.PollingSubscriptionSyncInteractor", f = "PollingSubscriptionSyncInteractor.kt", l = {47, 65, SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE, HProv.ALG_SID_SHA3_224}, m = "startSubscriptionPolling")
/* loaded from: classes2.dex */
final class PollingSubscriptionSyncInteractor$startSubscriptionPolling$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    int I$4;
    int I$5;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PollingSubscriptionSyncInteractor$startSubscriptionPolling$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.a(null, null, null, this);
    }
}
