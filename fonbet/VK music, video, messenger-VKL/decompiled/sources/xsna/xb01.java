package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Subscription;
import com.google.android.gms.fitness.result.ListSubscriptionsResult;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class xb01 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = null;
        Status status = null;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = SafeParcelReader.m(parcel, readInt, Subscription.CREATOR);
            } else if (c != 2) {
                SafeParcelReader.C(parcel, readInt);
            } else {
                status = (Status) SafeParcelReader.h(parcel, readInt, Status.CREATOR);
            }
        }
        SafeParcelReader.n(parcel, D);
        return new ListSubscriptionsResult(arrayList, status);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ListSubscriptionsResult[i];
    }
}
