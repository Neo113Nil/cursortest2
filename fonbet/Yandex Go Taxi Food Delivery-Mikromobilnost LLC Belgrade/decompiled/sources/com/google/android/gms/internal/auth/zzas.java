package com.google.android.gms.internal.auth;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.accounttransfer.DeviceMetaData;
import com.google.android.gms.common.api.Status;
import defpackage.vc91;

/* loaded from: classes11.dex */
public abstract class zzas extends zzb implements zzat {
    public zzas() {
        super("com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferCallbacks");
    }

    @Override // com.google.android.gms.internal.auth.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                Status status = (Status) vc91.a(parcel, Status.CREATOR);
                vc91.b(parcel);
                zzh(status);
                return true;
            case 2:
                Status status2 = (Status) vc91.a(parcel, Status.CREATOR);
                com.google.android.gms.auth.api.accounttransfer.zzw zzwVar = (com.google.android.gms.auth.api.accounttransfer.zzw) vc91.a(parcel, com.google.android.gms.auth.api.accounttransfer.zzw.CREATOR);
                vc91.b(parcel);
                zzf(status2, zzwVar);
                return true;
            case 3:
                Status status3 = (Status) vc91.a(parcel, Status.CREATOR);
                com.google.android.gms.auth.api.accounttransfer.zzo zzoVar = (com.google.android.gms.auth.api.accounttransfer.zzo) vc91.a(parcel, com.google.android.gms.auth.api.accounttransfer.zzo.CREATOR);
                vc91.b(parcel);
                zzg(status3, zzoVar);
                return true;
            case 4:
                zze();
                return true;
            case 5:
                Status status4 = (Status) vc91.a(parcel, Status.CREATOR);
                vc91.b(parcel);
                zzd(status4);
                return true;
            case 6:
                byte[] createByteArray = parcel.createByteArray();
                vc91.b(parcel);
                zzb(createByteArray);
                return true;
            case 7:
                DeviceMetaData deviceMetaData = (DeviceMetaData) vc91.a(parcel, DeviceMetaData.CREATOR);
                vc91.b(parcel);
                zzc(deviceMetaData);
                return true;
            default:
                return false;
        }
    }

    public abstract /* synthetic */ void zzb(byte[] bArr) throws RemoteException;

    public abstract /* synthetic */ void zzc(DeviceMetaData deviceMetaData) throws RemoteException;

    public abstract /* synthetic */ void zzd(Status status) throws RemoteException;

    public abstract /* synthetic */ void zze() throws RemoteException;

    public abstract /* synthetic */ void zzf(Status status, com.google.android.gms.auth.api.accounttransfer.zzw zzwVar) throws RemoteException;

    public abstract /* synthetic */ void zzg(Status status, com.google.android.gms.auth.api.accounttransfer.zzo zzoVar) throws RemoteException;

    public abstract /* synthetic */ void zzh(Status status) throws RemoteException;
}
