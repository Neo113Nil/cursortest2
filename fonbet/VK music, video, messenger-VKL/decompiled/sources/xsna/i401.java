package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.VisibleRegion;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class i401 extends com.google.android.gms.internal.maps.zza implements ynv {
    @Override // xsna.ynv
    public final LatLng H(bq70 bq70Var) throws RemoteException {
        Parcel zza = zza();
        com.google.android.gms.internal.maps.zzc.zzf(zza, bq70Var);
        Parcel zzH = zzH(1, zza);
        LatLng latLng = (LatLng) com.google.android.gms.internal.maps.zzc.zza(zzH, LatLng.CREATOR);
        zzH.recycle();
        return latLng;
    }

    @Override // xsna.ynv
    public final VisibleRegion Y() throws RemoteException {
        Parcel zzH = zzH(3, zza());
        VisibleRegion visibleRegion = (VisibleRegion) com.google.android.gms.internal.maps.zzc.zza(zzH, VisibleRegion.CREATOR);
        zzH.recycle();
        return visibleRegion;
    }
}
