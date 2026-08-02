package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.issuer.UserAddress;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class n501 implements Parcelable.Creator<UserAddress> {
    @Override // android.os.Parcelable.Creator
    public final UserAddress createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        boolean z = false;
        String str14 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            boolean z2 = z;
            switch ((char) readInt) {
                case 2:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    str14 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 7:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    str6 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\t':
                    str7 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\n':
                    str8 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 11:
                    str9 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\f':
                    str10 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\r':
                    str11 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 14:
                    z = SafeParcelReader.o(parcel, readInt);
                    continue;
                case 15:
                    str13 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 16:
                    str12 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
            z = z2;
        }
        SafeParcelReader.n(parcel, D);
        UserAddress userAddress = new UserAddress();
        userAddress.b = str;
        userAddress.c = str14;
        userAddress.d = str2;
        userAddress.e = str3;
        userAddress.f = str4;
        userAddress.g = str5;
        userAddress.h = str6;
        userAddress.i = str7;
        userAddress.j = str8;
        userAddress.k = str9;
        userAddress.l = str10;
        userAddress.m = str11;
        userAddress.n = z;
        userAddress.o = str13;
        userAddress.p = str12;
        return userAddress;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ UserAddress[] newArray(int i) {
        return new UserAddress[i];
    }
}
