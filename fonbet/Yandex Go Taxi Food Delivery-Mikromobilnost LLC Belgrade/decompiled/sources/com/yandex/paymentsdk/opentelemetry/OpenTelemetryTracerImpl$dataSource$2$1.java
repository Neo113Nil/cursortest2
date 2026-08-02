package com.yandex.paymentsdk.opentelemetry;

import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
final /* synthetic */ class OpenTelemetryTracerImpl$dataSource$2$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object b = ((b) this.receiver).e.b((byte[]) obj, (Continuation) obj2);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
