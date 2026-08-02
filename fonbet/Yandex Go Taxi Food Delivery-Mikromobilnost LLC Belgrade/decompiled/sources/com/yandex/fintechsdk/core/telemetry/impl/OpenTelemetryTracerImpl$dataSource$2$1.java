package com.yandex.fintechsdk.core.telemetry.impl;

import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes12.dex */
final /* synthetic */ class OpenTelemetryTracerImpl$dataSource$2$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        Object b = ((b) this.receiver).e.b((byte[]) obj, (Continuation) obj2);
        return b == CoroutineSingletons.COROUTINE_SUSPENDED ? b : zy11.a;
    }
}
