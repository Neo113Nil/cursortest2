package com.yandex.passport.common.analytics;

import com.yandex.pulse.metrics.SystemProfileProtos$SystemProfileProto;
import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@mvg(c = "com.yandex.passport.common.analytics.AnalyticsHelper", f = "AnalyticsHelper.kt", l = {SystemProfileProtos$SystemProfileProto.ComponentId.TRANSLATE_KIT_VALUE}, m = "getDeviceId-wSIJhPw$suspendImpl")
/* loaded from: classes8.dex */
final class AnalyticsHelper$getDeviceId$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnalyticsHelper$getDeviceId$1(f fVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object e = f.e(this.this$0, this);
        if (e == CoroutineSingletons.COROUTINE_SUSPENDED) {
            return e;
        }
        String str = (String) e;
        if (str != null) {
            return new com.yandex.passport.common.value.a(str);
        }
        return null;
    }
}
