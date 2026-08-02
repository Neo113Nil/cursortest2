package xsna;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class ryz0 extends com.google.android.gms.internal.cast.zza implements gzz0 {
    @Override // xsna.gzz0
    public final void q0() throws RemoteException {
        zzc(1, zza());
    }

    @Override // xsna.gzz0
    public final int r1(int i, int i2, Intent intent) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, intent);
        zza.writeInt(i);
        zza.writeInt(i2);
        Parcel zzb = zzb(2, zza);
        int readInt = zzb.readInt();
        zzb.recycle();
        return readInt;
    }

    @Override // xsna.gzz0
    public final IBinder z0(Intent intent) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, intent);
        Parcel zzb = zzb(3, zza);
        IBinder readStrongBinder = zzb.readStrongBinder();
        zzb.recycle();
        return readStrongBinder;
    }

    @Override // xsna.gzz0
    public final void zzh() throws RemoteException {
        zzc(4, zza());
    }
}
