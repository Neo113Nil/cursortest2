package yads;

import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public final class ic {
    public final jp2 a;

    public ic(bu1 bu1Var) {
        this.a = bu1Var;
    }

    public static jk a(JSONObject jSONObject) {
        Object failure;
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.getString("attributes"));
            failure = new jk(jSONObject2.getString("campaignId"), jSONObject2.getString("bannerId"), jSONObject2.getString("placeId"));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        return (jk) failure;
    }
}
