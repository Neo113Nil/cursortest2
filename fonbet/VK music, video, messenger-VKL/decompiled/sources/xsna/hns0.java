package xsna;

import android.os.SystemClock;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.s1r0;
import xsna.sft0;

/* compiled from: VideoGetByIdRequestProvider.kt */
/* loaded from: classes15.dex */
public final class hns0 {
    public static final List<UsersFieldsDto> a = e43.l(UsersFieldsDto.CAN_SEND_FRIEND_REQUEST, UsersFieldsDto.SEX, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.FRIEND_STATUS, UsersFieldsDto.IS_VIDEO_LIVE_NOTIFICATIONS_BLOCKED, UsersFieldsDto.VERIFIED, UsersFieldsDto.TRENDING, UsersFieldsDto.IMAGE_STATUS, UsersFieldsDto.IS_NFT, UsersFieldsDto.OWNER_STATE, UsersFieldsDto.FOLLOWERS_COUNT);

    public static final ArrayList a(String str, String str2, JSONObject jSONObject) {
        Map map;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        JSONArray optJSONArray3;
        Map map2 = jgp.b;
        if (jSONObject == null || (optJSONArray3 = jSONObject.optJSONArray("profiles")) == null) {
            map = map2;
        } else {
            ArrayList arrayList = new ArrayList(optJSONArray3.length());
            int length = optJSONArray3.length();
            for (int i = 0; i < length; i++) {
                arrayList.add(new UserProfile(optJSONArray3.getJSONObject(i)));
            }
            int e = on00.e(c5g.u(arrayList, 10));
            if (e < 16) {
                e = 16;
            }
            map = new LinkedHashMap(e);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                map.put(((UserProfile) next).c, next);
            }
        }
        if (jSONObject != null && (optJSONArray2 = jSONObject.optJSONArray("groups")) != null) {
            ArrayList arrayList2 = new ArrayList(optJSONArray2.length());
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                arrayList2.add(new Group(optJSONArray2.getJSONObject(i2)));
            }
            int e2 = on00.e(c5g.u(arrayList2, 10));
            Map linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                linkedHashMap.put(new UserId(-((Group) next2).c.b), next2);
            }
            map2 = linkedHashMap;
        }
        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str)) == null) {
            return new ArrayList();
        }
        ArrayList arrayList3 = new ArrayList(optJSONArray.length());
        int length3 = optJSONArray.length();
        for (int i3 = 0; i3 < length3; i3++) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i3);
            Object userId = new UserId(jSONObject2.optLong("from_id"));
            jSONObject2.put("type", str2);
            arrayList3.add(new LiveEventModel(jSONObject2, 10, new UserId(10L), System.currentTimeMillis(), (UserProfile) map.get(userId), (Group) map2.get(userId)));
        }
        return arrayList3;
    }

    public static final JSONObject b(l7r0 l7r0Var, UserId userId, int i, String str, List<String> list, JSONObject jSONObject) {
        JSONObject optJSONObject;
        uft0 uft0Var = new uft0();
        StringBuilder sb = new StringBuilder();
        sb.append(r11.b(new StringBuilder(), userId.b, '_', i));
        if (str != null && str.length() != 0) {
            sb.append(BundleUtil.UNDERLINE_TAG.concat(str));
        }
        hz2 z = yfb.z(sft0.a.b(uft0Var, userId, Collections.singletonList(sb.toString()), null, null, null, Boolean.TRUE, list, 16774134), new y8(22));
        ahn.D(z);
        JSONObject jSONObject2 = (JSONObject) z.f(l7r0Var);
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("response");
        if (optJSONObject2 != null) {
            JSONArray optJSONArray = optJSONObject2.optJSONArray("items");
            JSONObject jSONObject3 = null;
            Long valueOf = (optJSONArray == null || (optJSONObject = optJSONArray.optJSONObject(0)) == null) ? null : Long.valueOf(optJSONObject.optLong("user_id"));
            if (valueOf != null && valueOf.longValue() > 0) {
                List singletonList = Collections.singletonList(new UserId(valueOf.longValue()));
                if ((58 & 1) != 0) {
                    singletonList = null;
                }
                hz2 z2 = yfb.z(s1r0.a.b(singletonList, null, (58 & 4) != 0 ? null : a, null, null), new h3e0(15));
                ahn.D(z2);
                jSONObject3 = (JSONObject) z2.f(l7r0Var);
            } else if (userId.b > 0) {
                JSONArray optJSONArray2 = optJSONObject2.optJSONArray("profiles");
                if (optJSONArray2 != null) {
                    jSONObject3 = optJSONArray2.optJSONObject(0);
                }
            } else {
                JSONArray optJSONArray3 = optJSONObject2.optJSONArray("groups");
                if (optJSONArray3 != null) {
                    jSONObject3 = optJSONArray3.optJSONObject(0);
                }
            }
            if (jSONObject3 != null) {
                optJSONObject2.put("owner", jSONObject3);
            }
            if (jSONObject != null) {
                optJSONObject2.put("comments", jSONObject);
            }
        }
        return jSONObject2;
    }

    public static final nwt c(String str, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("owner");
        if (epx.f(jSONObject2.getJSONArray("items").getJSONObject(0).toString(), "null")) {
            throw new JSONException("parse video.get - video is null");
        }
        JSONObject jSONObject4 = jSONObject2.getJSONArray("items").getJSONObject(0);
        ArrayList a2 = a("items", "start_comment", jSONObject2.optJSONObject("comments"));
        ArrayList a3 = a("pinned_comments", "start_pinned_comment", jSONObject2.optJSONObject("comments"));
        JSONArray optJSONArray = jSONObject2.optJSONArray("profiles");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("groups");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                UserProfile userProfile = new UserProfile(optJSONArray.getJSONObject(i));
                linkedHashMap.put(userProfile.c, userProfile);
            }
        }
        if (optJSONArray2 != null) {
            int length2 = optJSONArray2.length();
            for (int i2 = 0; i2 < length2; i2++) {
                Group group = new Group(optJSONArray2.getJSONObject(i2));
                UserId e = fkq0.e(fkq0.a(group.c));
                group.c = e;
                linkedHashMap2.put(e, group);
            }
        }
        VideoFileOld c = com.vk.dto.common.c.c(jSONObject4, linkedHashMap, linkedHashMap2, null);
        c.A0 = SystemClock.elapsedRealtime();
        if (drm0.N(c.r0) && str != null && !drm0.N(str)) {
            c.r0 = str;
        }
        UserId userId = new UserId(jSONObject3.getLong("id"));
        boolean z = c.b.b > 0 || c.d.b > 0;
        boolean z2 = userId.equals(c.d) || userId.equals(c.b);
        boolean z3 = (-userId.b) == c.b.b;
        if (z && z2) {
            UserProfile userProfile2 = new UserProfile(jSONObject3);
            c.f1(userProfile2.l0());
            c.f1(userProfile2.l0());
            return new nwt(c, userProfile2, null, a2, a3);
        }
        if (!z3) {
            throw new JSONException("parse video.get - user and group == null");
        }
        Group group2 = new Group(jSONObject3);
        c.f1(tsj.a(group2));
        c.f1(tsj.a(group2));
        return new nwt(c, null, group2, a2, a3);
    }
}
