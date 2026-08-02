package com.google.android.gms.internal.fido;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.tb91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzf extends zzb implements zzg {
    public zzf() {
        super("com.google.android.gms.fido.fido2.api.ICredentialListCallback");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            ArrayList readArrayList = parcel.readArrayList(tb91.a);
            tb91.b(parcel);
            zzb(readArrayList);
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

    public abstract /* synthetic */ void zzb(List list) throws RemoteException;

    public abstract /* synthetic */ void zzc(Status status) throws RemoteException;
}
