package com.yandex.go.safety.center;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.safety.center.SafetyCenterRootRouterImpl", f = "SafetyCenterRootRouterImpl.kt", l = {HProv.ALG_SID_SHA3_224}, m = "launchWebSafetyCenter", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterRootRouterImpl$launchWebSafetyCenter$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterRootRouterImpl$launchWebSafetyCenter$1(k kVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return k.P(this.this$0, null, null, null, this);
    }
}
