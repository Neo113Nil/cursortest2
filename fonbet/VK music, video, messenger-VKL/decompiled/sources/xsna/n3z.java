package xsna;

import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;

/* compiled from: LibverifySessionAnalyticsHelper.kt */
/* loaded from: classes15.dex */
public final class n3z {
    public static void a(List list) {
        VkAuthValidateAccountResponse.ValidateAccountFlow.Companion.getClass();
        if (list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.NEED_PASSWORD) || list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.NEED_PASSWORD_AND_VALIDATION)) {
            r55 r55Var = r55.a;
            r55.e().d(VkClientLibverifyInfo.Service.OTP_AUTH);
        } else if (!list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.NEED_VALIDATION)) {
            list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.NEED_REGISTRATION);
        } else {
            r55 r55Var2 = r55.a;
            r55.e().d(VkClientLibverifyInfo.Service.PASSWORDLESS);
        }
    }
}
