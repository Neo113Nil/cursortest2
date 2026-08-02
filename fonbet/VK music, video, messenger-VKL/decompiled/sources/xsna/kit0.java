package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFileOld;
import org.json.JSONObject;

/* compiled from: VideoStartStreaming.java */
/* loaded from: classes15.dex */
public final class kit0 extends rsg0<a> {

    /* compiled from: VideoStartStreaming.java */
    public static class a {
        public final int a;
        public final VideoFileOld b;

        public a(int i, VideoFileOld videoFileOld) {
            this.a = i;
            this.b = videoFileOld;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return new a(jSONObject2.optInt("post_id", -1), com.vk.dto.common.c.b(jSONObject2));
    }
}
