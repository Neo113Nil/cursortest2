package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzag;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class rp01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzu> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzu createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzag zzagVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzagVar = (zzag) SafeParcelReader.h(parcel, readInt, zzag.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzu(zzagVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzu[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzu[i];
    }
}
