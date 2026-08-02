package xsna;

import android.content.Context;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;

/* compiled from: ImVideoBridge.kt */
/* loaded from: classes2.dex */
public interface iew {
    default void a(Context context, AttachVideo attachVideo) {
        vf1 vf1Var = new vf1(10, attachVideo, context);
        if (gz80.a(34)) {
            vf1Var.invoke();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        permissionHelper.getClass();
        permissionHelper.d(context, PermissionHelper.e, R.string.vk_permissions_storage, R.string.vk_permissions_storage, vf1Var, new q8w(1));
    }
}
