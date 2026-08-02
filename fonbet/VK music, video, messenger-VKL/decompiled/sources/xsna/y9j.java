package xsna;

import android.app.Activity;
import com.vk.contactssync.api.di.ContactSyncColdStartModalComponent;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.fullscreen.promo.core.PromoSessionInfo;
import com.vk.permission.PermissionHelper;
import xsna.c63;
import xsna.ky6;

/* compiled from: FullscreenPromoPresenter.kt */
/* loaded from: classes17.dex */
public final class y9j extends c63.b {
    public final /* synthetic */ x9j b;
    public final /* synthetic */ PromoSessionInfo c;

    public y9j(x9j x9jVar, PromoSessionInfo promoSessionInfo) {
        this.b = x9jVar;
        this.c = promoSessionInfo;
    }

    @Override // xsna.c63.b
    public final void p(Activity activity) {
        x9j x9jVar = this.b;
        c63 c63Var = c63.a;
        c63.c(this);
        PermissionHelper.a.getClass();
        boolean n = PermissionHelper.n(activity);
        if (n) {
            x9j.e = true;
            ky6.a aVar = (ky6.a) Preference.j().edit();
            aVar.putInt("__contact_sync_cold_start_any_modal_version__", BuildInfo.e);
            aVar.apply();
        } else {
            x9j.d = true;
            ky6.a aVar2 = (ky6.a) Preference.j().edit();
            aVar2.putInt("__contact_sync_cold_start_any_modal_version__", BuildInfo.e);
            aVar2.apply();
        }
        q9j Qd = ((ContactSyncColdStartModalComponent) m7m.a(activity).a(fpf0.a(ContactSyncColdStartModalComponent.class))).Qd();
        PromoSessionInfo promoSessionInfo = this.c;
        Qd.a(activity, new z9j(n, x9jVar, promoSessionInfo), new aaj(n, x9jVar, promoSessionInfo), new baj(n, x9jVar, promoSessionInfo));
    }
}
