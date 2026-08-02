package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.DataDeleteRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class sg01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        IBinder iBinder = null;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    arrayList = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
                    break;
                case 4:
                    arrayList2 = SafeParcelReader.m(parcel, readInt, DataType.CREATOR);
                    break;
                case 5:
                    arrayList3 = SafeParcelReader.m(parcel, readInt, Session.CREATOR);
                    break;
                case 6:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case 7:
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\b':
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case '\t':
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
                case 11:
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new DataDeleteRequest(j, j2, arrayList, arrayList2, arrayList3, z, z2, z3, z4, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new DataDeleteRequest[i];
    }
}
