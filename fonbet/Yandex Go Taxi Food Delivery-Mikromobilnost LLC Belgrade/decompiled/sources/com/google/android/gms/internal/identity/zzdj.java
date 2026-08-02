package com.google.android.gms.internal.identity;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdj extends IStatusCallback.Stub {
    final /* synthetic */ Object zza;
    final /* synthetic */ atx0 zzb;

    public zzdj(Object obj, atx0 atx0Var) {
        this.zza = obj;
        this.zzb = atx0Var;
    }

    @Override // com.google.android.gms.common.api.internal.IStatusCallback.Stub, com.google.android.gms.common.api.internal.IStatusCallback
    public final void onResult(Status status) {
        ntx0.a(status, this.zza, this.zzb);
    }
}
