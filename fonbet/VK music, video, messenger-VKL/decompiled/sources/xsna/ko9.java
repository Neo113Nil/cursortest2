package xsna;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import androidx.preference.Preference;
import androidx.preference.SwitchPreferenceCompat;
import com.vk.catalog2.common.dto.api.ui.UIBlockHint;
import com.vk.core.tips.Tooltip;
import com.vk.log.L;
import com.vk.media.player.video.view.SimpleVideoView;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import ru.mail.libverify.api.VerificationFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ko9 implements SimpleVideoView.i, Preference.b, Tooltip.c {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ko9(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // androidx.preference.Preference.b
    public boolean Sl(Preference preference, Object obj) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.b;
        SwitchPreferenceCompat switchPreferenceCompat = (SwitchPreferenceCompat) this.c;
        int i = SettingsGeneralFragment.z0;
        FragmentActivity activity = settingsGeneralFragment.getActivity();
        if (activity == null) {
            return false;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            FragmentActivity kn = settingsGeneralFragment.kn();
            permissionHelper.getClass();
            PermissionHelper.i(permissionHelper, kn, PermissionHelper.h, PermissionHelper.i, R.string.vk_permissions_location, 0, null, new f0z(switchPreferenceCompat, 27), null, 384);
        }
        com.vk.metrics.eventtracking.b bVar = com.vk.metrics.eventtracking.b.a;
        Bundle bundle = new rhp0().a;
        bundle.putBoolean("LOCATION_TRACKING_ENABLED", booleanValue);
        bVar.f(bundle);
        try {
            VerificationFactory.setLocationUsage(activity, booleanValue);
            return true;
        } catch (Exception e) {
            L.i(e);
            return true;
        }
    }

    @Override // com.vk.media.player.video.view.SimpleVideoView.i
    public void b() {
        SimpleVideoView simpleVideoView = (SimpleVideoView) this.b;
        lo9 lo9Var = (lo9) this.c;
        if (simpleVideoView.I) {
            lo9Var.x();
            SimpleVideoView.i iVar = lo9Var.x;
            if (iVar != null) {
                iVar.b();
            }
        }
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        gzs gzsVar = (gzs) this.b;
        UIBlockHint uIBlockHint = (UIBlockHint) this.c;
        gzsVar.invoke();
        pla.e().b().b(uIBlockHint.y);
    }
}
