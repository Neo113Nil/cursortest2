package com.yandex.go.support.web.factory;

import android.net.Uri;
import com.yandex.go.support.web.CommonSupportJsNativeApi;
import defpackage.ah00;
import defpackage.aqc;
import defpackage.as21;
import defpackage.atd0;
import defpackage.cqc;
import defpackage.dqc;
import defpackage.eqc;
import defpackage.fn21;
import defpackage.fqc;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.kfu;
import defpackage.kmf0;
import defpackage.mc;
import defpackage.ny61;
import defpackage.otr0;
import defpackage.oud;
import defpackage.pv0;
import defpackage.sls;
import defpackage.tls;
import defpackage.tpc;
import defpackage.tpr;
import defpackage.v7v0;
import defpackage.vp21;
import defpackage.wnt;
import defpackage.yu41;
import defpackage.zjw0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.settings.main.k;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.web.CoreWebViewConfig;
import ru.yandex.taxi.web.UiWebViewConfig;

/* loaded from: classes14.dex */
public final class a {
    public final yu41 a;
    public final h3y b;
    public final as21 c;
    public final CommonSupportJsNativeApi d;
    public final h3y e;
    public final h3y f;
    public final fn21 g;
    public final h3y h;
    public final h3y i;
    public final ru.yandex.taxi.settings.email.a j;
    public final h3y k;
    public final h3y l;
    public final h3y m;
    public final tpc n;

