package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.log.L;
import org.json.JSONObject;

/* compiled from: RxListApiRequest.kt */
/* loaded from: classes15.dex */
public class pug0<I> extends rsg0<VKList<I>> {
    public final aay<I> s;

    public pug0(String str, aay<I> aayVar) {
        super(str);
        this.s = aayVar;
    }

    @Override // xsna.oer0, xsna.k7r0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public VKList<I> a(JSONObject jSONObject) throws Exception {
        aay<I> aayVar = this.s;
        try {
            if (aayVar != null) {
                return new VKList<>(jSONObject.getJSONObject("response"), aayVar);
            }
            throw new IllegalStateException("сan't parse because, no parser");
        } catch (Exception e) {
            L.B("vk", "Error parsing response", e);
            throw e;
        }
    }
}
