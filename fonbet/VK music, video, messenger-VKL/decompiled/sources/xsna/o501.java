package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.google.android.gms.wallet.CardInfo;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class o501 implements Parcelable.Creator<CardInfo> {
    @Override // android.os.Parcelable.Creator
    public final CardInfo createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        UserAddress userAddress = null;
        int i = 0;
        String str3 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 2) {
                str3 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                userAddress = (UserAddress) SafeParcelReader.h(parcel, readInt, UserAddress.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        CardInfo cardInfo = new CardInfo();
        cardInfo.b = str;
        cardInfo.c = str3;
        cardInfo.d = str2;
        cardInfo.e = i;
        cardInfo.f = userAddress;
        return cardInfo;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CardInfo[] newArray(int i) {
        return new CardInfo[i];
    }
}
