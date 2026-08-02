package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateParams;
import xsna.a4z0;
import xsna.izs;
import xsna.rwx;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class v extends Lambda implements izs<vtj0<AppUpdateInfo>, ServiceConnection> {
    public final /* synthetic */ a4z0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(a4z0 a4z0Var) {
        super(1);
        this.a = a4z0Var;
    }

    @Override // xsna.izs
    public final ServiceConnection invoke(vtj0<AppUpdateInfo> vtj0Var) {
        PackageInfo packageInfo;
        PackageManager.PackageInfoFlags of;
        vtj0<AppUpdateInfo> vtj0Var2 = vtj0Var;
        Context context = this.a.a;
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            of = PackageManager.PackageInfoFlags.of(1L);
            packageInfo = packageManager.getPackageInfo(packageName, of);
        } else {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 1);
        }
        AppUpdateParams appUpdateParams = new AppUpdateParams(packageInfo.getLongVersionCode());
        a4z0 a4z0Var = this.a;
        Context context2 = a4z0Var.a;
        return new rwx(context2, a4z0Var.b, context2.getPackageName(), appUpdateParams, new t(vtj0Var2), new u(vtj0Var2));
    }
}
