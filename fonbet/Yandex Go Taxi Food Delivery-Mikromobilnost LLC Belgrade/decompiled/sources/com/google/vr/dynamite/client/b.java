package com.google.vr.dynamite.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public final class b extends com.google.ar.core.dependencies.c implements INativeLibraryLoader {
    public b(IBinder iBinder) {
        super(iBinder, "com.google.vr.dynamite.client.INativeLibraryLoader");
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final int checkVersion(String str) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(2, a);
        int readInt = b.readInt();
        b.recycle();
        return readInt;
    }

    @Override // com.google.vr.dynamite.client.INativeLibraryLoader
    public final long initializeAndLoadNativeLibrary(String str) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        Parcel b = b(1, a);
        long readLong = b.readLong();
        b.recycle();
        return readLong;
    }
}
