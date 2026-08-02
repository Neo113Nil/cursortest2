package com.yandex.go.taxi.order.network;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.preorder.Preorder;
import com.yandex.go.taxi.order.models.api.preorder.intercity.RawOrderdraftInfo;
import com.yandex.go.taxi.order.perf.session.TaxiOrderSessionCheckpoint;
import defpackage.a3y0;
import defpackage.a6y0;
import defpackage.cmt;
import defpackage.e3n;
import defpackage.f8z0;
import defpackage.fmt;
import defpackage.g6y0;
import defpackage.hu70;
import defpackage.i6y0;
import defpackage.iu70;
import defpackage.mpx0;
import defpackage.ny61;
import defpackage.pu70;
import defpackage.s5w0;
import defpackage.s630;
import defpackage.wnt;
import defpackage.xnt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.net.taxi.TaxiApi;

/* loaded from: classes14.dex */
public final class d {
    public final TaxiApi a;
    public final iu70 b;
    public final wnt c;
    public final g6y0 d;
    public final a3y0 e = new a3y0(TaxiOrderLogGroup.CORE.getTag(), "OrderSender");

    public d(TaxiApi taxiApi, iu70 iu70Var, wnt wntVar, g6y0 g6y0Var) {
        this.a = taxiApi;
        this.b = iu70Var;
        this.c = wntVar;
        this.d = g6y0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008c, code lost:
    
        if (r7 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Preorder preorder, String str, String str2, boolean z, ContinuationImpl continuationImpl) {
        TaxiOrderDraftSender$orderDraft$1 taxiOrderDraftSender$orderDraft$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        kotlinx.serialization.json.b bVar;
        Object b;
        long a;
        boolean z2;
        if (continuationImpl instanceof TaxiOrderDraftSender$orderDraft$1) {
            taxiOrderDraftSender$orderDraft$1 = (TaxiOrderDraftSender$orderDraft$1) continuationImpl;
            int i2 = taxiOrderDraftSender$orderDraft$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDraftSender$orderDraft$1.label = i2 - Integer.MIN_VALUE;
                obj = taxiOrderDraftSender$orderDraft$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDraftSender$orderDraft$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    RawOrderdraftInfo rawOrderdraftInfo = preorder.I;
                    bVar = rawOrderdraftInfo != null ? rawOrderdraftInfo.a : null;
                    if (bVar != null) {
                        preorder.I = null;
                        this.e.f(new mpx0(15), "orderDraft");
                        a = s630.a();
                        cmt<pu70> d = this.a.d(bVar);
                        s5w0 s5w0Var = new s5w0(18, this);
                        taxiOrderDraftSender$orderDraft$1.L$0 = null;
                        taxiOrderDraftSender$orderDraft$1.L$1 = null;
                        taxiOrderDraftSender$orderDraft$1.L$2 = null;
                        taxiOrderDraftSender$orderDraft$1.L$3 = null;
                        taxiOrderDraftSender$orderDraft$1.L$4 = null;
                        taxiOrderDraftSender$orderDraft$1.L$5 = null;
                        taxiOrderDraftSender$orderDraft$1.Z$0 = z;
                        taxiOrderDraftSender$orderDraft$1.J$0 = a;
                        taxiOrderDraftSender$orderDraft$1.label = 2;
                        obj = ru.yandex.taxi.network.api.a.b(d, s5w0Var, taxiOrderDraftSender$orderDraft$1);
                        if (obj != coroutineSingletons) {
                            z2 = z;
                            fmt fmtVar = (fmt) obj;
                            long a2 = f8z0.a(a);
                            if (z2) {
                            }
                            return fmtVar.a;
                        }
                        return coroutineSingletons;
                    }
                    iu70 iu70Var = this.b;
                    taxiOrderDraftSender$orderDraft$1.L$0 = null;
                    taxiOrderDraftSender$orderDraft$1.L$1 = null;
                    taxiOrderDraftSender$orderDraft$1.L$2 = null;
                    taxiOrderDraftSender$orderDraft$1.L$3 = null;
                    taxiOrderDraftSender$orderDraft$1.Z$0 = z;
                    taxiOrderDraftSender$orderDraft$1.label = 1;
                    b = ((a) iu70Var).b(preorder, str, str2, taxiOrderDraftSender$orderDraft$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        a = taxiOrderDraftSender$orderDraft$1.J$0;
                        z2 = taxiOrderDraftSender$orderDraft$1.Z$0;
                        kotlin.b.b(obj);
                        fmt fmtVar2 = (fmt) obj;
                        long a22 = f8z0.a(a);
                        if (z2) {
                            ((i6y0) this.d).b(new a6y0(TaxiOrderSessionCheckpoint.ORDERDRAFT, e3n.e(a22), fmtVar2.e.a("X-YaTraceId")));
                        }
                        return fmtVar2.a;
                    }
                    z = taxiOrderDraftSender$orderDraft$1.Z$0;
                    kotlin.b.b(obj);
                    b = ((hu70) obj).a;
                }
                bVar = (kotlinx.serialization.json.b) ((xnt) this.c).c((String) b, kotlinx.serialization.json.b.Companion.serializer());
                this.e.f(new mpx0(15), "orderDraft");
                a = s630.a();
                cmt<pu70> d2 = this.a.d(bVar);
                s5w0 s5w0Var2 = new s5w0(18, this);
                taxiOrderDraftSender$orderDraft$1.L$0 = null;
                taxiOrderDraftSender$orderDraft$1.L$1 = null;
                taxiOrderDraftSender$orderDraft$1.L$2 = null;
                taxiOrderDraftSender$orderDraft$1.L$3 = null;
                taxiOrderDraftSender$orderDraft$1.L$4 = null;
                taxiOrderDraftSender$orderDraft$1.L$5 = null;
                taxiOrderDraftSender$orderDraft$1.Z$0 = z;
                taxiOrderDraftSender$orderDraft$1.J$0 = a;
                taxiOrderDraftSender$orderDraft$1.label = 2;
                obj = ru.yandex.taxi.network.api.a.b(d2, s5w0Var2, taxiOrderDraftSender$orderDraft$1);
                if (obj != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
        }
        taxiOrderDraftSender$orderDraft$1 = new TaxiOrderDraftSender$orderDraft$1(this, continuationImpl);
        obj = taxiOrderDraftSender$orderDraft$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDraftSender$orderDraft$1.label;
        if (i != 0) {
        }
        bVar = (kotlinx.serialization.json.b) ((xnt) this.c).c((String) b, kotlinx.serialization.json.b.Companion.serializer());
        this.e.f(new mpx0(15), "orderDraft");
        a = s630.a();
        cmt<pu70> d22 = this.a.d(bVar);
        s5w0 s5w0Var22 = new s5w0(18, this);
        taxiOrderDraftSender$orderDraft$1.L$0 = null;
        taxiOrderDraftSender$orderDraft$1.L$1 = null;
        taxiOrderDraftSender$orderDraft$1.L$2 = null;
        taxiOrderDraftSender$orderDraft$1.L$3 = null;
        taxiOrderDraftSender$orderDraft$1.L$4 = null;
        taxiOrderDraftSender$orderDraft$1.L$5 = null;
        taxiOrderDraftSender$orderDraft$1.Z$0 = z;
        taxiOrderDraftSender$orderDraft$1.J$0 = a;
        taxiOrderDraftSender$orderDraft$1.label = 2;
        obj = ru.yandex.taxi.network.api.a.b(d22, s5w0Var22, taxiOrderDraftSender$orderDraft$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
