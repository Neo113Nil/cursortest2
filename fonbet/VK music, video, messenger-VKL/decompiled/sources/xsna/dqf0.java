package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.RegisterExportResponse;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class dqf0 implements Parcelable.Creator<RegisterExportResponse> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final RegisterExportResponse createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        while (parcel.dataPosition() < D) {
            SafeParcelReader.C(parcel, parcel.readInt());
        }
        SafeParcelReader.n(parcel, D);
        return new RegisterExportResponse();
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final RegisterExportResponse[] newArray(int i) {
        return new RegisterExportResponse[i];
    }
}
