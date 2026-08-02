package com.google.android.gms.internal.play_billing;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.d791;

/* loaded from: classes11.dex */
public abstract class zzaw extends zzar implements zzax {
    public zzaw() {
        super("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideServiceCallback");
    }

    public abstract /* synthetic */ void zza(int i) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        int readInt = parcel.readInt();
        d791.b(parcel);
        zza(readInt);
        return true;
    }
}
