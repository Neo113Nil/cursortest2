package xsna;

import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipListParser.kt */
/* loaded from: classes18.dex */
public final class g7d {
    public static f7d a(JSONObject jSONObject, Map map, ArrayList arrayList) {
        mss0 c = c(jSONObject, map, arrayList);
        List<VideoFile> list = c.a;
        String str = c.b;
        long j = c.c;
        long j2 = c.d;
        long j3 = c.e;
        ArrayList arrayList2 = new ArrayList();
        for (VideoFile videoFile : list) {
            ClipVideoFile clipVideoFile = videoFile instanceof ClipVideoFile ? (ClipVideoFile) videoFile : null;
            if (clipVideoFile != null) {
                arrayList2.add(clipVideoFile);
            }
        }
        return new f7d(arrayList2, str, j, j2, j3);
    }

    public static /* synthetic */ f7d b(JSONObject jSONObject, Map map, int i) {
        if ((i & 2) != 0) {
            map = null;
        }
        return a(jSONObject, map, null);
    }

    public static mss0 c(JSONObject jSONObject, Map map, List list) {
        List<VideoFile> list2;
        Map map2 = jgp.b;
        if (jSONObject == null) {
            return new mss0(EmptyList.b, null, 0L, 0L, 0L, map2);
        }
        ArrayList arrayList = null;
        JSONArray optJSONArray = list == null ? jSONObject.optJSONArray("items") : null;
        JSONArray optJSONArray2 = jSONObject.optJSONArray("profiles");
        if (optJSONArray2 == null) {
            JSONObject optJSONObject = jSONObject.optJSONObject("owner_profile");
            optJSONArray2 = optJSONObject != null ? new JSONArray().put(optJSONObject) : null;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray("groups");
        if (optJSONArray3 == null) {
            optJSONArray3 = jSONObject.optJSONArray("owner_groups");
        }
        long optLong = jSONObject.optLong("count", 0L);
        String a = cqm0.a(jSONObject.optString("next_from"));
        long optLong2 = jSONObject.optLong("views_count", 0L);
        long optLong3 = jSONObject.optLong("likes_count", 0L);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (optJSONArray2 != null) {
            int length = optJSONArray2.length();
            for (int i = 0; i < length; i++) {
                UserProfile userProfile = new UserProfile(optJSONArray2.getJSONObject(i));
                linkedHashMap.put(userProfile.c, userProfile);
            }
        }
        if (optJSONArray3 != null) {
            int length2 = optJSONArray3.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Group group = new Group(optJSONArray3.getJSONObject(i2));
                UserId e = fkq0.e(fkq0.a(group.c));
                group.c = e;
                linkedHashMap2.put(e, group);
            }
        }
        if (map != null) {
            map2 = map;
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(on00.e(linkedHashMap.size()));
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            linkedHashMap3.put(entry.getKey(), ((UserProfile) entry.getValue()).l0());
        }
        LinkedHashMap n = pn00.n(map2, linkedHashMap3);
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(on00.e(linkedHashMap2.size()));
        for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
            linkedHashMap4.put(entry2.getKey(), tsj.a((Group) entry2.getValue()));
        }
        LinkedHashMap n2 = pn00.n(n, linkedHashMap4);
        if (list == null) {
            if (optJSONArray != null) {
                arrayList = new ArrayList(optJSONArray.length());
                int length3 = optJSONArray.length();
                for (int i3 = 0; i3 < length3; i3++) {
                    JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
                    JSONObject optJSONObject2 = jSONObject2.optJSONObject("video");
                    if (optJSONObject2 != null) {
                        jSONObject2 = optJSONObject2;
                    }
                    arrayList.add(com.vk.dto.common.c.c(jSONObject2, linkedHashMap, linkedHashMap2, n2));
                }
            }
            list2 = arrayList == null ? EmptyList.b : arrayList;
        } else {
            list2 = list;
        }
        for (VideoFile videoFile : list2) {
            Owner owner = (Owner) n2.get(videoFile.I0());
            if (owner != null) {
                videoFile.f1(owner);
            }
        }
        return new mss0(list2, a, optLong, optLong2, optLong3, n2);
    }
}
