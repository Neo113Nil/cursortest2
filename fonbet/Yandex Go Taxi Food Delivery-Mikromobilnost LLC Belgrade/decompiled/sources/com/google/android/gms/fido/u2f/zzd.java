package com.google.android.gms.fido.u2f;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.fido.zzu;
import defpackage.atx0;
import defpackage.iq11;
import defpackage.ntx0;
import defpackage.s400;

/* loaded from: classes11.dex */
final class zzd extends zzu {
    final /* synthetic */ atx0 zza;

    public zzd(iq11 iq11Var, atx0 atx0Var) {
        this.zza = atx0Var;
    }

    @Override // com.google.android.gms.internal.fido.zzu, com.google.android.gms.internal.fido.zzv
    public final void zzb(Status status, PendingIntent pendingIntent) throws RemoteException {
        ntx0.a(status, new s400(), this.zza);
    }
}
