package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.user.RequestUserProfile;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import xsna.wyd0;

/* compiled from: FriendsGetRequestsSwipeResponse.kt */
/* loaded from: classes14.dex */
public final class hps extends aay<zxq0> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Map<UserId, RequestUserProfile> b;

    public hps(String str, HashMap hashMap) {
        this.a = str;
        this.b = hashMap;
    }

    @Override // xsna.aay
    public final zxq0 a(JSONObject jSONObject) {
        Map<UserId, RequestUserProfile> map = this.b;
        RequestUserProfile i = ao8.i(this.a, jSONObject, map != null ? map.get(new UserId(jSONObject.getLong("user_id"))) : null);
        wyd0.a c = wyd0.c(jSONObject.optJSONObject("mutual"));
        return new zxq0(i, c.a, c.b);
    }
}
