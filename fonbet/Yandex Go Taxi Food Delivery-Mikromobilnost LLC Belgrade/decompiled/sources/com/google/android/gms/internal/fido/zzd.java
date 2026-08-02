package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.tb91;

/* loaded from: classes11.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.fido.fido2.api.IBooleanCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ClassLoader classLoader = tb91.a;
            boolean z = parcel.readInt() != 0;
            tb91.b(parcel);
            zzb(z);
        } else {
            if (i != 2) {
                return false;
            }
            Status status = (Status) tb91.a(parcel, Status.CREATOR);
            tb91.b(parcel);
            zzc(status);
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(boolean z) throws RemoteException;

    public abstract /* synthetic */ void zzc(Status status) throws RemoteException;
}
