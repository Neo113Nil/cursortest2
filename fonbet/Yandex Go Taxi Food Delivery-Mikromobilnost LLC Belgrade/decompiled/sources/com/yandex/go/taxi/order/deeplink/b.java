package com.yandex.go.taxi.order.deeplink;

import android.net.Uri;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$ChangeSource$Mode;
import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;
import com.yandex.go.taxi.order.models.api.objects.TipsType;
import defpackage.a0y0;
import defpackage.a3y0;
import defpackage.avu0;
import defpackage.b0y0;
import defpackage.bvu0;
import defpackage.c0y0;
import defpackage.d0y0;
import defpackage.e0y0;
import defpackage.f0y0;
import defpackage.g0y0;
import defpackage.g8e;
import defpackage.gtq0;
import defpackage.h0y0;
import defpackage.h3y;
import defpackage.hc00;
import defpackage.hst;
import defpackage.i0y0;
import defpackage.ic00;
import defpackage.jc00;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k0y0;
import defpackage.kc00;
import defpackage.l0y0;
import defpackage.m0y0;
import defpackage.n0y0;
import defpackage.ny61;
import defpackage.o0y0;
import defpackage.o2y0;
import defpackage.p0y0;
import defpackage.p2y0;
import defpackage.wzx0;
import defpackage.xc8;
import defpackage.xq70;
import defpackage.xzx0;
import defpackage.zzx0;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.IssuingDistributionPointExtension;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes8.dex */
public final class b {
    public final h3y a;
    public final com.yandex.go.taxi.order.interactors.a b;
    public final p2y0 c;
    public final a3y0 d = new a3y0(TaxiOrderLogGroup.NAVIGATION.getTag(), "DeeplinkInteractor");

    public b(h3y h3yVar, com.yandex.go.taxi.order.interactors.a aVar, p2y0 p2y0Var) {
        this.a = h3yVar;
        this.b = aVar;
        this.c = p2y0Var;
    }

