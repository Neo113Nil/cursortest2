package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes12.dex */
public final class u9k implements Parcelable.Creator<CreateRestoreCredentialRequest> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final CreateRestoreCredentialRequest createFromParcel(@NonNull Parcel parcel) {
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
        return new CreateRestoreCredentialRequest(bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final CreateRestoreCredentialRequest[] newArray(int i) {
        return new CreateRestoreCredentialRequest[i];
    }
}
