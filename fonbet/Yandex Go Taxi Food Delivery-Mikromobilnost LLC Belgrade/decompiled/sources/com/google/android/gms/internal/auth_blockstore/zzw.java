package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.w391;

/* loaded from: classes11.dex */
final class zzw extends zze {
    final /* synthetic */ atx0 zza;

    public zzw(w391 w391Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzl, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zzb(Status status, RetrieveBytesResponse retrieveBytesResponse) {
        ntx0.a(status, retrieveBytesResponse, this.zza);
    }
}
