package com.google.android.gms.location;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        Bundle bundle = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                arrayList = cma1.D(parcel, readInt, DetectedActivity.CREATOR);
            } else if (c == 2) {
                j = cma1.u0(parcel, readInt);
            } else if (c == 3) {
                j2 = cma1.u0(parcel, readInt);
            } else if (c == 4) {
                i = cma1.r0(parcel, readInt);
            } else if (c != 5) {
                cma1.A0(parcel, readInt);
            } else {
                bundle = cma1.s(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ActivityRecognitionResult(arrayList, j, j2, i, bundle);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ActivityRecognitionResult[i];
    }
}
