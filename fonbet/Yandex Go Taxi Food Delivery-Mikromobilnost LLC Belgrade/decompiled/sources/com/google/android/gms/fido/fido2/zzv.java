package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ywq;
import java.util.List;

/* loaded from: classes11.dex */
final class zzv extends com.google.android.gms.internal.fido.zzf {
    final /* synthetic */ atx0 zza;

    public zzv(ywq ywqVar, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.fido.zzf, com.google.android.gms.internal.fido.zzg
    public final void zzb(List list) {
        this.zza.a(list);
    }

    @Override // com.google.android.gms.internal.fido.zzf, com.google.android.gms.internal.fido.zzg
    public final void zzc(Status status) {
        this.zza.b(new ApiException(status));
    }
}
