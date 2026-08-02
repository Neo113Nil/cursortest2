package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* loaded from: classes11.dex */
public abstract class zzau extends zzar implements zzav {
    public static zzav zzc(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
        return queryLocalInterface instanceof zzav ? (zzav) queryLocalInterface : new zzat(iBinder);
    }

    @Override // com.google.android.gms.internal.play_billing.zzav
    public abstract /* synthetic */ void zza(String str, String str2, zzax zzaxVar) throws RemoteException;
}
