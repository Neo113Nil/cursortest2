package xsna;

import com.vk.core.serialize.Serializer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.masks.Mask;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: MasksGetVoipCatalog.kt */
/* loaded from: classes15.dex */
public final class wh10 extends rsg0<ArrayList<Mask>> {
    public wh10(int i) {
        super("masks.getVoipCatalog");
        C(1, "extended");
        C(i, "model_version");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        HashMap hashMap;
        HashMap hashMap2;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        if (optJSONArray != null) {
            hashMap = new HashMap();
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    UserProfile userProfile = new UserProfile(optJSONObject);
                    hashMap.put(userProfile.c, userProfile);
                }
            }
        } else {
            hashMap = null;
        }
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        if (optJSONArray2 != null) {
            hashMap2 = new HashMap();
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                JSONObject optJSONObject2 = optJSONArray2.optJSONObject(i2);
                if (optJSONObject2 != null) {
                    Group group = new Group(optJSONObject2);
                    hashMap2.put(group.c, group);
                }
            }
        } else {
            hashMap2 = null;
        }
        JSONArray optJSONArray3 = jSONObject2.optJSONArray("items");
        if (optJSONArray3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(optJSONArray3.length());
        int length3 = optJSONArray3.length();
        for (int i3 = 0; i3 < length3; i3++) {
            JSONObject optJSONObject3 = optJSONArray3.optJSONObject(i3);
            if (optJSONObject3 != null) {
                UserId userId = new UserId(optJSONObject3.optLong("owner_id"));
                Serializer.c<Mask> cVar = Mask.CREATOR;
                arrayList.add(Mask.a.a(optJSONObject3, hashMap != null ? (UserProfile) hashMap.get(userId) : null, hashMap2 != null ? (Group) hashMap2.get(fkq0.e(userId)) : null, 0L));
            }
        }
        return arrayList;
    }
}
