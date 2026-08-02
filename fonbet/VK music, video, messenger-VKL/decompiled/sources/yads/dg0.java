package yads;

import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dli0;
import xsna.t5j;
import xsna.uki0;

/* loaded from: classes10.dex */
public final class dg0 {
    public final d51 a;
    public final bf b;

    public /* synthetic */ dg0() {
        this(new d51(), new bf());
    }

    public final xf0 a(JSONObject jSONObject) {
        ArrayList arrayList;
        LinkedHashMap linkedHashMap;
        String optString = jSONObject.optString("type");
        String optString2 = jSONObject.optString("target");
        String optString3 = jSONObject.optString(TtmlNode.TAG_LAYOUT);
        if (optString == null || optString.length() == 0 || optString2 == null || optString2.length() == 0 || optString3 == null || optString3.length() == 0) {
            return null;
        }
        JSONArray optJSONArray = jSONObject.optJSONArray("images");
        if (optJSONArray != null) {
            d51 d51Var = this.a;
            d51Var.getClass();
            ArrayList arrayList2 = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                arrayList2.add(d51Var.a.a(optJSONArray.getJSONObject(i)));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("analyticsParameters");
        if (optJSONObject != null) {
            this.b.getClass();
            uki0 c = dli0.c(optJSONObject.keys());
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it = ((t5j) c).iterator();
            while (it.hasNext()) {
                Object next = it.next();
                linkedHashMap2.put(next, optJSONObject.get((String) next));
            }
            linkedHashMap = linkedHashMap2;
        } else {
            linkedHashMap = null;
        }
        return new xf0(optString, optString2, optString3, arrayList, linkedHashMap);
    }

    public dg0(d51 d51Var, bf bfVar) {
        this.a = d51Var;
        this.b = bfVar;
    }
}
