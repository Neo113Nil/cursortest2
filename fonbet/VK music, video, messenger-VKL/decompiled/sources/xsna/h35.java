package xsna;

import org.json.JSONObject;

/* compiled from: AuthGetContinuationForService.kt */
/* loaded from: classes6.dex */
public final class h35 extends rdx0<fcu0> {
    public h35(int i) {
        super("auth.getContinuationForService");
        this.j.put("app_id", String.valueOf(i));
        this.c = true;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        return new fcu0(jSONObject.getJSONObject("response").getString("super_app_token"));
    }
}
