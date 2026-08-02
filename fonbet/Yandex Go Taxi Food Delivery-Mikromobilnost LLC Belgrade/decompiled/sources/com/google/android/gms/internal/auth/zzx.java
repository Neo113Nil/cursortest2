package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.d491;

/* loaded from: classes11.dex */
final class zzx extends IStatusCallback.Stub {
    final /* synthetic */ atx0 zza;

    public zzx(d491 d491Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        d491.e(status, null, this.zza);
    }
}
