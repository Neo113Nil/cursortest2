package xsna;

import com.vk.api.generated.friends.dto.FriendsGetRequestsSortDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.r1r0;
import xsna.vos;

/* compiled from: FriendsGetRequestsAndRecommendations.kt */
/* loaded from: classes14.dex */
public final class aps extends awi<eps> {
    public final int s;
    public final String t;

    /* compiled from: FriendsGetRequestsAndRecommendations.kt */
    public static final class a {
        public final JSONObject a;
        public final JSONObject b;

        public a(JSONObject jSONObject, JSONObject jSONObject2) {
            this.a = jSONObject;
            this.b = jSONObject2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "BatchFriendsRequestResponseItem(readRequests=" + this.a + ", recommendations=" + this.b + ')';
        }
    }

    public aps(int i, String str) {
        this.s = i;
        this.t = str;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        HashMap hashMap;
        VKList vKList;
        VKList vKList2;
        List l = e43.l(UsersFieldsDto.ONLINE, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.CAREER, UsersFieldsDto.CITY, UsersFieldsDto.COUNTRY, UsersFieldsDto.EDUCATION, UsersFieldsDto.ONLINE_INFO, UsersFieldsDto.HAS_UNSEEN_STORIES, UsersFieldsDto.IS_FOLLOWERS_MODE_ON);
        a aVar = (a) new com.vk.api.request.rx.batch.e(yfb.z(nts.c(new ots(), 0, 2, null, FriendsGetRequestsSortDto.ROTATE, null, this.t, l, 425), new x50(16)), yfb.z(nts.i(new ots(), Integer.valueOf(this.s), l, this.t, null, null, null, null, 3930), new vt1(25)), new ac1((byte) 0, 3)).f(l7r0Var);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = aVar.a.getJSONArray("items");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            arrayList.add(new UserId(jSONArray.getJSONObject(i).getLong("user_id")));
        }
        if ((58 & 1) != 0) {
            arrayList = null;
        }
        JSONArray jSONArray2 = (JSONArray) yfb.z(r1r0.a.a(arrayList, null, (58 & 4) != 0 ? null : l, null, null), new zos(0)).f(l7r0Var);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("read_requests", aVar.a);
        jSONObject.put("recommendations", aVar.b);
        jSONObject.put("profiles", jSONArray2);
        JSONObject optJSONObject = jSONObject.optJSONObject("unread_requests");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("read_requests");
        if (optJSONObject == null && optJSONObject2 == null) {
            vKList2 = null;
            vKList = null;
        } else {
            JSONArray optJSONArray = jSONObject.optJSONArray("profiles");
            if (optJSONArray != null) {
                hashMap = new HashMap();
                int length2 = optJSONArray.length();
                for (int i2 = 0; i2 < length2; i2++) {
                    JSONObject optJSONObject3 = optJSONArray.optJSONObject(i2);
                    if (optJSONObject3 != null) {
                        RequestUserProfile requestUserProfile = new RequestUserProfile(new UserProfile(optJSONObject3));
                        hashMap.put(requestUserProfile.c, requestUserProfile);
                    }
                }
            } else {
                hashMap = null;
            }
            vKList = optJSONObject != null ? hashMap != null ? new VKList(optJSONObject, new dps(hashMap)) : new VKList() : null;
            vKList2 = optJSONObject2 != null ? hashMap != null ? new VKList(optJSONObject2, new dps(hashMap)) : new VKList() : null;
            if (hashMap != null) {
                hashMap.clear();
            }
        }
        JSONObject optJSONObject4 = jSONObject.optJSONObject("recommendations");
        return new eps(vKList, vKList2, optJSONObject4 != null ? vos.a.a(null, null, optJSONObject4) : new vos.b(new VKFromList(""), ""));
    }

    @Override // xsna.xz2
    public final int[] l() {
        return new int[]{9};
    }
}
