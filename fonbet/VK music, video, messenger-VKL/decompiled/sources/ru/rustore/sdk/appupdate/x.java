package ru.rustore.sdk.appupdate;

import android.content.Context;
import android.content.Intent;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.core.exception.RuStoreNotInstalledException;
import xsna.a4z0;
import xsna.hhj0;
import xsna.inj;
import xsna.izs;
import xsna.s3q0;
import xsna.vtj0;
import xsna.xx1;

/* loaded from: classes9.dex */
public final class x extends Lambda implements izs<vtj0<s3q0>, s3q0> {
    public final /* synthetic */ a4z0 a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(a4z0 a4z0Var, int i) {
        super(1);
        this.a = a4z0Var;
        this.b = i;
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<s3q0> vtj0Var) {
        Object failure;
        vtj0<s3q0> vtj0Var2 = vtj0Var;
        a4z0 a4z0Var = this.a;
        int i = this.b;
        try {
            Context context = a4z0Var.a;
            if (!inj.a(context, "ru.vk.store.qa") && !inj.a(context, "ru.vk.store")) {
                vtj0Var2.a(new RuStoreNotInstalledException());
            }
            Intent intent = new Intent("ru.vk.store.FlexibleAppUpdate");
            intent.putExtra("RUN_INSTALL", true);
            intent.putExtra("PACKAGE_NAME", context.getPackageName());
            intent.putExtra("AppUpdateType", i);
            xx1.z(context, intent, new hhj0(vtj0Var2, 14));
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
