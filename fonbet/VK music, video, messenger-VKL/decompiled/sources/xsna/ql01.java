package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.google.android.gms.wallet.wobs.UriData;
import com.google.android.gms.wallet.wobs.WalletObjectMessage;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class ql01 implements Parcelable.Creator<WalletObjectMessage> {
    @Override // android.os.Parcelable.Creator
    public final WalletObjectMessage createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        String str2 = null;
        TimeInterval timeInterval = null;
        UriData uriData = null;
        UriData uriData2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c == 4) {
                timeInterval = (TimeInterval) SafeParcelReader.h(parcel, readInt, TimeInterval.CREATOR);
            } else if (c == 5) {
                uriData = (UriData) SafeParcelReader.h(parcel, readInt, UriData.CREATOR);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                uriData2 = (UriData) SafeParcelReader.h(parcel, readInt, UriData.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        WalletObjectMessage walletObjectMessage = new WalletObjectMessage();
        walletObjectMessage.b = str;
        walletObjectMessage.c = str2;
        walletObjectMessage.d = timeInterval;
        walletObjectMessage.e = uriData;
        walletObjectMessage.f = uriData2;
        return walletObjectMessage;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ WalletObjectMessage[] newArray(int i) {
        return new WalletObjectMessage[i];
    }
}
