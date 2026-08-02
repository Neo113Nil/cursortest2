package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzdg extends zzs {
    final /* synthetic */ atx0 zza;

    public zzdg(atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.identity.zzs, com.google.android.gms.internal.identity.zzt
    public final void zzb(int i, String[] strArr) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        ntx0.a(new Status(i), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzs, com.google.android.gms.internal.identity.zzt
    public final void zzc(int i, String[] strArr) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        ntx0.a(new Status(i), null, this.zza);
    }

    @Override // com.google.android.gms.internal.identity.zzs, com.google.android.gms.internal.identity.zzt
    public final void zzd(int i, PendingIntent pendingIntent) {
        if (i != 0 && (i < 1000 || i >= 1006)) {
            i = 13;
        }
        ntx0.a(new Status(i), null, this.zza);
    }
}
