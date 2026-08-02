package com.google.android.gms.internal.identity;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.wb91;

/* loaded from: classes11.dex */
public abstract class zzs extends zzb implements zzt {
    public zzs() {
        super("com.google.android.gms.location.internal.IGeofencerCallbacks");
    }

    @Override // com.google.android.gms.internal.identity.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            int readInt = parcel.readInt();
            String[] createStringArray = parcel.createStringArray();
            wb91.d(parcel);
            zzb(readInt, createStringArray);
        } else if (i == 2) {
            int readInt2 = parcel.readInt();
            String[] createStringArray2 = parcel.createStringArray();
            wb91.d(parcel);
            zzc(readInt2, createStringArray2);
        } else {
            if (i != 3) {
                return false;
            }
            int readInt3 = parcel.readInt();
            PendingIntent pendingIntent = (PendingIntent) wb91.a(parcel, PendingIntent.CREATOR);
            wb91.d(parcel);
            zzd(readInt3, pendingIntent);
        }
        return true;
    }

    public abstract /* synthetic */ void zzb(int i, String[] strArr) throws RemoteException;

    public abstract /* synthetic */ void zzc(int i, String[] strArr) throws RemoteException;

    public abstract /* synthetic */ void zzd(int i, PendingIntent pendingIntent) throws RemoteException;
}
