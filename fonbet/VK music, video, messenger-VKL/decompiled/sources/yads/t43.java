package yads;

import java.util.Map;
import java.util.Objects;
import kotlin.Result;
import org.json.JSONObject;
import xsna.alk;
import xsna.y9y;

/* loaded from: classes10.dex */
public final class t43 {
    public static Map a(JSONObject jSONObject) {
        Object failure;
        try {
            failure = je1.a(jSONObject);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (Result.a(failure) != null) {
            Objects.toString(jSONObject);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Map) failure;
    }

    public static String a(Map map) {
        Object failure;
        try {
            y9y y9yVar = new y9y();
            for (Map.Entry entry : map.entrySet()) {
                alk.u(y9yVar, (String) entry.getKey(), (String) entry.getValue());
            }
            failure = y9yVar.a().toString();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result.a(failure);
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (String) failure;
    }

    public static Map a(String str) {
        Object failure;
        try {
            failure = a(new JSONObject(str));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Result.a(failure);
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (Map) failure;
    }
}
