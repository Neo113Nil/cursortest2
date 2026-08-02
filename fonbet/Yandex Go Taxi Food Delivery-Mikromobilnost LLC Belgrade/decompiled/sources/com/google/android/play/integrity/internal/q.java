package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.bo61;

/* loaded from: classes11.dex */
public abstract class q extends b implements r {
    public q() {
        super("com.google.android.play.core.integrity.protocol.IRequestDialogCallback");
    }

    @Override // com.google.android.play.integrity.internal.b
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 2) {
            return false;
        }
        Parcelable.Creator creator = Bundle.CREATOR;
        Bundle bundle = (Bundle) bo61.a(parcel);
        bo61.b(parcel);
        b(bundle);
        return true;
    }

    public abstract /* synthetic */ void b(Bundle bundle) throws RemoteException;
}
