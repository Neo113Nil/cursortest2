package com.yandex.go.payments.paymentlist.navigation.deeplink;

import android.net.Uri;
import com.yandex.go.payments.paymentlist.experiments.MainMenuPaymentMethodsSelectorExperiment;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.domain.repositories.e0;
import defpackage.a5y0;
import defpackage.an91;
import defpackage.b600;
import defpackage.b8a0;
import defpackage.d8a0;
import defpackage.e2a1;
import defpackage.e5d0;
import defpackage.e8a0;
import defpackage.em10;
import defpackage.faa0;
import defpackage.g8a0;
import defpackage.gaa0;
import defpackage.h3y;
import defpackage.h55;
import defpackage.h9a0;
import defpackage.hga0;
import defpackage.hxx;
import defpackage.j230;
import defpackage.m950;
import defpackage.n20;
import defpackage.nda0;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pep0;
import defpackage.tje;
import defpackage.wjd0;
import defpackage.y50;
import defpackage.ycq0;
import defpackage.yvf0;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.b;

/* loaded from: classes8.dex */
public final class a extends h55 {
    public final oep0 D;
    public final g8a0 E;
    public final n20 F;
    public final yvf0 G;
    public final ycq0 H;
    public final yvf0 I;
    public final h3y J;
    public final b K;
    public final yvf0 L;
    public final b600 M;
    public final hga0 N;

