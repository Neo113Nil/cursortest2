package com.yandex.go.multimodal_route.interactors;

import com.yandex.go.multimodal_route.network.models.MultimodalRoutesOrderDto;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.p2y0;
import defpackage.ysg;
import defpackage.yu40;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class i {
    public final p2y0 a;
    public final ysg b;
    public final yu40 c;

    public i(p2y0 p2y0Var, ysg ysgVar, yu40 yu40Var) {
        this.a = p2y0Var;
        this.b = ysgVar;
        this.c = yu40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
    
        if (r9 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
    
        if (r10 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        RemoveTaxiOrderInteractor$removeTaxiOrder$1 removeTaxiOrderInteractor$removeTaxiOrder$1;
        int i;
        String str2;
        Object obj;
        if (continuationImpl instanceof RemoveTaxiOrderInteractor$removeTaxiOrder$1) {
            removeTaxiOrderInteractor$removeTaxiOrder$1 = (RemoveTaxiOrderInteractor$removeTaxiOrder$1) continuationImpl;
            int i2 = removeTaxiOrderInteractor$removeTaxiOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                removeTaxiOrderInteractor$removeTaxiOrder$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = removeTaxiOrderInteractor$removeTaxiOrder$1.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = removeTaxiOrderInteractor$removeTaxiOrder$1.label;
                p2y0 p2y0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (o2y0Var == null) {
                        MultimodalRoutesOrderDto c = this.c.c(str);
                        if (c != null && (str2 = c.b.b) != null) {
                            removeTaxiOrderInteractor$removeTaxiOrder$1.L$0 = null;
                            removeTaxiOrderInteractor$removeTaxiOrder$1.L$1 = null;
                            removeTaxiOrderInteractor$removeTaxiOrder$1.L$2 = null;
                            removeTaxiOrderInteractor$removeTaxiOrder$1.L$3 = null;
                            removeTaxiOrderInteractor$removeTaxiOrder$1.label = 1;
                            Object p = ((e0) p2y0Var).p(str2, removeTaxiOrderInteractor$removeTaxiOrder$1);
                            obj = p;
                        }
                        return zy11.a;
                    }
                    this.b.i(o2y0Var.b().a);
                    RemoveTaxiOrderInteractor$removeTaxiOrder$2 removeTaxiOrderInteractor$removeTaxiOrder$2 = new RemoveTaxiOrderInteractor$removeTaxiOrder$2(1, null);
                    removeTaxiOrderInteractor$removeTaxiOrder$1.L$0 = null;
                    removeTaxiOrderInteractor$removeTaxiOrder$1.L$1 = null;
                    removeTaxiOrderInteractor$removeTaxiOrder$1.L$2 = null;
                    removeTaxiOrderInteractor$removeTaxiOrder$1.L$3 = null;
                    removeTaxiOrderInteractor$removeTaxiOrder$1.label = 2;
                    Object B = ((e0) p2y0Var).B(o2y0Var, removeTaxiOrderInteractor$removeTaxiOrder$2, removeTaxiOrderInteractor$removeTaxiOrder$1);
                    return B == obj3 ? obj3 : B;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return obj2;
                }
                kotlin.b.b(obj2);
                obj = obj2;
                o2y0Var = (o2y0) obj;
            }
        }
        removeTaxiOrderInteractor$removeTaxiOrder$1 = new RemoveTaxiOrderInteractor$removeTaxiOrder$1(this, continuationImpl);
        Object obj22 = removeTaxiOrderInteractor$removeTaxiOrder$1.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = removeTaxiOrderInteractor$removeTaxiOrder$1.label;
        p2y0 p2y0Var2 = this.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj;
    }
}
