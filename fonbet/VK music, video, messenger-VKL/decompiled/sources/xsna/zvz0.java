package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzae;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zvz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        DataType dataType = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                iBinder = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzae(dataType, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzae[i];
    }
}
