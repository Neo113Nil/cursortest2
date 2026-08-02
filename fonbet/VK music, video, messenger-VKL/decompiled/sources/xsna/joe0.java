package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.vk.camera.ui.SuperappQrCameraActivity;
import com.vk.permission.PermissionHelper;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.qr.web2app.QrWebToAppComponent;
import com.vkontakte.android.R;
import java.util.HashSet;

/* compiled from: QrWebToAppCameraHelperFragment.kt */
/* loaded from: classes6.dex */
public final class joe0 extends Fragment {
    public koe0 i;
    public boolean j;
    public final hb0<Intent> h = registerForActivityResult(new cb0(), new keq(this, 1));
    public final m0g0 k = new m0g0(6);

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = ((QrWebToAppComponent) m7m.d(this).a(fpf0.a(QrWebToAppComponent.class))).getHandler();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (!this.j) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            Context requireContext = requireContext();
            permissionHelper.getClass();
            permissionHelper.d(requireContext, PermissionHelper.z, R.string.vk_permissions_camera_qr, R.string.vk_permissions_camera_qr, new tu80(this, 15), new bzw(this, 27));
        }
        this.j = true;
    }

    public final void tn() {
        FragmentManager supportFragmentManager = kn().getSupportFragmentManager();
        supportFragmentManager.getClass();
        androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
        aVar.q(this);
        aVar.k(false);
    }

    public final void un() {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        bVar.getClass();
        com.vk.registration.funnels.b.z(bVar, SchemeStatSak$EventScreen.QR_SCANNER, null, null, null, 30);
        int i = SuperappQrCameraActivity.g;
        Context requireContext = requireContext();
        Context requireContext2 = requireContext();
        HashSet hashSet = iah0.a;
        this.h.a(SuperappQrCameraActivity.a.a(2, requireContext, !fnj.d(requireContext2)));
    }
}
