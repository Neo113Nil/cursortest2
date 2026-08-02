package yads;

import kotlin.Result;
import org.json.JSONObject;
import xsna.m9y;
import xsna.n9y;

/* loaded from: classes10.dex */
public abstract class yw0 {
    public static ww0 a(JSONObject jSONObject) {
        Object failure;
        m9y a = n9y.a(xw0.b);
        try {
            failure = (ww0) a.a(ww0.Companion.serializer(), jSONObject.toString());
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (ww0) failure;
    }
}
