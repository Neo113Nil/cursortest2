package xsna;

import com.vk.api.generated.friends.dto.FriendsGetInterestingRequestsFieldsDto;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import com.vk.dto.user.UserProfile;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.s1r0;
import xsna.vos;

/* compiled from: FriendsGetRequestsAndRecommendationsSwipe.kt */
/* loaded from: classes14.dex */
public final class bps extends awi<ips> {
    public final int s;
    public final UserId t;
    public final String u;
    public final String v = "user_discover_item";

    public bps(int i, UserId userId, String str) {
        this.s = i;
        this.t = userId;
        this.u = str;
    }

    @Override // xsna.xz2, xsna.nx2
    public final Object f(l7r0 l7r0Var) {
        VKList vKList;
        HashMap hashMap;
        ots otsVar = new ots();
        List l = e43.l(FriendsGetInterestingRequestsFieldsDto.CROP_PHOTO, FriendsGetInterestingRequestsFieldsDto.BDATE, FriendsGetInterestingRequestsFieldsDto.HAS_PHOTO, FriendsGetInterestingRequestsFieldsDto.CITY, FriendsGetInterestingRequestsFieldsDto.MUTUAL, FriendsGetInterestingRequestsFieldsDto.FIRST_NAME_ACC, FriendsGetInterestingRequestsFieldsDto.OCCUPATION, FriendsGetInterestingRequestsFieldsDto.RELATION, FriendsGetInterestingRequestsFieldsDto.SCREEN_NAME);
        UserId userId = this.t;
        Integer valueOf = userId != null ? Integer.valueOf((int) userId.b) : null;
        int i = this.s;
        Pair pair = (Pair) new com.vk.api.request.rx.batch.e(yfb.z(otsVar.t(l, 0, Integer.valueOf(i), valueOf, this.u), new qm0(22)), yfb.z(nts.i(new ots(), Integer.valueOf(i), e43.l(UsersFieldsDto.CROP_PHOTO, UsersFieldsDto.BDATE, UsersFieldsDto.HAS_PHOTO, UsersFieldsDto.CITY, UsersFieldsDto.MUTUAL, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.OCCUPATION, UsersFieldsDto.RELATION, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.SCREEN_NAME), this.u, "swipe_friends", null, null, null, 3674), new ht(28)), new yx5(6)).f(l7r0Var);
        JSONObject jSONObject = (JSONObject) pair.d();
        JSONObject jSONObject2 = (JSONObject) pair.g();
        Integer x = f370.x(jSONObject, "count_unread");
        JSONArray jSONArray = jSONObject.getJSONArray("items");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int length = jSONArray.length();
        for (int i2 = 0; i2 < length; i2++) {
            arrayList.add(new UserId(jSONArray.getJSONObject(i2).getLong("user_id")));
        }
        List l2 = e43.l(UsersFieldsDto.CROP_PHOTO, UsersFieldsDto.BDATE, UsersFieldsDto.HAS_PHOTO, UsersFieldsDto.CITY, UsersFieldsDto.MUTUAL, UsersFieldsDto.FIRST_NAME_ACC, UsersFieldsDto.OCCUPATION, UsersFieldsDto.RELATION, UsersFieldsDto.PHOTO_BASE, UsersFieldsDto.SCREEN_NAME);
        if ((58 & 1) != 0) {
            arrayList = null;
        }
        if ((58 & 4) != 0) {
            l2 = null;
        }
        hz2 z = yfb.z(s1r0.a.b(arrayList, null, l2, null, null), new sm0(19));
        JSONObject jSONObject3 = new JSONObject();
        if (x != null) {
            jSONObject3.put("unread_requests_count", x.intValue());
        }
        jSONObject3.put("requests", jSONObject);
        jSONObject3.put("recommendations", jSONObject2);
        jSONObject3.put("profiles", z);
        JSONObject optJSONObject = jSONObject3.optJSONObject("requests");
        String str = this.v;
        if (optJSONObject != null) {
            JSONArray optJSONArray = jSONObject3.optJSONArray("profiles");
            if (optJSONArray != null) {
                hashMap = new HashMap();
                int length2 = optJSONArray.length();
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject optJSONObject2 = optJSONArray.optJSONObject(i3);
                    if (optJSONObject2 != null) {
                        RequestUserProfile requestUserProfile = new RequestUserProfile(new UserProfile(optJSONObject2));
                        hashMap.put(requestUserProfile.c, requestUserProfile);
                    }
                }
            } else {
                hashMap = null;
            }
            vKList = new VKList(optJSONObject, new hps(str, hashMap));
            if (hashMap != null) {
                hashMap.clear();
            }
        } else {
            vKList = null;
        }
        JSONObject optJSONObject3 = jSONObject3.optJSONObject("recommendations");
        return new ips(jSONObject3.optInt("unread_requests_count"), vKList, optJSONObject3 != null ? optJSONObject3.optString("title") : null, optJSONObject3 != null ? vos.a.a(null, str, optJSONObject3) : new vos.b(new VKFromList(""), ""));
    }

    @Override // xsna.xz2
    public final int[] l() {
        return new int[]{9};
    }
}
