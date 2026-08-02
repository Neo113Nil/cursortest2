package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.bo61;

/* loaded from: classes11.dex */
public abstract class j extends b implements k {
    public j() {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            Parcelable.Creator creator = Bundle.CREATOR;
            Bundle bundle = (Bundle) bo61.a(parcel);
            bo61.b(parcel);
            e(bundle);
            return true;
        }
        if (i == 3) {
            Parcelable.Creator creator2 = Bundle.CREATOR;
            Bundle bundle2 = (Bundle) bo61.a(parcel);
            bo61.b(parcel);
            c(bundle2);
            return true;
        }
        if (i == 4) {
            Parcelable.Creator creator3 = Bundle.CREATOR;
            Bundle bundle3 = (Bundle) bo61.a(parcel);
            bo61.b(parcel);
            d(bundle3);
            return true;
        }
        if (i != 5) {
            return false;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        Bundle bundle4 = (Bundle) bo61.a(parcel);
        bo61.b(parcel);
        b(bundle4);
        return true;
    }

    @Deprecated
    public abstract /* synthetic */ void b(Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void c(Bundle bundle) throws RemoteException;

    @Deprecated
    public abstract /* synthetic */ void d(Bundle bundle) throws RemoteException;

    public abstract /* synthetic */ void e(Bundle bundle) throws RemoteException;
}
