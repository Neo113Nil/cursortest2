package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.WorkSource;
import com.google.android.gms.internal.identity.ClientIdentity;
import defpackage.cma1;

/* loaded from: classes11.dex */
public final class zzj implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int P0 = cma1.P0(parcel);
        WorkSource workSource = new WorkSource();
        ClientIdentity clientIdentity = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        int i3 = 102;
        while (parcel.dataPosition() < P0) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = cma1.u0(parcel, readInt);
                    break;
                case 2:
                    i = cma1.r0(parcel, readInt);
                    break;
                case 3:
                    i3 = cma1.r0(parcel, readInt);
                    break;
                case 4:
                    j2 = cma1.u0(parcel, readInt);
                    break;
                case 5:
                    z = cma1.k0(parcel, readInt);
                    break;
                case 6:
                    workSource = (WorkSource) cma1.y(parcel, readInt, WorkSource.CREATOR);
                    break;
                case 7:
                    i2 = cma1.r0(parcel, readInt);
                    break;
                case '\b':
                default:
                    cma1.A0(parcel, readInt);
                    break;
                case '\t':
                    clientIdentity = (ClientIdentity) cma1.y(parcel, readInt, ClientIdentity.CREATOR);
                    break;
            }
        }
        cma1.E(parcel, P0);
        return new CurrentLocationRequest(j, i, i3, j2, z, i2, workSource, clientIdentity);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new CurrentLocationRequest[i];
    }
}
