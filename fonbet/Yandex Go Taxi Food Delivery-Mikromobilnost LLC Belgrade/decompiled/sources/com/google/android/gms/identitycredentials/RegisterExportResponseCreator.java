package com.google.android.gms.identitycredentials;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class RegisterExportResponseCreator implements Parcelable.Creator<RegisterExportResponse> {
    public static void writeToParcel(RegisterExportResponse registerExportResponse, Parcel parcel, int i) {
        bb1.o0(parcel, bb1.n0(parcel, 20293));
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegisterExportResponse createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        while (parcel.dataPosition() < P0) {
            cma1.A0(parcel, parcel.readInt());
        }
        cma1.E(parcel, P0);
        return new RegisterExportResponse();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public RegisterExportResponse[] newArray(int i) {
        return new RegisterExportResponse[i];
    }
}
