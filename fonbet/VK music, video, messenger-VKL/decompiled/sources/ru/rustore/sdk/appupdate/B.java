package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.ServiceConnection;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.a4z0;
import xsna.izs;
import xsna.s3q0;
import xsna.v5y0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class B extends Lambda implements izs<vtj0<s3q0>, ServiceConnection> {
    public final /* synthetic */ AppUpdateInfo a;
    public final /* synthetic */ a4z0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(a4z0 a4z0Var, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.a = appUpdateInfo;
        this.b = a4z0Var;
    }

    @Override // xsna.izs
    public final ServiceConnection invoke(vtj0<s3q0> vtj0Var) {
        vtj0<s3q0> vtj0Var2 = vtj0Var;
        this.a.markIsUsed$sdk_public_appupdate_release();
        Context context = this.b.a;
        return new v5y0(context, context.getPackageName(), new z(vtj0Var2), new A(vtj0Var2));
    }
}
