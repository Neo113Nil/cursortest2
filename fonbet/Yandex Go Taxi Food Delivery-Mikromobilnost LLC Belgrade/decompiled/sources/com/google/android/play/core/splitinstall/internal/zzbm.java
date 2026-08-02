package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.yxa1;
import java.util.List;

/* loaded from: classes11.dex */
public final class zzbm extends zzk implements zzbo {
    public zzbm(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzc(String str, int i, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        int i2 = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(4, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzd(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        int i = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(8, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zze(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        int i = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(13, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzf(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        int i = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(14, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzg(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        int i = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(7, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzh(String str, int i, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeInt(i);
        int i2 = yxa1.a;
        zza.writeStrongBinder(zzbqVar);
        zzb(5, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzi(String str, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        int i = yxa1.a;
        zza.writeStrongBinder(zzbqVar);
        zzb(6, zza);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.zzbo
    public final void zzj(String str, List list, Bundle bundle, zzbq zzbqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeTypedList(list);
        int i = yxa1.a;
        zza.writeInt(1);
        bundle.writeToParcel(zza, 0);
        zza.writeStrongBinder(zzbqVar);
        zzb(2, zza);
    }
}
