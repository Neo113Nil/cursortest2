package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.RegistrationResponse;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class irf0 implements Parcelable.Creator<RegistrationResponse> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final RegistrationResponse createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        while (parcel.dataPosition() < D) {
            SafeParcelReader.C(parcel, parcel.readInt());
        }
        SafeParcelReader.n(parcel, D);
        return new RegistrationResponse();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final RegistrationResponse[] newArray(int i) {
        return new RegistrationResponse[i];
    }
}