    public final p0y0 a(l0y0 l0y0Var, o2y0 o2y0Var) {
        String str;
        if (o2y0Var != null && o2y0Var.c() != DriveState.CANCELLED) {
            TaxiOrder b = o2y0Var.b();
            if (b.l.getY() && b.V().j0 != null) {
                return new m0y0("taxi main due to an altpin order");
            }
            this.c.getClass();
            return new o0y0(l0y0Var, o2y0Var);
        }
        if (l0y0Var.c()) {
            ic00 ic00Var = ((kc00) ((jc00) this.a.get())).a;
            ic00Var.getClass();
            if (ic00Var instanceof hc00) {
                str = "taxi order details fallback to taxi main";
                return new m0y0(str);
            }
        }
        str = null;
        return new m0y0(str);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x026f, code lost:
    
        if (r2 == r4) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0288, code lost:
    
        if (r2 == r4) goto L143;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Uri uri, ContinuationImpl continuationImpl) {
        TaxiOrderDeeplinkInteractor$handleIntent$2 taxiOrderDeeplinkInteractor$handleIntent$2;
        int i;
        TaxiOrderDeeplink$PreferredScreenType taxiOrderDeeplink$PreferredScreenType;
        Object obj;
        l0y0 g0y0Var;
        TaxiOrderDeeplink$ChangeSource$Mode taxiOrderDeeplink$ChangeSource$Mode;
        TaxiOrderDeeplink$ChangeSource$Mode taxiOrderDeeplink$ChangeSource$Mode2;
        l0y0 d0y0Var;
        String queryParameter;
        Double i2;
        Double i3;
        String a;
        Object m0y0Var;
        if (continuationImpl instanceof TaxiOrderDeeplinkInteractor$handleIntent$2) {
            taxiOrderDeeplinkInteractor$handleIntent$2 = (TaxiOrderDeeplinkInteractor$handleIntent$2) continuationImpl;
            int i4 = taxiOrderDeeplinkInteractor$handleIntent$2.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                taxiOrderDeeplinkInteractor$handleIntent$2.label = i4 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderDeeplinkInteractor$handleIntent$2.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDeeplinkInteractor$handleIntent$2.label;
                a3y0 a3y0Var = this.d;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!"taxi_order_details".equalsIgnoreCase(uri != null ? uri.getAuthority() : null)) {
                        return n0y0.a;
                    }
                    a3y0Var.getClass();
                    a3y0.h(new String[]{"handleIntent"});
                    hst hstVar = jst.e;
                    a3y0 a3y0Var2 = xq70.c;
                    if (uri == null) {
                        g0y0Var = f0y0.d;
                    } else {
                        String queryParameter2 = uri.getQueryParameter("order_id");
                        String str = queryParameter2 == null ? "" : queryParameter2;
                        String queryParameter3 = uri.getQueryParameter("preferred_screen_type");
                        if (queryParameter3 == null || (taxiOrderDeeplink$PreferredScreenType = (TaxiOrderDeeplink$PreferredScreenType) gtq0.j(queryParameter3, TaxiOrderDeeplink$PreferredScreenType.Companion.serializer())) == null) {
                            taxiOrderDeeplink$PreferredScreenType = TaxiOrderDeeplink$PreferredScreenType.DEFAULT;
                        }
                        TaxiOrderDeeplink$PreferredScreenType taxiOrderDeeplink$PreferredScreenType2 = taxiOrderDeeplink$PreferredScreenType;
                        String queryParameter4 = uri.getQueryParameter("open_taxi_main_on_not_found");
                        boolean parseBoolean = queryParameter4 != null ? Boolean.parseBoolean(queryParameter4.toLowerCase(Locale.ROOT)) : false;
                        String queryParameter5 = uri.getQueryParameter("need_open_details");
                        if (queryParameter5 != null) {
                            Boolean.parseBoolean(queryParameter5.toLowerCase(Locale.ROOT));
                        }
                        String queryParameter6 = uri.getQueryParameter("action");
                        if (jl40.l(queryParameter6, "messenger") || str.length() != 0) {
                            if (queryParameter6 != null) {
                                switch (queryParameter6.hashCode()) {
                                    case -1436108013:
                                        if (queryParameter6.equals("messenger")) {
                                            String queryParameter7 = uri.getQueryParameter("chat_id");
                                            if (queryParameter7 != null && queryParameter7.length() != 0) {
                                                g0y0Var = new i0y0(queryParameter7, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                                obj = null;
                                                break;
                                            } else {
                                                obj = null;
                                                a3y0.d(xq70.c, "DEEPLINK_FORMAT_EXCEPTION", null, new xc8(g8e.m(uri, "Missing 'chat_id' param in taxi_order_details deeplink with action messenger. Uri: '", "'"), 16), 2);
                                                g0y0Var = new g0y0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                                break;
                                            }
                                        }
                                        obj = null;
                                        break;
                                    case -1229233821:
                                        if (queryParameter6.equals("alternative_point_a_found")) {
                                            g0y0Var = new wzx0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            obj = null;
                                            break;
                                        }
                                        obj = null;
                                        break;
                                    case -831730806:
                                        if (queryParameter6.equals("change_source")) {
                                            String queryParameter8 = uri.getQueryParameter("mode");
                                            if (queryParameter8 == null || (taxiOrderDeeplink$ChangeSource$Mode = (TaxiOrderDeeplink$ChangeSource$Mode) gtq0.j(queryParameter8, TaxiOrderDeeplink$ChangeSource$Mode.Companion.serializer())) == null) {
                                                taxiOrderDeeplink$ChangeSource$Mode = TaxiOrderDeeplink$ChangeSource$Mode.CHANGE_SOURCE_SCREEN;
                                            }
                                            String queryParameter9 = uri.getQueryParameter("source");
                                            String str2 = queryParameter9 == null ? "" : queryParameter9;
                                            String queryParameter10 = uri.getQueryParameter("p_type");
                                            c0y0 c0y0Var = a0y0.b;
                                            if (queryParameter10 != null) {
                                                int hashCode = queryParameter10.hashCode();
                                                if (hashCode == 102225) {
                                                    taxiOrderDeeplink$ChangeSource$Mode2 = taxiOrderDeeplink$ChangeSource$Mode;
                                                    if (queryParameter10.equals("geo")) {
                                                        c0y0Var = b0y0.b;
                                                    }
                                                } else if (hashCode == 106845584 && queryParameter10.equals(IssuingDistributionPointExtension.POINT) && (queryParameter = uri.getQueryParameter("lat")) != null && (i2 = avu0.i(queryParameter)) != null) {
                                                    double doubleValue = i2.doubleValue();
                                                    String queryParameter11 = uri.getQueryParameter("lon");
                                                    if (queryParameter11 != null && (i3 = avu0.i(queryParameter11)) != null) {
                                                        taxiOrderDeeplink$ChangeSource$Mode2 = taxiOrderDeeplink$ChangeSource$Mode;
                                                        c0y0Var = new zzx0(doubleValue, i3.doubleValue());
                                                    }
                                                }
                                                d0y0Var = new d0y0(str, taxiOrderDeeplink$ChangeSource$Mode2, c0y0Var, str2, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                                g0y0Var = d0y0Var;
                                                obj = null;
                                                break;
                                            }
                                            taxiOrderDeeplink$ChangeSource$Mode2 = taxiOrderDeeplink$ChangeSource$Mode;
                                            d0y0Var = new d0y0(str, taxiOrderDeeplink$ChangeSource$Mode2, c0y0Var, str2, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            g0y0Var = d0y0Var;
                                            obj = null;
                                        }
                                        obj = null;
                                        break;
                                    case -191501435:
                                        if (queryParameter6.equals("feedback")) {
                                            String queryParameter12 = uri.getQueryParameter("value");
                                            Integer l = queryParameter12 != null ? bvu0.l(10, queryParameter12) : null;
                                            if (l == null) {
                                                a3y0.d(xq70.c, "DEEPLINK_FORMAT_EXCEPTION", null, new xc8(g8e.m(uri, "Missing 'value' param in taxi_order_details deeplink with action feedback. Uri: '", "'"), 16), 2);
                                                g0y0Var = new g0y0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            } else {
                                                g0y0Var = new h0y0(str, l.intValue(), taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            }
                                            obj = null;
                                            break;
                                        }
                                        obj = null;
                                        break;
                                    case 3045982:
                                        if (queryParameter6.equals("call")) {
                                            g0y0Var = new xzx0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            obj = null;
                                            break;
                                        }
                                        obj = null;
                                        break;
                                    case 3052376:
                                        if (queryParameter6.equals("chat")) {
                                            g0y0Var = new e0y0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                                            obj = null;
                                            break;
                                        }
                                        obj = null;
                                        break;
                                    case 3560248:
                                        if (queryParameter6.equals("tips")) {
                                            d0y0Var = new k0y0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean, uri.getQueryParameter("tips_value"), uri.getQueryParameter("tips_type"));
                                            g0y0Var = d0y0Var;
                                            obj = null;
                                            break;
                                        }
                                        obj = null;
                                        break;
                                    default:
                                        obj = null;
                                        break;
                                }
                                a = g0y0Var.a();
                                if (a.length() > 0) {
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$0 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$1 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$2 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.label = 1;
                                    obj2 = d(a, g0y0Var, taxiOrderDeeplinkInteractor$handleIntent$2);
                                } else if (g0y0Var instanceof i0y0) {
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$0 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$1 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.L$2 = obj;
                                    taxiOrderDeeplinkInteractor$handleIntent$2.label = 2;
                                    obj2 = c((i0y0) g0y0Var, taxiOrderDeeplinkInteractor$handleIntent$2);
                                } else {
                                    m0y0Var = new m0y0();
                                }
                                return obj3;
                            }
                            obj = null;
                            g0y0Var = new g0y0(str, taxiOrderDeeplink$PreferredScreenType2, parseBoolean);
                            a = g0y0Var.a();
                            if (a.length() > 0) {
                            }
                            return obj3;
                        }
                        g0y0Var = f0y0.d;
                    }
                    obj = null;
                    a = g0y0Var.a();
                    if (a.length() > 0) {
                    }
                    return obj3;
                }
                if (i == 1) {
                    kotlin.b.b(obj2);
                    m0y0Var = (p0y0) obj2;
                } else {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    m0y0Var = (p0y0) obj2;
                }
                a3y0Var.getClass();
                a3y0.h(new String[]{"handleIntent"});
                hst hstVar2 = jst.e;
                return m0y0Var;
            }
        }
        taxiOrderDeeplinkInteractor$handleIntent$2 = new TaxiOrderDeeplinkInteractor$handleIntent$2(this, continuationImpl);
        Object obj22 = taxiOrderDeeplinkInteractor$handleIntent$2.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDeeplinkInteractor$handleIntent$2.label;
        a3y0 a3y0Var3 = this.d;
        if (i != 0) {
        }
        a3y0Var3.getClass();
        a3y0.h(new String[]{"handleIntent"});
        hst hstVar22 = jst.e;
        return m0y0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(i0y0 i0y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderDeeplinkInteractor$messengerFlow$1 taxiOrderDeeplinkInteractor$messengerFlow$1;
        int i;
        if (continuationImpl instanceof TaxiOrderDeeplinkInteractor$messengerFlow$1) {
            taxiOrderDeeplinkInteractor$messengerFlow$1 = (TaxiOrderDeeplinkInteractor$messengerFlow$1) continuationImpl;
            int i2 = taxiOrderDeeplinkInteractor$messengerFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDeeplinkInteractor$messengerFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderDeeplinkInteractor$messengerFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDeeplinkInteractor$messengerFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String d = i0y0Var.d();
                    taxiOrderDeeplinkInteractor$messengerFlow$1.L$0 = i0y0Var;
                    taxiOrderDeeplinkInteractor$messengerFlow$1.L$1 = null;
                    taxiOrderDeeplinkInteractor$messengerFlow$1.label = 1;
                    obj = this.b.b(d, taxiOrderDeeplinkInteractor$messengerFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i0y0Var = (i0y0) taxiOrderDeeplinkInteractor$messengerFlow$1.L$0;
                    kotlin.b.b(obj);
                }
                return a(i0y0Var, (o2y0) obj);
            }
        }
        taxiOrderDeeplinkInteractor$messengerFlow$1 = new TaxiOrderDeeplinkInteractor$messengerFlow$1(this, continuationImpl);
        Object obj2 = taxiOrderDeeplinkInteractor$messengerFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDeeplinkInteractor$messengerFlow$1.label;
        if (i != 0) {
        }
        return a(i0y0Var, (o2y0) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, l0y0 l0y0Var, ContinuationImpl continuationImpl) {
        TaxiOrderDeeplinkInteractor$orderIdFlow$1 taxiOrderDeeplinkInteractor$orderIdFlow$1;
        int i;
        String e;
        Object value;
        TaxiOrder taxiOrder;
        Object value2;
        TaxiOrder taxiOrder2;
        if (continuationImpl instanceof TaxiOrderDeeplinkInteractor$orderIdFlow$1) {
            taxiOrderDeeplinkInteractor$orderIdFlow$1 = (TaxiOrderDeeplinkInteractor$orderIdFlow$1) continuationImpl;
            int i2 = taxiOrderDeeplinkInteractor$orderIdFlow$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderDeeplinkInteractor$orderIdFlow$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderDeeplinkInteractor$orderIdFlow$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderDeeplinkInteractor$orderIdFlow$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    com.yandex.go.taxi.order.interactors.a aVar = this.b;
                    taxiOrderDeeplinkInteractor$orderIdFlow$1.L$0 = null;
                    taxiOrderDeeplinkInteractor$orderIdFlow$1.L$1 = l0y0Var;
                    taxiOrderDeeplinkInteractor$orderIdFlow$1.label = 1;
                    obj = aVar.c(str, taxiOrderDeeplinkInteractor$orderIdFlow$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l0y0Var = (l0y0) taxiOrderDeeplinkInteractor$orderIdFlow$1.L$1;
                    kotlin.b.b(obj);
                }
                o2y0 o2y0Var = (o2y0) obj;
                if (l0y0Var instanceof h0y0) {
                    if ((l0y0Var instanceof k0y0) && (e = ((k0y0) l0y0Var).e()) != null && o2y0Var != null) {
                        r0 r0Var = o2y0Var.a;
                        do {
                            value = r0Var.getValue();
                            taxiOrder = (TaxiOrder) value;
                            taxiOrder.U(e, TipsType.FLAT);
                        } while (!r0Var.k(value, taxiOrder));
                        o2y0Var.f();
                    }
                } else if (o2y0Var != null) {
                    r0 r0Var2 = o2y0Var.a;
                    do {
                        value2 = r0Var2.getValue();
                        taxiOrder2 = (TaxiOrder) value2;
                        int d = ((h0y0) l0y0Var).d();
                        synchronized (taxiOrder2) {
                            taxiOrder2.l = taxiOrder2.l.R(d);
                        }
                    } while (!r0Var2.k(value2, taxiOrder2));
                    o2y0Var.f();
                }
                return a(l0y0Var, o2y0Var);
            }
        }
        taxiOrderDeeplinkInteractor$orderIdFlow$1 = new TaxiOrderDeeplinkInteractor$orderIdFlow$1(this, continuationImpl);
        Object obj2 = taxiOrderDeeplinkInteractor$orderIdFlow$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderDeeplinkInteractor$orderIdFlow$1.label;
        if (i != 0) {
        }
        o2y0 o2y0Var2 = (o2y0) obj2;
        if (l0y0Var instanceof h0y0) {
        }
        return a(l0y0Var, o2y0Var2);
    }
}