    public a(yu41 yu41Var, h3y h3yVar, as21 as21Var, CommonSupportJsNativeApi commonSupportJsNativeApi, h3y h3yVar2, h3y h3yVar3, fn21 fn21Var, h3y h3yVar4, h3y h3yVar5, ru.yandex.taxi.settings.email.a aVar, h3y h3yVar6, h3y h3yVar7, h3y h3yVar8, tpc tpcVar) {
        this.a = yu41Var;
        this.b = h3yVar;
        this.c = as21Var;
        this.d = commonSupportJsNativeApi;
        this.e = h3yVar2;
        this.f = h3yVar3;
        this.g = fn21Var;
        this.h = h3yVar4;
        this.i = h3yVar5;
        this.j = aVar;
        this.k = h3yVar6;
        this.l = h3yVar7;
        this.m = h3yVar8;
        this.n = tpcVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Uri.Builder builder, fqc fqcVar, ContinuationImpl continuationImpl) {
        CommonSupportWebConfigFactory$applySourceParameters$1 commonSupportWebConfigFactory$applySourceParameters$1;
        int i;
        String str;
        String str2;
        String str3;
        if (continuationImpl instanceof CommonSupportWebConfigFactory$applySourceParameters$1) {
            commonSupportWebConfigFactory$applySourceParameters$1 = (CommonSupportWebConfigFactory$applySourceParameters$1) continuationImpl;
            int i2 = commonSupportWebConfigFactory$applySourceParameters$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebConfigFactory$applySourceParameters$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebConfigFactory$applySourceParameters$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebConfigFactory$applySourceParameters$1.label;
                if (i != 0) {
                    b.b(obj);
                    boolean z = fqcVar instanceof aqc;
                    fn21 fn21Var = this.g;
                    if (z) {
                        String Hg = ((h) fn21Var).Hg();
                        builder.appendQueryParameter("chargers_user_id", Hg != null ? Hg : "");
                        aqc aqcVar = (aqc) fqcVar;
                        builder.appendQueryParameter("order_id", aqcVar.b);
                        builder.appendQueryParameter("order_status", aqcVar.c);
                        builder.appendQueryParameter("power_bank_number", aqcVar.d);
                    } else if (fqcVar instanceof dqc) {
                        String Hg2 = ((h) fn21Var).Hg();
                        builder.appendQueryParameter("scooter_user_id", Hg2 != null ? Hg2 : "");
                        dqc dqcVar = (dqc) fqcVar;
                        String str4 = dqcVar.d;
                        if (str4 != null) {
                            builder.appendQueryParameter("scooter_ride_id", str4);
                        }
                        String str5 = dqcVar.b;
                        if (str5 != null) {
                            builder.appendQueryParameter("session_id", str5);
                        }
                        String str6 = dqcVar.c;
                        if (str6 != null) {
                            builder.appendQueryParameter("scooter_id", str6);
                        }
                        String str7 = dqcVar.f;
                        if (str7 != null) {
                            builder.appendQueryParameter("scooter_session_status", str7);
                        }
                        String str8 = dqcVar.e;
                        if (str8 != null) {
                            builder.appendQueryParameter("scooter_number", str8);
                        }
                        commonSupportWebConfigFactory$applySourceParameters$1.L$0 = builder;
                        commonSupportWebConfigFactory$applySourceParameters$1.L$1 = fqcVar;
                        commonSupportWebConfigFactory$applySourceParameters$1.label = 1;
                        obj = c(fqcVar, commonSupportWebConfigFactory$applySourceParameters$1);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else if ((fqcVar instanceof cqc) && (str = ((cqc) fqcVar).c) != null && str.length() != 0) {
                        builder.appendQueryParameter("order_id", str);
                    }
                    return zy11.a;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                fqcVar = (fqc) commonSupportWebConfigFactory$applySourceParameters$1.L$1;
                builder = (Uri.Builder) commonSupportWebConfigFactory$applySourceParameters$1.L$0;
                b.b(obj);
                str2 = (String) obj;
                if (str2 != null) {
                    builder.appendQueryParameter("user_city", str2);
                }
                builder.appendQueryParameter("entry_point", ((dqc) fqcVar).g);
                String Og = ((h) ((vp21) this.f.get())).Og();
                str3 = Og.length() != 0 ? Og : null;
                if (str3 != null) {
                    builder.appendQueryParameter("phone", str3);
                }
                return zy11.a;
            }
        }
        commonSupportWebConfigFactory$applySourceParameters$1 = new CommonSupportWebConfigFactory$applySourceParameters$1(this, continuationImpl);
        Object obj3 = commonSupportWebConfigFactory$applySourceParameters$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebConfigFactory$applySourceParameters$1.label;
        if (i != 0) {
        }
        str2 = (String) obj3;
        if (str2 != null) {
        }
        builder.appendQueryParameter("entry_point", ((dqc) fqcVar).g);
        String Og2 = ((h) ((vp21) this.f.get())).Og();
        if (Og2.length() != 0) {
        }
        if (str3 != null) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, fqc fqcVar, String str2, sls slsVar, tls tlsVar, ContinuationImpl continuationImpl) {
        CommonSupportWebConfigFactory$create$1 commonSupportWebConfigFactory$create$1;
        int i;
        String str3;
        Uri.Builder appendQueryParameter;
        oud a;
        sls slsVar2;
        tls tlsVar2;
        fqc fqcVar2 = fqcVar;
        h3y h3yVar = this.k;
        ru.yandex.taxi.settings.email.a aVar = this.j;
        if (continuationImpl instanceof CommonSupportWebConfigFactory$create$1) {
            commonSupportWebConfigFactory$create$1 = (CommonSupportWebConfigFactory$create$1) continuationImpl;
            int i2 = commonSupportWebConfigFactory$create$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebConfigFactory$create$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebConfigFactory$create$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebConfigFactory$create$1.label;
                if (i != 0) {
                    b.b(obj);
                    if (str.length() == 0) {
                        str3 = this.c.c("LAST_KNOWN_SUPPORT_URL");
                        if (str3 == null) {
                            str3 = "";
                        }
                    } else {
                        str3 = str;
                    }
                    yu41 yu41Var = this.a;
                    yu41Var.getClass();
                    HashMap hashMap = new HashMap();
                    String Hg = ((h) yu41Var.a).Hg();
                    if (Hg != null && Hg.length() != 0) {
                        hashMap.put("id", Hg);
                    }
                    Uri.Builder buildUpon = Uri.parse(str3).buildUpon();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    appendQueryParameter = buildUpon.appendQueryParameter("from", fqcVar2.a());
                    if (str2 != null) {
                        appendQueryParameter.appendQueryParameter("bot_guid", str2);
                    }
                    otr0.c(appendQueryParameter, ((h) this.i.get()).Ig(), aVar.c(), ((k) h3yVar.get()).h, ((Number) aVar.f.getValue(aVar, ru.yandex.taxi.settings.email.a.i[0])).intValue() == 1);
                    ((kfu) this.l.get()).getClass();
                    appendQueryParameter.appendQueryParameter("helpType", "Yandex");
                    zzs zzsVar = ((k) h3yVar.get()).i;
                    if (zzsVar != null) {
                        appendQueryParameter.appendQueryParameter("lon", String.valueOf(zzsVar.b));
                        appendQueryParameter.appendQueryParameter("lat", String.valueOf(zzsVar.a));
                    }
                    kmf0 kmf0Var = (kmf0) this.m.get();
                    synchronized (kmf0Var) {
                        a = kmf0Var.a.a();
                    }
                    String str4 = a.a;
                    if (str4 != null && str4.length() != 0) {
                        appendQueryParameter.appendQueryParameter("promoCode", str4);
                        appendQueryParameter.appendQueryParameter("couponCheckValid", String.valueOf(a.b));
                        Boolean bool = a.c;
                        if (bool != null) {
                            appendQueryParameter.appendQueryParameter("couponCheckValidAny", String.valueOf(bool.booleanValue()));
                        }
                    }
                    commonSupportWebConfigFactory$create$1.L$0 = null;
                    commonSupportWebConfigFactory$create$1.L$1 = fqcVar2;
                    commonSupportWebConfigFactory$create$1.L$2 = null;
                    slsVar2 = slsVar;
                    commonSupportWebConfigFactory$create$1.L$3 = slsVar2;
                    tlsVar2 = tlsVar;
                    commonSupportWebConfigFactory$create$1.L$4 = tlsVar2;
                    commonSupportWebConfigFactory$create$1.L$5 = null;
                    commonSupportWebConfigFactory$create$1.L$6 = appendQueryParameter;
                    commonSupportWebConfigFactory$create$1.L$7 = null;
                    commonSupportWebConfigFactory$create$1.label = 1;
                    if (a(appendQueryParameter, fqcVar2, commonSupportWebConfigFactory$create$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Uri.Builder builder = (Uri.Builder) commonSupportWebConfigFactory$create$1.L$6;
                    tls tlsVar3 = (tls) commonSupportWebConfigFactory$create$1.L$4;
                    sls slsVar3 = (sls) commonSupportWebConfigFactory$create$1.L$3;
                    fqc fqcVar3 = (fqc) commonSupportWebConfigFactory$create$1.L$1;
                    b.b(obj);
                    tlsVar2 = tlsVar3;
                    slsVar2 = slsVar3;
                    appendQueryParameter = builder;
                    fqcVar2 = fqcVar3;
                }
                String b = ((g) this.h.get()).b();
                CoreWebViewConfig.a aVar2 = new CoreWebViewConfig.a();
                aVar2.b = appendQueryParameter.build().toString();
                aVar2.e = false;
                aVar2.c = b;
                aVar2.k = this.d;
                mc mcVar = this.n.a;
                aVar2.m = new com.yandex.go.support.web.b((zjw0) mcVar.a.get(), (wnt) mcVar.b.get(), slsVar2, tlsVar2);
                aVar2.o = true;
                if (fqcVar2 instanceof eqc) {
                    String Hg2 = ((h) this.g).Hg();
                    aVar2.b("X-YaTaxi-UserId", Hg2 != null ? Hg2 : "");
                }
                return new UiWebViewConfig(aVar2.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 3145718, null);
            }
        }
        commonSupportWebConfigFactory$create$1 = new CommonSupportWebConfigFactory$create$1(this, continuationImpl);
        Object obj3 = commonSupportWebConfigFactory$create$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebConfigFactory$create$1.label;
        if (i != 0) {
        }
        String b2 = ((g) this.h.get()).b();
        CoreWebViewConfig.a aVar22 = new CoreWebViewConfig.a();
        aVar22.b = appendQueryParameter.build().toString();
        aVar22.e = false;
        aVar22.c = b2;
        aVar22.k = this.d;
        mc mcVar2 = this.n.a;
        aVar22.m = new com.yandex.go.support.web.b((zjw0) mcVar2.a.get(), (wnt) mcVar2.b.get(), slsVar2, tlsVar2);
        aVar22.o = true;
        if (fqcVar2 instanceof eqc) {
        }
        return new UiWebViewConfig(aVar22.a(), null, false, false, false, false, null, false, false, null, false, false, null, null, null, 0, 0, false, false, null, false, false, 3145718, null);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(2:10|11)(2:23|24))(4:25|(1:27)(2:32|(1:34)(1:35))|(2:29|(1:31))|22)|12|(2:18|19)|22))|39|6|7|(0)(0)|12|(4:14|16|18|19)|22|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r5 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0089, code lost:
    
