package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import android.os.RemoteException;
import defpackage.atx0;
import defpackage.x891;

/* loaded from: classes11.dex */
final class zzba extends zzbb {
    public zzba(x891 x891Var, atx0 atx0Var) {
        super(x891Var, atx0Var);
    }

    @Override // com.google.android.play.core.splitinstall.zzbb, com.google.android.play.core.splitinstall.internal.zzbp, com.google.android.play.core.splitinstall.internal.zzbq
    public final void zzi(int i, Bundle bundle) throws RemoteException {
        super.zzi(i, bundle);
        this.zza.c(Integer.valueOf(i));
    }
}
