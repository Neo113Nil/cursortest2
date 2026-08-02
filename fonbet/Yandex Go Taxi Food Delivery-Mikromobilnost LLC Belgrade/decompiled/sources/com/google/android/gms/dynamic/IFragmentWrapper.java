package com.google.android.gms.dynamic;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import defpackage.yc91;

/* loaded from: classes11.dex */
public interface IFragmentWrapper extends IInterface {

    public static abstract class Stub extends com.google.android.gms.internal.common.zzb implements IFragmentWrapper {
        public Stub() {
            super("com.google.android.gms.dynamic.IFragmentWrapper");
        }

        public static IFragmentWrapper asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IFragmentWrapper");
            return queryLocalInterface instanceof IFragmentWrapper ? (IFragmentWrapper) queryLocalInterface : new zza(iBinder);
        }

        public abstract /* synthetic */ void zzA(IObjectWrapper iObjectWrapper) throws RemoteException;

        @Override // com.google.android.gms.internal.common.zzb
        public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            switch (i) {
                case 2:
                    IObjectWrapper zzb = zzb();
                    parcel2.writeNoException();
                    yc91.d(parcel2, zzb);
                    return true;
                case 3:
                    Bundle zzc = zzc();
                    parcel2.writeNoException();
                    int i3 = yc91.a;
                    if (zzc == null) {
                        parcel2.writeInt(0);
                    } else {
                        parcel2.writeInt(1);
                        zzc.writeToParcel(parcel2, 1);
                    }
                    return true;
                case 4:
                    int zzd = zzd();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzd);
                    return true;
                case 5:
                    IFragmentWrapper zze = zze();
                    parcel2.writeNoException();
                    yc91.d(parcel2, zze);
                    return true;
                case 6:
                    IObjectWrapper zzf = zzf();
                    parcel2.writeNoException();
                    yc91.d(parcel2, zzf);
                    return true;
                case 7:
                    boolean zzg = zzg();
                    parcel2.writeNoException();
                    int i4 = yc91.a;
                    parcel2.writeInt(zzg ? 1 : 0);
                    return true;
                case 8:
                    String zzh = zzh();
                    parcel2.writeNoException();
                    parcel2.writeString(zzh);
                    return true;
                case 9:
                    IFragmentWrapper zzi = zzi();
                    parcel2.writeNoException();
                    yc91.d(parcel2, zzi);
                    return true;
                case 10:
                    int zzj = zzj();
                    parcel2.writeNoException();
                    parcel2.writeInt(zzj);
                    return true;
                case 11:
                    boolean zzk = zzk();
                    parcel2.writeNoException();
                    int i5 = yc91.a;
                    parcel2.writeInt(zzk ? 1 : 0);
                    return true;
                case 12:
                    IObjectWrapper zzl = zzl();
                    parcel2.writeNoException();
                    yc91.d(parcel2, zzl);
                    return true;
                case 13:
                    boolean zzm = zzm();
                    parcel2.writeNoException();
                    int i6 = yc91.a;
                    parcel2.writeInt(zzm ? 1 : 0);
                    return true;
                case 14:
                    boolean zzn = zzn();
                    parcel2.writeNoException();
                    int i7 = yc91.a;
                    parcel2.writeInt(zzn ? 1 : 0);
                    return true;
                case 15:
                    boolean zzo = zzo();
                    parcel2.writeNoException();
                    int i8 = yc91.a;
                    parcel2.writeInt(zzo ? 1 : 0);
                    return true;
                case 16:
                    boolean zzp = zzp();
                    parcel2.writeNoException();
                    int i9 = yc91.a;
                    parcel2.writeInt(zzp ? 1 : 0);
                    return true;
                case 17:
                    boolean zzq = zzq();
                    parcel2.writeNoException();
                    int i10 = yc91.a;
                    parcel2.writeInt(zzq ? 1 : 0);
                    return true;
                case 18:
                    boolean zzr = zzr();
                    parcel2.writeNoException();
                    int i11 = yc91.a;
                    parcel2.writeInt(zzr ? 1 : 0);
                    return true;
                case 19:
                    boolean zzs = zzs();
                    parcel2.writeNoException();
                    int i12 = yc91.a;
                    parcel2.writeInt(zzs ? 1 : 0);
                    return true;
                case 20:
                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    yc91.e(parcel);
                    zzt(asInterface);
                    parcel2.writeNoException();
                    return true;
                case 21:
                    boolean a = yc91.a(parcel);
                    yc91.e(parcel);
                    zzu(a);
                    parcel2.writeNoException();
                    return true;
                case 22:
                    boolean a2 = yc91.a(parcel);
                    yc91.e(parcel);
                    zzv(a2);
                    parcel2.writeNoException();
                    return true;
                case 23:
                    boolean a3 = yc91.a(parcel);
                    yc91.e(parcel);
                    zzw(a3);
                    parcel2.writeNoException();
                    return true;
                case 24:
                    boolean a4 = yc91.a(parcel);
                    yc91.e(parcel);
                    zzx(a4);
                    parcel2.writeNoException();
                    return true;
                case 25:
                    Intent intent = (Intent) yc91.b(parcel, Intent.CREATOR);
                    yc91.e(parcel);
                    zzy(intent);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    Intent intent2 = (Intent) yc91.b(parcel, Intent.CREATOR);
                    int readInt = parcel.readInt();
                    yc91.e(parcel);
                    zzz(intent2, readInt);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    yc91.e(parcel);
                    zzA(asInterface2);
                    parcel2.writeNoException();
                    return true;
                default:
                    return false;
            }
        }

        public abstract /* synthetic */ IObjectWrapper zzb() throws RemoteException;

        public abstract /* synthetic */ Bundle zzc() throws RemoteException;

        public abstract /* synthetic */ int zzd() throws RemoteException;

        public abstract /* synthetic */ IFragmentWrapper zze() throws RemoteException;

        public abstract /* synthetic */ IObjectWrapper zzf() throws RemoteException;

        public abstract /* synthetic */ boolean zzg() throws RemoteException;

        public abstract /* synthetic */ String zzh() throws RemoteException;

        public abstract /* synthetic */ IFragmentWrapper zzi() throws RemoteException;

        public abstract /* synthetic */ int zzj() throws RemoteException;

        public abstract /* synthetic */ boolean zzk() throws RemoteException;

        public abstract /* synthetic */ IObjectWrapper zzl() throws RemoteException;

        public abstract /* synthetic */ boolean zzm() throws RemoteException;

        public abstract /* synthetic */ boolean zzn() throws RemoteException;

        public abstract /* synthetic */ boolean zzo() throws RemoteException;

        public abstract /* synthetic */ boolean zzp() throws RemoteException;

        public abstract /* synthetic */ boolean zzq() throws RemoteException;

        public abstract /* synthetic */ boolean zzr() throws RemoteException;

        public abstract /* synthetic */ boolean zzs() throws RemoteException;

        public abstract /* synthetic */ void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;

        public abstract /* synthetic */ void zzu(boolean z) throws RemoteException;

        public abstract /* synthetic */ void zzv(boolean z) throws RemoteException;

        public abstract /* synthetic */ void zzw(boolean z) throws RemoteException;

        public abstract /* synthetic */ void zzx(boolean z) throws RemoteException;

        public abstract /* synthetic */ void zzy(Intent intent) throws RemoteException;

        public abstract /* synthetic */ void zzz(Intent intent, int i) throws RemoteException;
    }

    void zzA(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzb() throws RemoteException;

    Bundle zzc() throws RemoteException;

    int zzd() throws RemoteException;

    IFragmentWrapper zze() throws RemoteException;

    IObjectWrapper zzf() throws RemoteException;

    boolean zzg() throws RemoteException;

    String zzh() throws RemoteException;

    IFragmentWrapper zzi() throws RemoteException;

    int zzj() throws RemoteException;

    boolean zzk() throws RemoteException;

    IObjectWrapper zzl() throws RemoteException;

    boolean zzm() throws RemoteException;

    boolean zzn() throws RemoteException;

    boolean zzo() throws RemoteException;

    boolean zzp() throws RemoteException;

    boolean zzq() throws RemoteException;

    boolean zzr() throws RemoteException;

    boolean zzs() throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzu(boolean z) throws RemoteException;

    void zzv(boolean z) throws RemoteException;

    void zzw(boolean z) throws RemoteException;

    void zzx(boolean z) throws RemoteException;

    void zzy(Intent intent) throws RemoteException;

    void zzz(Intent intent, int i) throws RemoteException;
}
