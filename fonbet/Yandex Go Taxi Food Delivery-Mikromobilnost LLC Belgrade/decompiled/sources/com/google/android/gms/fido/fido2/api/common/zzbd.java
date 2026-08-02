package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzbd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.D(parcel, readInt, UvmEntry.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new UvmEntries(arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new UvmEntries[i];
    }
}
