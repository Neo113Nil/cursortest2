package com.google.android.gms.internal.p000authapi;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.GetPhoneNumberHintIntentRequest;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.u091;

/* loaded from: classes11.dex */
public final class zbw extends zba implements IInterface {
    public zbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.identity.internal.ISignInService");
    }

    public final void zbc(zbm zbmVar, BeginSignInRequest beginSignInRequest) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbmVar);
        u091.c(zba, beginSignInRequest);
        zbb(1, zba);
    }

    public final void zbd(zbp zbpVar, GetPhoneNumberHintIntentRequest getPhoneNumberHintIntentRequest, String str) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbpVar);
        u091.c(zba, getPhoneNumberHintIntentRequest);
        zba.writeString(str);
        zbb(4, zba);
    }

    public final void zbe(zbr zbrVar, GetSignInIntentRequest getSignInIntentRequest) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, zbrVar);
        u091.c(zba, getSignInIntentRequest);
        zbb(3, zba);
    }

    public final void zbf(IStatusCallback iStatusCallback, String str) throws RemoteException {
        Parcel zba = zba();
        u091.d(zba, iStatusCallback);
        zba.writeString(str);
        zbb(2, zba);
    }
}
