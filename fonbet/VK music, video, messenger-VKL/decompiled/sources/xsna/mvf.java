package xsna;

import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.PostCaptionInfo;
import org.json.JSONObject;

/* compiled from: CloseSituationalSuggestRequest.kt */
/* loaded from: classes4.dex */
public final class mvf extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvf(String str, int i) {
        super(str);
        this.s = i;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Integer.valueOf(jSONObject.optInt("response"));
            default:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                String optString = jSONObject2.optString("type");
                String optString2 = jSONObject2.optString("title");
                String optString3 = jSONObject2.optString("text");
                JSONObject optJSONObject = jSONObject2.optJSONObject("button");
                return new PostCaptionInfo(optString, optString2, optString3, optJSONObject != null ? new LinkButton(optJSONObject) : null);
        }
    }
}
