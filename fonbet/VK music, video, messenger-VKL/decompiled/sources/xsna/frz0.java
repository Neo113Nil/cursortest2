package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.identity.GetSignInIntentRequest;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class frz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        boolean z = false;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 6:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new GetSignInIntentRequest(str, str2, str3, str4, i, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GetSignInIntentRequest[i];
    }
}
