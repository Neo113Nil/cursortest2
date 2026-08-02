package defpackage;

import android.net.Uri;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.yandex.passport.internal.ui.authsdk.AuthSdkActivity;
import io.appmetrica.analytics.RtmErrorEvent;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.a;
import org.json.JSONObject;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes8.dex */
public abstract class erp0 {
    public static final LinkedHashMap a(JSONObject jSONObject, JSONObject jSONObject2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            linkedHashMap.put(next, Integer.valueOf(next.length() + jSONObject.optString(next).length()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.Result$Failure] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [org.json.JSONObject] */
    public static final JSONObject b(JSONObject jSONObject, w42 w42Var) {
        ?? failure;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                linkedHashMap.put(next, jSONObject.opt(next));
            }
            Map v = bvf0.v(linkedHashMap, w42Var.a(), w42Var.b());
            failure = new JSONObject();
            for (Map.Entry entry : v.entrySet()) {
                failure.put((String) entry.getKey(), entry.getValue());
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            x4c.g("Failed to filter sensitive data", a, null, Collections.singletonList(nrp0.b), 4);
        }
        if (!(failure instanceof Result.Failure)) {
            jSONObject = failure;
        }
        return jSONObject;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r18v5, types: [kll0] */
    public static final kll0 c(crp0 crp0Var, qhl0 qhl0Var, eqp0 eqp0Var, w42 w42Var) {
        String localizedMessage;
        int length;
        Object next;
        String str;
        String obj;
        JSONObject put;
        JSONObject put2 = vng.D(new JSONObject(), qhl0Var).put("errorType", crp0Var.a).put("url", crp0Var.d());
        Throwable b = crp0Var.b();
        String str2 = null;
        JSONObject put3 = put2.put(Constants.KEY_EXCEPTION, b != null ? b.toString() : null);
        if (crp0Var instanceof jqp0) {
            jqp0 jqp0Var = (jqp0) crp0Var;
            Throwable th = jqp0Var.c;
            put3.put("name", th.getClass().getCanonicalName()).put("exceptionMessage", th.getMessage());
            String str3 = jqp0Var.f;
            if (str3 != null) {
                put3.put("tags", str3);
            }
        } else if (crp0Var instanceof mqp0) {
            String e = ((mqp0) crp0Var).e();
            if (e != null) {
                put3.put("tags", e);
            }
        } else if (crp0Var instanceof nqp0) {
            nqp0 nqp0Var = (nqp0) crp0Var;
            put3.put(AuthSdkActivity.RESPONSE_TYPE_CODE, nqp0Var.e()).put(Constants.KEY_MESSAGE, nqp0Var.f()).put("traceId", nqp0Var.h()).put("retryPolicyId", nqp0Var.g());
        } else if (crp0Var instanceof tqp0) {
            tqp0 tqp0Var = (tqp0) crp0Var;
            put3.put("traceId", tqp0Var.f()).put("retryPolicyId", tqp0Var.e());
        } else if (crp0Var instanceof qqp0) {
            put3.put(Constants.KEY_MESSAGE, ((qqp0) crp0Var).e());
        } else if (crp0Var instanceof gqp0) {
            gqp0 gqp0Var = (gqp0) crp0Var;
            put3.put("mode", gqp0Var.e()).put("isBiometricEncrypt", gqp0Var.f());
        } else if (crp0Var instanceof rqp0) {
            put3.put("mode", ((rqp0) crp0Var).e());
        } else if (crp0Var instanceof sqp0) {
            sqp0 sqp0Var = (sqp0) crp0Var;
            put3.put("key", sqp0Var.e()).put("isLocal", sqp0Var.f());
        } else if (crp0Var instanceof kqp0) {
            kqp0 kqp0Var = (kqp0) crp0Var;
            put3.put("imageUrl", kqp0Var.e()).put("originalException", kqp0Var.f()).put("requestData", kqp0Var.g()).put(Constants.KEY_EXCEPTION, (Object) null);
        } else if (crp0Var instanceof iqp0) {
            put3.put("screenKey", ((iqp0) crp0Var).e());
        } else if (crp0Var instanceof oqp0) {
            oqp0 oqp0Var = (oqp0) crp0Var;
            put3.put("name", oqp0Var.b().getClass().getCanonicalName()).put("traceId", oqp0Var.f()).put("retryPolicyId", oqp0Var.e());
        } else if (crp0Var instanceof uqp0) {
            uqp0 uqp0Var = (uqp0) crp0Var;
            put3.put(Constants.KEY_MESSAGE, uqp0Var.f()).put(ErrorResponseData.JSON_ERROR_CODE, uqp0Var.e()).put("reasonCode", uqp0Var.g()).put("reasonMessage", uqp0Var.h());
        } else if (crp0Var instanceof brp0) {
            brp0 brp0Var = (brp0) crp0Var;
            put3.put(AuthSdkActivity.RESPONSE_TYPE_CODE, brp0Var.e()).put(Constants.KEY_MESSAGE, brp0Var.f()).put("traceId", brp0Var.g());
            Throwable b2 = brp0Var.b();
            if (b2 != null && (localizedMessage = b2.getLocalizedMessage()) != null) {
                put3.put("exceptionMessage", localizedMessage);
            }
        } else if (crp0Var instanceof arp0) {
            arp0 arp0Var = (arp0) crp0Var;
            put3.put(AuthSdkActivity.RESPONSE_TYPE_CODE, arp0Var.e()).put(Constants.KEY_MESSAGE, arp0Var.f()).put("traceId", arp0Var.g());
        } else if (crp0Var instanceof vqp0) {
            vqp0 vqp0Var = (vqp0) crp0Var;
            put3.put("traceId", vqp0Var.i()).put("title", vqp0Var.h()).put(DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, vqp0Var.e()).put("supportUrl", vqp0Var.f()).put("techInfo", vqp0Var.g());
        } else if (crp0Var instanceof zqp0) {
            put3.put(Constants.KEY_MESSAGE, "Untrusted uri in deeplink");
        } else if (crp0Var instanceof yqp0) {
            put3.put(Constants.KEY_MESSAGE, ((yqp0) crp0Var).e());
        } else if (crp0Var instanceof fqp0) {
            put3.put("eventName", ((fqp0) crp0Var).e()).put(Constants.KEY_MESSAGE, "failed to map event name to adjust token");
        } else if (crp0Var instanceof hqp0) {
            hqp0 hqp0Var = (hqp0) crp0Var;
            put3.put(Constants.KEY_MESSAGE, hqp0Var.f());
            put3.put("deeplinkSource", hqp0Var.e());
        } else if (crp0Var instanceof wqp0) {
            wqp0 wqp0Var = (wqp0) crp0Var;
            put3.put("imageSizeInKb", wqp0Var.f()).put("url", wqp0Var.d()).put("headers", wqp0Var.e());
        } else if (crp0Var instanceof xqp0) {
            put3.put(Constants.KEY_MESSAGE, "Unknown query parameters in the deeplink");
            put3.put("deeplinkSource", ((xqp0) crp0Var).e());
        } else if (crp0Var instanceof pqp0) {
            put3.put("deeplinkSource", ((pqp0) crp0Var).e());
        } else {
            if (!(crp0Var instanceof lqp0)) {
                w511.b();
                return null;
            }
            put3.put("url", ((lqp0) crp0Var).d());
        }
        Object c = crp0Var.c();
        if (c != null && (obj = c.toString()) != null && (put = put3.put("payload", obj)) != null) {
            put3 = put;
        }
        RtmErrorEvent.Builder withVersion = RtmErrorEvent.newBuilder(crp0Var.a()).withSource(qhl0Var.a).withVersion("0.233.1");
        JSONObject b3 = b(put3, w42Var);
        int i = eqp0Var.e;
        if (eqp0Var.d && (length = b3.toString().length() - i) > 0) {
            List<String> list = eqp0Var.f;
            ArrayList arrayList = new ArrayList();
            for (String str4 : list) {
                String optString = b3.optString(str4);
                if (evu0.J(optString)) {
                    optString = null;
                }
                Pair pair = optString != null ? new Pair(str4, optString) : null;
                if (pair != null) {
                    arrayList.add(pair);
                }
            }
            int d = gw00.d(tcc.n(arrayList, 10));
            if (d < 16) {
                d = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(d);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                linkedHashMap.put(pair2.c(), pair2.f());
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            if (!linkedHashMap2.isEmpty()) {
                Iterator it2 = linkedHashMap2.values().iterator();
                int i2 = 0;
                while (it2.hasNext()) {
                    i2 += ((String) it2.next()).length();
                }
                int i3 = i2 - length;
                if (i3 < 0) {
                    i3 = 0;
                }
                int size = ((int) (length / linkedHashMap2.size())) + 1;
                while (true) {
                    Iterator it3 = linkedHashMap2.values().iterator();
                    int i4 = 0;
                    while (it3.hasNext()) {
                        i4 = ((String) it3.next()).length() + i4;
                    }
                    if (i4 > i3) {
                        Iterator it4 = linkedHashMap2.entrySet().iterator();
                        if (!it4.hasNext()) {
                            ?? r18 = str2;
                            ny61.p();
                            return r18;
                        }
                        Object next2 = it4.next();
                        if (it4.hasNext()) {
                            int length2 = ((String) ((Map.Entry) next2).getValue()).length();
                            while (true) {
                                Object next3 = it4.next();
                                str = str2;
                                int length3 = ((String) ((Map.Entry) next3).getValue()).length();
                                if (length2 < length3) {
                                    length2 = length3;
                                    next2 = next3;
                                }
                                if (!it4.hasNext()) {
                                    break;
                                }
                                str2 = str;
                            }
                        } else {
                            str = str2;
                        }
                        Map.Entry entry = (Map.Entry) next2;
                        linkedHashMap2.put((String) entry.getKey(), gvu0.t0(size, (String) entry.getValue()));
                        str2 = str;
                    } else {
                        String str5 = str2;
                        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                            String str6 = (String) entry2.getKey();
                            String str7 = (String) entry2.getValue();
                            if (evu0.J(str7)) {
                                b3.remove(str6);
                            } else {
                                b3.put(str6, str7);
                            }
                        }
                        if (b3.toString().length() - i > 0) {
                            LinkedHashMap a = a(b3, b3);
                            Iterator it5 = a.entrySet().iterator();
                            if (it5.hasNext()) {
                                next = it5.next();
                                if (it5.hasNext()) {
                                    int intValue = ((Number) ((Map.Entry) next).getValue()).intValue();
                                    while (true) {
                                        Object next4 = it5.next();
                                        int intValue2 = ((Number) ((Map.Entry) next4).getValue()).intValue();
                                        if (intValue < intValue2) {
                                            next = next4;
                                            intValue = intValue2;
                                        }
                                        if (!it5.hasNext()) {
                                            break;
                                        }
                                        str5 = null;
                                    }
                                }
                            } else {
                                next = str5;
                            }
                            Map.Entry entry3 = (Map.Entry) next;
                            if (jl40.l(entry3 != null ? (String) entry3.getKey() : str5, "url")) {
                                try {
                                    b3.put("url", evu0.S("/", Uri.parse(b3.optString("url")).buildUpon().clearQuery().toString()));
                                    if (b3.toString().length() > i) {
                                        a = a(b3, b3);
                                    }
                                } catch (Exception e2) {
                                    x4c.g("Failed to trim url", e2, b3.optString("url"), str5, 8);
                                }
                            }
                            ArrayList arrayList2 = new ArrayList();
                            for (Map.Entry entry4 : a.x0(a.entrySet(), new drp0())) {
                                String optString2 = b3.optString((String) entry4.getKey());
                                if (!eqp0Var.h.contains(entry4.getKey())) {
                                    int length4 = optString2.length();
                                    int i5 = eqp0Var.g;
                                    if (length4 > i5) {
                                        b3.put((String) entry4.getKey(), gvu0.A0(i5, optString2));
                                        arrayList2.add(entry4.getKey());
                                        b3.put("truncated", arrayList2);
                                        if (b3.toString().length() <= i) {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        RtmErrorEvent.Builder withUrl = withVersion.withAdditional(b3.toString()).withUrl(crp0Var.d());
        Throwable b4 = crp0Var.b();
        return new kll0(withUrl.withStacktrace(b4 != null ? ljo.b(b4) : null).build(), put3, b(put3, w42Var));
    }
}
