package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.CardInfo;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class rd01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzi> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzi createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        CardInfo[] cardInfoArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                cardInfoArr = (CardInfo[]) SafeParcelReader.l(parcel, readInt, CardInfo.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzi(cardInfoArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzi[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzi[i];
    }
}
