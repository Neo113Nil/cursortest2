package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.da91;

/* loaded from: classes.dex */
public abstract class zzcz extends zzbm implements zzda {
    public zzcz() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            Bundle bundle = (Bundle) da91.b(parcel, Bundle.CREATOR);
            long readLong = parcel.readLong();
            da91.f(parcel);
            zze(readString, readString2, bundle, readLong);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int zzf = zzf();
            parcel2.writeNoException();
            parcel2.writeInt(zzf);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzda
    public abstract /* synthetic */ void zze(String str, String str2, Bundle bundle, long j) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzda
    public abstract /* synthetic */ int zzf() throws RemoteException;
}
