package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-maps@@18.0.0 */
/* loaded from: classes13.dex */
public final class tq01 extends com.google.android.gms.internal.maps.zzb {
    public final /* synthetic */ ga40 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq01(ga40 ga40Var) {
        super("com.google.android.gms.maps.internal.IOnCameraMoveStartedListener");
        this.a = ga40Var;
    }

    @Override // com.google.android.gms.internal.maps.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        ((fer0) this.a.c).i(parcel.readInt());
        parcel2.writeNoException();
        return true;
    }
}
