package com.google.vr.dynamite.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.ar.core.dependencies.e;

/* loaded from: classes11.dex */
public final class a extends com.google.ar.core.dependencies.c implements ILoadedInstanceCreator {
    public a(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.ILoadedInstanceCreator");
    }

    @Override // com.google.vr.dynamite.client.ILoadedInstanceCreator
    public final INativeLibraryLoader newNativeLibraryLoader(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        INativeLibraryLoader bVar;
        Parcel a = a();
        e.c(a, iObjectWrapper);
        e.c(a, iObjectWrapper2);
        Parcel b = b(1, a);
        IBinder readStrongBinder = b.readStrongBinder();
        if (readStrongBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.dynamite.client.INativeLibraryLoader");
            bVar = queryLocalInterface instanceof INativeLibraryLoader ? (INativeLibraryLoader) queryLocalInterface : new b(readStrongBinder);
        }
        b.recycle();
        return bVar;
    }
}
