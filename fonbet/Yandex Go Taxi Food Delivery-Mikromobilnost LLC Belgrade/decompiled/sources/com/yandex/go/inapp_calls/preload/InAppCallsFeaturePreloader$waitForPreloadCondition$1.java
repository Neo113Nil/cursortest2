package com.yandex.go.inapp_calls.preload;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.inapp_calls.preload.InAppCallsFeaturePreloader", f = "InAppCallsFeaturePreloader.kt", l = {HProv.PROV_GOST_2001_DH}, m = "waitForPreloadCondition", v = 2)
/* loaded from: classes12.dex */
final class InAppCallsFeaturePreloader$waitForPreloadCondition$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppCallsFeaturePreloader$waitForPreloadCondition$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.d(this.this$0, this);
    }
}
