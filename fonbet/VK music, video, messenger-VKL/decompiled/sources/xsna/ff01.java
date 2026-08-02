package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Session;
import com.google.android.gms.fitness.result.SessionStopResult;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class ff01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        Status status = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                status = (Status) SafeParcelReader.h(parcel, readInt, Status.CREATOR);
            } else if (c != 3) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                arrayList = SafeParcelReader.m(parcel, readInt, Session.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new SessionStopResult(status, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new SessionStopResult[i];
    }
}
