package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public final class nuz0 extends com.google.android.gms.internal.common.zza implements evz0 {
    @Override // xsna.evz0
    public final com.google.android.gms.common.zzr M(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zzpVar);
        Parcel zzB = zzB(6, zza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(zzB, com.google.android.gms.common.zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // xsna.evz0
    public final com.google.android.gms.common.zzr P(com.google.android.gms.common.zzp zzpVar) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zzpVar);
        Parcel zzB = zzB(8, zza);
        com.google.android.gms.common.zzr zzrVar = (com.google.android.gms.common.zzr) com.google.android.gms.internal.common.zzc.zzb(zzB, com.google.android.gms.common.zzr.CREATOR);
        zzB.recycle();
        return zzrVar;
    }

    @Override // xsna.evz0
    public final boolean t1(com.google.android.gms.common.zzt zztVar, bq70 bq70Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.common.zzc.zzc(zza, zztVar);
        com.google.android.gms.internal.common.zzc.zze(zza, bq70Var);
        Parcel zzB = zzB(5, zza);
        boolean zza2 = com.google.android.gms.internal.common.zzc.zza(zzB);
        zzB.recycle();
        return zza2;
    }

    @Override // xsna.evz0
    public final boolean zzg() throws RemoteException {
        Parcel zzB = zzB(7, zza());
        boolean zza = com.google.android.gms.internal.common.zzc.zza(zzB);
        zzB.recycle();
        return zza;
    }
}
