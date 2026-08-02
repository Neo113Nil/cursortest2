package xsna;

import com.vk.dto.actionlinks.CheckLinkResponse;
import org.json.JSONObject;

/* compiled from: ActionLinksCheckUrl.kt */
/* loaded from: classes14.dex */
public final class u20 extends rsg0 {
    public final /* synthetic */ int s = 0;

    public u20(String str) {
        super("actionLinks.checkUrl");
        K("url", str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return new CheckLinkResponse(jSONObject.optJSONObject("response"));
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    public u20(String str, String str2, String str3) {
        super("fave.removeLink");
        K("link", str);
        if (str2 != null) {
            K("link_id", str2);
        }
        if (str3 == null || str3.length() == 0) {
            return;
        }
        K("ref", str3);
    }
}
