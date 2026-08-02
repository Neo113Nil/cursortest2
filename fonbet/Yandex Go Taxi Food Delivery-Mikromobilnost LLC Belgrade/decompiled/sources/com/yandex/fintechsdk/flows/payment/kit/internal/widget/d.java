package com.yandex.fintechsdk.flows.payment.kit.internal.widget;

import defpackage.b451;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WidgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1 widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WidgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1) {
            widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1 = (WidgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    LinkedHashMap linkedHashMap = ((b451) obj).a;
                    widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(linkedHashMap, widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1 = new WidgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = widgetViewHandle$startObserving$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
