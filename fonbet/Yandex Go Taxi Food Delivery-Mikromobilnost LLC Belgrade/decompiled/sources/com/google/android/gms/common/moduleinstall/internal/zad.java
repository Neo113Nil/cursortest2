package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.internal.base.zab;
import defpackage.sy81;

/* loaded from: classes11.dex */
public abstract class zad extends zab implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // com.google.android.gms.internal.base.zab
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) sy81.a(parcel, Status.CREATOR);
            ModuleAvailabilityResponse moduleAvailabilityResponse = (ModuleAvailabilityResponse) sy81.a(parcel, ModuleAvailabilityResponse.CREATOR);
            sy81.b(parcel);
            zae(status, moduleAvailabilityResponse);
        } else if (i == 2) {
            Status status2 = (Status) sy81.a(parcel, Status.CREATOR);
            ModuleInstallResponse moduleInstallResponse = (ModuleInstallResponse) sy81.a(parcel, ModuleInstallResponse.CREATOR);
            sy81.b(parcel);
            zad(status2, moduleInstallResponse);
        } else if (i == 3) {
            Status status3 = (Status) sy81.a(parcel, Status.CREATOR);
            ModuleInstallIntentResponse moduleInstallIntentResponse = (ModuleInstallIntentResponse) sy81.a(parcel, ModuleInstallIntentResponse.CREATOR);
            sy81.b(parcel);
            zac(status3, moduleInstallIntentResponse);
        } else {
            if (i != 4) {
                return false;
            }
            Status status4 = (Status) sy81.a(parcel, Status.CREATOR);
            sy81.b(parcel);
            zab(status4);
        }
        return true;
    }

    public abstract /* synthetic */ void zab(Status status) throws RemoteException;

    public abstract /* synthetic */ void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse) throws RemoteException;

    public abstract /* synthetic */ void zad(Status status, ModuleInstallResponse moduleInstallResponse) throws RemoteException;

    public abstract /* synthetic */ void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse) throws RemoteException;
}
