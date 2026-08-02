package yads;

import com.ironsource.C4641xe;
import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class d {
    public static c a(String str) {
        if (str == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new c(jSONObject.getString(C4641xe.d), a(jSONObject.getJSONArray("test_ids")));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static LinkedHashSet a(JSONArray jSONArray) {
        Object failure;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                failure = Boolean.valueOf(linkedHashSet.add(Long.valueOf(jSONArray.getLong(i))));
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (Result.a(failure) != null) {
                new Pair(jSONArray.get(i), xsna.sp.g).toString();
            }
        }
        return linkedHashSet;
    }
}
