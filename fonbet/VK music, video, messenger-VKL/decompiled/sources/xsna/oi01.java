package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.GiftCardWalletObject;
import com.google.android.gms.wallet.wobs.CommonWalletObject;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class oi01 implements Parcelable.Creator<GiftCardWalletObject> {
    @Override // android.os.Parcelable.Creator
    public final GiftCardWalletObject createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        CommonWalletObject commonWalletObject = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        long j = 0;
        long j2 = 0;
        String str4 = null;
        String str5 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    commonWalletObject = (CommonWalletObject) SafeParcelReader.h(parcel, readInt, CommonWalletObject.CREATOR);
                    break;
                case 3:
                    str4 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    str5 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 5:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case '\b':
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\t':
                    str3 = SafeParcelReader.i(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        GiftCardWalletObject giftCardWalletObject = new GiftCardWalletObject();
        new CommonWalletObject();
        giftCardWalletObject.b = commonWalletObject;
        giftCardWalletObject.c = str4;
        giftCardWalletObject.d = str5;
        giftCardWalletObject.f = j;
        giftCardWalletObject.g = str2;
        giftCardWalletObject.h = j2;
        giftCardWalletObject.i = str3;
        giftCardWalletObject.e = str;
        return giftCardWalletObject;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GiftCardWalletObject[] newArray(int i) {
        return new GiftCardWalletObject[i];
    }
}
