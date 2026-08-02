package com.yandex.fintechsdk.core.telemetry.impl;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.fintechsdk.core.telemetry.impl.OpenTelemetryTracerImpl", f = "OpenTelemetryTracerImpl.kt", l = {HProv.PP_REBOOT}, m = "sendUnsentSpan")
/* loaded from: classes12.dex */
final class OpenTelemetryTracerImpl$sendUnsentSpan$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenTelemetryTracerImpl$sendUnsentSpan$1(b bVar, Continuation continuation) {
        super(continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return b.e(this.this$0, null, this);
    }
}
