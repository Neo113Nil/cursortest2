package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthGetAppScopes.kt */
/* loaded from: classes6.dex */
public final class g35 extends v66<List<? extends VkAuthAppScope>> {
    public g35() {
        super("auth.getAppScopes");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONObject("response").getJSONArray("items");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Serializer.c<VkAuthAppScope> cVar = VkAuthAppScope.CREATOR;
            arrayList.add(VkAuthAppScope.a.a(jSONArray.getJSONObject(i)));
        }
        return arrayList;
    }
}
