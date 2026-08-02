package xsna;

import com.vk.api.request.rx.VkListWithPayload;
import com.vk.dto.common.data.VKList;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: RxListWithPayloadApiRequest.kt */
/* loaded from: classes15.dex */
public class tug0<VkList, Payload> extends pug0<VkList> {
    public final we3 t;

    public tug0(ve3 ve3Var, we3 we3Var) {
        super("apps.getCollectionApps", ve3Var);
        this.t = we3Var;
    }

    @Override // xsna.pug0, xsna.oer0, xsna.k7r0
    /* renamed from: F0 */
    public final VKList<VkList> a(JSONObject jSONObject) {
        aay<I> aayVar = this.s;
        try {
            if (aayVar != 0) {
                return new VkListWithPayload(jSONObject.getJSONObject("response"), aayVar, this.t);
            }
            throw new IllegalStateException("сan't parse because, no parser");
        } catch (Exception e) {
            L.B("vk", "Error parsing response", e);
            throw e;
        }
    }
}
