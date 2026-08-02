package yads;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.e43;
import xsna.j8y;
import xsna.n9y;

/* loaded from: classes10.dex */
public abstract class je1 {
    public static final j8y a = n9y.a(ie1.b);

    public static final Integer a(String str, JSONObject jSONObject) {
        Object failure;
        try {
            failure = Integer.valueOf(jSONObject.getInt(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Integer) failure;
    }

    public static List b(String str, JSONObject jSONObject) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray == null || optJSONArray.length() <= 0) {
            return null;
        }
        ListBuilder e = e43.e();
        int length = optJSONArray.length();
        for (int i = 0; i < length; i++) {
            String optString = optJSONArray.optString(i);
            if (optString != null && optString.length() != 0 && !"null".equals(optString)) {
                e.add(optString);
            }
        }
        return e.g();
    }

    public static j8y a() {
        return a;
    }

    public static final JSONObject a(String str) {
        Object failure;
        try {
            failure = new JSONObject(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (JSONObject) failure;
    }

    public static Map a(JSONObject jSONObject) {
        MapBuilder mapBuilder = new MapBuilder();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString = jSONObject.optString(next);
            if (optString != null && optString.length() != 0 && !"null".equals(optString)) {
                mapBuilder.put(next, optString);
            }
        }
        return mapBuilder.h();
    }
}
