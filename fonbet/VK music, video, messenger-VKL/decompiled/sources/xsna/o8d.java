package xsna;

import com.huawei.hms.support.api.entity.core.CommonCode;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.group.Group;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: ClipNewsfeedGetLikesFeed.kt */
/* loaded from: classes14.dex */
public final class o8d extends rsg0<h7d> {
    public o8d(PaginationKey paginationKey, int i) {
        super("newsfeed.getLikesFeed");
        PaginationKey.Next next = paginationKey instanceof PaginationKey.Next ? (PaginationKey.Next) paginationKey : null;
        if (next != null) {
            K("start_from", next.b);
        }
        g(i, "count");
        j("like_types", "clip");
        j(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK, "reload");
        j("fields", "video_files,is_friend,friend_status,member_status,is_member,is_closed,screen_name,verified,image_status,photo_base,url,trust_mark");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        Map map;
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONArray optJSONArray = jSONObject2.optJSONArray("groups");
        Map map2 = null;
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject3 = optJSONArray.getJSONObject(i);
                Group.z0.getClass();
                Group group = new Group(jSONObject3);
                group.c = fkq0.e(group.c);
                arrayList.add(group);
            }
            int e = on00.e(c5g.u(arrayList, 10));
            if (e < 16) {
                e = 16;
            }
            map = new LinkedHashMap(e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                map.put(((Group) next).c, next);
            }
        } else {
            map = null;
        }
        Map map3 = jgp.b;
        Map map4 = map == null ? map3 : map;
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("profiles");
        if (optJSONArray2 != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add((UserProfile) UserProfile.g0.a(optJSONArray2.getJSONObject(i2)));
            }
            int e2 = on00.e(c5g.u(arrayList2, 10));
            Map linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                linkedHashMap.put(((UserProfile) next2).c, next2);
            }
            map2 = linkedHashMap;
        }
        Map map5 = map2 == null ? map3 : map2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(map5.size()));
        for (Map.Entry entry : map5.entrySet()) {
            linkedHashMap2.put(entry.getKey(), ((UserProfile) entry.getValue()).l0());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(on00.e(map4.size()));
        for (Map.Entry entry2 : map4.entrySet()) {
            linkedHashMap3.put(entry2.getKey(), tsj.a((Group) entry2.getValue()));
        }
        LinkedHashMap n = pn00.n(linkedHashMap2, linkedHashMap3);
        JSONArray jSONArray = jSONObject2.getJSONArray("items");
        ArrayList arrayList3 = new ArrayList(jSONArray.length());
        int length3 = jSONArray.length();
        for (int i3 = 0; i3 < length3; i3++) {
            arrayList3.add(new ClipVideoFile(jSONArray.getJSONObject(i3).getJSONObject("clip").getJSONArray("items").getJSONObject(0), map5, map4, null, 8, null));
        }
        f7d a = g7d.a(jSONObject2, n, arrayList3);
        ArrayList arrayList4 = a.a;
        String str = a.b;
        long j = a.c;
        PaginationKey.LoadedFull loadedFull = PaginationKey.LoadedFull.b;
        return new h7d(arrayList4, loadedFull, (str == null || str.length() == 0 || str.equals("null")) ? loadedFull : new PaginationKey.Next(str), j, null, null);
    }
}
