package com.ybsdk.feature.merchant.offers.internal.screens.root;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.analytics.generated.delegates.OffersListEvents$MerchantOffersLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import defpackage.c9v;
import defpackage.ds31;
import defpackage.gao;
import defpackage.h791;
import defpackage.j3h;
import defpackage.jl40;
import defpackage.mfp0;
import defpackage.mp10;
import defpackage.nh6;
import defpackage.np10;
import defpackage.nq10;
import defpackage.ny61;
import defpackage.op10;
import defpackage.ph6;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.qis;
import defpackage.qp10;
import defpackage.rp10;
import defpackage.sb6;
import defpackage.sh6;
import defpackage.tb6;
import defpackage.tje;
import defpackage.uc5;
import defpackage.v0h;
import defpackage.vq10;
import defpackage.w4x0;
import defpackage.wq10;
import defpackage.x4c;
import defpackage.x4x0;
import defpackage.xl10;
import defpackage.xo10;
import defpackage.xyz;
import defpackage.zmg;
import defpackage.zq10;
import defpackage.zy11;
import java.util.List;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class b extends uc5 {
    public final qp10 B;
    public final w4x0 C;
    public final com.ybsdk.feature.merchant.offers.internal.domain.interactor.a D;
    public final j3h E;
    public final zq10 F;
    public final sb6 G;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a H;
    public final c9v I;
    public pzt0 J;

    public b(xl10 xl10Var, qp10 qp10Var, w4x0 w4x0Var, com.ybsdk.feature.merchant.offers.internal.domain.interactor.a aVar, j3h j3hVar, zq10 zq10Var, sb6 sb6Var, com.ybsdk.feature.banners.impl.domain.interactors.a aVar2, c9v c9vVar) {
        super(new xyz(22, qp10Var), xl10Var);
        this.B = qp10Var;
        this.C = w4x0Var;
        this.D = aVar;
        this.E = j3hVar;
        this.F = zq10Var;
        this.G = sb6Var;
        this.H = aVar2;
        this.I = c9vVar;
        ((AppAnalyticsReporter) c9vVar.b).N.a.a("merchant_offers.open", null);
        tje.N(ds31.a(this), null, null, new MerchantOffersViewModel$2(this, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0064, code lost:
    
        if (r11 == r2) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(b bVar, boolean z, ContinuationImpl continuationImpl) {
        MerchantOffersViewModel$loadFirstPage$1 merchantOffersViewModel$loadFirstPage$1;
        int i;
        Object b;
        rp10 rp10Var;
        Object obj;
        Throwable a;
        r0 r0Var;
        Object value;
        qis qisVar;
        pz40 Y;
        r0 r0Var2;
        Object value2;
        c9v c9vVar = bVar.I;
        if (continuationImpl instanceof MerchantOffersViewModel$loadFirstPage$1) {
            merchantOffersViewModel$loadFirstPage$1 = (MerchantOffersViewModel$loadFirstPage$1) continuationImpl;
            int i2 = merchantOffersViewModel$loadFirstPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersViewModel$loadFirstPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = merchantOffersViewModel$loadFirstPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersViewModel$loadFirstPage$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((AppAnalyticsReporter) c9vVar.b).N.a.a("merchant_offers.initiated", null);
                    com.ybsdk.feature.merchant.offers.internal.domain.interactor.a aVar = bVar.D;
                    merchantOffersViewModel$loadFirstPage$1.Z$0 = z;
                    merchantOffersViewModel$loadFirstPage$1.label = 1;
                    b = aVar.b(merchantOffersViewModel$loadFirstPage$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = merchantOffersViewModel$loadFirstPage$1.Z$0;
                        rp10 rp10Var2 = (rp10) merchantOffersViewModel$loadFirstPage$1.L$1;
                        Object obj3 = merchantOffersViewModel$loadFirstPage$1.L$0;
                        kotlin.b.b(obj2);
                        rp10Var = rp10Var2;
                        obj = obj3;
                        boolean z2 = z;
                        qisVar = (qis) obj2;
                        if (qisVar != null) {
                            bVar.Z(new vq10(qisVar));
                        }
                        Y = bVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, nq10.a((nq10) value2, rp10Var, null, null, 13)));
                        ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.OK, null);
                        z = z2;
                        b = obj;
                        a = Result.a(b);
                        if (a != null) {
                            x4c.g("Error loading first page of merchant offers", a, null, null, 12);
                            if (z) {
                                bVar.Z(new wq10(gao.e(null, Text.Empty.INSTANCE, a, 1)));
                            } else {
                                pz40 Y2 = bVar.Y();
                                do {
                                    r0Var = (r0) Y2;
                                    value = r0Var.getValue();
                                } while (!r0Var.k(value, nq10.a((nq10) value, null, a, null, 11)));
                            }
                            ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.ERROR, a.getMessage());
                        }
                        return zy11.a;
                    }
                    z = merchantOffersViewModel$loadFirstPage$1.Z$0;
                    kotlin.b.b(obj2);
                    b = ((Result) obj2).getValue();
                }
                if (!(b instanceof Result.Failure)) {
                    rp10Var = (rp10) b;
                    List list = rp10Var.e;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    merchantOffersViewModel$loadFirstPage$1.L$0 = b;
                    merchantOffersViewModel$loadFirstPage$1.L$1 = rp10Var;
                    merchantOffersViewModel$loadFirstPage$1.Z$0 = z;
                    merchantOffersViewModel$loadFirstPage$1.label = 2;
                    qis a2 = bVar.H.a(list, mfp0.b);
                    if (a2 != coroutineSingletons) {
                        obj = b;
                        obj2 = a2;
                        boolean z22 = z;
                        qisVar = (qis) obj2;
                        if (qisVar != null) {
                        }
                        Y = bVar.Y();
                        do {
                            r0Var2 = (r0) Y;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, nq10.a((nq10) value2, rp10Var, null, null, 13)));
                        ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.OK, null);
                        z = z22;
                        b = obj;
                    }
                    return coroutineSingletons;
                }
                a = Result.a(b);
                if (a != null) {
                }
                return zy11.a;
            }
        }
        merchantOffersViewModel$loadFirstPage$1 = new MerchantOffersViewModel$loadFirstPage$1(bVar, continuationImpl);
        Object obj22 = merchantOffersViewModel$loadFirstPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersViewModel$loadFirstPage$1.label;
        if (i != 0) {
        }
        if (!(b instanceof Result.Failure)) {
        }
        a = Result.a(b);
        if (a != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x009d, code lost:
    
        if (r1 == r4) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c0(b bVar, ContinuationImpl continuationImpl) {
        MerchantOffersViewModel$loadNextPage$1 merchantOffersViewModel$loadNextPage$1;
        int i;
        List list;
        r0 r0Var;
        Object value;
        Object c;
        Object obj;
        rp10 rp10Var;
        Throwable a;
        r0 r0Var2;
        Object value2;
        qis qisVar;
        EmptyList emptyList;
        rp10 rp10Var2;
        pz40 Y;
        r0 r0Var3;
        Object value3;
        c9v c9vVar = bVar.I;
        if (continuationImpl instanceof MerchantOffersViewModel$loadNextPage$1) {
            merchantOffersViewModel$loadNextPage$1 = (MerchantOffersViewModel$loadNextPage$1) continuationImpl;
            int i2 = merchantOffersViewModel$loadNextPage$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                merchantOffersViewModel$loadNextPage$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = merchantOffersViewModel$loadNextPage$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = merchantOffersViewModel$loadNextPage$1.label;
                zy11 zy11Var = zy11.a;
                EmptyList emptyList2 = EmptyList.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ((AppAnalyticsReporter) c9vVar.b).N.a.a("merchant_offers.initiated", null);
                    rp10 rp10Var3 = ((nq10) bVar.X()).b;
                    if (rp10Var3 != null && (list = rp10Var3.d) != null) {
                        pz40 Y2 = bVar.Y();
                        do {
                            r0Var = (r0) Y2;
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, nq10.a((nq10) value, null, null, op10.a, 7)));
                        com.ybsdk.feature.merchant.offers.internal.domain.interactor.a aVar = bVar.D;
                        rp10 rp10Var4 = ((nq10) bVar.X()).b;
                        String str = rp10Var4 != null ? rp10Var4.c : null;
                        merchantOffersViewModel$loadNextPage$1.label = 1;
                        c = aVar.c(str, list, merchantOffersViewModel$loadNextPage$1);
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rp10Var = (rp10) merchantOffersViewModel$loadNextPage$1.L$1;
                    obj = merchantOffersViewModel$loadNextPage$1.L$0;
                    kotlin.b.b(obj2);
                    qisVar = (qis) obj2;
                    if (qisVar != null) {
                        bVar.Z(new vq10(qisVar));
                    }
                    rp10 rp10Var5 = ((nq10) bVar.X()).b;
                    List list2 = rp10Var5 == null ? rp10Var5.a : null;
                    rp10 rp10Var6 = ((nq10) bVar.X()).b;
                    emptyList = rp10Var6 == null ? rp10Var6.b : null;
                    if (emptyList != null) {
                        emptyList2 = emptyList;
                    }
                    rp10Var2 = new rp10(list2, kotlin.collections.a.m0(rp10Var.b, emptyList2), rp10Var.d, rp10Var.c, rp10Var.e);
                    Y = bVar.Y();
                    do {
                        r0Var3 = (r0) Y;
                        value3 = r0Var3.getValue();
                    } while (!r0Var3.k(value3, nq10.a((nq10) value3, rp10Var2, null, np10.a, 5)));
                    ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.OK, null);
                    c = obj;
                    a = Result.a(c);
                    if (a != null) {
                        x4c.g("Error loading next page of merchant offers", a, null, null, 12);
                        pz40 Y3 = bVar.Y();
                        do {
                            r0Var2 = (r0) Y3;
                            value2 = r0Var2.getValue();
                        } while (!r0Var2.k(value2, nq10.a((nq10) value2, null, null, new mp10(a), 7)));
                        ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.ERROR, a.getMessage());
                    }
                    bVar.J = null;
                    return zy11Var;
                }
                kotlin.b.b(obj2);
                c = ((Result) obj2).getValue();
                if (!(c instanceof Result.Failure)) {
                    rp10 rp10Var7 = (rp10) c;
                    List list3 = rp10Var7.e;
                    if (list3 == null) {
                        list3 = emptyList2;
                    }
                    merchantOffersViewModel$loadNextPage$1.L$0 = c;
                    merchantOffersViewModel$loadNextPage$1.L$1 = rp10Var7;
                    merchantOffersViewModel$loadNextPage$1.label = 2;
                    qis a2 = bVar.H.a(list3, mfp0.b);
                    if (a2 != coroutineSingletons) {
                        obj = c;
                        obj2 = a2;
                        rp10Var = rp10Var7;
                        qisVar = (qis) obj2;
                        if (qisVar != null) {
                        }
                        rp10 rp10Var52 = ((nq10) bVar.X()).b;
                        if (rp10Var52 == null) {
                        }
                        rp10 rp10Var62 = ((nq10) bVar.X()).b;
                        if (rp10Var62 == null) {
                        }
                        if (emptyList != null) {
                        }
                        rp10Var2 = new rp10(list2, kotlin.collections.a.m0(rp10Var.b, emptyList2), rp10Var.d, rp10Var.c, rp10Var.e);
                        Y = bVar.Y();
                        do {
                            r0Var3 = (r0) Y;
                            value3 = r0Var3.getValue();
                        } while (!r0Var3.k(value3, nq10.a((nq10) value3, rp10Var2, null, np10.a, 5)));
                        ((AppAnalyticsReporter) c9vVar.b).N.k(OffersListEvents$MerchantOffersLoadedResult.OK, null);
                        c = obj;
                    }
                    return coroutineSingletons;
                }
                a = Result.a(c);
                if (a != null) {
                }
                bVar.J = null;
                return zy11Var;
            }
        }
        merchantOffersViewModel$loadNextPage$1 = new MerchantOffersViewModel$loadNextPage$1(bVar, continuationImpl);
        Object obj22 = merchantOffersViewModel$loadNextPage$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = merchantOffersViewModel$loadNextPage$1.label;
        zy11 zy11Var2 = zy11.a;
        EmptyList emptyList22 = EmptyList.a;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        a = Result.a(c);
        if (a != null) {
        }
        bVar.J = null;
        return zy11Var2;
    }

    public final OrientationAwareRecyclerView.a d0() {
        xo10 xo10Var = (xo10) this.B;
        return new OrientationAwareRecyclerView.a(xo10Var.a.g().isEnabled(), xo10Var.a.g().getScrollAngle());
    }

    public final void e0(tb6 tb6Var) {
        this.G.a(tb6Var.a, BottomBarItemId.MERCHANTS.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        sh6 sh6Var = tb6Var.e;
        boolean z = sh6Var instanceof ph6;
        w4x0 w4x0Var = this.C;
        if (z) {
            ((AppAnalyticsReporter) this.I.b).Y.x(QrPaymentEvents$QrIconClickedSource.MERCHANT_OFFERS);
            ((x4x0) w4x0Var).a();
        } else if (sh6Var instanceof nh6) {
            Z(zmg.i);
        } else {
            ((x4x0) w4x0Var).b(sh6Var);
        }
    }

    public final void f0() {
        if (jl40.l(((nq10) X()).d, np10.a)) {
            this.J = tje.N(ds31.a(this), null, null, new MerchantOffersViewModel$onLastItemShown$1(this, null), 3);
        }
    }

    public final void g0() {
        this.J = tje.N(ds31.a(this), null, null, new MerchantOffersViewModel$onPagingErrorClick$1(this, null), 3);
    }

    public final boolean h0(Uri uri) {
        return h791.e(this.E, uri.toString(), false, null, 14) instanceof v0h;
    }

    public final void i0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new MerchantOffersViewModel$showFullscreen$1(this, qisVar, null), 3);
    }
}
