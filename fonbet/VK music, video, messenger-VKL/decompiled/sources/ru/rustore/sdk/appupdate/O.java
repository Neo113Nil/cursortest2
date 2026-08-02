package ru.rustore.sdk.appupdate;

import android.content.Context;
import java.util.Iterator;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateOptions;
import ru.rustore.sdk.appupdate.model.InstallState;
import xsna.h6x;
import xsna.izs;
import xsna.jiy0;
import xsna.mrn0;
import xsna.r9y0;
import xsna.s3q0;
import xsna.xx1;

/* loaded from: classes9.dex */
public final class O extends Lambda implements izs<InstallState, s3q0> {
    public final /* synthetic */ mrn0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public O(mrn0 mrn0Var) {
        super(1);
        this.a = mrn0Var;
    }

    @Override // xsna.izs
    public final s3q0 invoke(InstallState installState) {
        InstallState installState2 = installState;
        mrn0 mrn0Var = this.a;
        AppUpdateOptions appUpdateOptions = mrn0Var.d;
        r9y0 r9y0Var = mrn0Var.c;
        if (appUpdateOptions != null) {
            int appUpdateType = appUpdateOptions.getAppUpdateType();
            int installStatus = installState2.getInstallStatus();
            if (installStatus == 1) {
                r9y0Var.getClass();
                jiy0 jiy0Var = new jiy0("updateStart.downloaded", r9y0Var.a(appUpdateType));
                Context context = r9y0Var.d;
                xx1.A(context, context.getPackageName(), jiy0Var);
            } else if (installStatus == 3) {
                r9y0Var.b(appUpdateType, String.valueOf(installState2.getInstallErrorCode()));
            }
        }
        if (installState2.getInstallStatus() == 3) {
            this.a.d = null;
        }
        Iterator<h6x> it = this.a.b.iterator();
        while (it.hasNext()) {
            it.next().a(installState2);
        }
        return s3q0.a;
    }
}
