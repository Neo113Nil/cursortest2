package xsna;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataUpdateListenerRegistrationRequest;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class xo01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
            } else if (c == 2) {
                dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
            } else if (c == 3) {
                pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                iBinder = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataUpdateListenerRegistrationRequest(dataSource, dataType, pendingIntent, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataUpdateListenerRegistrationRequest[i];
    }
}
