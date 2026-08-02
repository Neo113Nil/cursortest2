package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.tapandpay.firstparty.zzaq;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes13.dex */
public final class pyz0 implements Parcelable.Creator<zzaq> {
    @Override // android.os.Parcelable.Creator
    public final zzaq createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        float f = 0.0f;
        float f2 = 0.0f;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 4:
                    f = SafeParcelReader.t(parcel, readInt);
                    break;
                case 5:
                    f2 = SafeParcelReader.t(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzaq(j, j2, i, f, f2, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ zzaq[] newArray(int i) {
        return new zzaq[i];
    }
}
