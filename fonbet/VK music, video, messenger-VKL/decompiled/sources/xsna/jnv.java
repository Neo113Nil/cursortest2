package xsna;

import android.os.Parcel;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.identitycredentials.PendingGetCredentialHandle;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public abstract class jnv extends com.google.android.gms.internal.identity_credentials.zzb {
    @Override // com.google.android.gms.internal.identity_credentials.zzb
    public final boolean dispatchTransaction(int i, @NonNull Parcel parcel, @NonNull Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            Status status = (Status) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, Status.CREATOR);
            PendingGetCredentialHandle pendingGetCredentialHandle = (PendingGetCredentialHandle) com.google.android.gms.internal.identity_credentials.zzc.zza(parcel, PendingGetCredentialHandle.CREATOR);
            enforceNoDataAvail(parcel);
            i7o0.i(status, pendingGetCredentialHandle, ((bhx) this).a);
            return true;
        }
        if (i == 2) {
            enforceNoDataAvail(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 3) {
            enforceNoDataAvail(parcel);
            throw new UnsupportedOperationException();
        }
        if (i == 4) {
            enforceNoDataAvail(parcel);
            throw new UnsupportedOperationException();
        }
        if (i != 5) {
            return false;
        }
        enforceNoDataAvail(parcel);
        throw new UnsupportedOperationException();
    }
}
