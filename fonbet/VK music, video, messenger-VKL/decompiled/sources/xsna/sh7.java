package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import org.json.JSONObject;

/* compiled from: BoardAddComment.java */
/* loaded from: classes6.dex */
public final class sh7 extends rsg0<Integer> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return Integer.valueOf(jSONObject.getInt("response"));
        } catch (Exception unused) {
            return null;
        }
    }
}
