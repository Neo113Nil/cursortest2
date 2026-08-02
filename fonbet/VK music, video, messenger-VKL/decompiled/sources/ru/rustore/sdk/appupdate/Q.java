package ru.rustore.sdk.appupdate;

import kotlin.jvm.internal.Lambda;
import xsna.izs;
import xsna.s3q0;
import xsna.vtj0;

/* loaded from: classes9.dex */
public final class Q extends Lambda implements izs<vtj0<Integer>, s3q0> {
    public Q() {
        super(1);
    }

    @Override // xsna.izs
    public final s3q0 invoke(vtj0<Integer> vtj0Var) {
        vtj0Var.a(new IllegalStateException("AppUpdateInfo object is already used. Call the method getAppUpdateInfo() again"));
        return s3q0.a;
    }
}
