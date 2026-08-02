package com.google.android.play.integrity.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.bo61;

/* loaded from: classes11.dex */
public final class l extends a implements n {
    public l(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void c(Bundle bundle, r rVar) throws RemoteException {
        Parcel a = a();
        int i = bo61.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        a.writeStrongBinder(rVar);
        b(3, a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.integrity.internal.n
    public final void d(Bundle bundle, p pVar) throws RemoteException {
        Parcel a = a();
        int i = bo61.a;
        a.writeInt(1);
        bundle.writeToParcel(a, 0);
        a.writeStrongBinder(pVar);
        b(2, a);
    }
}
