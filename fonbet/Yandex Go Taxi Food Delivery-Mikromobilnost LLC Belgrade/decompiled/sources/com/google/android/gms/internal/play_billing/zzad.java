package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.d791;

/* loaded from: classes11.dex */
public abstract class zzad extends zzar implements zzae {
    public zzad() {
        super("com.android.vending.billing.IInAppBillingGetBillingConfigCallback");
    }

    public abstract /* synthetic */ void zza(Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.internal.play_billing.zzar
    public final boolean zzb(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) d791.a(parcel);
        d791.b(parcel);
        zza(bundle);
        parcel2.writeNoException();
        return true;
    }
}
