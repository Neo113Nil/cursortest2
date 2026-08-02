package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.ClearRestoreCredentialRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class gic implements Parcelable.Creator<ClearRestoreCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final ClearRestoreCredentialRequest createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new ClearRestoreCredentialRequest(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final ClearRestoreCredentialRequest[] newArray(int i) {
        return new ClearRestoreCredentialRequest[i];
    }
}
