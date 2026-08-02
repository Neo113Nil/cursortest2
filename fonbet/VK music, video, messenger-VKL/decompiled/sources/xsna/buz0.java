package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.RawDataPoint;
import com.google.android.gms.fitness.data.Value;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class buz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        int i = 0;
        int i2 = 0;
        Value[] valueArr = null;
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
                    valueArr = (Value[]) SafeParcelReader.l(parcel, readInt, Value.CREATOR);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 6:
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new RawDataPoint(j, j2, valueArr, i, i2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RawDataPoint[i];
    }
}
