package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import defpackage.u091;

/* loaded from: classes11.dex */
public final class zbk extends zba implements IInterface {
    public zbk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    public final void zbc(zbj zbjVar, AuthorizationRequest authorizationRequest) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbjVar);
        u091.c(zba, authorizationRequest);
        zbb(1, zba);
    }
}
