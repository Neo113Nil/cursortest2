package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.VkAppsList;
import org.json.JSONObject;

/* compiled from: VkAppsGetFromMenu.kt */
/* loaded from: classes15.dex */
public final class zau0 extends rsg0<VkAppsList> {
    public zau0() {
        super("apps.getFromMenu");
        K("filter", "vk_apps");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Serializer.c<VkAppsList> cVar = VkAppsList.CREATOR;
        return VkAppsList.a.a(jSONObject.optJSONObject("response"));
    }
}
