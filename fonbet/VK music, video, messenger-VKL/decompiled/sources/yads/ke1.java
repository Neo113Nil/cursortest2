package yads;

import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public abstract class ke1 {
    public static final String a(String str, JSONObject jSONObject) {
        Object failure;
        try {
            failure = jSONObject.getString(str);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }
}
