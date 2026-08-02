package com.google.android.gms.internal.auth;

import android.os.Bundle;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.d491;

/* loaded from: classes11.dex */
final class zzy extends zzj {
    final /* synthetic */ atx0 zza;

    public zzy(d491 d491Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth.zzj, com.google.android.gms.internal.auth.zzk
    public final void zzb(Status status, Bundle bundle) {
        d491.e(status, bundle, this.zza);
    }
}
