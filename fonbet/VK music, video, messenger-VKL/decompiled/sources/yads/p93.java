package yads;

import java.util.List;
import kotlin.Result;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import xsna.e43;

/* loaded from: classes10.dex */
public final class p93 {
    public static List a(JSONArray jSONArray) {
        Object failure;
        ListBuilder e = e43.e();
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            try {
                failure = jSONArray.getString(i);
            } catch (Throwable th) {
                failure = new Result.Failure(th);
            }
            if (!(failure instanceof Result.Failure)) {
                e.add((String) failure);
            }
        }
        return e.g();
    }
}
