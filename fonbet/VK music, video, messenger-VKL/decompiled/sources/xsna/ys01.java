package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.RawBucket;
import com.google.android.gms.fitness.data.RawDataSet;
import com.google.android.gms.fitness.data.Session;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class ys01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        int i = 0;
        int i2 = 0;
        Session session = null;
        ArrayList arrayList = null;
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
                    session = (Session) SafeParcelReader.h(parcel, readInt, Session.CREATOR);
                    break;
                case 4:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 5:
                    arrayList = SafeParcelReader.m(parcel, readInt, RawDataSet.CREATOR);
                    break;
                case 6:
                    i2 = SafeParcelReader.w(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new RawBucket(j, j2, session, i, arrayList, i2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RawBucket[i];
    }
}
