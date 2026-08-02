package com.google.android.gms.auth.api.signin.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* loaded from: classes11.dex */
final class zbj extends zba {
    final /* synthetic */ b zba;

    public zbj(b bVar) {
        this.zba = bVar;
    }

    @Override // com.google.android.gms.auth.api.signin.internal.zba, com.google.android.gms.auth.api.signin.internal.zbq, com.google.android.gms.auth.api.signin.internal.zbr
    public final void zbb(Status status) throws RemoteException {
        this.zba.a(status);
    }
}
