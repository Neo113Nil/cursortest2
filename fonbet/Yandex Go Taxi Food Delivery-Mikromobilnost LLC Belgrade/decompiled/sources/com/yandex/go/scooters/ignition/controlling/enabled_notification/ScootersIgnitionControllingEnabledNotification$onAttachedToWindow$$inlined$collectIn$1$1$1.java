package com.yandex.go.scooters.ignition.controlling.enabled_notification;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.scooters.ignition.controlling.enabled_notification.ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1", f = "ScootersIgnitionControllingEnabledNotification.kt", l = {46, 48}, m = "emit", v = 2)
/* loaded from: classes13.dex */
public final class ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionControllingEnabledNotification$onAttachedToWindow$$inlined$collectIn$1$1$1(a aVar, Continuation continuation) {
        super(continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(null, this);
    }
}
