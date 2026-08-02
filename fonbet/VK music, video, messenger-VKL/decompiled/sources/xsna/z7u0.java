package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.auth.oauth.parcelable.AuthCodeResult;
import com.vk.oauth.alfa.base.VkAlfaBaseActivity;
import com.vk.oauth.alfa.verification.VkAlfaVerificationActivity;
import xsna.eo70;

/* compiled from: VkAlfaVerificationProvider.kt */
/* loaded from: classes4.dex */
public final class z7u0 implements gnr0 {
    @Override // xsna.do70
    public final boolean a(int i, int i2, Intent intent, izs<? super eo70, s3q0> izsVar) {
        eo70 aVar;
        if (i != 190389) {
            return false;
        }
        if (i2 != -1 || intent == null) {
            aVar = new eo70.a();
        } else {
            AuthCodeResult authCodeResult = (AuthCodeResult) intent.getParcelableExtra("vk_alfa_oauth_activity.auth_code_result");
            aVar = authCodeResult != null ? new eo70.e(authCodeResult.b, authCodeResult.c, authCodeResult.d, authCodeResult.e, null) : new eo70.a();
        }
        izsVar.invoke(aVar);
        return aVar instanceof eo70.e;
    }

    @Override // xsna.do70
    public final void b(Activity activity, Bundle bundle) {
        int i = VkAlfaVerificationActivity.n;
        String str = VkAlfaBaseActivity.m;
        String c = o19.c();
        VkAlfaBaseActivity.m = c;
        activity.startActivityForResult(new Intent(activity, (Class<?>) VkAlfaVerificationActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtra("vk_alfa_oauth_activity.activity_verification_code", c), 190389);
    }

    @Override // xsna.gnr0
    public final void c(com.vk.superapp.verification.account.d dVar, Bundle bundle) {
        int i = VkAlfaVerificationActivity.n;
        Context requireContext = dVar.requireContext();
        String str = VkAlfaBaseActivity.m;
        String c = o19.c();
        VkAlfaBaseActivity.m = c;
        dVar.startActivityForResult(new Intent(requireContext, (Class<?>) VkAlfaVerificationActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtra("vk_alfa_oauth_activity.activity_verification_code", c).putExtras(bundle), 190389);
    }
}
