package xsna;

import android.content.Context;
import com.vk.permission.PermissionHelper;
import com.vk.superapp.permission.js.bridge.api.events.GetGrantedPermissions$Response;
import kotlin.collections.builders.ListBuilder;

/* compiled from: JsPermissionDelegateImpl.kt */
/* loaded from: classes6.dex */
public final class y5y extends u5y {
    @Override // xsna.u5y
    public final ListBuilder a(Context context) {
        ListBuilder e = e43.e();
        PermissionHelper.a.getClass();
        if (PermissionHelper.b(context, PermissionHelper.h)) {
            e.add(GetGrantedPermissions$Response.Data.Permissions.LOCATION);
        }
        if (PermissionHelper.b(context, PermissionHelper.l)) {
            e.add(GetGrantedPermissions$Response.Data.Permissions.CAMERA);
        }
        return e.g();
    }
}
