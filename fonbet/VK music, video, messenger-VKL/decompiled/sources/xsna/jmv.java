package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import xsna.glx;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public abstract class jmv extends com.google.android.gms.internal.auth_blockstore.zzb {
    @Override // com.google.android.gms.internal.auth_blockstore.zzb
    public final boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        Status status = (Status) com.google.android.gms.internal.auth_blockstore.zzc.zza(parcel, Status.CREATOR);
        boolean zzd = com.google.android.gms.internal.auth_blockstore.zzc.zzd(parcel);
        enforceNoDataAvail(parcel);
        i7o0.i(status, Boolean.valueOf(zzd), ((glx.b) this).a);
        return true;
    }
}
