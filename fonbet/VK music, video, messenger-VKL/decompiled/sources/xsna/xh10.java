package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import org.json.JSONObject;

/* compiled from: MasksHasNew.java */
/* loaded from: classes15.dex */
public final class xh10 extends rsg0<Integer> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        try {
            return Integer.valueOf(jSONObject.getJSONObject("response").getInt("new_masks"));
        } catch (Exception unused) {
            return 0;
        }
    }
}
