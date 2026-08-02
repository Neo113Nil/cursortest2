package com.yandex.go.rida.bids.data;

import com.yandex.go.rida.bids.data.model.RejectBidParam;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import defpackage.bvf0;
import defpackage.cmt;
import defpackage.gci0;
import defpackage.j0;
import defpackage.mdh;
import defpackage.n4u0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.pz40;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zo1;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes13.dex */
public final class a {
    public final BidsApi a;
    public final tt2 b;
    public final o2y0 c;
    public final r0 d;
    public final gci0 e;
    public final r0 f;
    public final r0 g;
    public final gci0 h;

    public a(BidsApi bidsApi, tt2 tt2Var, o2y0 o2y0Var) {
        this.a = bidsApi;
        this.b = tt2Var;
        this.c = o2y0Var;
        Boolean bool = Boolean.FALSE;
        r0 c = bvf0.c(bool);
        this.d = c;
        this.e = e.d(c);
        this.f = bvf0.c(bool);
        r0 c2 = bvf0.c(null);
        this.g = c2;
        this.h = e.d(c2);
    }

    public final Object a(String str, j0 j0Var, Continuation continuation) {
        return f(this.g, str, new BidsNetworkRepository$acceptBid$2(j0Var, this, str, null), (ContinuationImpl) continuation);
    }

    public final Object b(boolean z, zo1 zo1Var, Continuation continuation) {
        return e(this.f, new BidsNetworkRepository$changeAutoAccept$2(zo1Var, this, z, null), (ContinuationImpl) continuation);
    }

    public final Object c(int i, Continuation continuation) {
        OrderStatusInfo.RidaSearchInfo.IncreasePriceInfo increasePriceInfo;
        String str;
        OrderStatusInfo.RidaSearchInfo ridaSearchInfo = this.c.b().V().u0;
        if (ridaSearchInfo == null || (increasePriceInfo = ridaSearchInfo.f) == null || (str = increasePriceInfo.b) == null) {
            return null;
        }
        return e(this.d, new BidsNetworkRepository$increasePassengerPrice$2(this, i, str, null), (ContinuationImpl) continuation);
    }

    public final Object d(String str, Continuation continuation) {
        cmt<zy11> d = this.a.d(new RejectBidParam(str, this.c.b().a));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new BidsNetworkRepository$rejectBid$2(d, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(r0 r0Var, tls tlsVar, ContinuationImpl continuationImpl) {
        BidsNetworkRepository$runSingle$1 bidsNetworkRepository$runSingle$1;
        int i;
        n4u0 n4u0Var;
        if (continuationImpl instanceof BidsNetworkRepository$runSingle$1) {
            bidsNetworkRepository$runSingle$1 = (BidsNetworkRepository$runSingle$1) continuationImpl;
            int i2 = bidsNetworkRepository$runSingle$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsNetworkRepository$runSingle$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsNetworkRepository$runSingle$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsNetworkRepository$runSingle$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (!r0Var.k(Boolean.FALSE, Boolean.TRUE)) {
                        return null;
                    }
                    bidsNetworkRepository$runSingle$1.L$0 = r0Var;
                    bidsNetworkRepository$runSingle$1.L$1 = null;
                    bidsNetworkRepository$runSingle$1.label = 1;
                    obj = tlsVar.invoke(bidsNetworkRepository$runSingle$1);
                    n4u0Var = r0Var;
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4u0 n4u0Var2 = (pz40) bidsNetworkRepository$runSingle$1.L$0;
                    b.b(obj);
                    n4u0Var = n4u0Var2;
                }
                Boolean bool = Boolean.FALSE;
                r0 r0Var2 = (r0) n4u0Var;
                r0Var2.getClass();
                r0Var2.m(null, bool);
                return obj;
            }
        }
        bidsNetworkRepository$runSingle$1 = new BidsNetworkRepository$runSingle$1(this, continuationImpl);
        Object obj3 = bidsNetworkRepository$runSingle$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsNetworkRepository$runSingle$1.label;
        if (i != 0) {
        }
        Boolean bool2 = Boolean.FALSE;
        r0 r0Var22 = (r0) n4u0Var;
        r0Var22.getClass();
        r0Var22.m(null, bool2);
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(r0 r0Var, String str, tls tlsVar, ContinuationImpl continuationImpl) {
        BidsNetworkRepository$runSingle$2 bidsNetworkRepository$runSingle$2;
        int i;
        n4u0 n4u0Var;
        if (continuationImpl instanceof BidsNetworkRepository$runSingle$2) {
            bidsNetworkRepository$runSingle$2 = (BidsNetworkRepository$runSingle$2) continuationImpl;
            int i2 = bidsNetworkRepository$runSingle$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsNetworkRepository$runSingle$2.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsNetworkRepository$runSingle$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsNetworkRepository$runSingle$2.label;
                if (i != 0) {
                    b.b(obj);
                    if (!r0Var.k(null, str)) {
                        return null;
                    }
                    bidsNetworkRepository$runSingle$2.L$0 = r0Var;
                    bidsNetworkRepository$runSingle$2.L$1 = null;
                    bidsNetworkRepository$runSingle$2.L$2 = null;
                    bidsNetworkRepository$runSingle$2.label = 1;
                    obj = ((BidsNetworkRepository$acceptBid$2) tlsVar).invoke(bidsNetworkRepository$runSingle$2);
                    n4u0Var = r0Var;
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    n4u0 n4u0Var2 = (pz40) bidsNetworkRepository$runSingle$2.L$0;
                    b.b(obj);
                    n4u0Var = n4u0Var2;
                }
                ((r0) n4u0Var).l(null);
                return obj;
            }
        }
        bidsNetworkRepository$runSingle$2 = new BidsNetworkRepository$runSingle$2(this, continuationImpl);
        Object obj2 = bidsNetworkRepository$runSingle$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsNetworkRepository$runSingle$2.label;
        if (i != 0) {
        }
        ((r0) n4u0Var).l(null);
        return obj2;
    }
}
