package xsna;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class c601 extends com.google.android.gms.internal.cast.zzb implements tf01 {
    public final /* synthetic */ f701 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c601(f701 f701Var) {
        super("com.google.android.gms.cast.framework.media.internal.IFetchBitmapTaskProgressPublisher");
        this.a = f701Var;
    }

    @Override // com.google.android.gms.internal.cast.zzb
    public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        long readLong = parcel.readLong();
        long readLong2 = parcel.readLong();
        com.google.android.gms.internal.cast.zzc.zzf(parcel);
        this.a.publishProgress(Long.valueOf(readLong), Long.valueOf(readLong2));
        parcel2.writeNoException();
        return true;
    }
}
