package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.Credential;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class bdk implements Parcelable.Creator<Credential> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final Credential createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                bundle = SafeParcelReader.b(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new Credential(str, bundle);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final Credential[] newArray(int i) {
        return new Credential[i];
    }
}
