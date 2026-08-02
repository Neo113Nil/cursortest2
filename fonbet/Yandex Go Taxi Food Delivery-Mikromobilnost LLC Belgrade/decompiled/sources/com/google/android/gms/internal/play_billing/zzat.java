package com.google.android.gms.internal.play_billing;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.d791;

/* loaded from: classes11.dex */
public final class zzat extends zzaq implements zzav {
    public zzat(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.play.billingtestcompanion.aidl.IBillingOverrideService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.play_billing.zzav
    public final void zza(String str, String str2, zzax zzaxVar) throws RemoteException {
        Parcel zzu = zzu();
        zzu.writeString(str);
        zzu.writeString(str2);
        int i = d791.a;
        zzu.writeStrongBinder(zzaxVar);
        zzx(1, zzu);
    }
}
