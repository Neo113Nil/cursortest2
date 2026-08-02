package xsna;

import com.ironsource.C4504q2;
import com.vk.dto.common.id.UserId;
import com.vk.log.L;
import java.util.LinkedList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: FriendsGetOnline.java */
/* loaded from: classes14.dex */
public final class ros extends rsg0 {
    public final /* synthetic */ int s = 0;

    public ros() {
        super("friends.getOnline");
        K(C4504q2.u, "hints");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                LinkedList linkedList = new LinkedList();
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                for (int i = 0; i < jSONArray.length(); i++) {
                    linkedList.add(new UserId(jSONArray.getLong(i)));
                }
                return linkedList;
            default:
                try {
                    return Integer.valueOf(jSONObject.getInt("response"));
                } catch (Exception e) {
                    L.E(e, new Object[0]);
                    return null;
                }
        }
    }

    public ros(UserId userId, int i, String str, String str2) {
        super("video.add");
        C(i, "video_id");
        F(userId, "owner_id");
        if (str != null) {
            K("ref", str);
        }
        if (str2 != null) {
            K("context", str2);
        }
    }
}
