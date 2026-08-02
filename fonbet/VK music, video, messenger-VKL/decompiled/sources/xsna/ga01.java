package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class ga01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzg> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzg createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        AccountInfo accountInfo = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                accountInfo = (AccountInfo) SafeParcelReader.h(parcel, readInt, AccountInfo.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzg(accountInfo);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzg[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzg[i];
    }
}
