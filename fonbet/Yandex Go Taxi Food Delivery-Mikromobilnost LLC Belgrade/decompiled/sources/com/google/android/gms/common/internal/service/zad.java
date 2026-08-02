package com.google.android.gms.common.internal.service;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.o25;

/* loaded from: classes11.dex */
final class zad extends zaa {
    private final o25 zaa;

    public zad(o25 o25Var) {
        this.zaa = o25Var;
    }

    @Override // com.google.android.gms.common.internal.service.zaa, com.google.android.gms.common.internal.service.zaj, com.google.android.gms.common.internal.service.zak
    public final void zab(int i) throws RemoteException {
        this.zaa.a(new Status(i));
    }
}
