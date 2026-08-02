package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.log.L;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: GetUsersGroupRequest.java */
/* loaded from: classes14.dex */
public final class lwt extends rsg0<a> {

    /* compiled from: GetUsersGroupRequest.java */
    public static class a {
        public ArrayList<UserProfile> a;
        public ArrayList<UserProfile> b;
    }

    public lwt(String str) {
        super(str);
        C(1, "extended");
        K("fields", "photo_base");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        boolean e = vx2.d.e();
        float b = vx2.d.b();
        try {
            ArrayList<UserProfile> arrayList = new ArrayList<>();
            ArrayList<UserProfile> arrayList2 = new ArrayList<>();
            JSONArray optJSONArray = jSONObject.getJSONObject("response").optJSONArray("profiles");
            JSONArray optJSONArray2 = jSONObject.getJSONObject("response").optJSONArray("groups");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(new UserProfile(optJSONArray.getJSONObject(i)));
                }
            }
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = optJSONArray2.getJSONObject(i2);
                    UserProfile userProfile = new UserProfile();
                    userProfile.c = new UserId(-jSONObject2.getLong("id"));
                    userProfile.e = jSONObject2.getString("name");
                    userProfile.g = jSONObject2.optString("photo_base");
                    userProfile.h = we7.q(jSONObject2, b, e);
                    userProfile.s.putString("group_activity", jSONObject2.optString("activity"));
                    arrayList2.add(userProfile);
                }
            }
            a aVar = new a();
            aVar.a = arrayList;
            aVar.b = arrayList2;
            return aVar;
        } catch (Exception e2) {
            L.C("vk", e2);
            return null;
        }
    }
}
