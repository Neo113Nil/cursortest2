package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import defpackage.da91;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzgd extends zzbm implements zzge {
    public zzgd() {
        super("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(zzoh.CREATOR);
        da91.f(parcel);
        zze(createTypedArrayList);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zzge
    public abstract /* synthetic */ void zze(List list) throws RemoteException;
}
