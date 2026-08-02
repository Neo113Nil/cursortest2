package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.common.ConnectionResult;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class gxz0 extends com.google.android.gms.internal.cast.zza implements oxz0 {
    @Override // xsna.oxz0
    public final void e(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(5, zza);
    }

    @Override // xsna.oxz0
    public final void m(ApplicationMetadata applicationMetadata, String str, String str2, boolean z) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, applicationMetadata);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeInt(z ? 1 : 0);
        zzc(4, zza);
    }

    @Override // xsna.oxz0
    public final void o(ConnectionResult connectionResult) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, connectionResult);
        zzc(3, zza);
    }

    @Override // xsna.oxz0
    public final void p0() throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.cast.zzc.zzc(zza, null);
        zzc(1, zza);
    }

    @Override // xsna.oxz0
    public final void zzf(int i) throws RemoteException {
        Parcel zza = zza();
        zza.writeInt(i);
        zzc(2, zza);
    }

    @Override // xsna.oxz0
    public final void zzj(boolean z) throws RemoteException {
        Parcel zza = zza();
        int i = com.google.android.gms.internal.cast.zzc.zza;
        zza.writeInt(z ? 1 : 0);
        zza.writeInt(0);
        zzc(6, zza);
    }
}
