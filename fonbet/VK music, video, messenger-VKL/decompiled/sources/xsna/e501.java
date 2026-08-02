package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.service.FitnessSensorServiceRequest;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class e501 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        long j = 0;
        long j2 = 0;
        DataSource dataSource = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c == 2) {
                iBinder = SafeParcelReader.v(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.z(parcel, readInt);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                j2 = SafeParcelReader.z(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new FitnessSensorServiceRequest(dataSource, iBinder, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new FitnessSensorServiceRequest[i];
    }
}
