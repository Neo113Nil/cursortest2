package defpackage;

import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class fn71 implements s191 {
    @Override // defpackage.s191
    public final Object a(JSONObject jSONObject) {
        Object obj = jSONObject.get("value");
        if (obj instanceof JSONObject) {
            JSONObject jSONObject2 = (JSONObject) obj;
            return new ig61(jSONObject2.getString("warningText"), y6i0.c((float) jSONObject2.optDouble("warningSize", 0.11999999731779099d), 0.0f, 1.0f));
        }
        if (obj instanceof String) {
            return new ig61((String) obj);
        }
        yx61.e("Native Ad json has not required attributes");
        return null;
    }
}
