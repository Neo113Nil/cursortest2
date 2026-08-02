package com.yandex.go.scooters.offers.v2.components.bottom.domain.booking;

import defpackage.dvw;
import defpackage.j18;
import defpackage.n6n0;
import defpackage.ny61;
import defpackage.r95;
import defpackage.y5n0;
import defpackage.z5;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class g extends r95 {
    public final n6n0 b;
    public final com.yandex.go.scooters.payments.data.c c;
    public final com.yandex.go.scooters.offers.v2.components.bottom.data.a d;

    public g(n6n0 n6n0Var, com.yandex.go.scooters.payments.data.c cVar, com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar) {
        this.b = n6n0Var;
        this.c = cVar;
        this.d = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ab, code lost:
    
        if (r12 == r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c9 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // defpackage.r95
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ScootersPaymentMethodBookHandler$handle$1 scootersPaymentMethodBookHandler$handle$1;
        Object obj;
        Object obj2;
        int i;
        y5n0 a;
        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar;
        boolean booleanValue;
        if (continuationImpl instanceof ScootersPaymentMethodBookHandler$handle$1) {
            scootersPaymentMethodBookHandler$handle$1 = (ScootersPaymentMethodBookHandler$handle$1) continuationImpl;
            int i2 = scootersPaymentMethodBookHandler$handle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPaymentMethodBookHandler$handle$1.label = i2 - Integer.MIN_VALUE;
                obj = scootersPaymentMethodBookHandler$handle$1.result;
                obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPaymentMethodBookHandler$handle$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (this.c.c() == null) {
                        com.yandex.go.scooters.offers.v2.components.bottom.data.a aVar2 = this.d;
                        a = aVar2.a.a();
                        scootersPaymentMethodBookHandler$handle$1.L$0 = null;
                        scootersPaymentMethodBookHandler$handle$1.L$1 = aVar2;
                        scootersPaymentMethodBookHandler$handle$1.L$2 = a;
                        scootersPaymentMethodBookHandler$handle$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(scootersPaymentMethodBookHandler$handle$1));
                        j18Var.u();
                        n6n0.a(this.b, null, new z5(23, j18Var, this), 1);
                        Object s = j18Var.s();
                        if (s != obj2) {
                            aVar = aVar2;
                            obj = s;
                        }
                    }
                    scootersPaymentMethodBookHandler$handle$1.L$0 = null;
                    scootersPaymentMethodBookHandler$handle$1.L$1 = null;
                    scootersPaymentMethodBookHandler$handle$1.L$2 = null;
                    scootersPaymentMethodBookHandler$handle$1.label = 3;
                    Object a2 = super.a(scootersPaymentMethodBookHandler$handle$1);
                    if (a2 != obj2) {
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            return zy11.a;
                        }
                        scootersPaymentMethodBookHandler$handle$1.L$0 = null;
                        scootersPaymentMethodBookHandler$handle$1.L$1 = null;
                        scootersPaymentMethodBookHandler$handle$1.L$2 = null;
                        scootersPaymentMethodBookHandler$handle$1.label = 3;
                        Object a22 = super.a(scootersPaymentMethodBookHandler$handle$1);
                        return a22 != obj2 ? obj2 : a22;
                    }
                    a = (y5n0) scootersPaymentMethodBookHandler$handle$1.L$2;
                    aVar = (com.yandex.go.scooters.offers.v2.components.bottom.data.a) scootersPaymentMethodBookHandler$handle$1.L$1;
                    kotlin.b.b(obj);
                }
                booleanValue = ((Boolean) obj).booleanValue();
                if (booleanValue) {
                    obj = Boolean.FALSE;
                } else {
                    scootersPaymentMethodBookHandler$handle$1.L$0 = null;
                    scootersPaymentMethodBookHandler$handle$1.L$1 = null;
                    scootersPaymentMethodBookHandler$handle$1.L$2 = null;
                    scootersPaymentMethodBookHandler$handle$1.Z$0 = booleanValue;
                    scootersPaymentMethodBookHandler$handle$1.label = 2;
                    obj = com.yandex.go.scooters.offers.v2.components.bottom.data.a.a(aVar, a, scootersPaymentMethodBookHandler$handle$1);
                }
                if (!((Boolean) obj).booleanValue()) {
                }
                scootersPaymentMethodBookHandler$handle$1.L$0 = null;
                scootersPaymentMethodBookHandler$handle$1.L$1 = null;
                scootersPaymentMethodBookHandler$handle$1.L$2 = null;
                scootersPaymentMethodBookHandler$handle$1.label = 3;
                Object a222 = super.a(scootersPaymentMethodBookHandler$handle$1);
                if (a222 != obj2) {
                }
            }
        }
        scootersPaymentMethodBookHandler$handle$1 = new ScootersPaymentMethodBookHandler$handle$1(this, continuationImpl);
        obj = scootersPaymentMethodBookHandler$handle$1.result;
        obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPaymentMethodBookHandler$handle$1.label;
        if (i != 0) {
        }
        booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        scootersPaymentMethodBookHandler$handle$1.L$0 = null;
        scootersPaymentMethodBookHandler$handle$1.L$1 = null;
        scootersPaymentMethodBookHandler$handle$1.L$2 = null;
        scootersPaymentMethodBookHandler$handle$1.label = 3;
        Object a2222 = super.a(scootersPaymentMethodBookHandler$handle$1);
        if (a2222 != obj2) {
        }
    }
}
