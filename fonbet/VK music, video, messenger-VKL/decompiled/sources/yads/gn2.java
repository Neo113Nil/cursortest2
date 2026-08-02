package yads;

import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class gn2 {
    public static en2 a(String str) {
        new fn2();
        JSONObject jSONObject = new JSONObject(ln.b(str));
        HashMap hashMap = new HashMap();
        String string = jSONObject.getString("body");
        JSONObject jSONObject2 = jSONObject.getJSONObject("headers");
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.getString(next));
        }
        return new en2(string, hashMap);
    }
}
