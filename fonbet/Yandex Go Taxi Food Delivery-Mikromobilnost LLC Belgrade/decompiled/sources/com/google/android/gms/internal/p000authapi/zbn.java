package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import defpackage.u091;

/* loaded from: classes11.dex */
public final class zbn extends zba implements IInterface {
    public zbn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
    }

    public final void zbc(zbt zbtVar, SaveAccountLinkingTokenRequest saveAccountLinkingTokenRequest) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbtVar);
        u091.c(zba, saveAccountLinkingTokenRequest);
        zbb(1, zba);
    }

    public final void zbd(zbv zbvVar, SavePasswordRequest savePasswordRequest) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbvVar);
        u091.c(zba, savePasswordRequest);
        zbb(2, zba);
    }
}
