package xsna;

import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.SaveCustomPosterResponse;
import java.util.ArrayList;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: VideoGetGroupsForStreaming.java */
/* loaded from: classes15.dex */
public final class mns0 extends rsg0 {
    public final /* synthetic */ int s = 0;

    public /* synthetic */ mns0(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                ArrayList arrayList = new ArrayList();
                JSONArray jSONArray = jSONObject.getJSONArray("response");
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(new Group(jSONArray.getJSONObject(i)));
                }
                return arrayList;
            case 1:
                return Boolean.valueOf(jSONObject.optInt("response", 0) == 1);
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return new SaveCustomPosterResponse(new ImageSize(optJSONObject.optJSONObject("background_photo"), (String) null, 2, (zcl) null), optJSONObject.optString("background_full_id"), optJSONObject.optString("background_access_hash"));
        }
    }

    public mns0() {
        super("video.getGroupsForStreaming");
        C(1, "extended");
    }

    public mns0(int i, UserId userId, String str) {
        super("wall.saveCustomPoster");
        F(userId, "owner_id");
        K("photo", str);
        K("text_color", String.format("%06X", Arrays.copyOf(new Object[]{Integer.valueOf(i & 16777215)}, 1)));
    }
}
