package com.yandex.go.multimodal_route.service;

import defpackage.kx70;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes8.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1 multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1) {
            multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1 = (MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (((kx70) obj3).f() == ServiceType.MULTIMODAL) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((kx70) it.next()).b());
                    }
                    Set N0 = kotlin.collections.a.N0(arrayList2);
                    multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(N0, multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1) == coroutineSingletons) {
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
        multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1 = new MultimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalOrderLcpListener$observeMultimodalOrder$2$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
