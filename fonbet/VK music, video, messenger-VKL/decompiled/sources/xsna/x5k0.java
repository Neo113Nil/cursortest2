package xsna;

import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;

/* compiled from: SmartflowHelper.kt */
/* loaded from: classes.dex */
public final class x5k0 {
    public static boolean a(VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
        VkAuthValidateAccountResponse.NextStep d = vkAuthValidateAccountResponse.d();
        if (vkAuthValidateAccountResponse.e() != null && d != null && d.j() != null) {
            if (d.j() != VkAuthValidateAccountResponse.NextStep.VerificationMethod.BLOCKED_WITHOUT_PHONE) {
                return true;
            }
            par0.a.getClass();
            par0.b("VerificationMethod.BLOCKED_WITHOUT_PHONE must not be used in method selection");
            return false;
        }
        par0 par0Var = par0.a;
        StringBuilder sb = new StringBuilder("Required Smartflow Data is null: ");
        sb.append(vkAuthValidateAccountResponse.e());
        sb.append(", or ");
        sb.append(vkAuthValidateAccountResponse.d());
        sb.append(", or ");
        VkAuthValidateAccountResponse.NextStep d2 = vkAuthValidateAccountResponse.d();
        sb.append(d2 != null ? d2.j() : null);
        String sb2 = sb.toString();
        par0Var.getClass();
        par0.b(sb2);
        return false;
    }
}
