package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import defpackage.u091;

/* loaded from: classes11.dex */
public final class zbs extends com.google.android.gms.internal.p000authapi.zba implements IInterface {
    public zbs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void zbc(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbrVar);
        u091.c(zba, googleSignInOptions);
        zbb(103, zba);
    }

    public final void zbd(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbrVar);
        u091.c(zba, googleSignInOptions);
        zbb(102, zba);
    }

    public final void zbe(zbr zbrVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbrVar);
        u091.c(zba, googleSignInOptions);
        zbb(101, zba);
    }
}
