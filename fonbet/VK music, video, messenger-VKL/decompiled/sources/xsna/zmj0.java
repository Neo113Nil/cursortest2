package xsna;

import com.vk.navigation.NavigationDelegateActivity;
import com.vk.superapp.api.dto.auth.validateaccount.VkAuthValidateAccountResponse;
import xsna.p1n0;

/* compiled from: SilentAuthByLoginRouterImpl.kt */
/* loaded from: classes11.dex */
public final class zmj0 implements ymj0 {
    @Override // xsna.ymj0
    public final boolean a(VkAuthValidateAccountResponse vkAuthValidateAccountResponse) {
        return vkAuthValidateAccountResponse.c().contains(VkAuthValidateAccountResponse.ValidateAccountFlow.EXCHANGE_TOKEN);
    }

    @Override // xsna.ymj0
    public final void b(NavigationDelegateActivity navigationDelegateActivity, String str, String str2) {
        p1n0 p1n0Var = new p1n0();
        r55 r55Var = r55.a;
        p1n0.a(p1n0Var, navigationDelegateActivity, str2, str, r55.i().b(navigationDelegateActivity), new p1n0.a(2));
    }
}
