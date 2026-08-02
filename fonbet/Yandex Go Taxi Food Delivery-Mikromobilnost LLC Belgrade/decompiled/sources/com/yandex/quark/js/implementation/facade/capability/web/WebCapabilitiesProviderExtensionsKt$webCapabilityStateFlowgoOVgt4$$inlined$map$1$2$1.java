package com.yandex.quark.js.implementation.facade.capability.web;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yandex.quark.js.implementation.facade.capability.web.WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlow-goOVgt4$$inlined$map$1$2", f = "WebCapabilitiesProviderExtensions.kt", l = {223}, m = "emit")
/* renamed from: com.yandex.quark.js.implementation.facade.capability.web.WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlow-goOVgt4$$inlined$map$1$2$1, reason: invalid class name */
/* loaded from: classes8.dex */
public final class WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1(a aVar, Continuation continuation) {
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
