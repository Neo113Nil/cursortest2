package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.Map;
import org.json.JSONObject;
import xsna.wyd0;

/* compiled from: FriendsGetRequestsNotificationsResponse.kt */
/* loaded from: classes14.dex */
public final class dps extends aay<zxq0> {
    public final /* synthetic */ Map<UserId, RequestUserProfile> a;

    public dps(Map map) {
        this.a = map;
    }

    @Override // xsna.aay
    public final zxq0 a(JSONObject jSONObject) {
        RequestUserProfile i = ao8.i(null, jSONObject, this.a.get(new UserId(jSONObject.getLong("user_id"))));
        wyd0.a c = wyd0.c(jSONObject.optJSONObject("mutual"));
        return new zxq0(i, c.a, c.b);
    }
}
