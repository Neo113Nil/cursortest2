package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class wvz0 extends com.google.android.gms.internal.cast.zzb implements fwz0 {
    public wvz0() {
        super("com.google.android.gms.cast.internal.IBundleCallback");
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
        com.google.android.gms.internal.cast.zzc.zzf(parcel);
        j(bundle);
        return true;
    }
}
