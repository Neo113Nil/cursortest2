package com.yandex.quark.js.implementation.facade.capability.web;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.u28;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Iterator;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1 webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1) {
            webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1 = (WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1) continuation;
            int i2 = webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.label;
                Object obj3 = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Iterator it = ((Set) obj).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Object next = it.next();
                        if (jl40.l(((u28) next).a(), "AliceChatCapability")) {
                            obj3 = next;
                            break;
                        }
                    }
                    webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj3, webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1 = new WebCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1(this, continuation);
        Object obj22 = webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCapabilitiesProviderExtensionsKt$webCapabilityStateFlowgoOVgt4$$inlined$map$1$2$1.label;
        Object obj32 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
