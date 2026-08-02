package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.a4z0;
import xsna.ctj0;
import xsna.izs;
import xsna.ntj0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class C extends Lambda implements izs<s3q0, ctj0<Integer>> {
    public final /* synthetic */ a4z0 a;
    public final /* synthetic */ AppUpdateInfo b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C(a4z0 a4z0Var, AppUpdateInfo appUpdateInfo) {
        super(1);
        this.a = a4z0Var;
        this.b = appUpdateInfo;
    }

    @Override // xsna.izs
    public final ctj0<Integer> invoke(s3q0 s3q0Var) {
        a4z0 a4z0Var = this.a;
        AppUpdateInfo appUpdateInfo = this.b;
        a4z0Var.getClass();
        return new ntj0(new w(a4z0Var, appUpdateInfo));
    }
}
