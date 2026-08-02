package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzbb;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class yj01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzm> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzm createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzbb zzbbVar = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzbbVar = (zzbb) SafeParcelReader.h(parcel, readInt, zzbb.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzm(zzbbVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzm[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzm[i];
    }
}
