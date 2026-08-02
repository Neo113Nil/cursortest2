package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: VideoLike.java */
/* loaded from: classes15.dex */
public final class css0 extends rsg0<a> {

    /* compiled from: VideoLike.java */
    public static class a {
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            jSONObject.getJSONObject("response").getInt("likes");
            a aVar = new a();
            jSONObject.getJSONObject("response").optInt("reposts", -1);
            jSONObject.getJSONObject("response").optInt("reposted_post_id", -1);
            return aVar;
        } catch (Exception e) {
            L.i(e);
            return null;
        }
    }
}
