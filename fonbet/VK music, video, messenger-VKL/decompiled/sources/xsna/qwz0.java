package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Subscription;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class qwz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        long j = 0;
        DataSource dataSource = null;
        DataType dataType = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c == 2) {
                dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
            } else if (c == 3) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c == 4) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 5) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                i2 = SafeParcelReader.w(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new Subscription(dataSource, dataType, j, i, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Subscription[i];
    }
}
