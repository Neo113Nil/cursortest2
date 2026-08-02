package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.sequences.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class pp61 {
    public final p271 a;
    public final km71 b;

    public pp61() {
        p271 p271Var = new p271();
        km71 km71Var = new km71();
        this.a = p271Var;
        this.b = km71Var;
    }

    public final ap81 a(JSONObject jSONObject) {
        ArrayList arrayList;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("target");
        String optString3 = jSONObject.optString("layout");
        LinkedHashMap linkedHashMap = null;
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            p271 p271Var = this.a;
            p271Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(p271Var.a.a(optJSONArray.getJSONObject(i)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("analyticsParameters");
        if (optJSONObject != null) {
            this.b.getClass();
            qrq0 b = a.b(optJSONObject.keys());
            linkedHashMap = new LinkedHashMap();
            Iterator it = ((a7e) b).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap.put(next, optJSONObject.get((String) next));
            }
        }
        return new ap81(optString, optString2, optString3, arrayList, linkedHashMap);
    }
}
