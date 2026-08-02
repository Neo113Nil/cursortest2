package xsna;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.dto.common.data.VKList;
import com.vk.dto.search.SearchItem;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;

/* compiled from: VideoAddAlbum.java */
/* loaded from: classes15.dex */
public final class zzr0 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr0(String str, int i) {
        super(str);
        this.s = i;
        switch (i) {
            case 2:
                super("superApp.searchLocality");
                if (str != null && !drm0.N(str)) {
                    K("query", str);
                    break;
                }
                break;
            default:
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        ?? r0;
        switch (this.s) {
            case 0:
                return Integer.valueOf(jSONObject.getJSONObject("response").getInt("album_id"));
            case 1:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                VKList vKList = new VKList();
                vKList.o(200);
                if (optJSONObject != null) {
                    JSONArray jSONArray = optJSONObject.getJSONArray("items");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        vKList.add(new SearchItem(jSONArray.getJSONObject(i)));
                    }
                }
                return vKList;
            default:
                JSONArray jSONArray2 = jSONObject.getJSONObject("response").getJSONArray("items");
                if (jSONArray2 != null) {
                    r0 = new ArrayList(jSONArray2.length());
                    int length2 = jSONArray2.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        JSONObject optJSONObject2 = jSONArray2.optJSONObject(i2);
                        if (optJSONObject2 != null) {
                            r0.add(new qwz(optJSONObject2.optString("title"), optJSONObject2.optString("subtitle"), optJSONObject2.optBoolean("is_checked"), optJSONObject2.optString("hash")));
                        }
                    }
                } else {
                    r0 = 0;
                }
                if (r0 == 0) {
                    r0 = EmptyList.b;
                }
                return new bwh0(r0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzr0(String str, int i, int i2) {
        super("search.getHints");
        this.s = 1;
        EmptyList emptyList = EmptyList.b;
        K(CampaignEx.JSON_KEY_AD_Q, str);
        C(Math.min(i, 200), SignalingProtocol.KEY_OFFSET);
        C(Math.min(i2, 200), SignalingProtocol.KEY_LIMIT);
        StringBuilder sb = new StringBuilder("domain,city,online_info,members_count,activity,verified,trending,career,university_name,graduation,company,country,photo_base");
        emptyList.isEmpty();
        sb.append("");
        K("fields", sb.toString());
    }
}
