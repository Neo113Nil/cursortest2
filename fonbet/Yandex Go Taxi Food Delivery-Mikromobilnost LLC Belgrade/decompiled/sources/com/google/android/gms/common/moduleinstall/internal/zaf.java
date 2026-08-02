package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.internal.IStatusCallback;
import defpackage.sy81;

/* loaded from: classes11.dex */
public final class zaf extends com.google.android.gms.internal.base.zaa implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        sy81.d(zaa, zaeVar);
        sy81.c(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        sy81.d(zaa, zaeVar);
        sy81.c(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        sy81.d(zaa, zaeVar);
        sy81.c(zaa, apiFeatureRequest);
        sy81.d(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) throws RemoteException {
        Parcel zaa = zaa();
        sy81.d(zaa, iStatusCallback);
        sy81.c(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) throws RemoteException {
        Parcel zaa = zaa();
        sy81.d(zaa, iStatusCallback);
        sy81.d(zaa, zahVar);
        zac(6, zaa);
    }
}
