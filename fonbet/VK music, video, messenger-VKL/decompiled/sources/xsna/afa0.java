package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: PhotosGetByIdResolveLink.java */
/* loaded from: classes15.dex */
public final class afa0 extends rsg0<String> {
    public int s;

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return jSONObject.getJSONArray("response").getJSONObject(0).optString("photo_" + this.s);
        } catch (Exception e) {
            L.E(e, new Object[0]);
            return null;
        }
    }
}
