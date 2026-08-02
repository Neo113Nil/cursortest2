package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.issuer.PushTokenizeRequest;
import com.google.android.gms.tapandpay.issuer.UserAddress;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class atz0 implements Parcelable.Creator<PushTokenizeRequest> {
    @Override // android.os.Parcelable.Creator
    public final PushTokenizeRequest createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        boolean z = false;
        byte[] bArr = null;
        String str = null;
        String str2 = null;
        UserAddress userAddress = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    bArr = SafeParcelReader.c(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    userAddress = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
                    break;
                case '\b':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new PushTokenizeRequest(i, i2, bArr, str, str2, userAddress, z);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PushTokenizeRequest[] newArray(int i) {
        return new PushTokenizeRequest[i];
    }
}
