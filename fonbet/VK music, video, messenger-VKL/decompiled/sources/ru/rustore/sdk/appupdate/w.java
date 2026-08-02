package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.a4z0;
import xsna.cfz;
import xsna.izs;
import xsna.pzy0;
import xsna.s3q0;
import xsna.vtj0;
import xsna.xx1;

/* loaded from: classes9.dex */
public final class w extends Lambda implements izs<vtj0<Integer>, s3q0> {
    public final /* synthetic */ a4z0 a;
    public final /* synthetic */ AppUpdateInfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(a4z0 a4z0Var, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.a = a4z0Var;
        this.b = appUpdateInfo;
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<Integer> vtj0Var) {
        Object failure;
        vtj0<Integer> vtj0Var2 = vtj0Var;
        a4z0 a4z0Var = this.a;
        AppUpdateInfo appUpdateInfo = this.b;
        try {
            Context context = a4z0Var.a;
            Intent intent = new Intent("ru.vk.store.FlexibleAppUpdate");
            intent.putExtras(pzy0.a(appUpdateInfo));
            xx1.z(context, intent, new cfz(vtj0Var2, 26));
            appUpdateInfo.markIsUsed$sdk_public_appupdate_release();
            failure = s3q0.a;
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        Throwable a = Result.a(failure);
        if (a != null) {
            vtj0Var2.a(a);
        }
        return s3q0.a;
    }
}
