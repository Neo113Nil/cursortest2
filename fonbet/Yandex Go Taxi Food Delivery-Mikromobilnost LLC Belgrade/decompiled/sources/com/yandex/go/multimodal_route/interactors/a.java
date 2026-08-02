package com.yandex.go.multimodal_route.interactors;

import defpackage.evu0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.ren;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class a {
    public final com.yandex.go.order.external.tracking.h a;

    public a(com.yandex.go.order.external.tracking.h hVar) {
        this.a = hVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        MultimodalRouteLocalCompleteInteractor$removeOrder$1 multimodalRouteLocalCompleteInteractor$removeOrder$1;
        int i;
        List list;
        ArrayList arrayList;
        if (continuationImpl instanceof MultimodalRouteLocalCompleteInteractor$removeOrder$1) {
            multimodalRouteLocalCompleteInteractor$removeOrder$1 = (MultimodalRouteLocalCompleteInteractor$removeOrder$1) continuationImpl;
            int i2 = multimodalRouteLocalCompleteInteractor$removeOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                multimodalRouteLocalCompleteInteractor$removeOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = multimodalRouteLocalCompleteInteractor$removeOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = multimodalRouteLocalCompleteInteractor$removeOrder$1.label;
                com.yandex.go.order.external.tracking.h hVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    mth mthVar = hVar.v;
                    multimodalRouteLocalCompleteInteractor$removeOrder$1.L$0 = str;
                    multimodalRouteLocalCompleteInteractor$removeOrder$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(mthVar, multimodalRouteLocalCompleteInteractor$removeOrder$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) multimodalRouteLocalCompleteInteractor$removeOrder$1.L$0;
                    kotlin.b.b(obj);
                }
                list = (List) obj;
                arrayList = new ArrayList();
                for (Object obj2 : list) {
                    if (!evu0.y(((ren) obj2).g(), str, false)) {
                        arrayList.add(obj2);
                    }
                }
                if (arrayList.size() != list.size()) {
                    hVar.b(arrayList, true, true);
                }
                return zy11.a;
            }
        }
        multimodalRouteLocalCompleteInteractor$removeOrder$1 = new MultimodalRouteLocalCompleteInteractor$removeOrder$1(this, continuationImpl);
        Object obj3 = multimodalRouteLocalCompleteInteractor$removeOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = multimodalRouteLocalCompleteInteractor$removeOrder$1.label;
        com.yandex.go.order.external.tracking.h hVar2 = this.a;
        if (i != 0) {
        }
        list = (List) obj3;
        arrayList = new ArrayList();
        while (r0.hasNext()) {
        }
        if (arrayList.size() != list.size()) {
        }
        return zy11.a;
    }
}
