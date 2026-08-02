package com.google.android.gms.internal.play_billing;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.d791;

/* loaded from: classes11.dex */
public abstract class zzaj extends zzar implements zzak {
    public zzaj() {
        super("com.android.vending.billing.IInAppBillingIsExternalPaymentAvailableCallback");
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
        return true;
    }
}
