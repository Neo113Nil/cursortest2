package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.w391;

/* loaded from: classes11.dex */
final class zzv extends zzn {
    final /* synthetic */ atx0 zza;

    public zzv(w391 w391Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzn, com.google.android.gms.internal.auth_blockstore.zzo
    public final void zza(Status status, int i) {
        ntx0.a(status, Integer.valueOf(i), this.zza);
    }
}
