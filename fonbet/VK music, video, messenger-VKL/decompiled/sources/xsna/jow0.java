package xsna;

import org.json.JSONObject;

/* compiled from: VoipGetBigProfilePhoto.kt */
/* loaded from: classes15.dex */
public final class jow0 extends rsg0<a> {

    /* compiled from: VoipGetBigProfilePhoto.kt */
    public static final class a {
        public final String a;

        public a(String str) {
            this.a = str;
        }
    }

    public jow0(long j) {
        super("users.get");
        D(j, "user_ids");
        K("fields", "photo_base,verified");
        C(1, "photo_sizes");
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject optJSONObject = jSONObject.optJSONArray("response").optJSONObject(0);
        String optString = optJSONObject.optString("photo_base", optJSONObject.optString("photo_400", optJSONObject.optString("photo_200", optJSONObject.optString("photo_100"))));
        optJSONObject.optInt("verified");
        return new a(optString);
    }
}
