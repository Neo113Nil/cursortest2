package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.fullscreenbanners.api.dto.AudioGetFullScreenBannerResult;
import com.vk.fullscreenbanners.api.dto.FullScreenBanner;
import java.util.List;
import org.json.JSONObject;

/* compiled from: AudioGetFullScreenBanner.kt */
/* loaded from: classes16.dex */
public final class cp4 extends rsg0 {
    public final /* synthetic */ int s = 1;

    public cp4(String str) {
        super("audio.getFullscreenBanner");
        K("section_id", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return new AudioGetFullScreenBannerResult(optJSONObject != null ? new FullScreenBanner(optJSONObject) : null);
            case 1:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                VKList vKList = new VKList();
                com.vk.dto.newsfeed.a.a(jSONObject2, vKList, new zj90(), null);
                vKList.n(jSONObject2.optString("next_from"));
                return vKList;
        }
    }

    public cp4(int i, String str, List list, List list2, List list3) {
        super("friends.editList");
        C(i, "list_id");
        if (str != null) {
            K("name", str);
        }
        if (list != null) {
            M("user_ids", list);
        }
        if (list2 != null) {
            M("add_user_ids", list2);
        }
        if (list3 != null) {
            M("delete_user_ids", list3);
        }
    }

    public cp4(String str, String str2) {
        super("newsfeed.getLikesFeed");
        K("start_from", str);
        C(1, "photo_sizes");
        K("fields", "video_files,trust_mark," + jy2.a);
        K("like_types", str2);
    }
}
