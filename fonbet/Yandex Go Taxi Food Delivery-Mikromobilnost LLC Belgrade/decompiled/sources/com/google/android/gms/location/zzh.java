package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzh implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        String str = null;
        ArrayList arrayList2 = null;
        String str2 = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = cma1.D(parcel, readInt, ActivityTransition.CREATOR);
            } else if (c == 2) {
                str = cma1.z(parcel, readInt);
            } else if (c == 3) {
                arrayList2 = cma1.D(parcel, readInt, ClientIdentity.CREATOR);
            } else if (c != 4) {
                cma1.A0(parcel, readInt);
            } else {
                str2 = cma1.z(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ActivityTransitionRequest(arrayList, str, arrayList2, str2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityTransitionRequest[i];
    }
}
