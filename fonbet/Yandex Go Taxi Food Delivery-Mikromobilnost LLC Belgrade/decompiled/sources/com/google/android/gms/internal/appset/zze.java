package com.google.android.gms.internal.appset;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.appset.zzc;
import com.google.android.gms.common.api.Status;
import defpackage.uc91;

/* loaded from: classes11.dex */
public abstract class zze extends zzb implements zzf {
    public zze() {
        super("com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    @Override // com.google.android.gms.internal.appset.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = uc91.a;
        zzb(parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), parcel.readInt() != 0 ? zzc.CREATOR.createFromParcel(parcel) : null);
        return true;
    }

    @Override // com.google.android.gms.internal.appset.zzf
    public abstract /* synthetic */ void zzb(Status status, zzc zzcVar) throws RemoteException;
}
