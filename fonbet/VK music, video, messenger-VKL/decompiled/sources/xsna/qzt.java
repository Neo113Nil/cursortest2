package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import org.json.JSONObject;

/* compiled from: GiftsDelete.java */
/* loaded from: classes15.dex */
public final class qzt extends rsg0<Boolean> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        return Boolean.valueOf(jSONObject.optInt("response") == 1);
    }
}
