package xsna;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identitycredentials.CredentialOption;

/* compiled from: com.google.android.gms:play-services-identity-credentials@@16.0.0-alpha02 */
/* loaded from: classes12.dex */
public final class edk implements Parcelable.Creator<CredentialOption> {
    @Override // android.os.Parcelable.Creator
    @NonNull
    public final CredentialOption createFromParcel(@NonNull Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = "";
        String str2 = str;
        String str3 = str2;
        Bundle bundle = null;
        Bundle bundle2 = null;
        String str4 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    bundle = SafeParcelReader.b(parcel, readInt);
                    break;
                case 3:
                    bundle2 = SafeParcelReader.b(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new CredentialOption(str, bundle, bundle2, str4, str2, str3);
    }

    @Override // android.os.Parcelable.Creator
    @NonNull
    public final CredentialOption[] newArray(int i) {
        return new CredentialOption[i];
    }
}
