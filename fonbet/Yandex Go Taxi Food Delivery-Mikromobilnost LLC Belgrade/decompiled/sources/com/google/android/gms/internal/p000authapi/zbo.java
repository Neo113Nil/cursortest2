package com.google.android.gms.internal.p000authapi;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.u091;

/* loaded from: classes11.dex */
public abstract class zbo extends zbb implements zbp {
    public zbo() {
        super("com.google.android.gms.auth.api.identity.internal.IGetPhoneNumberHintIntentCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) u091.a(parcel, Status.CREATOR);
        PendingIntent pendingIntent = (PendingIntent) u091.a(parcel, PendingIntent.CREATOR);
        u091.b(parcel);
        zbb(status, pendingIntent);
        return true;
    }

    public abstract /* synthetic */ void zbb(Status status, PendingIntent pendingIntent) throws RemoteException;
}
