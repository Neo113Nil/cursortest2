package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.data.ApiApplication;
import com.vk.dto.common.data.VkAppsList;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GamesGetFromMenu.kt */
/* loaded from: classes15.dex */
public final class qft extends rsg0<VkAppsList> {
    public qft() {
        super("apps.getFromMenu");
        K("filter", "html");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ArrayList arrayList;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        if (optJSONObject.has("featured") || optJSONObject.has("favorites")) {
            Serializer.c<VkAppsList> cVar = VkAppsList.CREATOR;
            return VkAppsList.a.a(optJSONObject);
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("items");
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                if (optJSONObject2 != null) {
                    arrayList.add(new ApiApplication(optJSONObject2));
                }
            }
        } else {
            arrayList = null;
        }
        return new VkAppsList(arrayList, null, 2, null);
    }
}
