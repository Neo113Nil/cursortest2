package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class ol01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzo> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzo createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        CardInfo[] cardInfoArr = null;
        AccountInfo accountInfo = null;
        String str = null;
        String str2 = null;
        SparseArray sparseArray = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                cardInfoArr = (CardInfo[]) SafeParcelReader.l(parcel, readInt, CardInfo.CREATOR);
            } else if (c == 3) {
                accountInfo = (AccountInfo) SafeParcelReader.h(parcel, readInt, AccountInfo.CREATOR);
            } else if (c == 4) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 5) {
                str2 = SafeParcelReader.i(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                int B = SafeParcelReader.B(parcel, readInt);
                int dataPosition = parcel.dataPosition();
                if (B == 0) {
                    sparseArray = null;
                } else {
                    SparseArray sparseArray2 = new SparseArray();
                    int readInt2 = parcel.readInt();
                    for (int i = 0; i < readInt2; i++) {
                        sparseArray2.append(parcel.readInt(), parcel.readString());
                    }
                    parcel.setDataPosition(dataPosition + B);
                    sparseArray = sparseArray2;
                }
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzo(cardInfoArr, accountInfo, str, str2, sparseArray);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzo[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzo[i];
    }
}
