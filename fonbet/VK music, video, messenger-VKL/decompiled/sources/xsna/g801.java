package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.result.DataTypeResult;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class g801 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Status status = null;
        DataType dataType = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) SafeParcelReader.h(parcel, readInt, Status.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataTypeResult(status, dataType);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataTypeResult[i];
    }
}
