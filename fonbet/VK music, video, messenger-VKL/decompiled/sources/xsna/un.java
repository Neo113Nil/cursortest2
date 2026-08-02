package xsna;

import org.json.JSONObject;

/* compiled from: AccountGetBalance.java */
/* loaded from: classes14.dex */
public final class un extends rsg0 {
    public final /* synthetic */ int s = 0;

    public /* synthetic */ un(String str) {
        super(str);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        switch (this.s) {
            case 0:
                return Integer.valueOf(jSONObject.getJSONObject("response").getInt("votes"));
            default:
                return Boolean.valueOf(jSONObject.getInt("response") == 1);
        }
    }

    public un() {
        super("account.getBalance");
        C(1, "extended");
    }
}
