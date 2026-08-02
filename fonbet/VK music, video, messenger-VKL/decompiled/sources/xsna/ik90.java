package xsna;

import android.content.Context;
import com.vk.permission.PermissionHelper;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: PartMediaWarningDelegate.kt */
/* loaded from: classes15.dex */
public final class ik90 implements hk90 {
    public final Context b;
    public final gzs<s3q0> c;
    public final String[] d;

    public ik90(int i, Context context, gzs gzsVar) {
        String[] strArr;
        this.b = context;
        this.c = gzsVar;
        if (i == 222) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.r;
        } else if (i != 333) {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.q;
        } else {
            PermissionHelper.a.getClass();
            strArr = PermissionHelper.s;
        }
        this.d = strArr;
    }

    @Override // xsna.hk90
    public final void b() {
        if (gz80.a(34)) {
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            PermissionHelper.g(permissionHelper, this.b, PermissionHelper.f, this.d, 0, 0, new vv20(this, 10), null, null, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE);
        }
    }
}
