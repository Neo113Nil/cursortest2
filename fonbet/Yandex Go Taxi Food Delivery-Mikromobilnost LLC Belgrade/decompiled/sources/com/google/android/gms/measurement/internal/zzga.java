package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import defpackage.da91;
import java.util.List;

/* loaded from: classes.dex */
public abstract class zzga extends zzbm implements zzgb {
    public zzga() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzA(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzB(zzr zzrVar, zzoo zzooVar, zzgh zzghVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzC(zzr zzrVar, zzaf zzafVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzD(zzr zzrVar, Bundle bundle, zzge zzgeVar) throws RemoteException;

    @Override // com.google.android.gms.internal.measurement.zzbm
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzgh zzghVar = null;
        zzge zzgeVar = null;
        switch (i) {
            case 1:
                zzbg zzbgVar = (zzbg) da91.b(parcel, zzbg.CREATOR);
                zzr zzrVar = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zze(zzbgVar, zzrVar);
                parcel2.writeNoException();
                return true;
            case 2:
                zzpl zzplVar = (zzpl) da91.b(parcel, zzpl.CREATOR);
                zzr zzrVar2 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzf(zzplVar, zzrVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                zzr zzrVar3 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzg(zzrVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbg zzbgVar2 = (zzbg) da91.b(parcel, zzbg.CREATOR);
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                da91.f(parcel);
                zzh(zzbgVar2, readString, readString2);
                parcel2.writeNoException();
                return true;
            case 6:
                zzr zzrVar4 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzi(zzrVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                zzr zzrVar5 = (zzr) da91.b(parcel, zzr.CREATOR);
                boolean a = da91.a(parcel);
                da91.f(parcel);
                List zzj = zzj(zzrVar5, a);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzj);
                return true;
            case 9:
                zzbg zzbgVar3 = (zzbg) da91.b(parcel, zzbg.CREATOR);
                String readString3 = parcel.readString();
                da91.f(parcel);
                byte[] zzk = zzk(zzbgVar3, readString3);
                parcel2.writeNoException();
                parcel2.writeByteArray(zzk);
                return true;
            case 10:
                long readLong = parcel.readLong();
                String readString4 = parcel.readString();
                String readString5 = parcel.readString();
                String readString6 = parcel.readString();
                da91.f(parcel);
                zzl(readLong, readString4, readString5, readString6);
                parcel2.writeNoException();
                return true;
            case 11:
                zzr zzrVar6 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                String zzm = zzm(zzrVar6);
                parcel2.writeNoException();
                parcel2.writeString(zzm);
                return true;
            case 12:
                zzah zzahVar = (zzah) da91.b(parcel, zzah.CREATOR);
                zzr zzrVar7 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzn(zzahVar, zzrVar7);
                parcel2.writeNoException();
                return true;
            case 13:
                zzah zzahVar2 = (zzah) da91.b(parcel, zzah.CREATOR);
                da91.f(parcel);
                zzo(zzahVar2);
                parcel2.writeNoException();
                return true;
            case 14:
                String readString7 = parcel.readString();
                String readString8 = parcel.readString();
                boolean a2 = da91.a(parcel);
                zzr zzrVar8 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                List zzp = zzp(readString7, readString8, a2, zzrVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzp);
                return true;
            case 15:
                String readString9 = parcel.readString();
                String readString10 = parcel.readString();
                String readString11 = parcel.readString();
                boolean a3 = da91.a(parcel);
                da91.f(parcel);
                List zzq = zzq(readString9, readString10, readString11, a3);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzq);
                return true;
            case 16:
                String readString12 = parcel.readString();
                String readString13 = parcel.readString();
                zzr zzrVar9 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                List zzr = zzr(readString12, readString13, zzrVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzr);
                return true;
            case 17:
                String readString14 = parcel.readString();
                String readString15 = parcel.readString();
                String readString16 = parcel.readString();
                da91.f(parcel);
                List zzs = zzs(readString14, readString15, readString16);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzs);
                return true;
            case 18:
                zzr zzrVar10 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzt(zzrVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) da91.b(parcel, Bundle.CREATOR);
                zzr zzrVar11 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzu(bundle, zzrVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                zzr zzrVar12 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzv(zzrVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                zzr zzrVar13 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzao zzw = zzw(zzrVar13);
                parcel2.writeNoException();
                if (zzw == null) {
                    parcel2.writeInt(0);
                } else {
                    parcel2.writeInt(1);
                    zzw.writeToParcel(parcel2, 1);
                }
                return true;
            case 24:
                zzr zzrVar14 = (zzr) da91.b(parcel, zzr.CREATOR);
                Bundle bundle2 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                da91.f(parcel);
                List zzx = zzx(zzrVar14, bundle2);
                parcel2.writeNoException();
                parcel2.writeTypedList(zzx);
                return true;
            case 25:
                zzr zzrVar15 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzy(zzrVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                zzr zzrVar16 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzz(zzrVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                zzr zzrVar17 = (zzr) da91.b(parcel, zzr.CREATOR);
                da91.f(parcel);
                zzA(zzrVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                zzr zzrVar18 = (zzr) da91.b(parcel, zzr.CREATOR);
                zzoo zzooVar = (zzoo) da91.b(parcel, zzoo.CREATOR);
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    zzghVar = queryLocalInterface instanceof zzgh ? (zzgh) queryLocalInterface : new zzgf(readStrongBinder);
                }
                da91.f(parcel);
                zzB(zzrVar18, zzooVar, zzghVar);
                parcel2.writeNoException();
                return true;
            case 30:
                zzr zzrVar19 = (zzr) da91.b(parcel, zzr.CREATOR);
                zzaf zzafVar = (zzaf) da91.b(parcel, zzaf.CREATOR);
                da91.f(parcel);
                zzC(zzrVar19, zzafVar);
                parcel2.writeNoException();
                return true;
            case 31:
                zzr zzrVar20 = (zzr) da91.b(parcel, zzr.CREATOR);
                Bundle bundle3 = (Bundle) da91.b(parcel, Bundle.CREATOR);
                IBinder readStrongBinder2 = parcel.readStrongBinder();
                if (readStrongBinder2 != null) {
                    IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    zzgeVar = queryLocalInterface2 instanceof zzge ? (zzge) queryLocalInterface2 : new zzgc(readStrongBinder2);
                }
                da91.f(parcel);
                zzD(zzrVar20, bundle3, zzgeVar);
                parcel2.writeNoException();
                return true;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zze(zzbg zzbgVar, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzf(zzpl zzplVar, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzg(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzh(zzbg zzbgVar, String str, String str2) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzi(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzj(zzr zzrVar, boolean z) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ byte[] zzk(zzbg zzbgVar, String str) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzl(long j, String str, String str2, String str3) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ String zzm(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzn(zzah zzahVar, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzo(zzah zzahVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzp(String str, String str2, boolean z, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzq(String str, String str2, String str3, boolean z) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzr(String str, String str2, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzs(String str, String str2, String str3) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzt(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzu(Bundle bundle, zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzv(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ zzao zzw(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ List zzx(zzr zzrVar, Bundle bundle) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzy(zzr zzrVar) throws RemoteException;

    @Override // com.google.android.gms.measurement.internal.zzgb
    public abstract /* synthetic */ void zzz(zzr zzrVar) throws RemoteException;
}
