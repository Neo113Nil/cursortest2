package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.vk.oauth.esia.VkEsiaOAuthActivity;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import xsna.eo70;

/* compiled from: VkEsiaOAuthProvider.kt */
/* loaded from: classes4.dex */
public final class zqu0 implements do70, gnr0 {
    public hrf0 a;

    @Override // xsna.do70
    public final boolean a(int i, int i2, Intent intent, izs<? super eo70, s3q0> izsVar) {
        eo70 aVar;
        if (i != 38392) {
            return false;
        }
        if (i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra("vk_esia_oauth_activity.auth_code");
            String stringExtra2 = intent.getStringExtra("vk_esia_oauth_activity.client_id");
            String stringExtra3 = intent.getStringExtra("vk_esia_oauth_activity.redirect_uri");
            aVar = (stringExtra == null || stringExtra2 == null || stringExtra3 == null) ? new eo70.a() : new eo70.e(stringExtra, null, stringExtra2, stringExtra3, null);
        } else if (i2 == 2) {
            if (intent != null) {
                intent.getStringExtra("error_message");
            }
            aVar = new eo70.a();
        } else {
            aVar = i2 == 0 ? eo70.b.a : new eo70.a();
        }
        hrf0 hrf0Var = this.a;
        if (hrf0Var != null) {
            SchemeStatSak$EventScreen schemeStatSak$EventScreen = hrf0Var.a;
            if ((aVar instanceof eo70.d) || (aVar instanceof eo70.e)) {
                com.vk.registration.funnels.b.a.getClass();
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.OAUTH_ASK_CONFIRMED, null, null, null, null, null, null, 254);
                frf0.d(schemeStatSak$EventScreen, hrf0Var.b, null, 12);
            } else if (aVar instanceof eo70.a) {
                RegistrationFunnelScreenStack registrationFunnelScreenStack2 = frf0.a;
                frf0.g(schemeStatSak$EventScreen, hrf0Var.b, null, null, 12);
            }
        }
        izsVar.invoke(aVar);
        return !epx.f(aVar, eo70.b.a);
    }

    @Override // xsna.do70
    public final void b(Activity activity, Bundle bundle) {
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.OAUTH_ESIA;
        hrf0 hrf0Var = new hrf0(schemeStatSak$EventScreen);
        this.a = hrf0Var;
        hrf0Var.b = frf0.f(null, schemeStatSak$EventScreen, null, false, null, null, 60);
        String str = VkEsiaOAuthActivity.n;
        String c = o19.c();
        VkEsiaOAuthActivity.n = c;
        activity.startActivityForResult(new Intent(activity, (Class<?>) VkEsiaOAuthActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtra("vk_esia_oauth_activity.app_code", c), 38392);
    }

    @Override // xsna.gnr0
    public final void c(com.vk.superapp.verification.account.d dVar, Bundle bundle) {
        this.a = null;
        String str = VkEsiaOAuthActivity.n;
        String c = o19.c();
        Context requireContext = dVar.requireContext();
        VkEsiaOAuthActivity.n = c;
        dVar.startActivityForResult(new Intent(requireContext, (Class<?>) VkEsiaOAuthActivity.class).putExtra("vk_base_oauth_activity.key_start_auth", true).putExtra("vk_esia_oauth_activity.app_code", c).putExtra("vk_esia_oauth_activity.is_verification_flow", true), 38392);
    }
}
