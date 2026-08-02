package xsna;

import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VideoGetRecommendedLiveVideos.java */
/* loaded from: classes15.dex */
public final class ons0 extends rsg0<List<VideoOwner>> {
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) throws Exception, VKApiExecutionException {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        LinkedList linkedList = new LinkedList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        JSONArray jSONArray = jSONObject2.getJSONArray("profiles");
        for (int i = 0; i < jSONArray.length(); i++) {
            UserProfile userProfile = new UserProfile(jSONArray.getJSONObject(i));
            hashMap2.put(userProfile.c, userProfile);
        }
        JSONArray jSONArray2 = jSONObject2.getJSONArray("groups");
        for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
            Group group = new Group(jSONArray2.getJSONObject(i2));
            hashMap.put(fkq0.e(group.c), group);
        }
        JSONArray jSONArray3 = jSONObject2.getJSONArray("items");
        for (int i3 = 0; i3 < jSONArray3.length(); i3++) {
            VideoFileOld b = com.vk.dto.common.c.b(jSONArray3.getJSONObject(i3));
            linkedList.add(new VideoOwner(b, (UserProfile) hashMap2.get(b.b), (Group) hashMap.get(b.b)));
        }
        return linkedList;
    }
}
