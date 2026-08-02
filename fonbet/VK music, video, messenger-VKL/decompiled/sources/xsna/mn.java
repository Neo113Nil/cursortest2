package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: AccountChangePassword.java */
/* loaded from: classes14.dex */
public final class mn extends rsg0<a> {

    /* compiled from: AccountChangePassword.java */
    public static class a {
        public String a;
        public String b;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            JSONObject jSONObject2 = jSONObject.getJSONObject("response");
            a aVar = new a();
            aVar.a = jSONObject2.getString("token");
            aVar.b = jSONObject2.optString("secret");
            return aVar;
        } catch (Exception e) {
            L.C("vk", e);
            return null;
        }
    }
}
