package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.w391;

/* loaded from: classes11.dex */
final class zzx extends zze {
    final /* synthetic */ atx0 zza;

    public zzx(w391 w391Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zze, com.google.android.gms.internal.auth_blockstore.zzl, com.google.android.gms.internal.auth_blockstore.zzm
    public final void zza(Status status, byte[] bArr) {
        ntx0.a(status, bArr, this.zza);
    }
}
