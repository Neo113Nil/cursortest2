package com.yandex.go.rida.bids.interactor;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.ar5;
import defpackage.avj0;
import defpackage.kyh0;
import defpackage.mej;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.x780;
import defpackage.xq5;
import defpackage.ysg;
import defpackage.zuj0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes13.dex */
public final class s {
    public final ysg a;
    public final zuj0 b;
    public final o2y0 c;

    public s(ysg ysgVar, zuj0 zuj0Var, o2y0 o2y0Var, x780 x780Var) {
        this.a = ysgVar;
        this.b = zuj0Var;
        this.c = o2y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(ContinuationImpl continuationImpl) {
        FailedOrderStatusInteractor$awaitFailedStatus$1 failedOrderStatusInteractor$awaitFailedStatus$1;
        int i;
        if (continuationImpl instanceof FailedOrderStatusInteractor$awaitFailedStatus$1) {
            failedOrderStatusInteractor$awaitFailedStatus$1 = (FailedOrderStatusInteractor$awaitFailedStatus$1) continuationImpl;
            int i2 = failedOrderStatusInteractor$awaitFailedStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                failedOrderStatusInteractor$awaitFailedStatus$1.label = i2 - Integer.MIN_VALUE;
                Object obj = failedOrderStatusInteractor$awaitFailedStatus$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = failedOrderStatusInteractor$awaitFailedStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    r rVar = new r(this.c.a(), this);
                    failedOrderStatusInteractor$awaitFailedStatus$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(rVar, failedOrderStatusInteractor$awaitFailedStatus$1);
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
                return ((TaxiOrder) obj).h.b;
            }
        }
        failedOrderStatusInteractor$awaitFailedStatus$1 = new FailedOrderStatusInteractor$awaitFailedStatus$1(this, continuationImpl);
        Object obj2 = failedOrderStatusInteractor$awaitFailedStatus$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = failedOrderStatusInteractor$awaitFailedStatus$1.label;
        if (i != 0) {
        }
        return ((TaxiOrder) obj2).h.b;
    }

    public final void b(xq5 xq5Var) {
        TaxiOrder b = this.c.b();
        b.O(false);
        this.a.g(b);
        ((com.yandex.go.rida.bids.router.d) xq5Var).a.r(new ar5(0));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(xq5 xq5Var, ContinuationImpl continuationImpl) {
        FailedOrderStatusInteractor$processFailedStatus$1 failedOrderStatusInteractor$processFailedStatus$1;
        Object obj;
        int i;
        if (continuationImpl instanceof FailedOrderStatusInteractor$processFailedStatus$1) {
            failedOrderStatusInteractor$processFailedStatus$1 = (FailedOrderStatusInteractor$processFailedStatus$1) continuationImpl;
            int i2 = failedOrderStatusInteractor$processFailedStatus$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                failedOrderStatusInteractor$processFailedStatus$1.label = i2 - Integer.MIN_VALUE;
                obj = failedOrderStatusInteractor$processFailedStatus$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = failedOrderStatusInteractor$processFailedStatus$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    failedOrderStatusInteractor$processFailedStatus$1.L$0 = xq5Var;
                    failedOrderStatusInteractor$processFailedStatus$1.label = 1;
                    obj = a(failedOrderStatusInteractor$processFailedStatus$1);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xq5Var = (xq5) failedOrderStatusInteractor$processFailedStatus$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((DriveState) obj) != DriveState.EXPIRED) {
                    int i3 = kyh0.taxiexpired_title;
                    avj0 avj0Var = (avj0) this.b;
                    ((com.yandex.go.rida.bids.router.d) xq5Var).b(new mej(avj0Var.h(i3), null, null, avj0Var.h(kyh0.common_retry)), new FailedOrderStatusInteractor$processFailedStatus$2(this, xq5Var, null), new FailedOrderStatusInteractor$processFailedStatus$3(this, xq5Var, null));
                } else {
                    b(xq5Var);
                }
                return zy11.a;
            }
        }
        failedOrderStatusInteractor$processFailedStatus$1 = new FailedOrderStatusInteractor$processFailedStatus$1(this, continuationImpl);
        obj = failedOrderStatusInteractor$processFailedStatus$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = failedOrderStatusInteractor$processFailedStatus$1.label;
        if (i != 0) {
        }
        if (((DriveState) obj) != DriveState.EXPIRED) {
        }
        return zy11.a;
    }
}
