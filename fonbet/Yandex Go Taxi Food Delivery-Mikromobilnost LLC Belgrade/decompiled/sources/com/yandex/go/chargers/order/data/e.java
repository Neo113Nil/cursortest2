package com.yandex.go.chargers.order.data;

import com.yandex.go.chargers.data.f;
import defpackage.eci0;
import defpackage.h3y;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.sjh;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.wsr0;
import defpackage.xsr0;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.o;

/* loaded from: classes.dex */
public final class e {
    public final ru.yandex.taxi.launch.c a;
    public final h3y b;
    public final f c;
    public final eci0 d;

    public e(tt2 tt2Var, tse tseVar, ru.yandex.taxi.launch.c cVar, h3y h3yVar, f fVar) {
        this.a = cVar;
        this.b = h3yVar;
        this.c = fVar;
        rol0 rol0Var = new rol0(new ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$1(this, null));
        tt2Var.getClass();
        sjh sjhVar = uyj.a;
        this.d = kotlinx.coroutines.flow.e.O(new o(kotlinx.coroutines.flow.e.F(rol0Var, mdh.b), new ChargersActiveOrdersRequestRepository$activeOrdersResponseFlow$2(3, null)), tseVar, wsr0.a(xsr0.a, 3), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ChargersActiveOrdersRequestRepository$getActiveOrdersResponse$1 chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1;
        int i;
        if (continuationImpl instanceof ChargersActiveOrdersRequestRepository$getActiveOrdersResponse$1) {
            chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1 = (ChargersActiveOrdersRequestRepository$getActiveOrdersResponse$1) continuationImpl;
            int i2 = chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(this.d, chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                Object value = ((Result) obj).getValue();
                kotlin.b.b(value);
                return value;
            }
        }
        chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1 = new ChargersActiveOrdersRequestRepository$getActiveOrdersResponse$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersRequestRepository$getActiveOrdersResponse$1.label;
        if (i != 0) {
        }
        Object value2 = ((Result) obj2).getValue();
        kotlin.b.b(value2);
        return value2;
    }
}
