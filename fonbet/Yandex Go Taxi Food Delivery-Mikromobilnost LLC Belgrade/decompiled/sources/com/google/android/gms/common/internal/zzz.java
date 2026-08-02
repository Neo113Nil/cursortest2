package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yc91;

/* loaded from: classes11.dex */
public abstract class zzz extends com.google.android.gms.internal.common.zzb implements IGmsCallbacks {
    public zzz() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    public abstract /* synthetic */ void onPostInitComplete(int i, IBinder iBinder, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.common.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            IBinder readStrongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) yc91.b(parcel, Bundle.CREATOR);
            yc91.e(parcel);
            onPostInitComplete(readInt, readStrongBinder, bundle);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            Bundle bundle2 = (Bundle) yc91.b(parcel, Bundle.CREATOR);
            yc91.e(parcel);
            zzb(readInt2, bundle2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            zzj zzjVar = (zzj) yc91.b(parcel, zzj.CREATOR);
            yc91.e(parcel);
            zzc(readInt3, readStrongBinder2, zzjVar);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(int i, Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void zzc(int i, IBinder iBinder, zzj zzjVar) throws RemoteException;
}
