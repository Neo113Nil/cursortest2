package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.result.DataReadResult;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class d501 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = null;
        int i = 0;
        Status status = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                SafeParcelReader.y(parcel, readInt, arrayList, d501.class.getClassLoader());
            } else if (c == 2) {
                status = (Status) SafeParcelReader.h(parcel, readInt, Status.CREATOR);
            } else if (c == 3) {
                SafeParcelReader.y(parcel, readInt, arrayList2, d501.class.getClassLoader());
            } else if (c == 5) {
                i = SafeParcelReader.w(parcel, readInt);
            } else if (c != 6) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList3 = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataReadResult(arrayList, status, arrayList2, i, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataReadResult[i];
    }
}
