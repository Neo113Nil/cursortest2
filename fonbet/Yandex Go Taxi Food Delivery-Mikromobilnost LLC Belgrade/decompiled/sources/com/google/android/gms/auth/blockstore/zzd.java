package com.google.android.gms.auth.blockstore;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.blockstore.RetrieveBytesResponse;
import defpackage.cma1;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class zzd implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        Bundle bundle = null;
        ArrayList arrayList = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = cma1.s(parcel, readInt);
            } else if (c != 2) {
                cma1.A0(parcel, readInt);
            } else {
                arrayList = cma1.D(parcel, readInt, RetrieveBytesResponse.BlockstoreData.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new RetrieveBytesResponse(bundle, arrayList);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new RetrieveBytesResponse[i];
    }
}
