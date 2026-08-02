package xsna;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.DataPoint;
import com.google.android.gms.fitness.data.DataSet;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.request.SessionInsertRequest;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class tyz0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Session session = null;
        ArrayList arrayList = null;
        ArrayList arrayList2 = null;
        IBinder iBinder = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                session = (Session) SafeParcelReader.h(parcel, readInt, Session.CREATOR);
            } else if (c == 2) {
                arrayList = SafeParcelReader.m(parcel, readInt, DataSet.CREATOR);
            } else if (c == 3) {
                arrayList2 = SafeParcelReader.m(parcel, readInt, DataPoint.CREATOR);
            } else if (c != 4) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                iBinder = SafeParcelReader.v(parcel, readInt);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new SessionInsertRequest(session, arrayList, arrayList2, iBinder);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionInsertRequest[i];
    }
}
