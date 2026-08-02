package defpackage;

import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public abstract class lwq {
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final JSONObject a(dtf dtfVar) {
        JSONObject jSONObject;
        JSONArray jSONArray;
        String str;
        JSONArray jSONArray2 = new JSONArray();
        List list = dtfVar.a;
        ArrayList arrayList = new ArrayList(tcc.n(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ctf ctfVar = (ctf) it.next();
            JSONObject jSONObject2 = new JSONObject();
            String str2 = ctfVar.a;
            kq4 kq4Var = ctfVar.f;
            JSONObject put = jSONObject2.put("methodType", str2).put("methodBank", ctfVar.b).put("title", ctfVar.c).put("subtitle", kq4Var != null ? "" : ctfVar.d).putOpt("currency", kq4Var != null ? kq4Var.b : null).put("balanceValue", kq4Var != null ? Integer.valueOf(kq4Var.a.intValue()) : null).put("logoUrl", ctfVar.e).put("titleTrailingIconUrl", ctfVar.i);
            List list2 = ctfVar.j;
            if (list2 != null) {
                List list3 = list2;
                if (list3.isEmpty()) {
                    list3 = null;
                }
                List list4 = list3;
                if (list4 != null) {
                    jSONArray = new JSONArray();
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        jSONArray.put((String) it2.next());
                    }
                    JSONObject put2 = put.put("restrictions", jSONArray).put("errorRespCode", ctfVar.k);
                    str = ctfVar.l;
                    if (str == null) {
                        r6 = new JSONObject(str);
                    }
                    put2.putOpt("payload", r6);
                    arrayList.add(put2);
                }
            }
            jSONArray = null;
            JSONObject put22 = put.put("restrictions", jSONArray).put("errorRespCode", ctfVar.k);
            str = ctfVar.l;
            if (str == null) {
            }
            put22.putOpt("payload", r6);
            arrayList.add(put22);
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            jSONArray2.put((JSONObject) it3.next());
        }
        Map map = dtfVar.g;
        if (map != null) {
            jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                jSONObject.put((String) entry.getKey(), (String) entry.getValue());
            }
        } else {
            jSONObject = null;
        }
        JSONObject put3 = new JSONObject().put("template", "SelectMethodScreen").put("lang", Locale.getDefault().getLanguage());
        JSONObject putOpt = new JSONObject().put("paymentMethods", jSONArray2).put("selectedPosition", dtfVar.b).put("canShowPromo", dtfVar.c).putOpt("orderAmount", dtfVar.d).putOpt("metaJson", dtfVar.f);
        String str3 = dtfVar.e;
        if (str3 == null) {
            str3 = "RUB";
        }
        JSONObject putOpt2 = putOpt.put("currency", str3).putOpt("legalUrlsMap", jSONObject);
        String str4 = dtfVar.h;
        putOpt2.putOpt("payload", str4 != null ? new JSONArray(str4) : null);
        return put3.put(Constants.KEY_DATA, putOpt2);
    }
}
