package xsna;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.zzal;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class yxz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        DataSource dataSource = null;
        DataType dataType = null;
        IBinder iBinder = null;
        PendingIntent pendingIntent = null;
        IBinder iBinder2 = null;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        long j4 = 0;
        int i = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
                    break;
                case 2:
                    dataType = (DataType) SafeParcelReader.h(parcel, readInt, DataType.CREATOR);
                    break;
                case 3:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 4:
                case 5:
                case 11:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case 6:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 7:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\b':
                    pendingIntent = (PendingIntent) SafeParcelReader.h(parcel, readInt, PendingIntent.CREATOR);
                    break;
                case '\t':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\n':
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\f':
                    j4 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\r':
                    iBinder2 = SafeParcelReader.v(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new zzal(dataSource, dataType, iBinder, j, j2, pendingIntent, j3, i, j4, iBinder2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzal[i];
    }
}
