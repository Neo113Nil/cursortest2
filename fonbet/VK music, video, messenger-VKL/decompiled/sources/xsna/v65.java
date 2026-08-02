package xsna;

import com.ironsource.O6;
import com.vk.superapp.api.dto.auth.LibverifyValidationType;
import com.vk.superapp.api.dto.auth.VkAuthSmsInboxField;
import com.vk.superapp.api.dto.auth.VkAuthValidatePhoneResult;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: AuthValidatePhone.kt */
/* loaded from: classes6.dex */
public final class v65 extends v66<VkAuthValidatePhoneResult> {
    public final String u;

    /* compiled from: AuthValidatePhone.kt */
    public static final class a {
        public static VkAuthValidatePhoneResult.ValidationType a(String str) {
            if (str == null) {
                return null;
            }
            switch (str.hashCode()) {
                case -1795887624:
                    if (str.equals("max_messenger")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_MAX_MESSENGER;
                    }
                    return null;
                case -1028952655:
                    if (str.equals("callreset")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_CALL_RESET;
                    }
                    return null;
                case -792038226:
                    if (str.equals("passkey")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PASSKEY;
                    }
                    return null;
                case 104677:
                    if (str.equals("ivr")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_IVR;
                    }
                    return null;
                case 114009:
                    if (str.equals("sms")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_SMS;
                    }
                    return null;
                case 3452698:
                    if (str.equals("push")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_PUSH;
                    }
                    return null;
                case 96619420:
                    if (str.equals("email")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_EMAIL;
                    }
                    return null;
                case 407601128:
                    if (str.equals("max_code")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_MAX_CODE;
                    }
                    return null;
                case 1092754464:
                    if (str.equals("sms_inbox")) {
                        return VkAuthValidatePhoneResult.ValidationType.VALIDATION_TYPE_SMS_INBOX;
                    }
                    return null;
                default:
                    return null;
            }
        }
    }

    public v65(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str3, boolean z8) {
        super("auth.validatePhone");
        this.u = str;
        if (str != null) {
            j(O6.e1, str);
        }
        if (str2 != null) {
            j("phone", str2);
        }
        if (str3 != null) {
            j("super_app_token", str3);
        }
        if (z) {
            g(1, "voice");
        }
        if (z2) {
            g(1, "libverify_support");
        }
        this.r = z3;
        if (z4) {
            g(1, "disable_partial");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        g(1, "allow_callreset");
        arrayList2.add("callreset_preview_enabled");
        if (z5) {
            arrayList.add("push");
        }
        if (z6) {
            arrayList.add("email");
        }
        if (z7) {
            arrayList.add("passkey");
        }
        arrayList.add("max_messenger");
        arrayList.add("max_code");
        if (z8) {
            arrayList.add("sms_inbox");
        }
        if (!arrayList.isEmpty()) {
            i("supported_ways", arrayList);
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        i("supported_ways_settings", arrayList2);
    }

    @Override // xsna.oer0, xsna.k7r0
    public final Object a(JSONObject jSONObject) {
        String str;
        VkAuthSmsInboxField vkAuthSmsInboxField;
        boolean z;
        List list;
        String optString;
        JSONObject optJSONObject = jSONObject.optJSONObject("response");
        String str2 = this.u;
        if (optJSONObject == null) {
            return new VkAuthValidatePhoneResult(str2 == null ? "" : str2, false, null, null, null, false, 0L, 0L, null, 0, null, null, null, false, null, false, null, null, null, false);
        }
        String optString2 = optJSONObject.optString(O6.e1, str2 != null ? str2 : "");
        boolean z2 = true;
        if (optJSONObject.optInt("libverify_support", 0) != 1 && ((optString = optJSONObject.optString("libverify_support")) == null || !Boolean.parseBoolean(optString))) {
            z2 = false;
        }
        JSONArray optJSONArray = optJSONObject.optJSONArray("available_libverify_verification_types");
        String optString3 = optJSONObject.optString("validation_type");
        String optString4 = optJSONObject.optString("validation_resend");
        boolean optBoolean = optJSONObject.optBoolean("need_show_preview_callreset", false);
        long optLong = optJSONObject.optLong("delay", 120L);
        long optLong2 = optJSONObject.optLong("messenger_delay", 90L);
        String optString5 = optJSONObject.optString("external_id", null);
        String optString6 = optJSONObject.optString("phone", null);
        String optString7 = optJSONObject.optString("masked_email", null);
        int optInt = optJSONObject.optInt("code_length");
        String optString8 = optJSONObject.optString("device_name");
        boolean optBoolean2 = optJSONObject.optBoolean("show_qr_code", false);
        Long z3 = f370.z(optJSONObject, "phonereuse_timeout_ms");
        boolean optBoolean3 = optJSONObject.optBoolean("messengers_option", false);
        String A = f370.A("max_messenger_hash", optJSONObject);
        String A2 = f370.A("redirect_url", optJSONObject);
        JSONObject optJSONObject2 = optJSONObject.optJSONObject("smsinbox");
        if (optJSONObject2 == null) {
            str = optString3;
            vkAuthSmsInboxField = null;
        } else {
            String A3 = f370.A("number", optJSONObject2);
            String A4 = f370.A("instructions", optJSONObject2);
            Integer x = f370.x(optJSONObject2, "timeout");
            Integer x2 = f370.x(optJSONObject2, "status_period");
            if (A3 == null || A4 == null || x == null || x2 == null) {
                str = optString3;
                vkAuthSmsInboxField = null;
            } else {
                str = optString3;
                vkAuthSmsInboxField = new VkAuthSmsInboxField(A3, A4, x.intValue(), x2.intValue());
            }
        }
        int i = 0;
        boolean optBoolean4 = optJSONObject.optBoolean("is_need_show_max_button", false);
        if (optJSONArray != null) {
            ArrayList arrayList = new ArrayList(optJSONArray.length());
            int length = optJSONArray.length();
            while (i < length) {
                String string = optJSONArray.getString(i);
                LibverifyValidationType.Companion.getClass();
                arrayList.add(LibverifyValidationType.a.a(string));
                i++;
                optBoolean4 = optBoolean4;
            }
            z = optBoolean4;
            list = j5g.V(arrayList);
        } else {
            z = optBoolean4;
            list = null;
        }
        VkAuthValidatePhoneResult.ValidationType a2 = a.a(str);
        VkAuthValidatePhoneResult.ValidationType a3 = a.a(optString4);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return new VkAuthValidatePhoneResult(optString2, z2, list, a2, a3, optBoolean, timeUnit.toMillis(optLong), timeUnit.toMillis(optLong2), optString5, optInt, optString6, optString8, optString7, optBoolean2, z3, optBoolean3, A, A2, vkAuthSmsInboxField, z);
    }
}
