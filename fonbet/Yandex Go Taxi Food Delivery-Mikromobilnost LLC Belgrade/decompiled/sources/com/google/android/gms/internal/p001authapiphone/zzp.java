package com.google.android.gms.internal.p001authapiphone;

import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;
import defpackage.tjb1;

/* loaded from: classes11.dex */
final class zzp extends zzd {
    final /* synthetic */ atx0 zza;

    public zzp(tjb1 tjb1Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzd, com.google.android.gms.internal.p001authapiphone.zze
    public final void zzb(Status status, int i) {
        ntx0.a(status, Integer.valueOf(i), this.zza);
    }
}
