package com.yandex.go.taxi.order.detailed_price.domain;

import defpackage.fef;
import defpackage.j3j;
import defpackage.l3j;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ c b;
    public final /* synthetic */ List c;
    public final /* synthetic */ fef w;
    public final /* synthetic */ String x;

    public a(vpr vprVar, c cVar, List list, fef fefVar, String str) {
        this.a = vprVar;
        this.b = cVar;
        this.c = list;
        this.w = fefVar;
        this.x = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a0, code lost:
    
        if (r8.emit(r2, r0) != r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1 detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1) {
            detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1 = (DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1) continuation;
            int i2 = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    com.yandex.go.taxi.order.detailed_price.domain.mapper.a aVar = this.b.b;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                    vpr vprVar2 = this.a;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$4 = vprVar2;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                    detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 1;
                    Object a = aVar.a(this.c, this.w, detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1);
                    if (a != coroutineSingletons) {
                        obj2 = a;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$4;
                kotlin.b.b(obj2);
                List list = (List) obj2;
                String str = this.x;
                Object l3jVar = list == null ? new l3j(list, str) : new j3j(str);
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
                detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
            }
        }
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1 = new DetailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1(this, continuation);
        Object obj22 = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        List list2 = (List) obj22;
        String str2 = this.x;
        if (list2 == null) {
        }
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$0 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$1 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$2 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$3 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$4 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$5 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.L$6 = null;
        detailedPriceStateInteractor$stateFlow$1$invokeSuspend$$inlined$map$1$2$1.label = 2;
    }
}
