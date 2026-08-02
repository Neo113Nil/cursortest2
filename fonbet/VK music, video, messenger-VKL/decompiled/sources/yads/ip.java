package yads;

import android.text.Html;
import com.ironsource.O6;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.j8y;
import xsna.xn8;

/* loaded from: classes10.dex */
public final class ip {
    public final js1 a;
    public final j8y b;

    public /* synthetic */ ip() {
        this(new js1(), je1.a());
    }

    public final gb a(JSONObject jSONObject) {
        String valueOf;
        String string;
        try {
            try {
                j8y j8yVar = je1.a;
                string = jSONObject.getString("ad_unit_id");
            } catch (JSONException unused) {
                j8y j8yVar2 = je1.a;
                String string2 = jSONObject.getString("block_id");
                if (string2 == null || string2.length() == 0 || "null".equals(string2)) {
                    throw new JSONException("Json value can not be null or empty");
                }
                valueOf = String.valueOf(Html.fromHtml(string2));
            }
        } catch (JSONException unused2) {
        }
        if (string == null || string.length() == 0 || "null".equals(string)) {
            throw new JSONException("Json value can not be null or empty");
        }
        valueOf = String.valueOf(Html.fromHtml(string));
        JSONArray optJSONArray = jSONObject.optJSONArray(O6.E1);
        if (optJSONArray != null && optJSONArray.length() > 0) {
            ArrayList arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                rr1 a = this.a.a(optJSONArray.getJSONObject(i));
                if (a != null) {
                    arrayList.add(a);
                }
            }
            if (!arrayList.isEmpty()) {
                return new gb(valueOf, jSONObject.toString(), arrayList);
            }
        }
        return null;
    }

    public final hp b(JSONObject jSONObject) {
        JSONObject jSONObject2;
        ht1 ht1Var;
        String jSONObject3;
        try {
            jSONObject2 = jSONObject.getJSONObject("mediation_prefetch_settings");
        } catch (Exception unused) {
            jSONObject2 = null;
        }
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("ad_unit_id_settings");
            if (optJSONArray == null) {
                optJSONArray = jSONObject.optJSONArray("block_id_settings");
            }
            ArrayList arrayList = new ArrayList();
            if (optJSONArray != null && optJSONArray.length() > 0) {
                int length = optJSONArray.length();
                for (int i = 0; i < length; i++) {
                    gb a = a(optJSONArray.getJSONObject(i));
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            if (jSONObject2 != null && (jSONObject3 = jSONObject2.toString()) != null) {
                j8y j8yVar = this.b;
                j8yVar.getClass();
                ht1Var = (ht1) j8yVar.a(xn8.a(ht1.Companion.serializer()), jSONObject3);
                if (arrayList.isEmpty() || ht1Var != null) {
                    return new hp(arrayList, ht1Var);
                }
                return null;
            }
            ht1Var = null;
            if (arrayList.isEmpty()) {
            }
            return new hp(arrayList, ht1Var);
        } catch (JSONException unused2) {
            return null;
        }
    }

    public ip(js1 js1Var, j8y j8yVar) {
        this.a = js1Var;
        this.b = j8yVar;
    }
}
