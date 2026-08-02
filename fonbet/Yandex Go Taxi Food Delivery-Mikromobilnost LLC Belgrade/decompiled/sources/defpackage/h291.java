package defpackage;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import yads.qr1;
import yads.yo;
import yads.z9;
import yads.zp1;

/* loaded from: classes7.dex */
public final class h291 {
    public final dd81 a;
    public final zcx b;

    public h291() {
        dd81 dd81Var = new dd81();
        zcx zcxVar = xf71.a;
        this.a = dd81Var;
        this.b = zcxVar;
    }

    public final z9 a(JSONObject jSONObject) {
        String string;
        try {
            try {
                zcx zcxVar = xf71.a;
                string = jSONObject.getString("ad_unit_id");
            } catch (JSONException unused) {
                zcx zcxVar2 = xf71.a;
                string = jSONObject.getString("block_id");
                if (string == null || string.length() == 0 || "null".equals(string)) {
                    throw new JSONException("Json value can not be null or empty");
                }
            }
        } catch (JSONException unused2) {
        }
        if (string == null || string.length() == 0 || "null".equals(string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("networks");
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
                this.a.getClass();
                zp1 b = dd81.b(jSONObject2);
                if (b != null) {
                    arrayList.add(b);
                }
            }
            if (!arrayList.isEmpty()) {
                return new z9(string, jSONObject.toString(), arrayList);
            }
        }
        return null;
    }

    public final yo b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        qr1 qr1Var;
        String jSONObject3;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    z9 a = a(optJSONArray.getJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            if (jSONObject2 != null && (jSONObject3 = jSONObject2.toString()) != null) {
                zcx zcxVar = this.b;
                zcxVar.getClass();
                qr1Var = (qr1) zcxVar.b(qke.n(qr1.CREATOR.serializer()), jSONObject3);
                if (arrayList.isEmpty() || qr1Var != null) {
                    return new yo(arrayList, qr1Var);
                }
                return null;
            }
            qr1Var = null;
            if (arrayList.isEmpty()) {
            }
            return new yo(arrayList, qr1Var);
        } catch (JSONException unused2) {
            return null;
        }
    }
}
