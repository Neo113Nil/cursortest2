package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class h extends b implements i {
    public static i b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IExpressIntegrityService");
        return queryLocalInterface instanceof i ? (i) queryLocalInterface : new g(iBinder);
    }

    @Override // com.google.android.play.integrity.internal.i
    public abstract /* synthetic */ void c(Bundle bundle, r rVar) throws RemoteException;

    @Override // com.google.android.play.integrity.internal.i
    public abstract /* synthetic */ void d(Bundle bundle, k kVar) throws RemoteException;

    @Override // com.google.android.play.integrity.internal.i
    public abstract /* synthetic */ void e(Bundle bundle, k kVar) throws RemoteException;
}
