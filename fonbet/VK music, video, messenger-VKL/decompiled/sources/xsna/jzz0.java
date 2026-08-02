package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public abstract class jzz0 extends com.google.android.gms.internal.maps.zzb {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        boolean e = ((ssz0) this).a.e(new eo00(com.google.android.gms.internal.maps.zzw.zzb(parcel.readStrongBinder())));
        parcel2.writeNoException();
        com.google.android.gms.internal.maps.zzc.zzc(parcel2, e);
        return true;
    }
}
