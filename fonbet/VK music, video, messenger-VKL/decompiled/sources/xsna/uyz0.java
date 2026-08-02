package xsna;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public abstract class uyz0 extends com.google.android.gms.internal.maps.zzb implements czz0 {
    public uyz0() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        dnv zb01Var;
        if (i != 1) {
            return false;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            zb01Var = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            zb01Var = queryLocalInterface instanceof dnv ? (dnv) queryLocalInterface : new zb01(readStrongBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
        }
        p1(zb01Var);
        parcel2.writeNoException();
        return true;
    }
}
