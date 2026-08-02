package xsna;

import android.content.res.ColorStateList;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkSimpleButton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.external.miniapp.net.app.AppFields;
import com.vk.superapp.navigation.api.VkBridgeAnalytics;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VKInstallViewDelegate.kt */
/* loaded from: classes6.dex */
public final class ddr0 {
    public static final List<AppFields> g = e43.l(AppFields.TITLE, AppFields.LEGAL_INFO, AppFields.GENRE, AppFields.ICON_278, AppFields.SCREENSHOTS, AppFields.DESCRIPTION, AppFields.RIGHTS, AppFields.FRIENDS_USE_APP, AppFields.MEMBERS_COUNT, AppFields.IS_NEED_TO_SHOW_LAUNCH_SCREEN, AppFields.SCREEN_ORIENTATION);
    public final qxv0 a;
    public final fvv0 b;
    public final mfu0 c;
    public final io.reactivex.rxjava3.disposables.b d;
    public final prq0 e;
    public final xc80 f;

    public ddr0(qxv0 qxv0Var, fvv0 fvv0Var, mfu0 mfu0Var, io.reactivex.rxjava3.disposables.b bVar, prq0 prq0Var, xc80 xc80Var) {
        this.a = qxv0Var;
        this.b = fvv0Var;
        this.c = mfu0Var;
        this.d = bVar;
        this.e = prq0Var;
        this.f = xc80Var;
    }

    public final boolean a() {
        FrameLayout c = this.a.c();
        if (c == null || !f4m.h(c)) {
            return false;
        }
        VkBridgeAnalytics E = this.b.E();
        if (E == null) {
            return true;
        }
        E.j(VkBridgeAnalytics.InstallScreenEvent.CLOSE);
        return true;
    }

    public final void b(boolean z) {
        FrameLayout c = this.a.c();
        if (c != null) {
            VkSimpleButton vkSimpleButton = (VkSimpleButton) c.findViewById(R.id.vk_apps_install_button);
            if (vkSimpleButton != null) {
                vkSimpleButton.setText(z ? null : vkSimpleButton.getContext().getString(R.string.vk_apps_install_screen_install_game_button));
                vkSimpleButton.setEnabled(!z);
            }
            VkSpinner vkSpinner = (VkSpinner) c.findViewById(R.id.vk_apps_install_spinner);
            if (vkSpinner != null) {
                f4m.E(vkSpinner, z);
                vkSpinner.setIndeterminateTintList(ColorStateList.valueOf(krv0.m(R.attr.vk_ui_icon_contrast_themed, vkSpinner.getContext())));
            }
        }
    }
}
