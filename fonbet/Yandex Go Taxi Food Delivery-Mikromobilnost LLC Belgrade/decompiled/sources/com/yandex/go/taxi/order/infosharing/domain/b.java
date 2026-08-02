package com.yandex.go.taxi.order.infosharing.domain;

import android.net.Uri;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.Driver;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.OrderShareSettingsExperiment;
import defpackage.alb1;
import defpackage.d6z;
import defpackage.fgp0;
import defpackage.n20;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.oep0;
import defpackage.pzt0;
import defpackage.qn11;
import defpackage.t2y0;
import defpackage.tje;
import defpackage.tse;
import defpackage.umt0;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b implements fgp0 {
    public final tse a;
    public final n20 b;
    public final com.yandex.go.navigation.screen.c c;
    public final t2y0 d;
    public final umt0 e;
    public final com.yandex.go.taxi.order.infosharing.data.a f;
    public final oep0 g;
    public pzt0 h;

    public b(tse tseVar, n20 n20Var, com.yandex.go.navigation.screen.c cVar, t2y0 t2y0Var, umt0 umt0Var, com.yandex.go.taxi.order.infosharing.data.a aVar, oep0 oep0Var) {
        this.a = tseVar;
        this.b = n20Var;
        this.c = cVar;
        this.d = t2y0Var;
        this.e = umt0Var;
        this.f = aVar;
        this.g = oep0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x005a, code lost:
    
        if (r13 == r1) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.fgp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri uri, Continuation continuation) {
        TaxiOrderScreenshotSharingHandler$onScreenshot$1 taxiOrderScreenshotSharingHandler$onScreenshot$1;
        int i;
        o2y0 o2y0Var;
        Uri uri2;
        o2y0 o2y0Var2;
        Driver driver;
        String str;
        pzt0 pzt0Var;
        if (continuation instanceof TaxiOrderScreenshotSharingHandler$onScreenshot$1) {
            taxiOrderScreenshotSharingHandler$onScreenshot$1 = (TaxiOrderScreenshotSharingHandler$onScreenshot$1) continuation;
            int i2 = taxiOrderScreenshotSharingHandler$onScreenshot$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderScreenshotSharingHandler$onScreenshot$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderScreenshotSharingHandler$onScreenshot$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderScreenshotSharingHandler$onScreenshot$1.label;
                n20 n20Var = this.b;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiOrderScreenshotSharingHandler$onScreenshot$1.L$0 = uri;
                    taxiOrderScreenshotSharingHandler$onScreenshot$1.label = 1;
                    obj = ((com.yandex.go.taxi.order.provider.a) n20Var).t(taxiOrderScreenshotSharingHandler$onScreenshot$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        o2y0Var2 = (o2y0) taxiOrderScreenshotSharingHandler$onScreenshot$1.L$1;
                        uri2 = (Uri) taxiOrderScreenshotSharingHandler$onScreenshot$1.L$0;
                        kotlin.b.b(obj);
                        if (((List) obj).size() <= 1) {
                            o2y0Var = o2y0Var2;
                            uri = uri2;
                            TaxiOrder b = o2y0Var.b();
                            driver = b.V().g;
                            String c = alb1.c(driver.c, driver.b, driver.d);
                            if (driver.g.length() > 0 && c.length() > 0 && (str = b.V().B) != null && str.length() != 0) {
                                TaxiOrder b2 = o2y0Var.b();
                                pzt0Var = this.h;
                                if (pzt0Var != null) {
                                    pzt0Var.a(null);
                                }
                                this.h = tje.N(this.a, null, null, new TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1(this, b2, uri, null), 3);
                            }
                        }
                        return zy11Var;
                    }
                    uri = (Uri) taxiOrderScreenshotSharingHandler$onScreenshot$1.L$0;
                    kotlin.b.b(obj);
                }
                o2y0Var = (o2y0) obj;
                if (o2y0Var != null) {
                    OrderStatusInfo V = o2y0Var.b().V();
                    V.getClass();
                    qn11 qn11Var = OrderShareSettingsExperiment.j;
                    qn11 b3 = V.b(OrderShareSettingsExperiment.class);
                    if (b3 != null) {
                        qn11Var = b3;
                    }
                    OrderShareSettingsExperiment orderShareSettingsExperiment = (OrderShareSettingsExperiment) qn11Var;
                    boolean z = orderShareSettingsExperiment.b;
                    OrderShareSettingsExperiment.SharedMessage sharedMessage = orderShareSettingsExperiment.d;
                    if (z && d6z.Y(orderShareSettingsExperiment, sharedMessage.getA()).length() > 0 && d6z.Y(orderShareSettingsExperiment, sharedMessage.getB()).length() > 0) {
                        com.yandex.go.navigation.screen.c cVar = this.c;
                        if (cVar.f()) {
                            if (cVar.b() == Screen.ORDERS_LIST) {
                                taxiOrderScreenshotSharingHandler$onScreenshot$1.L$0 = uri;
                                taxiOrderScreenshotSharingHandler$onScreenshot$1.L$1 = o2y0Var;
                                taxiOrderScreenshotSharingHandler$onScreenshot$1.L$2 = null;
                                taxiOrderScreenshotSharingHandler$onScreenshot$1.label = 2;
                                Object k = ((com.yandex.go.taxi.order.provider.a) n20Var).k(taxiOrderScreenshotSharingHandler$onScreenshot$1);
                                if (k != coroutineSingletons) {
                                    uri2 = uri;
                                    o2y0Var2 = o2y0Var;
                                    obj = k;
                                    if (((List) obj).size() <= 1) {
                                    }
                                }
                                return coroutineSingletons;
                            }
                            TaxiOrder b4 = o2y0Var.b();
                            driver = b4.V().g;
                            String c2 = alb1.c(driver.c, driver.b, driver.d);
                            if (driver.g.length() > 0) {
                                TaxiOrder b22 = o2y0Var.b();
                                pzt0Var = this.h;
                                if (pzt0Var != null) {
                                }
                                this.h = tje.N(this.a, null, null, new TaxiOrderScreenshotSharingHandler$launchTaxiOrderSharingRouter$1(this, b22, uri, null), 3);
                            }
                        }
                    }
                }
                return zy11Var;
            }
        }
        taxiOrderScreenshotSharingHandler$onScreenshot$1 = new TaxiOrderScreenshotSharingHandler$onScreenshot$1(this, (ContinuationImpl) continuation);
        Object obj2 = taxiOrderScreenshotSharingHandler$onScreenshot$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderScreenshotSharingHandler$onScreenshot$1.label;
        n20 n20Var2 = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        o2y0Var = (o2y0) obj2;
        if (o2y0Var != null) {
        }
        return zy11Var2;
    }
}
