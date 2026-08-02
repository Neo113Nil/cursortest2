package xsna;

import org.json.JSONObject;

/* compiled from: FaveReorderTags.kt */
/* loaded from: classes4.dex */
public final class prq extends rsg0 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public prq(String str, int i) {
        super(str);
        this.s = i;
        switch (i) {
            case 1:
                super("utils.resolveUrlFromEmail");
                K("url", str);
                break;
            default:
                break;
        }
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
            default:
                JSONObject optJSONObject = jSONObject.optJSONObject("response");
                if (optJSONObject != null) {
                    return optJSONObject.optString("navigate_url");
                }
                return null;
        }
    }
}
