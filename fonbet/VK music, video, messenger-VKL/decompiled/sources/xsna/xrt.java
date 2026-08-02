package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.group.Group;
import org.json.JSONObject;

/* compiled from: GetGroupForCall.kt */
/* loaded from: classes15.dex */
public final class xrt extends rsg0<VkPaginationList<Group>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return tav0.b(jSONObject.optJSONObject("response"), Group.z0);
    }
}
