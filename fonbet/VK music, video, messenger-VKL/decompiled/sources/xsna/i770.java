package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: NotesGetById.java */
/* loaded from: classes15.dex */
public final class i770 extends rsg0<a> {

    /* compiled from: NotesGetById.java */
    public static class a {
        public String a;
        public String b;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            a aVar = new a();
            aVar.a = jSONObject.getJSONObject("response").optString("view_url");
            aVar.b = jSONObject.getJSONObject("response").optString("title");
            return aVar;
        } catch (Exception e) {
            L.E(e, new Object[0]);
            return null;
        }
    }
}
