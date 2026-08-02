package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.DataSource;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class yf01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = new ArrayList();
        DataSource dataSource = null;
        int i = 0;
        ArrayList arrayList2 = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c == 1000) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c == 3) {
                SafeParcelReader.y(parcel, readInt, arrayList, yf01.class.getClassLoader());
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList2 = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataSet(i, dataSource, arrayList, arrayList2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataSet[i];
    }
}
