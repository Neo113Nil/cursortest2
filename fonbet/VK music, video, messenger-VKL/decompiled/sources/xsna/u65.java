package xsna;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.ironsource.O6;
import com.vk.api.generated.auth.dto.AuthValidateRegistrationConfirmTextsDto;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthProfileInfo;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.NextStep;
import com.vk.superapp.api.dto.auth.validatephoneconfirm.PasswordScreen;
import com.vk.superapp.core.api.models.SignUpField;
import com.vk.superapp.core.api.models.SignUpIncompleteFieldsModel;
import com.vk.superapp.core.api.models.SignUpParams;
import java.util.List;
import kotlin.collections.EmptyList;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthValidateEmailConfirm.kt */
/* loaded from: classes6.dex */
public final class u65 extends v66<vbu0> {
    public final String u;

    public u65(String str, String str2) {
        super("auth.validateEmailConfirm");
        this.u = str;
        j(O6.e1, str);
        j("code", str2);
        this.r = true;
        this.c = true;
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.getJSONObject("response");
        String optString = jSONObject2.optString(O6.e1, this.u);
        JSONObject optJSONObject = jSONObject2.optJSONObject(CommonConstant.SCOPE.SCOPE_ACCOUNT_PROFILE);
        VkAuthProfileInfo vkAuthProfileInfo = optJSONObject != null ? new VkAuthProfileInfo(optJSONObject.getString("first_name"), optJSONObject.optString("last_name"), optJSONObject.optBoolean("has_2fa"), optJSONObject.optString("photo_200", null), optJSONObject.optString("phone"), optJSONObject.optBoolean("can_unbind_phone"), optJSONObject.optBoolean("has_password")) : null;
        PasswordScreen.a aVar = PasswordScreen.Companion;
        int optInt = jSONObject2.optInt("hide_password", 0);
        aVar.getClass();
        PasswordScreen a = PasswordScreen.a.a(optInt);
        JSONArray optJSONArray = jSONObject2.optJSONArray("signup_fields");
        JSONArray optJSONArray2 = jSONObject2.optJSONArray("signup_suggested_fields");
        String optString2 = jSONObject2.optString("signup_restricted_subject");
        Serializer.c<SignUpParams> cVar = SignUpParams.CREATOR;
        JSONObject optJSONObject2 = jSONObject2.optJSONObject("signup_params");
        SignUpParams signUpParams = new SignUpParams(optJSONObject2 != null ? optJSONObject2.optInt("password_min_length", 8) : 8);
        boolean optBoolean = jSONObject2.optBoolean("can_skip_password");
        Serializer.c<SignUpIncompleteFieldsModel> cVar2 = SignUpIncompleteFieldsModel.CREATOR;
        SignUpIncompleteFieldsModel a2 = SignUpIncompleteFieldsModel.a.a(jSONObject2.optJSONObject("signup_fields_values"));
        NextStep.a aVar2 = NextStep.Companion;
        String A = f370.A("next_step", jSONObject2);
        aVar2.getClass();
        NextStep a3 = NextStep.a.a(A);
        boolean optBoolean2 = jSONObject2.optBoolean("show_registration_confirm");
        JSONObject optJSONObject3 = jSONObject2.optJSONObject("registration_confirm_text");
        AuthValidateRegistrationConfirmTextsDto authValidateRegistrationConfirmTextsDto = optJSONObject3 != null ? new AuthValidateRegistrationConfirmTextsDto(f370.A("title", optJSONObject3), f370.A("subtitle", optJSONObject3)) : null;
        String optString3 = jSONObject2.optString("email_already_used");
        String optString4 = jSONObject2.optString("auth_hash");
        SignUpField.Companion.getClass();
        List b = SignUpField.a.b(optJSONArray);
        if (b == null) {
            b = EmptyList.b;
        }
        List list = b;
        List b2 = SignUpField.a.b(optJSONArray2);
        if (b2 == null) {
            b2 = EmptyList.b;
        }
        return new vbu0(optString, vkAuthProfileInfo, a, list, b2, optString2, jSONObject2.optString("hash", null), signUpParams, optBoolean, a2, a3, optBoolean2, authValidateRegistrationConfirmTextsDto, optString3, optString4);
    }
}
