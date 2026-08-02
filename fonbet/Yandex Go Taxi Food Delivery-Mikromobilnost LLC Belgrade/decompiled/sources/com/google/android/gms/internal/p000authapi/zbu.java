package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SavePasswordResult;
import com.google.android.gms.common.api.Status;
import defpackage.u091;

/* loaded from: classes11.dex */
public abstract class zbu extends zbb implements zbv {
    public zbu() {
        super("com.google.android.gms.auth.api.identity.internal.ISavePasswordCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) u091.a(parcel, Status.CREATOR);
        SavePasswordResult savePasswordResult = (SavePasswordResult) u091.a(parcel, SavePasswordResult.CREATOR);
        u091.b(parcel);
        zbb(status, savePasswordResult);
        return true;
    }

    public abstract /* synthetic */ void zbb(Status status, SavePasswordResult savePasswordResult) throws RemoteException;
}
