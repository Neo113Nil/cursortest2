package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.RemoteException;
import defpackage.sy81;

/* loaded from: classes.dex */
public abstract class zad extends com.google.android.gms.internal.base.zab implements zae {
    public zad() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 3:
                sy81.b(parcel);
                break;
            case 4:
                sy81.b(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                sy81.b(parcel);
                break;
            case 7:
                sy81.b(parcel);
                break;
            case 8:
                zak zakVar = (zak) sy81.a(parcel, zak.CREATOR);
                sy81.b(parcel);
                zab(zakVar);
                break;
            case 9:
                sy81.b(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }

    public abstract /* synthetic */ void zab(zak zakVar) throws RemoteException;
}
