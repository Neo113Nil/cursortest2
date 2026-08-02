package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.oauth.parcelable.AccessTokenResult;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import com.vk.oauth.tinkoff.verification.VkTinkoffVerificationActivity;
import xsna.eo70;

/* compiled from: VkTinkoffVerificationProvider.kt */
/* loaded from: classes4.dex */
public final class ksv0 implements gnr0 {
    @Override // xsna.do70
    public final boolean a(int i, int i2, Intent intent, izs<? super eo70, s3q0> izsVar) {
        if (i != 90077) {
            return false;
        }
        eo70 eo70Var = null;
        if (i2 == -1 && intent != null) {
            AccessTokenResult accessTokenResult = (AccessTokenResult) intent.getParcelableExtra("vk_tinkoff_oauth_activity.access_token");
            if (accessTokenResult != null) {
                eo70Var = new eo70.d(accessTokenResult.b, accessTokenResult.c);
            } else {
                AuthCodeResult authCodeResult = (AuthCodeResult) intent.getParcelableExtra("vk_tinkoff_oauth_activity.auth_code");
                if (authCodeResult != null) {
                    eo70Var = new eo70.e(authCodeResult.b, authCodeResult.c, authCodeResult.d, authCodeResult.e, null);
                }
            }
        }
        if (i2 == 0) {
            eo70Var = eo70.b.a;
        }
        if (eo70Var == null) {
            eo70Var = new eo70.a();
        }
        izsVar.invoke(eo70Var);
        return i2 != 0;
    }

    @Override // xsna.do70
    public final void b(Activity activity, Bundle bundle) {
        int i = VkTinkoffVerificationActivity.q;
        activity.startActivityForResult(new Intent(activity, (Class<?>) VkTinkoffVerificationActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtras(Bundle.EMPTY), 90077);
    }

    @Override // xsna.gnr0
    public final void c(com.vk.superapp.verification.account.d dVar, Bundle bundle) {
        int i = VkTinkoffVerificationActivity.q;
        dVar.startActivityForResult(new Intent(dVar.requireContext(), (Class<?>) VkTinkoffVerificationActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtras(bundle), 90077);
    }
}
