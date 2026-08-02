package com.google.android.gms.fido.fido2;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzd;
import defpackage.atx0;
import defpackage.ywq;

/* loaded from: classes11.dex */
final class zzu extends zzd {
    final /* synthetic */ atx0 zza;

    public zzu(ywq ywqVar, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.fido.zzd, com.google.android.gms.internal.fido.zze
    public final void zzb(boolean z) {
        this.zza.a(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.internal.fido.zzd, com.google.android.gms.internal.fido.zze
    public final void zzc(Status status) {
        this.zza.b(new ApiException(status));
    }
}
