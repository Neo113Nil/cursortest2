package com.ybsdk.feature.main.internal.screens.products;

import android.net.Uri;
import com.ybsdk.core.analytics.generated.AppAnalyticsReporter;
import com.ybsdk.core.analytics.generated.delegates.BottomNavigationEvents$BottomNavigationClickButtonVersion;
import com.ybsdk.core.analytics.generated.delegates.ProductsScreenEvents$ProductsScreenLoadedResult;
import com.ybsdk.core.analytics.generated.delegates.QrPaymentEvents$QrIconClickedSource;
import com.ybsdk.core.common.domain.entities.BottomBarItemId;
import com.ybsdk.core.design.spoiler.d;
import com.ybsdk.core.utils.ext.c;
import com.ybsdk.core.utils.ui.RequestStatus$Data$Source;
import com.ybsdk.feature.main.internal.domain.entities.ProductsViewType;
import com.ybsdk.widgets.common.recycler.OrientationAwareRecyclerView;
import defpackage.a9f0;
import defpackage.acf0;
import defpackage.auq0;
import defpackage.awa0;
import defpackage.bcf0;
import defpackage.ccf0;
import defpackage.d7f0;
import defpackage.dbf0;
import defpackage.ds31;
import defpackage.g3d0;
import defpackage.g8e;
import defpackage.gao;
import defpackage.h2r;
import defpackage.hj11;
import defpackage.ij11;
import defpackage.jj11;
import defpackage.jl40;
import defpackage.kpn;
import defpackage.l0p;
import defpackage.laf0;
import defpackage.mcf0;
import defpackage.mh6;
import defpackage.n800;
import defpackage.nfp0;
import defpackage.ny61;
import defpackage.ph6;
import defpackage.pz40;
import defpackage.pzt0;
import defpackage.q400;
import defpackage.qis;
import defpackage.r0d0;
import defpackage.r8j0;
import defpackage.rb00;
import defpackage.s8j0;
import defpackage.sb6;
import defpackage.scc;
import defpackage.sh6;
import defpackage.t400;
import defpackage.tb6;
import defpackage.tfl0;
import defpackage.tje;
import defpackage.ubf0;
import defpackage.uc5;
import defpackage.ugd0;
import defpackage.ut51;
import defpackage.w4x0;
import defpackage.w511;
import defpackage.wbf0;
import defpackage.x4x0;
import defpackage.xbf0;
import defpackage.ybf0;
import defpackage.z8f0;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Result;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class a extends uc5 {
    public final n800 B;
    public final AppAnalyticsReporter C;
    public final h2r D;
    public final com.ybsdk.feature.main.internal.data.network.a E;
    public final rb00 F;
    public final w4x0 G;
    public final awa0 H;
    public final sb6 I;
    public final com.ybsdk.feature.banners.impl.domain.interactors.a J;
    public final g3d0 K;
    public final tfl0 L;
    public pzt0 M;
    public pzt0 N;

    public a(n800 n800Var, AppAnalyticsReporter appAnalyticsReporter, h2r h2rVar, com.ybsdk.feature.main.internal.data.network.a aVar, rb00 rb00Var, w4x0 w4x0Var, awa0 awa0Var, sb6 sb6Var, com.ybsdk.feature.banners.impl.domain.interactors.a aVar2, g3d0 g3d0Var, tfl0 tfl0Var, ut51 ut51Var, mcf0 mcf0Var) {
        super(new r0d0(22, rb00Var), mcf0Var);
        this.B = n800Var;
        this.C = appAnalyticsReporter;
        this.D = h2rVar;
        this.E = aVar;
        this.F = rb00Var;
        this.G = w4x0Var;
        this.H = awa0Var;
        this.I = sb6Var;
        this.J = aVar2;
        this.K = g3d0Var;
        this.L = tfl0Var;
        appAnalyticsReporter.T.a.a("products_screen.open", null);
        c.a(ut51Var.a, ds31.a(this), new ubf0(this, 0));
        c.a(d.b, ds31.a(this), new ubf0(this, 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x004a, code lost:
    
        if (r9 == r2) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b0(a aVar, ContinuationImpl continuationImpl) {
        ProductsViewModel$loadProducts$1 productsViewModel$loadProducts$1;
        int i;
        Object c;
        Object obj;
        qis qisVar;
        Throwable a;
        AppAnalyticsReporter appAnalyticsReporter = aVar.C;
        if (continuationImpl instanceof ProductsViewModel$loadProducts$1) {
            productsViewModel$loadProducts$1 = (ProductsViewModel$loadProducts$1) continuationImpl;
            int i2 = productsViewModel$loadProducts$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                productsViewModel$loadProducts$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = productsViewModel$loadProducts$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = productsViewModel$loadProducts$1.label;
                RequestStatus$Data$Source requestStatus$Data$Source = null;
                if (i != 0) {
                    b.b(obj2);
                    com.ybsdk.feature.main.internal.data.network.a aVar2 = aVar.E;
                    productsViewModel$loadProducts$1.label = 1;
                    c = aVar2.c(productsViewModel$loadProducts$1);
                } else if (i == 1) {
                    b.b(obj2);
                    c = ((Result) obj2).getValue();
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    obj = productsViewModel$loadProducts$1.L$0;
                    b.b(obj2);
                    qisVar = (qis) obj2;
                    if (qisVar == null) {
                        aVar.Z(new ybf0(qisVar));
                        aVar.a0(new ugd0(11, qisVar, aVar));
                        c = obj;
                        a = Result.a(c);
                        int i3 = 14;
                        if (a != null) {
                            laf0 laf0Var = (laf0) c;
                            appAnalyticsReporter.T.g(ProductsScreenEvents$ProductsScreenLoadedResult.OK, null);
                            List list = laf0Var.b;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator it = list.iterator();
                                while (it.hasNext()) {
                                    if (jl40.l(((z8f0) it.next()).b, ProductsViewType.BANK_OFFERS.getValue())) {
                                        break;
                                    }
                                }
                            }
                            appAnalyticsReporter.T.a.a("products_screen.promo.invisible", null);
                            return new r8j0(laf0Var, requestStatus$Data$Source, i3);
                        }
                        l0p l0pVar = appAnalyticsReporter.T;
                        ProductsScreenEvents$ProductsScreenLoadedResult productsScreenEvents$ProductsScreenLoadedResult = ProductsScreenEvents$ProductsScreenLoadedResult.ERROR;
                        String message = a.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        l0pVar.g(productsScreenEvents$ProductsScreenLoadedResult, Collections.singletonList(message));
                        laf0 laf0Var2 = (laf0) ((dbf0) aVar.X()).a.a();
                        if (laf0Var2 == null) {
                            return new s8j0(a);
                        }
                        aVar.Z(new bcf0(gao.e(null, null, a, 3)));
                        return new r8j0(laf0Var2, requestStatus$Data$Source, i3);
                    }
                    c = obj;
                    obj = c;
                    qisVar = null;
                    aVar.a0(new ugd0(11, qisVar, aVar));
                    c = obj;
                    a = Result.a(c);
                    int i32 = 14;
                    if (a != null) {
                    }
                }
                if (!(c instanceof Result.Failure)) {
                    List list2 = ((laf0) c).c;
                    if (list2 != null) {
                        productsViewModel$loadProducts$1.L$0 = c;
                        productsViewModel$loadProducts$1.label = 2;
                        qis a2 = aVar.J.a(list2, nfp0.b);
                        if (a2 != coroutineSingletons) {
                            obj = c;
                            obj2 = a2;
                            qisVar = (qis) obj2;
                            if (qisVar == null) {
                            }
                        }
                        return coroutineSingletons;
                    }
                    obj = c;
                    qisVar = null;
                    aVar.a0(new ugd0(11, qisVar, aVar));
                    c = obj;
                }
                a = Result.a(c);
                int i322 = 14;
                if (a != null) {
                }
            }
        }
        productsViewModel$loadProducts$1 = new ProductsViewModel$loadProducts$1(aVar, continuationImpl);
        Object obj22 = productsViewModel$loadProducts$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = productsViewModel$loadProducts$1.label;
        RequestStatus$Data$Source requestStatus$Data$Source2 = null;
        if (i != 0) {
        }
        if (!(c instanceof Result.Failure)) {
        }
        a = Result.a(c);
        int i3222 = 14;
        if (a != null) {
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        this.C.T.a.a("products_screen.close", null);
    }

    public final OrientationAwareRecyclerView.a c0() {
        t400 t400Var = (t400) this.F;
        return new OrientationAwareRecyclerView.a(t400Var.a.g().isEnabled(), t400Var.a.g().getScrollAngle());
    }

    public final void d0(boolean z) {
        pzt0 pzt0Var = this.N;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.N = tje.N(ds31.a(this), null, null, new ProductsViewModel$loadData$1(this, null), 3);
        pzt0 pzt0Var2 = this.M;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.M = tje.N(ds31.a(this), null, null, new ProductsViewModel$loadData$2(this, z, null), 3);
    }

    public final void f0() {
        laf0 laf0Var = (laf0) ((dbf0) X()).a.a();
        if (laf0Var == null) {
            return;
        }
        List list = laf0Var.a;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                scc.m();
                throw null;
            }
            d7f0 d7f0Var = (d7f0) obj;
            l0p l0pVar = this.C.T;
            String str = d7f0Var.a;
            int f = scc.f(list) - i;
            a9f0 a9f0Var = d7f0Var.o;
            String str2 = a9f0Var != null ? a9f0Var.a : null;
            LinkedHashMap w = g8e.w(4, "product_type", str);
            w.put("order", Integer.valueOf(f));
            if (str2 != null) {
                w.put("skin_id", str2);
            }
            l0pVar.a.a("products_screen.product.show", w);
            i = i2;
        }
    }

    public final boolean g0(Uri uri, ProductsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType) {
        int i = ccf0.a[productsViewModel$ProductsScreenSideEffect$ShowBottomSheet$BottomSheetType.ordinal()];
        if (i == 1) {
            this.C.T.a.a("products_screen.qr_nfc_bottom_sheet.click", null);
        } else if (i != 2) {
            w511.b();
            return false;
        }
        return ((q400) this.B).a(uri.toString());
    }

    public final void h0(tb6 tb6Var) {
        this.I.a(tb6Var.a, BottomBarItemId.HOME.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.SCREEN_BUTTON);
        sh6 sh6Var = tb6Var.e;
        boolean z = sh6Var instanceof ph6;
        w4x0 w4x0Var = this.G;
        if (z) {
            Z(wbf0.a);
            this.C.Y.x(QrPaymentEvents$QrIconClickedSource.MAIN);
            ((x4x0) w4x0Var).b(sh6Var);
        } else if (sh6Var instanceof mh6) {
            Z(xbf0.a);
        } else {
            ((x4x0) w4x0Var).b(sh6Var);
        }
    }

    public final void i0() {
        this.L.e();
    }

    public final void j0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, false, null, false, false, false, false, 7679)));
    }

    public final void k0() {
        a aVar;
        r0 r0Var;
        Object value;
        List list;
        List list2;
        laf0 laf0Var = (laf0) ((dbf0) X()).a.a();
        auq0 auq0Var = null;
        kpn kpnVar = (laf0Var == null || (list2 = laf0Var.g) == null) ? null : (kpn) kotlin.collections.a.R(list2);
        laf0 laf0Var2 = (laf0) ((dbf0) X()).a.a();
        if (laf0Var2 != null && (list = laf0Var2.h) != null) {
            auq0Var = (auq0) kotlin.collections.a.R(list);
        }
        boolean z = ((dbf0) X()).c || ((dbf0) X()).b;
        boolean z2 = (z || kpnVar == null) ? false : true;
        if (z || z2 || auq0Var == null) {
            aVar = this;
        } else {
            acf0 acf0Var = new acf0(auq0Var);
            aVar = this;
            aVar.Z(acf0Var);
        }
        pz40 Y = aVar.Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, false, null, z2, false, false, false, 7679)));
    }

    public final void l0() {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, false, null, null, false, null, false, false, false, false, 4095)));
    }

    public final void m0() {
        String str;
        this.I.a(BottomBarItemId.PAY.getId(), BottomBarItemId.HOME.getId(), BottomNavigationEvents$BottomNavigationClickButtonVersion.TSAR_BUTTON);
        jj11 jj11Var = ((dbf0) X()).g;
        if (jj11Var instanceof hj11) {
            str = ((hj11) jj11Var).a.b;
        } else if (jj11Var instanceof ij11) {
            str = ((ij11) jj11Var).a.b;
        } else {
            if (jj11Var != null) {
                w511.b();
                return;
            }
            str = null;
        }
        if (str != null) {
            ((q400) this.B).a(str);
        }
    }

    public final void n0(boolean z) {
        r0 r0Var;
        Object value;
        pz40 Y = Y();
        do {
            r0Var = (r0) Y;
            value = r0Var.getValue();
        } while (!r0Var.k(value, dbf0.a((dbf0) value, null, false, z, null, null, false, null, false, false, false, false, 8187)));
    }

    public final void o0(boolean z) {
        if (z) {
            return;
        }
        d0(false);
    }

    public final boolean p0(Uri uri) {
        return ((q400) this.B).a(uri.toString());
    }

    public final void q0(qis qisVar) {
        tje.N(ds31.a(this), null, null, new ProductsViewModel$showFullscreen$1(this, qisVar, null), 3);
    }
}
