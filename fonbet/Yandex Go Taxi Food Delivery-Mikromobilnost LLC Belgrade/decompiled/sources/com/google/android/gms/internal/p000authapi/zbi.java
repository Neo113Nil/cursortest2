package com.google.android.gms.internal.p000authapi;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationResult;
import com.google.android.gms.common.api.Status;
import defpackage.u091;

/* loaded from: classes11.dex */
public abstract class zbi extends zbb implements zbj {
    public zbi() {
        super("com.google.android.gms.auth.api.identity.internal.IAuthorizationCallback");
    }

    @Override // com.google.android.gms.internal.p000authapi.zbb
    public final boolean zba(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) u091.a(parcel, Status.CREATOR);
        AuthorizationResult authorizationResult = (AuthorizationResult) u091.a(parcel, AuthorizationResult.CREATOR);
        u091.b(parcel);
        zbb(status, authorizationResult);
        return true;
    }

    @Override // com.google.android.gms.internal.p000authapi.zbj
    public abstract /* synthetic */ void zbb(Status status, AuthorizationResult authorizationResult) throws RemoteException;
}
