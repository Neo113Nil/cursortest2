package com.google.android.gms.internal.fido;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.tb91;

/* loaded from: classes11.dex */
public abstract class zzu extends zzb implements zzv {
    public zzu() {
        super("com.google.android.gms.fido.u2f.internal.regular.IU2fAppCallbacks");
    }

    @Override // com.google.android.gms.internal.fido.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) tb91.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) tb91.a(parcel, PendingIntent.CREATOR);
        tb91.b(parcel);
        zzb(status, pendingIntent);
        return true;
    }

    public abstract /* synthetic */ void zzb(Status status, PendingIntent pendingIntent) throws RemoteException;
}
