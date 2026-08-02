package com.google.android.gms.iid;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cloudmessaging.IMessengerCompat;
import com.google.android.gms.internal.gcm.zzd;
import defpackage.cm91;

/* loaded from: classes11.dex */
public final class zzm extends zzd implements zzl {
    public zzm(IBinder iBinder) {
        super(iBinder, IMessengerCompat.DESCRIPTOR);
    }

    @Override // com.google.android.gms.iid.zzl
    public final void send(Message message) throws RemoteException {
        Parcel zzd = zzd();
        int i = cm91.a;
        if (message == null) {
            zzd.writeInt(0);
        } else {
            zzd.writeInt(1);
            message.writeToParcel(zzd, 0);
        }
        zze(1, zzd);
    }
}
