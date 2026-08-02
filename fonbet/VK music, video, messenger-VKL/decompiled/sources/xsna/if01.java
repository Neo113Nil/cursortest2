package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.wallet.wobs.LoyaltyPointsBalance;

/* compiled from: com.google.android.gms:play-services-wallet@@18.0.0 */
/* loaded from: classes13.dex */
public final class if01 implements Parcelable.Creator<LoyaltyPointsBalance> {
    @Override // android.os.Parcelable.Creator
    public final LoyaltyPointsBalance createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        String str = null;
        int i2 = -1;
        long j = 0;
        double d = 0.0d;
        String str2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 3:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 4:
                    d = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 7:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        LoyaltyPointsBalance loyaltyPointsBalance = new LoyaltyPointsBalance();
        loyaltyPointsBalance.b = i;
        loyaltyPointsBalance.c = str;
        loyaltyPointsBalance.d = d;
        loyaltyPointsBalance.e = str2;
        loyaltyPointsBalance.f = j;
        loyaltyPointsBalance.g = i2;
        return loyaltyPointsBalance;
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LoyaltyPointsBalance[] newArray(int i) {
        return new LoyaltyPointsBalance[i];
    }
}
