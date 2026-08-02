package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public abstract class v201 extends com.google.android.gms.internal.cast.zzb implements y201 {
    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                bq70 bq70Var = new bq70(((j301) this).a);
                parcel2.writeNoException();
                com.google.android.gms.internal.cast.zzc.zze(parcel2, bq70Var);
                return true;
            case 2:
                Bundle bundle = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.g(bundle);
                parcel2.writeNoException();
                return true;
            case 3:
                Bundle bundle2 = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.f(bundle2);
                parcel2.writeNoException();
                return true;
            case 4:
                boolean zza = com.google.android.gms.internal.cast.zzc.zza(parcel);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.a(zza);
                parcel2.writeNoException();
                return true;
            case 5:
                long b = ((j301) this).a.b();
                parcel2.writeNoException();
                parcel2.writeLong(b);
                return true;
            case 6:
                parcel2.writeNoException();
                parcel2.writeInt(12451000);
                return true;
            case 7:
                Bundle bundle3 = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.e(bundle3);
                parcel2.writeNoException();
                return true;
            case 8:
                Bundle bundle4 = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.d(bundle4);
                parcel2.writeNoException();
                return true;
            case 9:
                Bundle bundle5 = (Bundle) com.google.android.gms.internal.cast.zzc.zzb(parcel, Bundle.CREATOR);
                com.google.android.gms.internal.cast.zzc.zzf(parcel);
                ((j301) this).a.h(bundle5);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }
}
