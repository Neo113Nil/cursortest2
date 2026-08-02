package xsna;

import com.ironsource.O6;
import com.vk.superapp.core.api.models.VkGender;
import org.json.JSONObject;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;

/* compiled from: AuthSignUp.kt */
/* loaded from: classes6.dex */
public final class g65 extends v66<ucu0> {
    public g65(String str, String str2, String str3, VkGender vkGender, String str4, String str5, String str6, String str7, boolean z, String str8, String str9, boolean z2, String str10, String str11) {
        super("auth.signup");
        if (str != null) {
            j("first_name", str);
        }
        if (str2 != null) {
            j("last_name", str2);
        }
        if (str3 != null) {
            j("full_name", str3);
        }
        if (vkGender != VkGender.UNDEFINED) {
            g(vkGender.h(), "sex");
        }
        if (str4 != null) {
            j("birthday", str4);
        }
        if (str5 != null) {
            j("phone", str5);
        }
        if (str7 != null) {
            j(LoginApiConstants.PARAM_NAME_PASSWORD, str7);
        }
        j(O6.e1, str6);
        if (z) {
            g(1, "extend");
        }
        if (str8 != null && str8.length() != 0) {
            j("profile_type", str8);
        }
        if (str9 != null && str9.length() != 0) {
            j("email", str9);
        }
        this.j.put("can_skip_password", z2 ? "1" : "0");
        if (str10 != null) {
            j("invite_hash", str10);
        }
        j("validate_session", str11);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        return new ucu0(jSONObject2.getInt("mid"), jSONObject2.optString("direct_auth_hash", null), jSONObject2.optString("hash", null));
    }
}
