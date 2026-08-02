package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInResult;
import com.google.android.gms.common.api.Status;
import defpackage.u091;

/* loaded from: classes11.dex */
public abstract class zbl extends zbb implements zbm {
    public zbl() {
        super("com.google.android.gms.auth.api.identity.internal.IBeginSignInCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) u091.a(parcel, Status.CREATOR);
        BeginSignInResult beginSignInResult = (BeginSignInResult) u091.a(parcel, BeginSignInResult.CREATOR);
        u091.b(parcel);
        zbb(status, beginSignInResult);
        return true;
    }

    public abstract /* synthetic */ void zbb(Status status, BeginSignInResult beginSignInResult) throws RemoteException;
}
