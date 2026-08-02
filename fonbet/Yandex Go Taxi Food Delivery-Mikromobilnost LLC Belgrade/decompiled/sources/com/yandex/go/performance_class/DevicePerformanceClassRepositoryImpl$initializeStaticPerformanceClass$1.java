package com.yandex.go.performance_class;

import defpackage.mvg;
import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.performance_class.DevicePerformanceClassRepositoryImpl", f = "DevicePerformanceClassRepositoryImpl.kt", l = {211, BuildConfig.API_LEVEL}, m = "initializeStaticPerformanceClass", v = 2)
/* loaded from: classes8.dex */
final class DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DevicePerformanceClassRepositoryImpl$initializeStaticPerformanceClass$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.a(this.this$0, null, this);
    }
}
