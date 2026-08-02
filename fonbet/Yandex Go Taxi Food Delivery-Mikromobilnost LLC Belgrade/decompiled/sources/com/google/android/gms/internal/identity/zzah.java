package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.y591;

/* loaded from: classes11.dex */
final class zzah extends IStatusCallback.Stub {
    final /* synthetic */ atx0 zza;

    public zzah(y591 y591Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        ntx0.a(status, null, this.zza);
    }
}
