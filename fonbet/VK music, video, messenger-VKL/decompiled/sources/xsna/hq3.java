package xsna;

import com.vk.dto.common.data.VKList;
import com.vk.dto.music.AudioRecommendationOnBoardingInfo;
import org.json.JSONObject;

/* compiled from: ArticlesGetByLink.kt */
/* loaded from: classes14.dex */
public final class hq3 extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq3(String str, int i, byte b) {
        super("audio.recommendationsOnboarding");
        this.s = i;
        switch (i) {
            case 2:
                super(str);
                break;
            default:
                if (str != null && str.length() != 0) {
                    j("next_from", str);
                    break;
                }
                break;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                return new VKList(optJSONObject, new com.vk.movika.sdk.base.observable.w(vj90.e(optJSONObject), 5));
            case 1:
                return new AudioRecommendationOnBoardingInfo(jSONObject.getJSONObject("response"));
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq3(String str, int i) {
        super("articles.getByLink");
        this.s = 0;
        boolean z = (i & 4) == 0;
        K("links", str);
        StringBuilder sb = new StringBuilder("photo_base,is_favorite");
        sb.append("");
        sb.append(z ? ",friend_status" : "");
        K("fields", sb.toString());
        C(1, "extended");
    }
}
