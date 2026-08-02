package com.google.android.gms.internal.auth;

import com.google.android.gms.auth.AccountChangeEventsResponse;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.d491;

/* loaded from: classes11.dex */
final class zzz extends zzl {
    final /* synthetic */ atx0 zza;

    public zzz(d491 d491Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth.zzl, com.google.android.gms.internal.auth.zzm
    public final void zzb(Status status, AccountChangeEventsResponse accountChangeEventsResponse) {
        d491.e(status, accountChangeEventsResponse, this.zza);
    }
}
