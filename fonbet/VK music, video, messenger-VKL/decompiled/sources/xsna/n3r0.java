package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: UtilsCheckScreenName.java */
/* loaded from: classes15.dex */
public final class n3r0 extends rsg0<a> {

    /* compiled from: UtilsCheckScreenName.java */
    public static class a {
        public String a;
        public boolean b;
        public ArrayList c;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        a aVar = new a();
        boolean z = jSONObject2.getInt("status") == 1;
        aVar.b = z;
        if (!z) {
            aVar.a = jSONObject2.getString("reason");
            if (jSONObject2.has("suggestions")) {
                aVar.c = new ArrayList();
                JSONArray jSONArray = jSONObject2.getJSONObject("suggestions").getJSONArray("items");
                for (int i = 0; i < jSONArray.length(); i = wq.b(jSONArray, i, aVar.c, i, 1)) {
                }
            }
        }
        return aVar;
    }
}
