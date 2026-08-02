package com.google.android.gms.common.api.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zab;
import defpackage.sy81;

/* loaded from: classes11.dex */
public interface IStatusCallback extends IInterface {

    public static abstract class Stub extends zab implements IStatusCallback {
        public Stub() {
            super("com.google.android.gms.common.api.internal.IStatusCallback");
        }

        public static IStatusCallback asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
            return queryLocalInterface instanceof IStatusCallback ? (IStatusCallback) queryLocalInterface : new zaby(iBinder);
        }

        @Override // com.google.android.gms.common.api.internal.IStatusCallback
        public abstract /* synthetic */ void onResult(Status status) throws RemoteException;

        @Override // com.google.android.gms.internal.base.zab
        public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                return false;
            }
            Status status = (Status) sy81.a(parcel, Status.CREATOR);
            sy81.b(parcel);
            onResult(status);
            return true;
        }
    }

    void onResult(Status status) throws RemoteException;
}
