package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.Value;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class vb01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        DataSource dataSource = null;
        Value[] valueArr = null;
        DataSource dataSource2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c == 3) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 4) {
                j2 = SafeParcelReader.z(parcel, readInt);
            } else if (c == 5) {
                valueArr = (Value[]) SafeParcelReader.l(parcel, readInt, Value.CREATOR);
            } else if (c == 6) {
                dataSource2 = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c != 7) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                j3 = SafeParcelReader.z(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataPoint(dataSource, j, j2, valueArr, dataSource2, j3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataPoint[i];
    }
}
