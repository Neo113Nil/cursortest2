package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.yxa1;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class zzbp extends zzl implements zzbq {
    public zzbp() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzl
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                int readInt = parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                Bundle bundle = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzi(readInt, bundle);
                return true;
            case 3:
                int readInt2 = parcel.readInt();
                Parcelable.Creator creator2 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzj(readInt2, bundle2);
                return true;
            case 4:
                int readInt3 = parcel.readInt();
                Parcelable.Creator creator3 = Bundle.CREATOR;
                Bundle bundle3 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzb(readInt3, bundle3);
                return true;
            case 5:
                int readInt4 = parcel.readInt();
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle4 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzg(readInt4, bundle4);
                return true;
            case 6:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                Bundle bundle5 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzl(bundle5);
                return true;
            case 7:
                ArrayList createTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                yxa1.b(parcel);
                zzh(createTypedArrayList);
                return true;
            case 8:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                Bundle bundle6 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzf(bundle6);
                return true;
            case 9:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                Bundle bundle7 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzc(bundle7);
                return true;
            case 10:
                Parcelable.Creator creator8 = Bundle.CREATOR;
                Bundle bundle8 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzm(bundle8);
                return true;
            case 11:
                Parcelable.Creator creator9 = Bundle.CREATOR;
                Bundle bundle9 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzk(bundle9);
                return true;
            case 12:
                Parcelable.Creator creator10 = Bundle.CREATOR;
                Bundle bundle10 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zzd(bundle10);
                return true;
            case 13:
                Parcelable.Creator creator11 = Bundle.CREATOR;
                Bundle bundle11 = (Bundle) yxa1.a(parcel);
                yxa1.b(parcel);
                zze(bundle11);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzb(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzc(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzd(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zze(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzf(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzg(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzh(List list) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzi(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzj(int i, Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzk(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzl(Bundle bundle) throws RemoteException;

    @Override // com.google.android.play.core.splitinstall.internal.zzbq
    public abstract /* synthetic */ void zzm(Bundle bundle) throws RemoteException;
}
