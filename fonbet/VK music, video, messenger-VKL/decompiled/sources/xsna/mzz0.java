package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class mzz0 extends com.google.android.gms.internal.cast.zza implements d001 {
    @Override // xsna.d001
    public final void K(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(13, zza);
    }

    @Override // xsna.d001
    public final int zze() throws RemoteException {
        Parcel zzb = zzb(17, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // xsna.d001
    public final vnv zzf() throws RemoteException {
        return y57.c(zzb(1, zza()));
    }

    @Override // xsna.d001
    public final boolean zzi() throws RemoteException {
        Parcel zzb = zzb(5, zza());
        boolean zza = com.google.android.gms.internal.cast.zzc.zza(zzb);
        zzb.recycle();
        return zza;
    }

    @Override // xsna.d001
    public final boolean zzj() throws RemoteException {
        Parcel zzb = zzb(6, zza());
        boolean zza = com.google.android.gms.internal.cast.zzc.zza(zzb);
        zzb.recycle();
        return zza;
    }

    @Override // xsna.d001
    public final boolean zzm() throws RemoteException {
        Parcel zzb = zzb(9, zza());
        boolean zza = com.google.android.gms.internal.cast.zzc.zza(zzb);
        zzb.recycle();
        return zza;
    }

    @Override // xsna.d001
    public final int zzo() throws RemoteException {
        Parcel zzb = zzb(18, zza());
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // xsna.d001
    public final void zzq() throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(2151);
        zzc(12, zza);
    }

    @Override // xsna.d001
    public final void zzt() throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(2153);
        zzc(15, zza);
    }
}
