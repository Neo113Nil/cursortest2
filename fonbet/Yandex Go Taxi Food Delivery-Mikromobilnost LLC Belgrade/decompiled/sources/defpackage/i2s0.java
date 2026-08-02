package defpackage;

import com.yandex.div.core.expression.variables.a;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class i2s0 {
    public final a a;
    public final LinkedHashMap b = new LinkedHashMap();

    public i2s0(a aVar) {
        this.a = aVar;
    }

    public static JSONObject b(LinkedHashMap linkedHashMap) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            jSONObject.put((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
        }
        return jSONObject;
    }

    public final void a(String str) {
        Boolean bool = Boolean.FALSE;
        LinkedHashMap linkedHashMap = this.b;
        linkedHashMap.put(str, bool);
        this.a.i(new w131("superapp.forced_shimmering_shortcuts", b(linkedHashMap)));
    }
}
