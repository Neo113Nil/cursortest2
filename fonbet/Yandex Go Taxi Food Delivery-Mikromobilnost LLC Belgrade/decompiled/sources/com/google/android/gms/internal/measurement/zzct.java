package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.da91;

/* loaded from: classes.dex */
public abstract class zzct extends zzbm implements zzcu {
    public zzct() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) da91.b(parcel, Bundle.CREATOR);
        da91.f(parcel);
        zzb(bundle);
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zzb(Bundle bundle) throws RemoteException;
}
