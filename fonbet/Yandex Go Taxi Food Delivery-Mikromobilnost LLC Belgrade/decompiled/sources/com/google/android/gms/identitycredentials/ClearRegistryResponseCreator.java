package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class ClearRegistryResponseCreator implements Parcelable.Creator<ClearRegistryResponse> {
    public static void writeToParcel(ClearRegistryResponse clearRegistryResponse, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        boolean isDeleted = clearRegistryResponse.getIsDeleted();
        bb1.m0(1, parcel, 4);
        parcel.writeInt(isDeleted ? 1 : 0);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ClearRegistryResponse createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        boolean z = false;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                z = cma1.k0(parcel, readInt);
            }
        }
        cma1.E(parcel, P0);
        return new ClearRegistryResponse(z);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public ClearRegistryResponse[] newArray(int i) {
        return new ClearRegistryResponse[i];
    }
}
