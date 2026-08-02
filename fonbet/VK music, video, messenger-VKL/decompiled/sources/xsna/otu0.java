package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.toggle.anonymous.SakFeatures;

/* compiled from: VkFaqRouter.kt */
/* loaded from: classes.dex */
public final class otu0 {
    public static boolean a() {
        Bundle bundle;
        if (SakFeatures.Type.SAK_HELP_BUTTON_ANDROID.h()) {
            try {
                q55 q55Var = q55.a;
                bundle = q55.c().a.K;
            } catch (Throwable unused) {
                bundle = null;
            }
            if ((bundle == null || !m63.g(bundle)) && (bundle == null || !bundle.getBoolean("ok_mimicry_flow", false))) {
                return true;
            }
        }
        return false;
    }

    public static void b(Context context, SchemeStatSak$EventScreen schemeStatSak$EventScreen) {
        String str;
        if (schemeStatSak$EventScreen == null || (str = schemeStatSak$EventScreen.name()) == null) {
            str = GrsBaseInfo.CountryCodeSource.UNKNOWN;
        }
        Uri build = Uri.parse("https://id.vk.com/about/faq/users/registration_and_login").buildUpon().appendQueryParameter("utm_content", "auth-".concat(str)).appendQueryParameter("utm_source", "auth_help").build();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(schemeStatSak$EventScreen, SchemeStatSak$EventScreen.VKID_FAQ, null, false, null, null, 60);
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(context, build);
    }
}
