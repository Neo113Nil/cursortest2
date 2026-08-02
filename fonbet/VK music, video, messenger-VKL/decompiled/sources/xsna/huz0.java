package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class huz0 extends com.google.android.gms.internal.cast.zzb {
    public final k0a a;

    public huz0(k0a k0aVar) {
        super("com.google.android.gms.cast.framework.ICastStateListener");
        this.a = k0aVar;
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        k0a k0aVar = this.a;
        if (i == 1) {
            bq70 bq70Var = new bq70(k0aVar);
            parcel2.writeNoException();
            com.google.android.gms.internal.cast.zzc.zze(parcel2, bq70Var);
            return true;
        }
        if (i != 2) {
            if (i != 3) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        int readInt = parcel.readInt();
        com.google.android.gms.internal.cast.zzc.zzf(parcel);
        k0aVar.b(readInt);
        parcel2.writeNoException();
        return true;
    }
}