    public a(y50 y50Var, oep0 oep0Var, g8a0 g8a0Var, n20 n20Var, yvf0 yvf0Var, ycq0 ycq0Var, yvf0 yvf0Var2, h3y h3yVar, b bVar, yvf0 yvf0Var3, b600 b600Var, hga0 hga0Var) {
        super(null);
        this.D = oep0Var;
        this.E = g8a0Var;
        this.F = n20Var;
        this.G = yvf0Var;
        this.H = ycq0Var;
        this.I = yvf0Var2;
        this.J = h3yVar;
        this.K = bVar;
        this.L = yvf0Var3;
        this.M = b600Var;
        this.N = hga0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e7, code lost:
    
        if (r12 == r7) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x01f0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(a aVar, Uri uri, ContinuationImpl continuationImpl) {
        PaymentMethodsDeeplinkRouter$handleDeeplink$1 paymentMethodsDeeplinkRouter$handleDeeplink$1;
        int i;
        String str;
        boolean b;
        Object k;
        o2y0 o2y0Var;
        String str2;
        Uri uri2;
        boolean z;
        Uri uri3 = uri;
        g8a0 g8a0Var = aVar.E;
        h3y h3yVar = aVar.J;
        n20 n20Var = aVar.F;
        if (continuationImpl instanceof PaymentMethodsDeeplinkRouter$handleDeeplink$1) {
            paymentMethodsDeeplinkRouter$handleDeeplink$1 = (PaymentMethodsDeeplinkRouter$handleDeeplink$1) continuationImpl;
            int i2 = paymentMethodsDeeplinkRouter$handleDeeplink$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                paymentMethodsDeeplinkRouter$handleDeeplink$1.label = i2 - Integer.MIN_VALUE;
                Object obj = paymentMethodsDeeplinkRouter$handleDeeplink$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = paymentMethodsDeeplinkRouter$handleDeeplink$1.label;
                int i3 = 1;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String queryParameter = uri3.getQueryParameter(Constants.KEY_SERVICE);
                    if (queryParameter == null || !e2a1.c(queryParameter)) {
                        str = queryParameter;
                        b = ((MainMenuPaymentMethodsSelectorExperiment) aVar.M.a.c()).getB();
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0 = uri3;
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1 = str;
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0 = b;
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.label = 2;
                        k = ((com.yandex.go.taxi.order.provider.a) n20Var).k(paymentMethodsDeeplinkRouter$handleDeeplink$1);
                    } else {
                        h9a0 h9a0Var = new h9a0(false, null, ((e5d0) h3yVar.get()).a(), false, queryParameter, null, 43);
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0 = null;
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1 = null;
                        paymentMethodsDeeplinkRouter$handleDeeplink$1.label = 1;
                        aVar.Q(h9a0Var);
                        if (zy11Var == coroutineSingletons) {
                        }
                    }
                }
                if (i == 1) {
                    kotlin.b.b(obj);
                    return zy11Var;
                }
                if (i != 2) {
                    if (i != 3) {
                        if (i == 4) {
                            z = paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0;
                            String str3 = (String) paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1;
                            uri2 = (Uri) paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0;
                            kotlin.b.b(obj);
                            str2 = str3;
                            if (!((Boolean) obj).booleanValue()) {
                                aVar.A((m950) aVar.G.get(), nda0.a, new j230(aVar, i3));
                                return zy11Var;
                            }
                            e8a0 a = g8a0Var.a(uri2);
                            if (a instanceof b8a0) {
                                aVar.H.b(((b8a0) a).a());
                            }
                            wjd0 a2 = ((e5d0) h3yVar.get()).a();
                            d8a0 d8a0Var = a instanceof d8a0 ? (d8a0) a : null;
                            h9a0 h9a0Var2 = new h9a0(false, null, a2, false, str2, d8a0Var != null ? d8a0Var.a() : null, 3);
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0 = null;
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1 = null;
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.L$2 = null;
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.L$3 = null;
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0 = z;
                            paymentMethodsDeeplinkRouter$handleDeeplink$1.label = 5;
                            aVar.Q(h9a0Var2);
                            return zy11Var == coroutineSingletons ? coroutineSingletons : zy11Var;
                        }
                        if (i != 5) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                boolean z2 = paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0;
                str = (String) paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1;
                Uri uri4 = (Uri) paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0;
                kotlin.b.b(obj);
                b = z2;
                uri3 = uri4;
                k = obj;
                String str4 = str;
                o2y0Var = (o2y0) kotlin.collections.a.u0((List) k);
                if (o2y0Var != null || an91.g(o2y0Var.c())) {
                    o2y0Var = null;
                }
                if (o2y0Var == null) {
                    e8a0 a3 = g8a0Var.a(uri3);
                    if (a3 instanceof b8a0) {
                        aVar.N.a.set(((b8a0) a3).a());
                    }
                    ((pep0) aVar.D).f((m950) aVar.I.get(), new a5y0("deeplink payment methods", o2y0Var, TaxiCardNavigationAction.OPEN_PAYMENT, 24), hxx.a);
                    aVar.i();
                    return zy11Var;
                }
                if (b) {
                    h9a0 h9a0Var3 = new h9a0(false, null, ((e5d0) h3yVar.get()).a(), true, str4, null, 35);
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0 = null;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1 = null;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$2 = null;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0 = b;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.label = 3;
                    aVar.Q(h9a0Var3);
                    if (zy11Var == coroutineSingletons) {
                    }
                } else {
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$0 = uri3;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$1 = str4;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.L$2 = null;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.Z$0 = b;
                    paymentMethodsDeeplinkRouter$handleDeeplink$1.label = 4;
                    Object t = ((e0) ((com.yandex.go.taxi.order.provider.a) n20Var).o()).t(paymentMethodsDeeplinkRouter$handleDeeplink$1);
                    if (t != coroutineSingletons) {
                        str2 = str4;
                        uri2 = uri3;
                        z = b;
                        obj = t;
                        if (!((Boolean) obj).booleanValue()) {
                        }
                    }
                }
            }
        }
        paymentMethodsDeeplinkRouter$handleDeeplink$1 = new PaymentMethodsDeeplinkRouter$handleDeeplink$1(aVar, continuationImpl);
        Object obj2 = paymentMethodsDeeplinkRouter$handleDeeplink$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = paymentMethodsDeeplinkRouter$handleDeeplink$1.label;
        int i32 = 1;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        String str42 = str;
        o2y0Var = (o2y0) kotlin.collections.a.u0((List) k);
        if (o2y0Var != null) {
        }
        o2y0Var = null;
        if (o2y0Var == null) {
        }
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        ru.yandex.taxi.deeplinks.a.c(o(), this.K, new gaa0(this));
        tje.N(o(), null, null, new PaymentMethodsDeeplinkRouter$onLaunch$2((faa0) obj, this, null), 3);
    }

    public final void Q(h9a0 h9a0Var) {
        D((m950) this.L.get(), h9a0Var, new em10(this, 1));
    }
}
