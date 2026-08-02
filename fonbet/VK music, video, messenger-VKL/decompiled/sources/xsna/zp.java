package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: AccountSaveProfileInfo.java */
/* loaded from: classes14.dex */
public final class zp extends rsg0<a> {

    /* compiled from: AccountSaveProfileInfo.java */
    public static class a {
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            if (!jSONObject2.has("name_request")) {
                if (jSONObject2.optInt("changed") == 1) {
                    return new a();
                }
                return null;
            }
            JSONObject jSONObject3 = jSONObject2.getJSONObject("name_request");
            String string = jSONObject3.getString("status");
            if ("processing".equals(string)) {
                return new a();
            }
            if ("declined".equals(string)) {
                return new a();
            }
            if ("was_accepted".equals(string)) {
                jSONObject3.getInt("repeat_date");
                return new a();
            }
            if ("was_declined".equals(string)) {
                jSONObject3.getInt("repeat_date");
                return new a();
            }
            jSONObject3.optString("first_name");
            jSONObject3.optString("last_name");
            return new a();
        } catch (Exception e) {
            L.C("vk", e);
            return null;
        }
    }
}
