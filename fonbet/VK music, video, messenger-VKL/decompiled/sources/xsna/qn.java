package xsna;

import org.json.JSONObject;

/* compiled from: AccountGetAdAwayToken.kt */
/* loaded from: classes14.dex */
public final class qn extends rsg0 {
    public final /* synthetic */ int s = 0;

    public qn() {
        super("account.getAdAwayToken");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                JSONObject jSONObject2 = jSONObject.getJSONObject("response");
                return new rn(jSONObject2.optString("m_puad"), Integer.valueOf(jSONObject2.optInt("m_puad_expire")));
            default:
                return Boolean.valueOf(jSONObject.optInt("response", 0) == 1);
        }
    }

    public qn(String str) {
        super("wall.checkCopyrightLink");
        K("link", str);
    }
}
