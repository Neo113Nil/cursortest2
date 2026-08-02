package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.DataReadRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class fl01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        DataSource dataSource = null;
        IBinder iBinder = null;
        ArrayList<Long> arrayList5 = null;
        ArrayList<Long> arrayList6 = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    arrayList = SafeParcelReader.m(parcel, readInt, DataType.CREATOR);
                    break;
                case 2:
                    arrayList2 = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
                    break;
                case 3:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 5:
                    arrayList3 = SafeParcelReader.m(parcel, readInt, DataType.CREATOR);
                    break;
                case 6:
                    arrayList4 = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
                    break;
                case 7:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case '\b':
                    j3 = SafeParcelReader.z(parcel, readInt);
                    break;
                case '\t':
                    dataSource = (DataSource) SafeParcelReader.h(parcel, readInt, DataSource.CREATOR);
                    break;
                case '\n':
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                case 11:
                case 15:
                case 16:
                case 17:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\f':
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 14:
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 18:
                    arrayList5 = SafeParcelReader.g(parcel, readInt);
                    break;
                case 19:
                    arrayList6 = SafeParcelReader.g(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataReadRequest(arrayList, arrayList2, j, j2, arrayList3, arrayList4, i, j3, dataSource, i2, z, z2, iBinder, arrayList5, arrayList6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataReadRequest[i];
    }
}
