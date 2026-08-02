package com.yandex.go.taxi.order.multi;

import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.a5y0;
import defpackage.a780;
import defpackage.clk0;
import defpackage.hxx;
import defpackage.j4l0;
import defpackage.m950;
import defpackage.mw40;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.q870;
import defpackage.t0y0;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class a {
    public final yvf0 a;
    public final oep0 b;
    public final mw40 c;
    public final com.yandex.go.taxi.order.interactors.a d;
    public final clk0 e;
    public final j4l0 f;

    public a(yvf0 yvf0Var, oep0 oep0Var, mw40 mw40Var, com.yandex.go.taxi.order.interactors.a aVar, clk0 clk0Var, j4l0 j4l0Var) {
        this.a = yvf0Var;
        this.b = oep0Var;
        this.c = mw40Var;
        this.d = aVar;
        this.e = clk0Var;
        this.f = j4l0Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(5:5|6|7|(1:(3:10|11|12)(2:30|31))(4:32|(1:34)(1:39)|35|(1:37)(1:38))|(8:14|(1:27)|18|19|(1:21)(1:26)|22|23|24)(2:28|29)))|44|6|7|(0)(0)|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0048, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010e, code lost:
    
        r0 = new kotlin.Result.Failure(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x009c A[Catch: Exception -> 0x0048, CancellationException -> 0x0121, TryCatch #2 {CancellationException -> 0x0121, Exception -> 0x0048, blocks: (B:11:0x003c, B:14:0x009c, B:16:0x00a6, B:19:0x00b2, B:21:0x00d6, B:22:0x00dc, B:26:0x00da, B:28:0x00f5, B:29:0x010d, B:35:0x0075), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f5 A[Catch: Exception -> 0x0048, CancellationException -> 0x0121, TryCatch #2 {CancellationException -> 0x0121, Exception -> 0x0048, blocks: (B:11:0x003c, B:14:0x009c, B:16:0x00a6, B:19:0x00b2, B:21:0x00d6, B:22:0x00dc, B:26:0x00da, B:28:0x00f5, B:29:0x010d, B:35:0x0075), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(TaxiOrder taxiOrder, boolean z, DetailsOpenReason detailsOpenReason, TaxiCardNavigationAction taxiCardNavigationAction, ContinuationImpl continuationImpl) {
        TaxiOrderNavigatorImpl$openTaxiOrder$1 taxiOrderNavigatorImpl$openTaxiOrder$1;
        Object obj;
        int i;
        boolean z2;
        DetailsOpenReason detailsOpenReason2;
        TaxiCardNavigationAction taxiCardNavigationAction2;
        boolean z3;
        TaxiOrder taxiOrder2 = taxiOrder;
        if (continuationImpl instanceof TaxiOrderNavigatorImpl$openTaxiOrder$1) {
            taxiOrderNavigatorImpl$openTaxiOrder$1 = (TaxiOrderNavigatorImpl$openTaxiOrder$1) continuationImpl;
            int i2 = taxiOrderNavigatorImpl$openTaxiOrder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderNavigatorImpl$openTaxiOrder$1.label = i2 - Integer.MIN_VALUE;
                obj = taxiOrderNavigatorImpl$openTaxiOrder$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderNavigatorImpl$openTaxiOrder$1.label;
                if (i != 0) {
                    b.b(obj);
                    r0 r0Var = this.f.b;
                    Boolean bool = Boolean.TRUE;
                    r0Var.getClass();
                    r0Var.m(null, bool);
                    boolean g = this.e.d() ? this.e.g() : taxiOrder2.l.getY();
                    com.yandex.go.taxi.order.interactors.a aVar = this.d;
                    String str = taxiOrder2.a;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.L$0 = taxiOrder2;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.L$1 = detailsOpenReason;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.L$2 = taxiCardNavigationAction;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.Z$0 = z;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.Z$1 = g;
                    taxiOrderNavigatorImpl$openTaxiOrder$1.label = 1;
                    Object c = aVar.c(str, taxiOrderNavigatorImpl$openTaxiOrder$1);
                    if (c == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    z2 = g;
                    obj = c;
                    detailsOpenReason2 = detailsOpenReason;
                    taxiCardNavigationAction2 = taxiCardNavigationAction;
                    z3 = z;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = taxiOrderNavigatorImpl$openTaxiOrder$1.Z$1;
                    boolean z5 = taxiOrderNavigatorImpl$openTaxiOrder$1.Z$0;
                    TaxiCardNavigationAction taxiCardNavigationAction3 = (TaxiCardNavigationAction) taxiOrderNavigatorImpl$openTaxiOrder$1.L$2;
                    DetailsOpenReason detailsOpenReason3 = (DetailsOpenReason) taxiOrderNavigatorImpl$openTaxiOrder$1.L$1;
                    TaxiOrder taxiOrder3 = (TaxiOrder) taxiOrderNavigatorImpl$openTaxiOrder$1.L$0;
                    b.b(obj);
                    z2 = z4;
                    taxiOrder2 = taxiOrder3;
                    z3 = z5;
                    taxiCardNavigationAction2 = taxiCardNavigationAction3;
                    detailsOpenReason2 = detailsOpenReason3;
                }
                if (obj != null) {
                    throw new IllegalStateException("Failed to mark as active order [" + taxiOrder2.a + "]");
                }
                TaxiCardNavigationAction taxiCardNavigationAction4 = taxiCardNavigationAction2;
                DetailsOpenReason detailsOpenReason4 = detailsOpenReason2;
                q870 q870Var = new q870(new t0y0(taxiOrder2.a, taxiOrder2.x(), taxiOrder2.b.g0, z2, taxiOrder2.h.getB(), taxiOrder2.h.getB() == DriveState.COMPLETE && !taxiOrder2.l.getA(), taxiCardNavigationAction2, z3, detailsOpenReason2));
                mw40 mw40Var = this.c;
                a780 a780Var = mw40Var.a;
                if (a780Var != null) {
                    a780Var.a(q870Var);
                } else {
                    mw40Var.b = q870Var;
                }
                ((pep0) this.b).f((m950) this.a.get(), new a5y0(detailsOpenReason4.alias, null, taxiCardNavigationAction4, 18), hxx.a);
                Object failure = zy11.a;
                r0 r0Var2 = this.f.b;
                Boolean bool2 = Boolean.FALSE;
                r0Var2.getClass();
                r0Var2.m(null, bool2);
                return failure;
            }
        }
        taxiOrderNavigatorImpl$openTaxiOrder$1 = new TaxiOrderNavigatorImpl$openTaxiOrder$1(this, continuationImpl);
        obj = taxiOrderNavigatorImpl$openTaxiOrder$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderNavigatorImpl$openTaxiOrder$1.label;
        if (i != 0) {
        }
        if (obj != null) {
        }
    }
}
