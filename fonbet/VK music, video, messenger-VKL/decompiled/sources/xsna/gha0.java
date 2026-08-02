package xsna;

import android.content.Context;
import com.vk.dto.photo.Photo;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;

/* compiled from: PhotosUtilsImpl.kt */
/* loaded from: classes4.dex */
public final class gha0 implements eha0 {
    public final PermissionHelper a;

    public gha0(PermissionHelper permissionHelper) {
        this.a = permissionHelper;
    }

    @Override // xsna.eha0
    public final String a(int i, Photo photo) {
        return photo.Ab(i, i).d.d;
    }

    @Override // xsna.eha0
    public final void b(Context context, String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        nps npsVar = new nps(str, context, gzsVar, gzsVar2, 1);
        if (gz80.a(34)) {
            npsVar.invoke();
            return;
        }
        PermissionHelper permissionHelper = this.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, npsVar, null);
    }
}
