package defpackage;

import android.net.Uri;
import kotlin.Result;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class a471 {
    public static s071 a(egk egkVar) {
        Object failure;
        bpk a = rp71.a(egkVar, "click");
        if (a == null) {
            return null;
        }
        try {
            JSONObject jSONObject = a.b;
            String string = jSONObject != null ? jSONObject.getString("url") : null;
            failure = string != null ? Uri.parse(string) : null;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri != null) {
            return new s071(uri);
        }
        return null;
    }
}
