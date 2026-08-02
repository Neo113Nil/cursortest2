package xsna;

import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.dto.common.data.VKFromList;
import com.vk.dto.friends.discover.UserDiscoverItem;
import com.vk.dto.user.RequestUserProfile;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.wyd0;

/* compiled from: FriendsGetRecommendationsWithMutual.kt */
/* loaded from: classes14.dex */
public final class vos extends rsg0<b> {
    public String s;
    public String t;

    /* compiled from: FriendsGetRecommendationsWithMutual.kt */
    public static final class a {
        public static b a(String str, String str2, JSONObject jSONObject) throws Exception {
            RequestUserProfile requestUserProfile;
            VKFromList vKFromList = new VKFromList(jSONObject.optString("next_from"));
            JSONArray jSONArray = jSONObject.getJSONArray("items");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                if (epx.f(str, "holiday_friends")) {
                    jSONObject2 = jSONObject2.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
                }
                if (jSONObject2 != null) {
                    if (epx.f(str2, "user_discover_item")) {
                        boolean z = jSONObject2.optInt("has_photo") == 1;
                        JSONObject optJSONObject = jSONObject2.optJSONObject("occupation");
                        requestUserProfile = new UserDiscoverItem(jSONObject2, z, optJSONObject != null ? ahn.A(optJSONObject) : null, jSONObject2.optInt("relation"));
                    } else {
                        requestUserProfile = new RequestUserProfile(jSONObject2);
                    }
                    requestUserProfile.n0 = true;
                    wyd0.a c = wyd0.c(jSONObject2.optJSONObject("mutual"));
                    vKFromList.add(new zxq0(requestUserProfile, c.a, c.b));
                }
            }
            return new b(vKFromList, jSONObject.optString("track_code"));
        }
    }

    /* compiled from: FriendsGetRecommendationsWithMutual.kt */
    public static final class b {
        public final VKFromList<zxq0> a;
        public final String b;

        public b(VKFromList<zxq0> vKFromList, String str) {
            this.a = vKFromList;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Result(items=");
            sb.append(this.a);
            sb.append(", trackCode=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public /* synthetic */ vos(String str, int i) {
        this(str, i, "photo_base,career,city,country,education,verified,trending,online_info,has_unseen_stories,is_verified,social_button_type,friend_status");
    }

    public final void F0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        K("ref", str);
    }

    public final void H0(String str) {
        if (str == null || str.length() == 0) {
            return;
        }
        K("track_code", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return a.a(this.s, this.t, jSONObject.getJSONObject("response"));
    }

    public vos(String str, int i, String str2) {
        super("friends.getRecommendations");
        if (!TextUtils.isEmpty(str)) {
            K("start_from", str);
        }
        C(i, "count");
        C(1, "need_mutual");
        K("fields", str2);
    }
}
