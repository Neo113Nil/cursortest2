package xsna;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public abstract class r4z0 {
    public static JSONObject a(String str, ArrayList arrayList) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.putOpt("form_id", str);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ymx ymxVar = (ymx) it.next();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("block_id", ymxVar.a);
            List<String> list = ymxVar.b;
            if (list != null && !list.isEmpty()) {
                JSONArray jSONArray2 = new JSONArray();
                for (String str2 : list) {
                    if (str2 != null) {
                        jSONArray2.put(str2);
                    }
                }
                jSONObject2.put("answer_ids", jSONArray2);
            }
            if (!TextUtils.isEmpty(null)) {
                jSONObject2.put("answer_text", (Object) null);
            }
            jSONArray.put(jSONObject2);
        }
        jSONObject.putOpt("answers", jSONArray);
        return jSONObject;
    }
}
