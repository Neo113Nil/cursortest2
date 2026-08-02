package yads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import kotlin.Result;
import kotlin.collections.builders.SetBuilder;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class en0 {
    public static String a(Set set) {
        if (set == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            cn0 cn0Var = (cn0) it.next();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("type", cn0Var.a.name());
            jSONObject.put("value", cn0Var.b);
            jSONArray = jSONArray.put(jSONObject);
        }
        if (jSONArray != null) {
            return jSONArray.toString();
        }
        return null;
    }

    public static Set a(JSONArray jSONArray) {
        Object failure;
        try {
            SetBuilder setBuilder = new SetBuilder();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                setBuilder.add(new cn0(dn0.valueOf(jSONObject.getString("type")), jSONObject.getString("value")));
            }
            failure = setBuilder.d();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Objects.toString(jSONArray);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Set) failure;
    }

    public static Set a(String str) {
        Object failure;
        try {
            failure = a(new JSONArray(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result.a(failure);
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Set) failure;
    }
}
