package com.yandex.quark.webchat.js;

import defpackage.ny61;
import defpackage.vpr;
import defpackage.ycc;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;

    public c(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        QuarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1 quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof QuarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1) {
            quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1 = (QuarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1) continuation;
            int i2 = quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Collection values = ((Map) obj).values();
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = values.iterator();
                    while (it.hasNext()) {
                        ycc.r((List) it.next(), linkedHashSet);
                    }
                    List J0 = kotlin.collections.a.J0(linkedHashSet);
                    quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(J0, quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1 = new QuarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = quarkJsFacadeRegistryImpl$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
