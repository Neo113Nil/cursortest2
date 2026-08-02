package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class j101 extends com.google.android.gms.internal.maps.zza implements fmv {
    @Override // xsna.fmv
    public final vnv B0() throws RemoteException {
        return y57.c(zzH(1, zza()));
    }

    @Override // xsna.fmv
    public final vnv T0() throws RemoteException {
        return y57.c(zzH(2, zza()));
    }

    @Override // xsna.fmv
    public final vnv W0(LatLngBounds latLngBounds, int i) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLngBounds);
        zza.writeInt(i);
        return y57.c(zzH(10, zza));
    }

    @Override // xsna.fmv
    public final vnv a0(CameraPosition cameraPosition) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, cameraPosition);
        return y57.c(zzH(7, zza));
    }

    @Override // xsna.fmv
    public final vnv h0(LatLng latLng) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLng);
        return y57.c(zzH(8, zza));
    }

    @Override // xsna.fmv
    public final vnv m1(LatLng latLng, float f) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzd(zza, latLng);
        zza.writeFloat(f);
        return y57.c(zzH(9, zza));
    }
}