        throw r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(fqc fqcVar, ContinuationImpl continuationImpl) {
        CommonSupportWebConfigFactory$requestCity$1 commonSupportWebConfigFactory$requestCity$1;
        int i;
        pv0 pv0Var;
        List list;
        v7v0 v7v0Var;
        if (continuationImpl instanceof CommonSupportWebConfigFactory$requestCity$1) {
            commonSupportWebConfigFactory$requestCity$1 = (CommonSupportWebConfigFactory$requestCity$1) continuationImpl;
            int i2 = commonSupportWebConfigFactory$requestCity$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                commonSupportWebConfigFactory$requestCity$1.label = i2 - Integer.MIN_VALUE;
                Object obj = commonSupportWebConfigFactory$requestCity$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = commonSupportWebConfigFactory$requestCity$1.label;
                if (i != 0) {
                    b.b(obj);
                    RoutePointType routePointType = fqcVar instanceof aqc ? RoutePointType.SERVICE_CHARGERS : fqcVar instanceof dqc ? RoutePointType.SERVICE_SCOOTERS : null;
                    if (routePointType != null) {
                        tpr a = atd0.a((atd0) this.e.get(), ((gh00) ((ah00) this.b.get())).e.b(), routePointType);
                        commonSupportWebConfigFactory$requestCity$1.L$0 = null;
                        commonSupportWebConfigFactory$requestCity$1.L$1 = null;
                        commonSupportWebConfigFactory$requestCity$1.label = 1;
                        obj = e.A(a, commonSupportWebConfigFactory$requestCity$1);
                        if (obj == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                    return null;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                b.b(obj);
                pv0Var = (pv0) obj;
                if (pv0Var != null && (list = pv0Var.h) != null && (v7v0Var = (v7v0) kotlin.collections.a.R(list)) != null) {
                    return v7v0Var.k;
                }
                return null;
            }
        }
        commonSupportWebConfigFactory$requestCity$1 = new CommonSupportWebConfigFactory$requestCity$1(this, continuationImpl);
        Object obj2 = commonSupportWebConfigFactory$requestCity$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = commonSupportWebConfigFactory$requestCity$1.label;
        if (i != 0) {
        }
        pv0Var = (pv0) obj2;
        if (pv0Var != null) {
            return v7v0Var.k;
        }
        return null;
    }
}
