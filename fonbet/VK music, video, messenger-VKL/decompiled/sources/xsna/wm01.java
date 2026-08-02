package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public abstract class wm01 extends com.google.android.gms.internal.maps.zzb {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((js01) this).a.a();
        parcel2.writeNoException();
        return true;
    }
}
