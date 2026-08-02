package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.ClearRegistryResponse;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class fic implements Parcelable.Creator<ClearRegistryResponse> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final ClearRegistryResponse createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                z = SafeParcelReader.o(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new ClearRegistryResponse(z);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final ClearRegistryResponse[] newArray(int i) {
        return new ClearRegistryResponse[i];
    }
}
