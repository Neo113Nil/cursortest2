package com.google.android.gms.identitycredentials;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.bb1;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class PendingGetCredentialHandleCreator implements Parcelable.Creator<PendingGetCredentialHandle> {
    public static void writeToParcel(PendingGetCredentialHandle pendingGetCredentialHandle, Parcel parcel, int i) {
        int n0 = bb1.n0(parcel, 20293);
        bb1.f0(parcel, 1, pendingGetCredentialHandle.getPendingIntent(), i, false);
        bb1.o0(parcel, n0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PendingGetCredentialHandle createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        PendingIntent pendingIntent = null;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                cma1.A0(parcel, readInt);
            } else {
                pendingIntent = (PendingIntent) cma1.y(parcel, readInt, PendingIntent.CREATOR);
            }
        }
        cma1.E(parcel, P0);
        return new PendingGetCredentialHandle(pendingIntent);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public PendingGetCredentialHandle[] newArray(int i) {
        return new PendingGetCredentialHandle[i];
    }
}
