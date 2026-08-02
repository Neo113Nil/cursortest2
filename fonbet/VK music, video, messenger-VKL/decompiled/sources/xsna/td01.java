package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;
import com.google.android.gms.wallet.wobs.TimeInterval;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class td01 implements Parcelable.Creator<LoyaltyPoints> {
    @Override // android.os.Parcelable.Creator
    public final LoyaltyPoints createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        String str = null;
        LoyaltyPointsBalance loyaltyPointsBalance = null;
        TimeInterval timeInterval = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = SafeParcelReader.i(parcel, readInt);
            } else if (c == 3) {
                loyaltyPointsBalance = (LoyaltyPointsBalance) SafeParcelReader.h(parcel, readInt, LoyaltyPointsBalance.CREATOR);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                timeInterval = (TimeInterval) SafeParcelReader.h(parcel, readInt, TimeInterval.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        LoyaltyPoints loyaltyPoints = new LoyaltyPoints();
        loyaltyPoints.b = str;
        loyaltyPoints.c = loyaltyPointsBalance;
        loyaltyPoints.d = timeInterval;
        return loyaltyPoints;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPoints[] newArray(int i) {
        return new LoyaltyPoints[i];
    }
}
