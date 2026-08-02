package defpackage;

import com.adjust.sdk.Constants;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.expression.BduiExpressionResolverImpl;
import com.yandex.fintechsdk.flows.payment.kit.api.model.TransportCardParams;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.Scenario;
import com.yandex.fintechsdk.flows.payment.kit.internal.model.a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.b;

/* loaded from: classes12.dex */
public final class b1m0 implements w6k {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ b1m0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // defpackage.w6k
    public final void a(p6k p6kVar, w3k w3kVar, apk apkVar) {
        Pair pair;
        String obj;
        Map s;
        Pair pair2;
        String obj2;
        String str;
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                Map map = w3kVar.a;
                ArrayList arrayList = new ArrayList();
                for (Map.Entry entry : map.entrySet()) {
                    String str2 = (String) entry.getKey();
                    Object value = entry.getValue();
                    if (value == null || (obj = value.toString()) == null) {
                        pair = null;
                    } else {
                        Object mo102resolveStringgIAlus = apkVar.mo102resolveStringgIAlus(obj, BduiExpressionResolverImpl.EXPRESSION_KEY);
                        if (Result.a(mo102resolveStringgIAlus) == null) {
                            obj = mo102resolveStringgIAlus;
                        }
                        pair = new Pair(str2, obj);
                    }
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                }
                ((v351) obj3).a(b.s(arrayList));
                break;
            case 1:
                Map map2 = w3kVar.a;
                Object obj4 = map2.get("event_name");
                String str3 = obj4 instanceof String ? (String) obj4 : null;
                if (str3 != null) {
                    Object mo102resolveStringgIAlus2 = apkVar.mo102resolveStringgIAlus(str3, BduiExpressionResolverImpl.EXPRESSION_KEY);
                    if (Result.a(mo102resolveStringgIAlus2) == null) {
                        String str4 = (String) mo102resolveStringgIAlus2;
                        Object obj5 = map2.get("params");
                        Map map3 = obj5 instanceof Map ? (Map) obj5 : null;
                        if (map3 == null) {
                            s = b.f();
                        } else {
                            ArrayList arrayList2 = new ArrayList();
                            for (Map.Entry entry2 : map3.entrySet()) {
                                Object key = entry2.getKey();
                                Object value2 = entry2.getValue();
                                if (value2 == null || (obj2 = value2.toString()) == null) {
                                    pair2 = null;
                                } else {
                                    String valueOf = String.valueOf(key);
                                    Object mo102resolveStringgIAlus3 = apkVar.mo102resolveStringgIAlus(obj2, BduiExpressionResolverImpl.EXPRESSION_KEY);
                                    if (Result.a(mo102resolveStringgIAlus3) == null) {
                                        obj2 = mo102resolveStringgIAlus3;
                                    }
                                    pair2 = new Pair(valueOf, obj2);
                                }
                                if (pair2 != null) {
                                    arrayList2.add(pair2);
                                }
                            }
                            s = b.s(arrayList2);
                        }
                        sr4 sr4Var = (sr4) obj3;
                        i3a0 i3a0Var = new i3a0(str4, s);
                        sr4Var.getClass();
                        lz40 lz40Var = (lz40) a.l.a.get(((v2a0) sr4Var.b).a);
                        if (lz40Var != null) {
                            lz40Var.g(i3a0Var);
                            break;
                        }
                    }
                }
                break;
            default:
                jsi0 jsi0Var = (jsi0) obj3;
                Map map4 = w3kVar.a;
                Object obj6 = map4.get("scenario");
                String str5 = obj6 instanceof String ? (String) obj6 : null;
                if (str5 != null) {
                    switch (str5.hashCode()) {
                        case -1779512647:
                            if (str5.equals("bind_sbp_token")) {
                                jsi0Var.b.startActivity(jsi0Var.a.a(new Scenario.SbpTokenBinding(null)).putExtra("PAYMENT_KIT.IS_BOTTOM_SHEET", true));
                                break;
                            }
                            break;
                        case -930533934:
                            if (str5.equals("bind_card")) {
                                jsi0Var.b.startActivity(jsi0Var.a.a(new Scenario.CardBinding(null)).putExtra("PAYMENT_KIT.IS_BOTTOM_SHEET", true));
                                break;
                            }
                            break;
                        case 581261306:
                            if (str5.equals("dynamic_link")) {
                                Object obj7 = map4.get(Constants.DEEPLINK);
                                str = obj7 instanceof String ? (String) obj7 : null;
                                if (str != null) {
                                    jsi0Var.b.startActivity(jsi0Var.a.b(str));
                                    break;
                                }
                            }
                            break;
                        case 1052964649:
                            if (str5.equals("transport")) {
                                Object obj8 = map4.get(Constants.DEEPLINK);
                                str = obj8 instanceof String ? (String) obj8 : null;
                                if (str != null) {
                                    jsi0Var.b.startActivity(jsi0Var.a.a(new Scenario.TransportCards(new TransportCardParams(b.f(), str))).putExtra("PAYMENT_KIT.IS_BOTTOM_SHEET", false));
                                    break;
                                }
                            }
                            break;
                    }
                }
                break;
        }
    }
}
