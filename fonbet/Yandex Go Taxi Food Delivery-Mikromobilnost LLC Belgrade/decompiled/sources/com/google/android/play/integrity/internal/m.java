package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class m extends b implements n {
    public static n b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return queryLocalInterface instanceof n ? (n) queryLocalInterface : new l(iBinder);
    }

    @Override // com.google.android.play.integrity.internal.n
    public abstract /* synthetic */ void c(Bundle bundle, r rVar) throws RemoteException;

    @Override // com.google.android.play.integrity.internal.n
    public abstract /* synthetic */ void d(Bundle bundle, p pVar) throws RemoteException;
}
