package xsna;

import android.location.Location;
import android.os.Parcel;
import android.os.RemoteException;
import xsna.vnv;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public abstract class o001 extends com.google.android.gms.internal.maps.zzb {
    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Location location = (Location) bq70.g(vnv.a.f(parcel.readStrongBinder()));
        im00 im00Var = ((fm00) ((yb01) this).a.c).a;
        if (!im00Var.u && im00Var.w == null) {
            im00Var.h6(location.getLatitude(), location.getLongitude(), true);
        }
        parcel2.writeNoException();
        return true;
    }
}
