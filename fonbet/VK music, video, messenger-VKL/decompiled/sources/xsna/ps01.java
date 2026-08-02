package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.request.GoalsReadRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class ps01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                iBinder = SafeParcelReader.v(parcel, readInt);
            } else if (c == 2) {
                SafeParcelReader.y(parcel, readInt, arrayList, ps01.class.getClassLoader());
            } else if (c == 3) {
                SafeParcelReader.y(parcel, readInt, arrayList2, ps01.class.getClassLoader());
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                SafeParcelReader.y(parcel, readInt, arrayList3, ps01.class.getClassLoader());
            }
        }
        SafeParcelReader.n(parcel, D);
        return new GoalsReadRequest(iBinder, arrayList, arrayList2, arrayList3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoalsReadRequest[i];
    }
}
