package com.google.android.gms.internal.auth;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.atx0;
import defpackage.ja91;
import defpackage.ntx0;

/* loaded from: classes11.dex */
final class zzbn extends zzbd {
    final /* synthetic */ atx0 zza;

    public zzbn(ja91 ja91Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.auth.zzbd, com.google.android.gms.internal.auth.zzbf, com.google.android.gms.internal.auth.zzbg
    public final void zzc(String str) throws RemoteException {
        ntx0.a(str != null ? Status.RESULT_SUCCESS : new Status(3006), str, this.zza);
    }
}
