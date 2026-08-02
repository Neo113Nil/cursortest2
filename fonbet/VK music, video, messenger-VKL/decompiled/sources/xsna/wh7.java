package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import org.json.JSONObject;

/* compiled from: BoardCommentLike.java */
/* loaded from: classes14.dex */
public final class wh7 extends rsg0<a> {
    public a s;

    /* compiled from: BoardCommentLike.java */
    public static class a {
        public boolean a;
        public int b;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        a aVar = this.s;
        try {
            aVar.b = jSONObject.getJSONObject("response").optInt("likes", 0);
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }
}
