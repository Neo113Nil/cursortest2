package xsna;

import java.io.InputStream;
import org.json.JSONObject;
import org.json.JSONTokener;

/* compiled from: DefaultJsonResponseConverter.kt */
/* loaded from: classes15.dex */
public final class jhl implements nay {
    @Override // xsna.nay
    public final boolean a(String str) {
        return drm0.D(str, "application/json", true) || drm0.D(str, "text/javascript", true);
    }

    @Override // xsna.nay
    public final JSONObject b(InputStream inputStream) {
        Object nextValue = new JSONTokener(fto0.p(inputStream)).nextValue();
        if (nextValue instanceof JSONObject) {
            return (JSONObject) nextValue;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("root_response", nextValue);
        return jSONObject;
    }
}
