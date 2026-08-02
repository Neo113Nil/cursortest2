package yads;

import android.net.Uri;
import kotlin.Result;
import org.json.JSONObject;
import xsna.ikn;
import xsna.zkn;

/* loaded from: classes10.dex */
public final class ei0 {
    public final lh0 a;

    public /* synthetic */ ei0() {
        this(new lh0());
    }

    public final di0 a(ikn iknVar) {
        Object failure;
        this.a.getClass();
        zkn a = lh0.a(iknVar, "click");
        if (a == null) {
            return null;
        }
        try {
            JSONObject jSONObject = a.b;
            failure = Uri.parse(jSONObject != null ? jSONObject.getString("url") : null);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = null;
        }
        Uri uri = (Uri) failure;
        if (uri != null) {
            return new di0(uri);
        }
        return null;
    }

    public ei0(lh0 lh0Var) {
        this.a = lh0Var;
    }
}
