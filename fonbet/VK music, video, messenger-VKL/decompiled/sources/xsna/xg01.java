package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzau;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class xg01 implements Parcelable.Creator<com.google.android.gms.tapandpay.firstparty.zzk> {
    @Override // android.os.Parcelable.Creator
    public final com.google.android.gms.tapandpay.firstparty.zzk createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        zzau[] zzauVarArr = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                zzauVarArr = (zzau[]) SafeParcelReader.l(parcel, readInt, zzau.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new com.google.android.gms.tapandpay.firstparty.zzk(zzauVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ com.google.android.gms.tapandpay.firstparty.zzk[] newArray(int i) {
        return new com.google.android.gms.tapandpay.firstparty.zzk[i];
    }
}
