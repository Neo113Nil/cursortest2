package xsna;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.superapp.base.js.bridge.VkUiPermissionsHandler;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxAction;
import com.vk.superapp.bridges.dto.analytics.MiniAppSettingsBoxType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vkontakte.android.R;
import xsna.aex0;
import xsna.bex0;

/* compiled from: VkUiGetPhoneNumberCommand.kt */
/* loaded from: classes6.dex */
public final class jwv0 extends dvv0 {
    public final Fragment e;
    public long f;

    public jwv0(Fragment fragment) {
        this.e = fragment;
    }

    @Override // xsna.dvv0
    public final void a(String str) {
        this.f = str != null ? Long.parseLong(str) : 0L;
        FragmentActivity activity = this.e.getActivity();
        if (activity == null) {
            return;
        }
        VkUiPermissionsHandler vkUiPermissionsHandler = this.c;
        if (vkUiPermissionsHandler != null && vkUiPermissionsHandler.a(VkUiPermissionsHandler.Permissions.PHONE)) {
            d();
            return;
        }
        if (this.b != null && jgn0.c()) {
            r6y r6yVar = this.b;
            if (r6yVar != null) {
                bex0.a.a(r6yVar, JsApiMethodType.GET_PHONE_NUMBER, VkAppsErrors.Client.INACTIVE_SCREEN, null, null, null, 60);
                return;
            }
            return;
        }
        aex0.a aVar = new aex0.a();
        aVar.b = Integer.valueOf(R.drawable.vk_icon_phone_outline_56);
        aVar.e = activity.getString(R.string.vk_apps_permissions_phone_title);
        aVar.f = activity.getString(R.string.vk_apps_permissions_phone_subtitle);
        aVar.b(activity.getString(R.string.vk_apps_access_allow), new gwv0(this));
        aVar.h = new aex0.e(activity.getString(R.string.vk_apps_access_disallow), new hwv0(this));
        aVar.j = new iwv0(this);
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.e0(aVar.a());
        tau0 tau0Var = this.d;
        if (tau0Var != null) {
            tau0Var.e(MiniAppSettingsBoxType.SETTINGS_BOX_GET_PHONE, MiniAppSettingsBoxAction.SHOW);
        }
    }

    public final void d() {
        io.reactivex.rxjava3.disposables.b b = b();
        if (b != null) {
            vdx0 vdx0Var = e370.e;
            if (vdx0Var == null) {
                vdx0Var = null;
            }
            b.b(vdx0Var.a().b(this.f).subscribe(new tmz(new cus0(this, 6), 27), new ow40(new pst0(this, 1), 29)));
        }
    }
}
