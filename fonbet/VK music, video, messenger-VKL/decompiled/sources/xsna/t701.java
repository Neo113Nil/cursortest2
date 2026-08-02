package xsna;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.measurement.zzbm;
import com.google.android.gms.internal.measurement.zzbo;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzkw;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class t701 extends zzbm implements v701 {
    public t701(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // xsna.v701
    public final void D1(zzac zzacVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzacVar);
        zzbo.zze(zza, zzqVar);
        zzc(12, zza);
    }

    @Override // xsna.v701
    public final void E0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzqVar);
        zzc(4, zza);
    }

    @Override // xsna.v701
    public final void G0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzqVar);
        zzc(20, zza);
    }

    @Override // xsna.v701
    public final void I0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzqVar);
        zzc(18, zza);
    }

    @Override // xsna.v701
    public final void M0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzqVar);
        zzc(6, zza);
    }

    @Override // xsna.v701
    public final List N0(String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        Parcel zzb = zzb(17, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // xsna.v701
    public final void a1(zzaw zzawVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzawVar);
        zzbo.zze(zza, zzqVar);
        zzc(1, zza);
    }

    @Override // xsna.v701
    public final void e1(long j, String str, String str2, String str3) throws RemoteException {
        Parcel zza = zza();
        zza.writeLong(j);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc(10, zza);
    }

    @Override // xsna.v701
    public final String f0(com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(11, zza);
        String readString = zzb.readString();
        zzb.recycle();
        return readString;
    }

    @Override // xsna.v701
    public final void f1(zzkw zzkwVar, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzkwVar);
        zzbo.zze(zza, zzqVar);
        zzc(2, zza);
    }

    @Override // xsna.v701
    public final List j1(String str, String str2, boolean z, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zzd(zza, z);
        zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(14, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzkw.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // xsna.v701
    public final List l0(String str, String str2, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zza.writeString(str2);
        zzbo.zze(zza, zzqVar);
        Parcel zzb = zzb(16, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzac.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // xsna.v701
    public final List s1(String str, String str2, String str3, boolean z) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(null);
        zza.writeString(str2);
        zza.writeString(str3);
        zzbo.zzd(zza, z);
        Parcel zzb = zzb(15, zza);
        ArrayList createTypedArrayList = zzb.createTypedArrayList(zzkw.CREATOR);
        zzb.recycle();
        return createTypedArrayList;
    }

    @Override // xsna.v701
    public final byte[] u1(zzaw zzawVar, String str) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, zzawVar);
        zza.writeString(str);
        Parcel zzb = zzb(9, zza);
        byte[] createByteArray = zzb.createByteArray();
        zzb.recycle();
        return createByteArray;
    }

    @Override // xsna.v701
    public final void x(Bundle bundle, com.google.android.gms.measurement.internal.zzq zzqVar) throws RemoteException {
        Parcel zza = zza();
        zzbo.zze(zza, bundle);
        zzbo.zze(zza, zzqVar);
        zzc(19, zza);
    }
}
