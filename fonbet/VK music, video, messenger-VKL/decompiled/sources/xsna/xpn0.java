package xsna;

import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.adapter.a;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;

/* compiled from: SystemCameraInteractor.kt */
/* loaded from: classes15.dex */
public final class xpn0 extends wqn0 implements jba0 {
    public final GalleryFragmentImpl h;
    public final t4t i;
    public final io.reactivex.rxjava3.disposables.b j;
    public final String k;

    public xpn0(GalleryFragmentImpl galleryFragmentImpl, t4t t4tVar, r3t r3tVar, io.reactivex.rxjava3.disposables.b bVar, myh myhVar, dne dneVar, String str) {
        super(galleryFragmentImpl, t4tVar, r3tVar, dneVar);
        this.h = galleryFragmentImpl;
        this.i = t4tVar;
        this.j = bVar;
        this.k = str;
    }

    @Override // xsna.jba0
    public final void D() {
        GalleryFragmentImpl galleryFragmentImpl = this.h;
        jbs jbsVar = new jbs(galleryFragmentImpl);
        g8n0 g8n0Var = new g8n0(this, 1);
        FragmentActivity kn = galleryFragmentImpl.kn();
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        PermissionHelper.f(permissionHelper, kn, PermissionHelper.t, R.string.vk_permissions_intent_photo, R.string.vk_permissions_intent_photo, new q34(kn, g8n0Var, jbsVar, 0), null, 32);
    }

    @Override // xsna.jba0
    public final void a(com.vk.attachpicker.adapter.a aVar) {
        Bundle bundle = new Bundle();
        if (aVar instanceof a.b) {
            bundle.putBoolean("result_story_camera", true);
        }
        if (aVar instanceof a.C0380a) {
            bundle.putBoolean("result_clips_camera", true);
        }
        Intent intent = new Intent();
        intent.putExtra("result_attachments", bundle);
        this.h.Mf(-1, intent);
    }

    @Override // xsna.jba0
    public final void b() {
        PermissionHelper permissionHelper = PermissionHelper.a;
        FragmentActivity activity = this.h.getActivity();
        permissionHelper.getClass();
        PermissionHelper.h(permissionHelper, activity, PermissionHelper.t, R.string.vk_permissions_intent_video, R.string.vk_permissions_intent_video_settings, new y3l0(this, 9), null, 64);
    }

    @Override // xsna.wqn0
    public final String d() {
        String str = this.k;
        return str != null ? fo8.a(str, "-system_camera") : "system_camera";
    }

    @Override // xsna.wqn0
    public final String e() {
        return "SystemCameraInteractor";
    }
}
