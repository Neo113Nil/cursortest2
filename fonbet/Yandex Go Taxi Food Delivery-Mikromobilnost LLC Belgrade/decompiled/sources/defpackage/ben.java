package defpackage;

import com.yandex.fintechsdk.flows.applink.payment.internal.di.paymentform.features.bdui.action.finish.FinishFlowStatus;
import com.yandex.go.analytics.SimpleOrderAddressAnalyticsData;
import com.yandex.go.order.external.tracking.c;
import com.yandex.go.order.external.tracking.h;
import com.yandex.go.superapp.order_tracking.api.data.OrderTrackingService$External$PreferredTrackingType;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.eats_commons.EatsService;
import ru.yandex.taxi.superapp.j;

/* loaded from: classes5.dex */
public final class ben implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ j b;

    public /* synthetic */ ben(j jVar, int i) {
        this.a = i;
        this.b = jVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        j jVar;
        gcn gcnVar;
        zy11 zy11Var;
        String str;
        h1p h1pVar;
        Object obj3;
        rwq0 rwq0Var;
        int i = this.a;
        zy11 zy11Var2 = zy11.a;
        j jVar2 = this.b;
        switch (i) {
            case 0:
                jVar2.b((gcn) obj2);
                return zy11Var2;
            default:
                gcn gcnVar2 = (gcn) obj2;
                rwq0 rwq0Var2 = (rwq0) obj;
                String str2 = rwq0Var2.a;
                hgn hgnVar = jVar2.c;
                h1p h1pVar2 = jVar2.b;
                i0t i0tVar = (i0t) hgnVar.a.get(h1pVar2);
                if (i0tVar != null) {
                    yrv0 yrv0Var = jVar2.d;
                    String str3 = str2 == null ? "UNKNOWN" : str2;
                    yrv0Var.getClass();
                    f0t f0tVar = i0tVar.a;
                    LinkedHashMap b = new SimpleOrderAddressAnalyticsData(new zzs(f0tVar.a, f0tVar.b, 0, null, null, 28), null, "UNKNOWN", null, yrv0Var.d.b().b(), null).b();
                    v8w0 v8w0Var = yrv0Var.f;
                    String b2 = yrv0Var.b();
                    String value = h1pVar2.getValue();
                    Object obj4 = b.get("api_endpoint");
                    String str4 = obj4 instanceof String ? (String) obj4 : null;
                    Object obj5 = b.get("coordinate");
                    Map map = obj5 instanceof Map ? (Map) obj5 : null;
                    gcnVar = gcnVar2;
                    Object obj6 = b.get(MetaDataField.SCREEN_FIELD);
                    zy11Var = zy11Var2;
                    String str5 = obj6 instanceof String ? (String) obj6 : null;
                    str = str2;
                    Object obj7 = b.get("myLocation");
                    h1pVar = h1pVar2;
                    Map map2 = obj7 instanceof Map ? (Map) obj7 : null;
                    jVar = jVar2;
                    Object obj8 = b.get("method");
                    String str6 = obj8 instanceof String ? (String) obj8 : null;
                    Object obj9 = b.get("original_coordinate");
                    Map map3 = obj9 instanceof Map ? (Map) obj9 : null;
                    Object obj10 = b.get("action");
                    String str7 = obj10 instanceof String ? (String) obj10 : null;
                    Object obj11 = b.get("clarify_point");
                    Boolean bool = obj11 instanceof Boolean ? (Boolean) obj11 : null;
                    Object obj12 = b.get("pin_drop_trace_id");
                    String str8 = obj12 instanceof String ? (String) obj12 : null;
                    Object obj13 = b.get("pickup_point_id");
                    String str9 = obj13 instanceof String ? (String) obj13 : null;
                    v8w0Var.getClass();
                    HashMap hashMap = new HashMap();
                    String str10 = str9;
                    if (b2 != null) {
                        hashMap.put("originScreen", b2);
                    }
                    obj3 = Constants.KEY_SERVICE;
                    if (value != null) {
                        hashMap.put(obj3, value);
                    }
                    hashMap.put("superappOrder", str3);
                    if (str4 != null) {
                        hashMap.put("api_endpoint", str4);
                    }
                    if (map != null) {
                        hashMap.put("coordinate", map);
                    }
                    if (str5 != null) {
                        hashMap.put(MetaDataField.SCREEN_FIELD, str5);
                    }
                    if (map2 != null) {
                        hashMap.put("myLocation", map2);
                    }
                    if (str6 != null) {
                        hashMap.put("method", str6);
                    }
                    if (map3 != null) {
                        hashMap.put("original_coordinate", map3);
                    }
                    if (str7 != null) {
                        hashMap.put("action", str7);
                    }
                    if (bool != null) {
                        hashMap.put("clarify_point", bool);
                    }
                    if (str8 != null) {
                        hashMap.put("pin_drop_trace_id", str8);
                    }
                    if (str10 != null) {
                        hashMap.put("pickup_point_id", str10);
                    }
                    v8w0Var.a.a("Superapp.AddressChanged", hashMap, 1, new HashMap());
                    rwq0Var = rwq0Var2;
                } else {
                    jVar = jVar2;
                    gcnVar = gcnVar2;
                    zy11Var = zy11Var2;
                    str = str2;
                    h1pVar = h1pVar2;
                    obj3 = Constants.KEY_SERVICE;
                    rwq0Var = rwq0Var2;
                }
                boolean l = jl40.l(rwq0Var.e, Boolean.FALSE);
                j jVar3 = jVar;
                h1p h1pVar3 = h1pVar;
                boolean z = ((a6w0) jVar3.i).a(h1pVar3).b != OrderTrackingService$External$PreferredTrackingType.WEB;
                h hVar = jVar3.g;
                ky11 ky11Var = hVar.b;
                if (h1pVar3 == EatsService.EATS || h1pVar3 == EatsService.GROCERY || h1pVar3 == EatsService.PHARMACY || h1pVar3 == EatsService.SHOP || h1pVar3 == EatsService.CORP_FOOD || (h1pVar3 instanceof f7n)) {
                    String str11 = str;
                    if (str11 != null) {
                        hVar.h.a.b(str11, h1pVar3.getValue(), "");
                        if (hVar.j.a.put(str11, h1pVar3) != null) {
                            jst.e.n("SuperAppOrderTracking: add already existed pending order [" + h1pVar3 + "]");
                        }
                        hVar.b(hVar.r, true, false);
                    }
                    f3p f3pVar = hVar.g;
                    c cVar = (c) hVar.l.getValue();
                    f3pVar.getClass();
                    if (str11 == null || str11.length() == 0) {
                        jst.e.j(new IllegalArgumentException("SuperAppOrderTracking: Missing actual order id"));
                    } else {
                        cVar.getClass();
                        ren b3 = cVar.b(h1pVar3);
                        if (str11.equals(b3 != null ? b3.g() : null)) {
                            v8w0 v8w0Var2 = f3pVar.a;
                            String value2 = h1pVar3.getValue();
                            v8w0Var2.getClass();
                            HashMap hashMap2 = new HashMap();
                            if (value2 != null) {
                                hashMap2.put(obj3, value2);
                            }
                            v8w0Var2.a.a("Superapp.OrdersTracking.AlreadyKnownAtCreation", hashMap2, 1, tse0.r(FinishFlowStatus.ORDER_ID_FIELD_NAME, hashMap2, str11));
                        } else {
                            cVar.a(new e3p(f3pVar, cVar, str11, h1pVar3));
                        }
                    }
                    ky11Var.e(str11, new py11(h1pVar3));
                } else {
                    if (h1pVar3 != EatsService.MARKET && h1pVar3 != EatsService.MARKET_VIEWER) {
                        w511.b();
                        return null;
                    }
                    ky11Var.e(str, new py11(h1pVar3));
                }
                if (!l && z) {
                    jVar3.k.p();
                }
                if (!l) {
                    ic00 ic00Var = ((kc00) jVar3.h).a;
                    ic00Var.getClass();
                    if (!(ic00Var instanceof hc00)) {
                        jVar3.l.f(h1pVar3);
                    }
                }
                zy11 zy11Var3 = zy11Var;
                gcnVar.a(new ck7(zy11Var3, null));
                return zy11Var3;
        }
    }
}
