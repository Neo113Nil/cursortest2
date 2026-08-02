package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.Credential;
import com.google.android.gms.identitycredentials.GetCredentialResponse;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class art implements Parcelable.Creator<GetCredentialResponse> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final GetCredentialResponse createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Credential credential = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                credential = (Credential) SafeParcelReader.h(parcel, readInt, Credential.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new GetCredentialResponse(credential);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final GetCredentialResponse[] newArray(int i) {
        return new GetCredentialResponse[i];
    }
}
