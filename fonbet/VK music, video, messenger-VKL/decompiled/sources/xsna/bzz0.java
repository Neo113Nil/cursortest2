package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataSource;
import com.google.android.gms.fitness.data.DataType;
import com.google.android.gms.fitness.request.SessionReadRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class bzz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = true;
        String str = null;
        String str2 = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        ArrayList<String> arrayList3 = null;
        IBinder iBinder = null;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.i(parcel, readInt);
                    break;
                case 2:
                    str2 = SafeParcelReader.i(parcel, readInt);
                    break;
                case 3:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 4:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m(parcel, readInt, DataType.CREATOR);
                    break;
                case 6:
                    arrayList2 = SafeParcelReader.m(parcel, readInt, DataSource.CREATOR);
                    break;
                case 7:
                    z = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\b':
                    z2 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\t':
                    arrayList3 = SafeParcelReader.k(parcel, readInt);
                    break;
                case '\n':
                    iBinder = SafeParcelReader.v(parcel, readInt);
                    break;
                case 11:
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
                case '\f':
                    z4 = SafeParcelReader.o(parcel, readInt);
                    break;
                case '\r':
                    z3 = SafeParcelReader.o(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new SessionReadRequest(str, str2, j, j2, arrayList, arrayList2, z, z2, arrayList3, iBinder, z4, z3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionReadRequest[i];
    }
}
