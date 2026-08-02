package xsna;

import android.content.Context;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.vk.core.preference.Preference;
import com.vk.device.store.AppStore;
import com.vk.log.L;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stat.scheme.SchemeStat$TypeInstallReferrer;
import xsna.f6x;

/* compiled from: InstallReferrerReporter.kt */
/* loaded from: classes.dex */
public final class g6x implements InstallReferrerStateListener {
    public final /* synthetic */ InstallReferrerClient a;
    public final /* synthetic */ Context b;

    public g6x(InstallReferrerClient installReferrerClient, Context context) {
        this.a = installReferrerClient;
        this.b = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a9, code lost:
    
        if (r13 != null) goto L27;
     */
    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInstallReferrerSetupFinished(int i) {
        String str;
        Uri uri;
        a1v0 a1v0Var = a1v0.b;
        if (a1v0Var.a) {
            L.G("onInstallReferrerSetupFinished: already processed, skipping");
            return;
        }
        a1v0Var.a = true;
        L.p(lhg.a(i, "onInstallReferrerSetupFinished: responseCode = "));
        InstallReferrerClient installReferrerClient = this.a;
        try {
            if (i != -1) {
                if (i == 0) {
                    try {
                        str = installReferrerClient.getInstallReferrer().getInstallReferrer();
                    } catch (Exception unused) {
                        str = "unknown_referrer";
                    }
                    String h = dy2.h(this.b, null);
                    if (h == null) {
                        h = AppStore.GOOGLE.j();
                    }
                    f6x.a aVar = new f6x.a(str, h);
                    L.p("onReferrerExtracted: " + aVar.a());
                    kx6 kx6Var = new kx6();
                    kx6Var.f = new SchemeStat$TypeInstallReferrer(aVar.b(), aVar.a());
                    kx6Var.q();
                    String a = aVar.a();
                    if (a != null) {
                        String str2 = drm0.N(a) ? null : a;
                        if (str2 != null) {
                            uri = Uri.parse(str2);
                        }
                    }
                    uri = Uri.EMPTY;
                    String queryParameter = uri.getQueryParameter("reg_unauth_id");
                    if (queryParameter != null) {
                        com.vk.registration.funnels.b.a.getClass();
                        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                        frf0.k(com.vk.registration.funnels.b.e(queryParameter));
                        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.WEB_REGISTRATION, null, null, null, null, null, null, 254);
                    }
                    Preference.f("install_referrer_prefs").edit().putBoolean("reported", true).apply();
                } else if (i != 1) {
                    L.l("onReferrerExtractionFailed, recoverable = false");
                    Preference.f("install_referrer_prefs").edit().putBoolean("reported", true).apply();
                }
                installReferrerClient.endConnection();
                return;
            }
            installReferrerClient.endConnection();
            return;
        } catch (Exception e) {
            L.i(e);
            return;
        }
        L.l("onReferrerExtractionFailed, recoverable = true");
    }

    @Override // com.android.installreferrer.api.InstallReferrerStateListener
    public final void onInstallReferrerServiceDisconnected() {
    }
}
