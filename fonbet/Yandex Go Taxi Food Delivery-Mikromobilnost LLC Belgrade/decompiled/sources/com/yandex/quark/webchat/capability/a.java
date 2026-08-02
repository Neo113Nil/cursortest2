package com.yandex.quark.webchat.capability;

import defpackage.au50;
import defpackage.nfh;
import defpackage.ny61;
import defpackage.u28;
import defpackage.vpr;
import defpackage.z28;
import defpackage.zwf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ nfh b;

    public a(vpr vprVar, nfh nfhVar) {
        this.a = vprVar;
        this.b = nfhVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        NativeCapabilityFilter$special$$inlined$map$1$2$1 nativeCapabilityFilter$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof NativeCapabilityFilter$special$$inlined$map$1$2$1) {
            nativeCapabilityFilter$special$$inlined$map$1$2$1 = (NativeCapabilityFilter$special$$inlined$map$1$2$1) continuation;
            int i2 = nativeCapabilityFilter$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nativeCapabilityFilter$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = nativeCapabilityFilter$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = nativeCapabilityFilter$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (Set) obj) {
                        u28 u28Var = (u28) obj3;
                        nfh nfhVar = this.b;
                        if (((Set) ((au50) nfhVar.b).b).contains(u28Var.a())) {
                            ((zwf0) nfhVar.a).c("NativeCapabilityFilter", "Filtered out Native Capability: ".concat(z28.a(u28Var.a())));
                        } else {
                            arrayList.add(obj3);
                        }
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList);
                    nativeCapabilityFilter$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, nativeCapabilityFilter$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        nativeCapabilityFilter$special$$inlined$map$1$2$1 = new NativeCapabilityFilter$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = nativeCapabilityFilter$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = nativeCapabilityFilter$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
