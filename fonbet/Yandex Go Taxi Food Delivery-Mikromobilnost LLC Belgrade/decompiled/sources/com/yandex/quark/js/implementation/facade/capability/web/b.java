package com.yandex.quark.js.implementation.facade.capability.web;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Map;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;

    public b(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WebCapabilityRegistry$special$$inlined$map$1$2$1 webCapabilityRegistry$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WebCapabilityRegistry$special$$inlined$map$1$2$1) {
            webCapabilityRegistry$special$$inlined$map$1$2$1 = (WebCapabilityRegistry$special$$inlined$map$1$2$1) continuation;
            int i2 = webCapabilityRegistry$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                webCapabilityRegistry$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = webCapabilityRegistry$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = webCapabilityRegistry$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set N0 = kotlin.collections.a.N0(((Map) obj).values());
                    webCapabilityRegistry$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, webCapabilityRegistry$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        webCapabilityRegistry$special$$inlined$map$1$2$1 = new WebCapabilityRegistry$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = webCapabilityRegistry$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = webCapabilityRegistry$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
