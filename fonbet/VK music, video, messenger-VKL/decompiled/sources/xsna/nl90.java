package xsna;

import com.vk.auth.main.VkClientLibverifyInfo;
import com.vk.auth.passkey.PasskeyAlternative;
import com.vk.auth.passkey.PasskeyCheckInfo;
import com.vk.auth.passkey.web.PasskeyWebAuthScreen;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import java.util.List;

/* compiled from: PasskeyAuthRouter.kt */
/* loaded from: classes.dex */
public final class nl90 {
    public final f71 a;

    public nl90(f71 f71Var) {
        this.a = f71Var;
    }

    public final void a(String str, String str2, boolean z, List list) {
        if (str2 == null) {
            par0.a.getClass();
            par0.b("Sid is null in passkey flow");
            return;
        }
        VkAuthValidateAccountResponse.ValidateAccountFlow.Companion.getClass();
        PasskeyAlternative passkeyAlternative = list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.a.b()) ? PasskeyAlternative.PASSWORD_ONLY : list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.a.d()) ? PasskeyAlternative.PHONE : list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.a.a()) ? PasskeyAlternative.PASSWORD : list.equals(VkAuthValidateAccountResponse.ValidateAccountFlow.a.c()) ? PasskeyAlternative.PHONE : PasskeyAlternative.RESTORE;
        r55 r55Var = r55.a;
        r55.e().d(VkClientLibverifyInfo.Service.PASSWORDLESS);
        PasskeyWebAuthScreen.a aVar = PasskeyWebAuthScreen.Companion;
        boolean z2 = passkeyAlternative == PasskeyAlternative.RESTORE;
        aVar.getClass();
        this.a.a(new PasskeyCheckInfo(str, str2, passkeyAlternative, PasskeyWebAuthScreen.a.a(z2), z, false, 32, null));
    }
}
