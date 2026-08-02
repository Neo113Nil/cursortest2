package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wc91;

/* loaded from: classes11.dex */
public abstract class zzd extends zzb implements zze {
    public zzd() {
        super("com.google.android.gms.auth.api.phone.internal.IAutofillPermissionStateCallback");
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator<Status> creator = Status.CREATOR;
        int i3 = wc91.a;
        Status createFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
        int readInt = parcel.readInt();
        wc91.a(parcel);
        zzb(createFromParcel, readInt);
        return true;
    }

    @Override // com.google.android.gms.internal.p001authapiphone.zze
    public abstract /* synthetic */ void zzb(Status status, int i) throws RemoteException;
}
