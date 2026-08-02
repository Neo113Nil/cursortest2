package com.yandex.go.superapp.unified_polling;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.cprocsp.NGate.tools.Constants;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.superapp.unified_polling.UnifiedPollingApiImplementation", f = "UnifiedPollingApiImplementation.kt", l = {Constants.VPN_TRAFFIC, HProv.PP_PASSWD_TERM}, m = "performTrackingRequest-5_5nbZA", v = 2)
/* loaded from: classes8.dex */
final class UnifiedPollingApiImplementation$performTrackingRequest$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifiedPollingApiImplementation$performTrackingRequest$1(g gVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return g.a(this.this$0, null, null, null, this);
    }
}
