package defpackage;

import java.util.LinkedHashSet;
import kotlin.Pair;
import kotlin.Result;
import org.json.JSONArray;

/* loaded from: classes7.dex */
public final class mz61 {
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
                new Pair(jSONArray.get(i), seu.D).toString();
            }
        }
        return linkedHashSet;
    }
}
