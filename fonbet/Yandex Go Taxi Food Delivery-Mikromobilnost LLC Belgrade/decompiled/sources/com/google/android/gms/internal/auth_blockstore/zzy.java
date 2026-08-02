package com.google.android.gms.internal.auth_blockstore;

import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.w391;

/* loaded from: classes11.dex */
final class zzy extends zzh {
    final /* synthetic */ atx0 zza;

    public zzy(w391 w391Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth_blockstore.zzh, com.google.android.gms.internal.auth_blockstore.zzi
    public final void zza(Status status, boolean z) {
        ntx0.a(status, Boolean.valueOf(z), this.zza);
    }
}
